package typings.colorString

import typings.colorString.colorStringStrings.hsl
import typings.colorString.colorStringStrings.hwb
import typings.colorString.colorStringStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object get {
    
    @scala.inline
    def apply(colorString: String): ColorDescriptor | Null = ^.asInstanceOf[js.Dynamic].apply(colorString.asInstanceOf[js.Any]).asInstanceOf[ColorDescriptor | Null]
    
    @JSImport("color-string", "get")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def hsl(colorString: String): Color | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(colorString.asInstanceOf[js.Any]).asInstanceOf[Color | Null]
    
    @scala.inline
    def hwb(colorString: String): Color | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb")(colorString.asInstanceOf[js.Any]).asInstanceOf[Color | Null]
    
    @scala.inline
    def rgb(colorString: String): Color | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(colorString.asInstanceOf[js.Any]).asInstanceOf[Color | Null]
  }
  
  object to {
    
    @JSImport("color-string", "to")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def hex(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def hsl(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def hwb(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def keyword(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyword")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    object rgb {
      
      @scala.inline
      def apply(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSImport("color-string", "to.rgb")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def percent(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("percent")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    }
  }
  
  type Color = js.Tuple4[Double, Double, Double, Double]
  
  trait ColorDescriptor extends StObject {
    
    var model: rgb | hsl | hwb
    
    var value: Color
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
