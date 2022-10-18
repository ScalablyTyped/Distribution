package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsColorHelperMod {
  
  @JSImport("black-engine/utils/ColorHelper", "ColorHelper")
  @js.native
  open class ColorHelper () extends StObject
  /* static members */
  object ColorHelper {
    
    @JSImport("black-engine/utils/ColorHelper", "ColorHelper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def hex2rgb(hex: Double): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("hex2rgb")(hex.asInstanceOf[js.Any]).asInstanceOf[RGB]
    
    inline def hexColorToString(color: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexColorToString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hsv2rgb(hsv: HSV): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(hsv.asInstanceOf[js.Any]).asInstanceOf[RGB]
    
    inline def intToRGBA(color: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intToRGBA")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def intToRGBA(color: Double, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intToRGBA")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def lerpHSV(hex1: Double, hex2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerpHSV")(hex1.asInstanceOf[js.Any], hex2.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def lerpHSV(hex1: Double, hex2: Double, factor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerpHSV")(hex1.asInstanceOf[js.Any], hex2.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def rgb2hex(rgb: RGB): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hex")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def rgb2hsv(rgb: RGB): HSV = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsv")(rgb.asInstanceOf[js.Any]).asInstanceOf[HSV]
  }
  
  @JSImport("black-engine/utils/ColorHelper", "HSV")
  @js.native
  open class HSV () extends StObject {
    def this(h: Double) = this()
    def this(h: Double, s: Double) = this()
    def this(h: Unit, s: Double) = this()
    def this(h: Double, s: Double, v: Double) = this()
    def this(h: Double, s: Unit, v: Double) = this()
    def this(h: Unit, s: Double, v: Double) = this()
    def this(h: Unit, s: Unit, v: Double) = this()
    
    var h: Double = js.native
    
    var s: Double = js.native
    
    var v: Double = js.native
  }
  
  @JSImport("black-engine/utils/ColorHelper", "RGB")
  @js.native
  open class RGB () extends StObject {
    def this(r: Double) = this()
    def this(r: Double, g: Double) = this()
    def this(r: Unit, g: Double) = this()
    def this(r: Double, g: Double, b: Double) = this()
    def this(r: Double, g: Unit, b: Double) = this()
    def this(r: Unit, g: Double, b: Double) = this()
    def this(r: Unit, g: Unit, b: Double) = this()
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
}
