package typings.ctrlTinycolor

import typings.ctrlTinycolor.anon.A
import typings.ctrlTinycolor.interfacesMod.HSL
import typings.ctrlTinycolor.interfacesMod.HSLA
import typings.ctrlTinycolor.interfacesMod.HSV
import typings.ctrlTinycolor.interfacesMod.HSVA
import typings.ctrlTinycolor.interfacesMod.RGB
import typings.ctrlTinycolor.interfacesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatInputMod {
  
  @JSImport("@ctrl/tinycolor/dist/format-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inputToRGB(color: String): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: js.Any): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSL): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSLA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSV): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSVA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: RGB): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: RGBA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def isValidCSSUnit(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCSSUnit")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidCSSUnit(color: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCSSUnit")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def stringInputToObject(color: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringInputToObject")(color.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
