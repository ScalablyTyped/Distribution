package typings.cathoQuantum

import typings.cathoQuantum.anon.ColorsTones0string1000str
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
  object default {
    
    @JSImport("@catho/quantum/Colors", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Colors", "default.error")
    @js.native
    def error: ColorsTones = js.native
    @scala.inline
    def error_=(x: ColorsTones): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Colors", "default.neutral")
    @js.native
    def neutral: ColorsTones0string1000str = js.native
    @scala.inline
    def neutral_=(x: ColorsTones0string1000str): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutral")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Colors", "default.primary")
    @js.native
    def primary: ColorsTones = js.native
    @scala.inline
    def primary_=(x: ColorsTones): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Colors", "default.secondary")
    @js.native
    def secondary: ColorsTones = js.native
    @scala.inline
    def secondary_=(x: ColorsTones): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondary")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Colors", "default.success")
    @js.native
    def success: ColorsTones = js.native
    @scala.inline
    def success_=(x: ColorsTones): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Colors", "default.warning")
    @js.native
    def warning: ColorsTones = js.native
    @scala.inline
    def warning_=(x: ColorsTones): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  trait ColorsTones extends StObject {
    
    var `100`: String
    
    var `300`: String
    
    var `500`: String
    
    var `700`: String
    
    var `900`: String
  }
  object ColorsTones {
    
    @scala.inline
    def apply(`100`: String, `300`: String, `500`: String, `700`: String, `900`: String): ColorsTones = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
      __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
      __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
      __obj.updateDynamic("700")(`700`.asInstanceOf[js.Any])
      __obj.updateDynamic("900")(`900`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorsTones]
    }
    
    @scala.inline
    implicit class ColorsTonesMutableBuilder[Self <: ColorsTones] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set100(value: String): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set300(value: String): Self = StObject.set(x, "300", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set500(value: String): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set700(value: String): Self = StObject.set(x, "700", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set900(value: String): Self = StObject.set(x, "900", value.asInstanceOf[js.Any])
    }
  }
}
