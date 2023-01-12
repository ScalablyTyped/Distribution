package typings.clampJsMain

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(element: HTMLElement): ClampResponse = ^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any]).asInstanceOf[ClampResponse]
  inline def apply(element: HTMLElement, options: ClampOptions): ClampResponse = (^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClampResponse]
  
  @JSImport("clamp-js-main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ClampOptions extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var clamp: js.UndefOr[Double | String] = js.undefined
    
    var splitOnChars: js.UndefOr[js.Array[String]] = js.undefined
    
    var truncationChar: js.UndefOr[String] = js.undefined
    
    var truncationHTML: js.UndefOr[String | Null] = js.undefined
    
    var useNativeClamp: js.UndefOr[Boolean] = js.undefined
  }
  object ClampOptions {
    
    inline def apply(): ClampOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClampOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClampOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setClamp(value: Double | String): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      inline def setSplitOnChars(value: js.Array[String]): Self = StObject.set(x, "splitOnChars", value.asInstanceOf[js.Any])
      
      inline def setSplitOnCharsUndefined: Self = StObject.set(x, "splitOnChars", js.undefined)
      
      inline def setSplitOnCharsVarargs(value: String*): Self = StObject.set(x, "splitOnChars", js.Array(value*))
      
      inline def setTruncationChar(value: String): Self = StObject.set(x, "truncationChar", value.asInstanceOf[js.Any])
      
      inline def setTruncationCharUndefined: Self = StObject.set(x, "truncationChar", js.undefined)
      
      inline def setTruncationHTML(value: String): Self = StObject.set(x, "truncationHTML", value.asInstanceOf[js.Any])
      
      inline def setTruncationHTMLNull: Self = StObject.set(x, "truncationHTML", null)
      
      inline def setTruncationHTMLUndefined: Self = StObject.set(x, "truncationHTML", js.undefined)
      
      inline def setUseNativeClamp(value: Boolean): Self = StObject.set(x, "useNativeClamp", value.asInstanceOf[js.Any])
      
      inline def setUseNativeClampUndefined: Self = StObject.set(x, "useNativeClamp", js.undefined)
    }
  }
  
  trait ClampResponse extends StObject {
    
    var clamped: String
    
    var original: String
  }
  object ClampResponse {
    
    inline def apply(clamped: String, original: String): ClampResponse = {
      val __obj = js.Dynamic.literal(clamped = clamped.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClampResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClampResponse] (val x: Self) extends AnyVal {
      
      inline def setClamped(value: String): Self = StObject.set(x, "clamped", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    }
  }
}
