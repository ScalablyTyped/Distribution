package typings.codemirrorLangHtml

import org.scalablytyped.runtime.StringDictionary
import typings.codemirrorAutocomplete.mod.CompletionContext
import typings.codemirrorAutocomplete.mod.CompletionResult
import typings.codemirrorLangHtml.anon.AutoCloseTags
import typings.codemirrorLangHtml.anon.ExtraGlobalAttributes
import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import typings.codemirrorState.mod.Extension
import typings.lezerCommon.mod.Parser
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Extension that will automatically insert close tags when a `>` or
  `/` is typed.
  */
  @JSImport("@codemirror/lang-html", "autoCloseTags")
  @js.native
  val autoCloseTags: Extension = js.native
  
  /**
  Language support for HTML, including
  [`htmlCompletion`](https://codemirror.net/6/docs/ref/#lang-html.htmlCompletion) and JavaScript and
  CSS support extensions.
  */
  inline def html(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("html")().asInstanceOf[LanguageSupport]
  inline def html(config: AutoCloseTags): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(config.asInstanceOf[js.Any]).asInstanceOf[LanguageSupport]
  
  /**
  HTML tag completion. Opens and closes tags and attributes in a
  context-aware way.
  */
  inline def htmlCompletionSource(context: CompletionContext): CompletionResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlCompletionSource")(context.asInstanceOf[js.Any]).asInstanceOf[CompletionResult | Null]
  
  /**
  Create a completion source for HTML extended with additional tags
  or attributes.
  */
  inline def htmlCompletionSourceWith(config: ExtraGlobalAttributes): js.Function1[/* context */ CompletionContext, CompletionResult | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlCompletionSourceWith")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* context */ CompletionContext, CompletionResult | Null]]
  
  /**
  A language provider based on the [Lezer HTML
  parser](https://github.com/lezer-parser/html), extended with the
  JavaScript and CSS parsers to parse the content of `<script>` and
  `<style>` tags.
  */
  @JSImport("@codemirror/lang-html", "htmlLanguage")
  @js.native
  val htmlLanguage: LRLanguage = js.native
  
  /**
  A language provider based on the [Lezer HTML
  parser](https://github.com/lezer-parser/html), extended with the
  JavaScript and CSS parsers to parse the content of `<script>` and
  `<style>` tags.
  */
  @JSImport("@codemirror/lang-html", "htmlPlain")
  @js.native
  val htmlPlain: LRLanguage = js.native
  
  trait NestedAttr extends StObject {
    
    var name: String
    
    var parser: Parser
    
    var tagName: js.UndefOr[String] = js.undefined
  }
  object NestedAttr {
    
    inline def apply(name: String, parser: Parser): NestedAttr = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedAttr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NestedAttr] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParser(value: Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
  
  trait NestedLang extends StObject {
    
    var attrs: js.UndefOr[js.Function1[/* attrs */ StringDictionary[String], Boolean]] = js.undefined
    
    var parser: Parser
    
    var tag: String
  }
  object NestedLang {
    
    inline def apply(parser: Parser, tag: String): NestedLang = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedLang]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NestedLang] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: /* attrs */ StringDictionary[String] => Boolean): Self = StObject.set(x, "attrs", js.Any.fromFunction1(value))
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setParser(value: Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  Type used to specify tags to complete.
  */
  trait TagSpec extends StObject {
    
    /**
      Define tag-specific attributes. Property names are attribute
      names, and property values can be null to indicate free-form
      attributes, or a list of strings for suggested attribute values.
      */
    var attrs: js.UndefOr[Record[String, Null | js.Array[String]]] = js.undefined
    
    /**
      Can be used to specify a list of child tags that are valid
      inside this tag. The default is to allow any tag.
      */
    var children: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      When set to false, don't complete global attributes on this tag.
      */
    var globalAttrs: js.UndefOr[Boolean] = js.undefined
  }
  object TagSpec {
    
    inline def apply(): TagSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagSpec] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: Record[String, Null | js.Array[String]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setGlobalAttrs(value: Boolean): Self = StObject.set(x, "globalAttrs", value.asInstanceOf[js.Any])
      
      inline def setGlobalAttrsUndefined: Self = StObject.set(x, "globalAttrs", js.undefined)
    }
  }
}
