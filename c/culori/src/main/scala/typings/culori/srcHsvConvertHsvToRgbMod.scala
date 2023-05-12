package typings.culori

import typings.culori.anon.OmitHsvmode
import typings.culori.srcRgbTypesMod.Rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHsvConvertHsvToRgbMod {
  
  @JSImport("culori/src/hsv/convertHsvToRgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: OmitHsvmode): Rgb = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[Rgb]
}
