package typings.contrastColor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("contrast-color", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ContrastColor_ {
    def this(defaults: ContrastColorConfig) = this()
  }
  @JSImport("contrast-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contrastColor(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("contrastColor")().asInstanceOf[Color]
  inline def contrastColor(config: ContrastColorConfig): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("contrastColor")(config.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  type Color = HexColor | NamedColor
  
  trait ContrastColorConfig extends StObject {
    
    /**
      * The background color to determine a foreground color for
      * @default "#FFFFFF"
      */
    var bgColor: js.UndefOr[Color] = js.undefined
    
    /**
      * Object to override or add named colours
      * @example { blue: "#0074D9" }
      * @default {}
      */
    var customNamedColors: js.UndefOr[StringDictionary[Color]] = js.undefined
    
    /**
      * The color to be returned if `bgColor` is determined to be _invalid_
      * @default "#000000"
      */
    var defaultColor: js.UndefOr[Color] = js.undefined
    
    /**
      * The color to be returned if `bgColor` is determined to be _light_
      * @default "#000000"
      */
    var fgDarkColor: js.UndefOr[Color] = js.undefined
    
    /**
      * The color to be returned if `bgColor` is determined to be _dark_
      * @default "#FFFFFF"
      */
    var fgLightColor: js.UndefOr[Color] = js.undefined
    
    /**
      * Number (0-255) used to adjust variance
      * @default 128
      */
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object ContrastColorConfig {
    
    inline def apply(): ContrastColorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContrastColorConfig]
    }
    
    extension [Self <: ContrastColorConfig](x: Self) {
      
      inline def setBgColor(value: Color): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      inline def setCustomNamedColors(value: StringDictionary[Color]): Self = StObject.set(x, "customNamedColors", value.asInstanceOf[js.Any])
      
      inline def setCustomNamedColorsUndefined: Self = StObject.set(x, "customNamedColors", js.undefined)
      
      inline def setDefaultColor(value: Color): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      inline def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
      
      inline def setFgDarkColor(value: Color): Self = StObject.set(x, "fgDarkColor", value.asInstanceOf[js.Any])
      
      inline def setFgDarkColorUndefined: Self = StObject.set(x, "fgDarkColor", js.undefined)
      
      inline def setFgLightColor(value: Color): Self = StObject.set(x, "fgLightColor", value.asInstanceOf[js.Any])
      
      inline def setFgLightColorUndefined: Self = StObject.set(x, "fgLightColor", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  @js.native
  trait ContrastColor_ extends StObject {
    
    def contrastColor(): Color = js.native
    def contrastColor(config: ContrastColorConfig): Color = js.native
  }
  
  type HexColor = String
  
  /**
    * A named color
    * @example "red"
    */
  type NamedColor = String
}
