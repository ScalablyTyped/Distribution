package typings.cheerio

import org.scalablytyped.runtime.Instantiable2
import typings.domhandler.mod.DomHandlerOptions
import typings.domhandler.mod.Element
import typings.htmlparser2.anon.DecodeEntities
import typings.htmlparser2.libTokenizerMod.Callbacks
import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionsMod {
  
  @JSImport("cheerio/lib/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cheerio/lib/options", JSImport.Default)
  @js.native
  val default: CheerioOptions = js.native
  
  inline def flatten(): js.UndefOr[InternalOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[js.UndefOr[InternalOptions]]
  inline def flatten(options: CheerioOptions): js.UndefOr[InternalOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[InternalOptions]]
  
  trait CheerioOptions
    extends StObject
       with HTMLParser2Options
       with Parse5Options {
    
    /** The base URI for the document. Used for the `href` and `src` props. */
    var baseURI: js.UndefOr[String | URL] = js.undefined
    
    /**
      * Extension point for pseudo-classes.
      *
      * Maps from names to either strings of functions.
      *
      * - A string value is a selector that the element must match to be selected.
      * - A function is called with the element as its first argument, and optional
      *   parameters second. If it returns true, the element is selected.
      *
      * @example
      *
      * ```js
      * const $ = cheerio.load(
      *   '<div class="foo"></div><div data-bar="boo"></div>',
      *   {
      *     pseudos: {
      *       // `:foo` is an alias for `div.foo`
      *       foo: 'div.foo',
      *       // `:bar(val)` is equivalent to `[data-bar=val s]`
      *       bar: (el, val) => el.attribs['data-bar'] === val,
      *     },
      *   }
      * );
      *
      * $(':foo').length; // 1
      * $('div:bar(boo)').length; // 1
      * $('div:bar(baz)').length; // 0
      * ```
      */
    var pseudos: js.UndefOr[
        Record[
          String, 
          String | (js.Function2[/* elem */ Element, /* value */ js.UndefOr[String | Null], Boolean])
        ]
      ] = js.undefined
    
    /**
      * Is the document in quirks mode?
      *
      * This will lead to `.className` and `#id` being case-insensitive.
      *
      * @default false
      */
    var quirksMode: js.UndefOr[Boolean] = js.undefined
    
    /** Recommended way of configuring htmlparser2 when wanting to parse XML. */
    var xml: js.UndefOr[HTMLParser2Options | Boolean] = js.undefined
  }
  object CheerioOptions {
    
    inline def apply(): CheerioOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheerioOptions]
    }
    
    extension [Self <: CheerioOptions](x: Self) {
      
      inline def setBaseURI(value: String | URL): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
      
      inline def setBaseURIUndefined: Self = StObject.set(x, "baseURI", js.undefined)
      
      inline def setPseudos(
        value: Record[
              String, 
              String | (js.Function2[/* elem */ Element, /* value */ js.UndefOr[String | Null], Boolean])
            ]
      ): Self = StObject.set(x, "pseudos", value.asInstanceOf[js.Any])
      
      inline def setPseudosUndefined: Self = StObject.set(x, "pseudos", js.undefined)
      
      inline def setQuirksMode(value: Boolean): Self = StObject.set(x, "quirksMode", value.asInstanceOf[js.Any])
      
      inline def setQuirksModeUndefined: Self = StObject.set(x, "quirksMode", js.undefined)
      
      inline def setXml(value: HTMLParser2Options | Boolean): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
      
      inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.htmlparser2.libParserMod.ParserOptions because var conflicts: xmlMode. Inlined lowerCaseTags, decodeEntities, lowerCaseAttributeNames, Tokenizer, recognizeCDATA, recognizeSelfClosing */ trait HTMLParser2Options
    extends StObject
       with DomHandlerOptions {
    
    /**
      * Allows the default tokenizer to be overwritten.
      */
    var Tokenizer: js.UndefOr[
        Instantiable2[
          /* param0 */ DecodeEntities, 
          /* cbs */ Callbacks, 
          typings.htmlparser2.libTokenizerMod.default
        ]
      ] = js.undefined
    
    /**
      * Decode entities within the document.
      *
      * @default true
      */
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true`, all attribute names will be lowercased. This has noticeable impact on speed.
      *
      * @default !xmlMode
      */
    var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, all tags will be lowercased.
      *
      * @default !xmlMode
      */
    var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, CDATA sections will be recognized as text even if the xmlMode option is not enabled.
      * NOTE: If xmlMode is set to `true` then CDATA sections will always be recognized as text.
      *
      * @default xmlMode
      */
    var recognizeCDATA: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true`, self-closing tags will trigger the onclosetag event even if xmlMode is not set to `true`.
      * NOTE: If xmlMode is set to `true` then self-closing tags will always be recognized.
      *
      * @default xmlMode
      */
    var recognizeSelfClosing: js.UndefOr[Boolean] = js.undefined
  }
  object HTMLParser2Options {
    
    inline def apply(): HTMLParser2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLParser2Options]
    }
    
    extension [Self <: HTMLParser2Options](x: Self) {
      
      inline def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      inline def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      inline def setLowerCaseAttributeNames(value: Boolean): Self = StObject.set(x, "lowerCaseAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseAttributeNamesUndefined: Self = StObject.set(x, "lowerCaseAttributeNames", js.undefined)
      
      inline def setLowerCaseTags(value: Boolean): Self = StObject.set(x, "lowerCaseTags", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseTagsUndefined: Self = StObject.set(x, "lowerCaseTags", js.undefined)
      
      inline def setRecognizeCDATA(value: Boolean): Self = StObject.set(x, "recognizeCDATA", value.asInstanceOf[js.Any])
      
      inline def setRecognizeCDATAUndefined: Self = StObject.set(x, "recognizeCDATA", js.undefined)
      
      inline def setRecognizeSelfClosing(value: Boolean): Self = StObject.set(x, "recognizeSelfClosing", value.asInstanceOf[js.Any])
      
      inline def setRecognizeSelfClosingUndefined: Self = StObject.set(x, "recognizeSelfClosing", js.undefined)
      
      inline def setTokenizer(
        value: Instantiable2[
              /* param0 */ DecodeEntities, 
              /* cbs */ Callbacks, 
              typings.htmlparser2.libTokenizerMod.default
            ]
      ): Self = StObject.set(x, "Tokenizer", value.asInstanceOf[js.Any])
      
      inline def setTokenizerUndefined: Self = StObject.set(x, "Tokenizer", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<cheerio.cheerio/lib/options.CheerioOptions, 'xml'> */
  trait InternalOptions extends StObject {
    
    var Tokenizer: js.UndefOr[
        Instantiable2[
          /* param0 */ DecodeEntities, 
          /* cbs */ Callbacks, 
          typings.htmlparser2.libTokenizerMod.default
        ]
      ] = js.undefined
    
    /**
      * Whether to use htmlparser2.
      *
      * This is set to true if `xml` is set to true.
      */
    var _useHtmlParser2: js.UndefOr[Boolean] = js.undefined
    
    var baseURI: js.UndefOr[String | URL] = js.undefined
    
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined
    
    var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
    
    var pseudos: js.UndefOr[
        Record[
          String, 
          String | (js.Function2[/* elem */ Element, /* value */ js.UndefOr[String | Null], Boolean])
        ]
      ] = js.undefined
    
    var quirksMode: js.UndefOr[Boolean] = js.undefined
    
    var recognizeCDATA: js.UndefOr[Boolean] = js.undefined
    
    var recognizeSelfClosing: js.UndefOr[Boolean] = js.undefined
    
    var scriptingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.undefined
    
    var withEndIndices: js.UndefOr[Boolean] = js.undefined
    
    var withStartIndices: js.UndefOr[Boolean] = js.undefined
    
    var xmlMode: js.UndefOr[Boolean] = js.undefined
  }
  object InternalOptions {
    
    inline def apply(): InternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalOptions]
    }
    
    extension [Self <: InternalOptions](x: Self) {
      
      inline def setBaseURI(value: String | URL): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
      
      inline def setBaseURIUndefined: Self = StObject.set(x, "baseURI", js.undefined)
      
      inline def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      inline def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      inline def setLowerCaseAttributeNames(value: Boolean): Self = StObject.set(x, "lowerCaseAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseAttributeNamesUndefined: Self = StObject.set(x, "lowerCaseAttributeNames", js.undefined)
      
      inline def setLowerCaseTags(value: Boolean): Self = StObject.set(x, "lowerCaseTags", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseTagsUndefined: Self = StObject.set(x, "lowerCaseTags", js.undefined)
      
      inline def setPseudos(
        value: Record[
              String, 
              String | (js.Function2[/* elem */ Element, /* value */ js.UndefOr[String | Null], Boolean])
            ]
      ): Self = StObject.set(x, "pseudos", value.asInstanceOf[js.Any])
      
      inline def setPseudosUndefined: Self = StObject.set(x, "pseudos", js.undefined)
      
      inline def setQuirksMode(value: Boolean): Self = StObject.set(x, "quirksMode", value.asInstanceOf[js.Any])
      
      inline def setQuirksModeUndefined: Self = StObject.set(x, "quirksMode", js.undefined)
      
      inline def setRecognizeCDATA(value: Boolean): Self = StObject.set(x, "recognizeCDATA", value.asInstanceOf[js.Any])
      
      inline def setRecognizeCDATAUndefined: Self = StObject.set(x, "recognizeCDATA", js.undefined)
      
      inline def setRecognizeSelfClosing(value: Boolean): Self = StObject.set(x, "recognizeSelfClosing", value.asInstanceOf[js.Any])
      
      inline def setRecognizeSelfClosingUndefined: Self = StObject.set(x, "recognizeSelfClosing", js.undefined)
      
      inline def setScriptingEnabled(value: Boolean): Self = StObject.set(x, "scriptingEnabled", value.asInstanceOf[js.Any])
      
      inline def setScriptingEnabledUndefined: Self = StObject.set(x, "scriptingEnabled", js.undefined)
      
      inline def setSourceCodeLocationInfo(value: Boolean): Self = StObject.set(x, "sourceCodeLocationInfo", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationInfoUndefined: Self = StObject.set(x, "sourceCodeLocationInfo", js.undefined)
      
      inline def setTokenizer(
        value: Instantiable2[
              /* param0 */ DecodeEntities, 
              /* cbs */ Callbacks, 
              typings.htmlparser2.libTokenizerMod.default
            ]
      ): Self = StObject.set(x, "Tokenizer", value.asInstanceOf[js.Any])
      
      inline def setTokenizerUndefined: Self = StObject.set(x, "Tokenizer", js.undefined)
      
      inline def setWithEndIndices(value: Boolean): Self = StObject.set(x, "withEndIndices", value.asInstanceOf[js.Any])
      
      inline def setWithEndIndicesUndefined: Self = StObject.set(x, "withEndIndices", js.undefined)
      
      inline def setWithStartIndices(value: Boolean): Self = StObject.set(x, "withStartIndices", value.asInstanceOf[js.Any])
      
      inline def setWithStartIndicesUndefined: Self = StObject.set(x, "withStartIndices", js.undefined)
      
      inline def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      inline def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
      
      inline def set_useHtmlParser2(value: Boolean): Self = StObject.set(x, "_useHtmlParser2", value.asInstanceOf[js.Any])
      
      inline def set_useHtmlParser2Undefined: Self = StObject.set(x, "_useHtmlParser2", js.undefined)
    }
  }
  
  trait Parse5Options extends StObject {
    
    /** Disable scripting in parse5, so noscript tags would be parsed. */
    var scriptingEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Enable location support for parse5. */
    var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.undefined
  }
  object Parse5Options {
    
    inline def apply(): Parse5Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parse5Options]
    }
    
    extension [Self <: Parse5Options](x: Self) {
      
      inline def setScriptingEnabled(value: Boolean): Self = StObject.set(x, "scriptingEnabled", value.asInstanceOf[js.Any])
      
      inline def setScriptingEnabledUndefined: Self = StObject.set(x, "scriptingEnabled", js.undefined)
      
      inline def setSourceCodeLocationInfo(value: Boolean): Self = StObject.set(x, "sourceCodeLocationInfo", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationInfoUndefined: Self = StObject.set(x, "sourceCodeLocationInfo", js.undefined)
    }
  }
}
