package typings.codemirrorLangMarkdown

import typings.codemirrorLanguage.mod.LanguageDescription
import typings.codemirrorLanguage.mod.LanguageSupport
import typings.codemirrorLanguage.mod.Language_
import typings.lezerMarkdown.distMarkdownMod.MarkdownExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddKeymap extends StObject {
    
    /**
      Set this to false to disable installation of the Markdown
      [keymap](https://codemirror.net/6/docs/ref/#lang-markdown.markdownKeymap).
      */
    var addKeymap: js.UndefOr[Boolean] = js.undefined
    
    /**
      The base language to use. Defaults to
      [`commonmarkLanguage`](https://codemirror.net/6/docs/ref/#lang-markdown.commonmarkLanguage).
      */
    var base: js.UndefOr[Language_] = js.undefined
    
    /**
      A source of language support for highlighting fenced code
      blocks. When it is an array, the parser will use
      [`LanguageDescription.matchLanguageName`](https://codemirror.net/6/docs/ref/#language.LanguageDescription^matchLanguageName)
      with the fenced code info to find a matching language. When it
      is a function, will be called with the info string and may
      return a language or `LanguageDescription` object.
      */
    var codeLanguages: js.UndefOr[
        js.Array[LanguageDescription] | (js.Function1[/* info */ String, Language_ | LanguageDescription | Null])
      ] = js.undefined
    
    /**
      When given, this language will be used by default to parse code
      blocks.
      */
    var defaultCodeLanguage: js.UndefOr[Language_ | LanguageSupport] = js.undefined
    
    /**
      Markdown parser
      [extensions](https://github.com/lezer-parser/markdown#user-content-markdownextension)
      to add to the parser.
      */
    var extensions: js.UndefOr[MarkdownExtension] = js.undefined
  }
  object AddKeymap {
    
    inline def apply(): AddKeymap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddKeymap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddKeymap] (val x: Self) extends AnyVal {
      
      inline def setAddKeymap(value: Boolean): Self = StObject.set(x, "addKeymap", value.asInstanceOf[js.Any])
      
      inline def setAddKeymapUndefined: Self = StObject.set(x, "addKeymap", js.undefined)
      
      inline def setBase(value: Language_): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setCodeLanguages(
        value: js.Array[LanguageDescription] | (js.Function1[/* info */ String, Language_ | LanguageDescription | Null])
      ): Self = StObject.set(x, "codeLanguages", value.asInstanceOf[js.Any])
      
      inline def setCodeLanguagesFunction1(value: /* info */ String => Language_ | LanguageDescription | Null): Self = StObject.set(x, "codeLanguages", js.Any.fromFunction1(value))
      
      inline def setCodeLanguagesUndefined: Self = StObject.set(x, "codeLanguages", js.undefined)
      
      inline def setCodeLanguagesVarargs(value: LanguageDescription*): Self = StObject.set(x, "codeLanguages", js.Array(value*))
      
      inline def setDefaultCodeLanguage(value: Language_ | LanguageSupport): Self = StObject.set(x, "defaultCodeLanguage", value.asInstanceOf[js.Any])
      
      inline def setDefaultCodeLanguageUndefined: Self = StObject.set(x, "defaultCodeLanguage", js.undefined)
      
      inline def setExtensions(value: MarkdownExtension): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: Any*): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
}
