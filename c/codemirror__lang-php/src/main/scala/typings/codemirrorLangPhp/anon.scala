package typings.codemirrorLangPhp

import typings.codemirrorLanguage.mod.Language_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BaseLanguage extends StObject {
    
    /**
      By default, the parser will treat content outside of `<?` and
      `?>` markers as HTML. You can pass a different language here to
      change that. Explicitly passing disables parsing of such content.
      */
    var baseLanguage: js.UndefOr[Language_ | Null] = js.undefined
    
    /**
      By default, PHP parsing only starts at the first `<?` marker.
      When you set this to true, it starts immediately at the start of
      the document.
      */
    var plain: js.UndefOr[Boolean] = js.undefined
  }
  object BaseLanguage {
    
    inline def apply(): BaseLanguage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseLanguage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseLanguage] (val x: Self) extends AnyVal {
      
      inline def setBaseLanguage(value: Language_): Self = StObject.set(x, "baseLanguage", value.asInstanceOf[js.Any])
      
      inline def setBaseLanguageNull: Self = StObject.set(x, "baseLanguage", null)
      
      inline def setBaseLanguageUndefined: Self = StObject.set(x, "baseLanguage", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    }
  }
}
