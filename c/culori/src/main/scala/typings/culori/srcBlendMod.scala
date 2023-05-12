package typings.culori

import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.culori.srcCommonMod.Mode
import typings.culori.srcCommonMod.NonEmptyArray
import typings.culori.srcRgbTypesMod.Rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBlendMod {
  
  @JSImport("culori/src/blend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(colors: NonEmptyArray[Color | String]): Rgb = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(colors.asInstanceOf[js.Any]).asInstanceOf[Rgb]
  inline def default(colors: NonEmptyArray[Color | String], `type`: BlendTypes): Rgb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(colors.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Rgb]
  inline def default(colors: NonEmptyArray[Color | String], `type`: BlendingFunction): Rgb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(colors.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Rgb]
  inline def default[M /* <: Mode */](colors: js.Array[Color | String], `type`: BlendTypes, mode: M): FindColorByMode[M, Color] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(colors.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[FindColorByMode[M, Color]]
  inline def default[M /* <: Mode */](colors: js.Array[Color | String], `type`: BlendingFunction, mode: M): FindColorByMode[M, Color] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(colors.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[FindColorByMode[M, Color]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.culori.culoriStrings.normal
    - typings.culori.culoriStrings.multiply
    - typings.culori.culoriStrings.screen
    - typings.culori.culoriStrings.`hard-light`
    - typings.culori.culoriStrings.overlay
    - typings.culori.culoriStrings.darken
    - typings.culori.culoriStrings.lighten
    - typings.culori.culoriStrings.`color-dodge`
    - typings.culori.culoriStrings.`color-burn`
    - typings.culori.culoriStrings.`soft-light`
    - typings.culori.culoriStrings.difference
    - typings.culori.culoriStrings.exclusion
  */
  trait BlendTypes extends StObject
  object BlendTypes {
    
    inline def `color-burn`: typings.culori.culoriStrings.`color-burn` = "color-burn".asInstanceOf[typings.culori.culoriStrings.`color-burn`]
    
    inline def `color-dodge`: typings.culori.culoriStrings.`color-dodge` = "color-dodge".asInstanceOf[typings.culori.culoriStrings.`color-dodge`]
    
    inline def darken: typings.culori.culoriStrings.darken = "darken".asInstanceOf[typings.culori.culoriStrings.darken]
    
    inline def difference: typings.culori.culoriStrings.difference = "difference".asInstanceOf[typings.culori.culoriStrings.difference]
    
    inline def exclusion: typings.culori.culoriStrings.exclusion = "exclusion".asInstanceOf[typings.culori.culoriStrings.exclusion]
    
    inline def `hard-light`: typings.culori.culoriStrings.`hard-light` = "hard-light".asInstanceOf[typings.culori.culoriStrings.`hard-light`]
    
    inline def lighten: typings.culori.culoriStrings.lighten = "lighten".asInstanceOf[typings.culori.culoriStrings.lighten]
    
    inline def multiply: typings.culori.culoriStrings.multiply = "multiply".asInstanceOf[typings.culori.culoriStrings.multiply]
    
    inline def normal: typings.culori.culoriStrings.normal = "normal".asInstanceOf[typings.culori.culoriStrings.normal]
    
    inline def overlay: typings.culori.culoriStrings.overlay = "overlay".asInstanceOf[typings.culori.culoriStrings.overlay]
    
    inline def screen: typings.culori.culoriStrings.screen = "screen".asInstanceOf[typings.culori.culoriStrings.screen]
    
    inline def `soft-light`: typings.culori.culoriStrings.`soft-light` = "soft-light".asInstanceOf[typings.culori.culoriStrings.`soft-light`]
  }
  
  type BlendingFunction = js.Function2[/* backdrop */ Double, /* source */ Double, Double]
}
