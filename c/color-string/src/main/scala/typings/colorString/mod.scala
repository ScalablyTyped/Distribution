package typings.colorString

import typings.colorString.colorStringStrings.hsl
import typings.colorString.colorStringStrings.hwb
import typings.colorString.colorStringStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object get {
    
    @JSImport("color-string", "get")
    @js.native
    def apply(colorString: String): ColorDescriptor | Null = js.native
    
    @JSImport("color-string", "get.hsl")
    @js.native
    def hsl(colorString: String): Color | Null = js.native
    
    @JSImport("color-string", "get.hwb")
    @js.native
    def hwb(colorString: String): Color | Null = js.native
    
    @JSImport("color-string", "get.rgb")
    @js.native
    def rgb(colorString: String): Color | Null = js.native
  }
  
  object to {
    
    @JSImport("color-string", "to.hex")
    @js.native
    def hex(args: (Double | js.Array[Double])*): String = js.native
    
    @JSImport("color-string", "to.hsl")
    @js.native
    def hsl(args: (Double | js.Array[Double])*): String = js.native
    
    @JSImport("color-string", "to.hwb")
    @js.native
    def hwb(args: (Double | js.Array[Double])*): String = js.native
    
    @JSImport("color-string", "to.keyword")
    @js.native
    def keyword(args: (Double | js.Array[Double])*): String = js.native
    
    object rgb {
      
      @JSImport("color-string", "to.rgb")
      @js.native
      def apply(args: (Double | js.Array[Double])*): String = js.native
      
      @JSImport("color-string", "to.rgb.percent")
      @js.native
      def percent(args: (Double | js.Array[Double])*): String = js.native
    }
  }
  
  type Color = js.Tuple4[Double, Double, Double, Double]
  
  @js.native
  trait ColorDescriptor extends StObject {
    
    var model: rgb | hsl | hwb = js.native
    
    var value: Color = js.native
  }
  object ColorDescriptor {
    
    @scala.inline
    def apply(model: rgb | hsl | hwb, value: Color): ColorDescriptor = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorDescriptor]
    }
    
    @scala.inline
    implicit class ColorDescriptorMutableBuilder[Self <: ColorDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: rgb | hsl | hwb): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Color): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
