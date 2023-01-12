package typings.badgen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("badgen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def badgen(param0: BadgenOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("badgen")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def calcWidth(param0: js.Iterable[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calcWidth")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait BadgenOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var iconWidth: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var labelColor: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var status: String
    
    var style: js.UndefOr[StyleOption] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object BadgenOptions {
    
    inline def apply(status: String): BadgenOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BadgenOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconWidth(value: Double): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
      
      inline def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleOption): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.badgen.badgenStrings.flat
    - typings.badgen.badgenStrings.classic
  */
  trait StyleOption extends StObject
  object StyleOption {
    
    inline def classic: typings.badgen.badgenStrings.classic = "classic".asInstanceOf[typings.badgen.badgenStrings.classic]
    
    inline def flat: typings.badgen.badgenStrings.flat = "flat".asInstanceOf[typings.badgen.badgenStrings.flat]
  }
  
  object global {
    
    trait Window extends StObject {
      
      def badgen(param0: BadgenOptions): String
      @JSName("badgen")
      var badgen_Original: js.Function1[/* param0 */ BadgenOptions, String]
    }
    object Window {
      
      inline def apply(badgen: /* param0 */ BadgenOptions => String): Window = {
        val __obj = js.Dynamic.literal(badgen = js.Any.fromFunction1(badgen))
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setBadgen(value: /* param0 */ BadgenOptions => String): Self = StObject.set(x, "badgen", js.Any.fromFunction1(value))
      }
    }
  }
}
