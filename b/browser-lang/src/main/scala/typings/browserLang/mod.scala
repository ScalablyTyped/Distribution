package typings.browserLang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browser-lang", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(option: BrowserOption): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(option.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait BrowserOption extends StObject {
    
    var fallback: String
    
    var languages: js.Array[String]
  }
  object BrowserOption {
    
    inline def apply(fallback: String, languages: js.Array[String]): BrowserOption = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserOption] (val x: Self) extends AnyVal {
      
      inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
    }
  }
}
