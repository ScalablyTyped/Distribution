package typings.highlightJsY75vKsj1

import typings.highlightJsY75vKsj1.highlightJsY75vKsj1Strings.self
import typings.std.Element
import typings.std.Record
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Block extends StObject {
    
    var block: Element
    
    var result: HighlightResult
    
    var text: String
  }
  object Block {
    
    inline def apply(block: Element, result: HighlightResult, text: String): Block = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    extension [Self <: Block](x: Self) {
      
      inline def setBlock(value: Element): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setResult(value: HighlightResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockLanguage extends StObject {
    
    var block: Element
    
    var language: String
  }
  object BlockLanguage {
    
    inline def apply(block: Element, language: String): BlockLanguage = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockLanguage]
    }
    
    extension [Self <: BlockLanguage](x: Self) {
      
      inline def setBlock(value: Element): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  trait El extends StObject {
    
    var el: Element
    
    var result: HighlightResult
    
    var text: String
  }
  object El {
    
    inline def apply(el: Element, result: HighlightResult, text: String): El = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[El]
    }
    
    extension [Self <: El](x: Self) {
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setResult(value: HighlightResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Language extends StObject {
    
    var el: Element
    
    var language: String
  }
  object Language {
    
    inline def apply(el: Element, language: String): typings.highlightJsY75vKsj1.anon.Language = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.highlightJsY75vKsj1.anon.Language]
    }
    
    extension [Self <: typings.highlightJsY75vKsj1.anon.Language](x: Self) {
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  trait LanguageName extends StObject {
    
    var languageName: String
  }
  object LanguageName {
    
    inline def apply(languageName: String): LanguageName = {
      val __obj = js.Dynamic.literal(languageName = languageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageName]
    }
    
    extension [Self <: LanguageName](x: Self) {
      
      inline def setLanguageName(value: String): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<.highlight.js-Y75vKsj1.HighlightResult, 'second_best'> */
  trait OmitHighlightResultsecond extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var emitter: Emitter
    
    var errorRaised: js.UndefOr[js.Error] = js.undefined
    
    var illegal: Boolean
    
    var illegalBy: js.UndefOr[illegalData] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var relevance: Double
    
    var sofar: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[typings.highlightJsY75vKsj1.Language | CompiledMode] = js.undefined
    
    var value: String
  }
  object OmitHighlightResultsecond {
    
    inline def apply(emitter: Emitter, illegal: Boolean, relevance: Double, value: String): OmitHighlightResultsecond = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], illegal = illegal.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitHighlightResultsecond]
    }
    
    extension [Self <: OmitHighlightResultsecond](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setEmitter(value: Emitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setErrorRaised(value: js.Error): Self = StObject.set(x, "errorRaised", value.asInstanceOf[js.Any])
      
      inline def setErrorRaisedUndefined: Self = StObject.set(x, "errorRaised", js.undefined)
      
      inline def setIllegal(value: Boolean): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
      
      inline def setIllegalBy(value: illegalData): Self = StObject.set(x, "illegalBy", value.asInstanceOf[js.Any])
      
      inline def setIllegalByUndefined: Self = StObject.set(x, "illegalBy", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      inline def setSofar(value: String): Self = StObject.set(x, "sofar", value.asInstanceOf[js.Any])
      
      inline def setSofarUndefined: Self = StObject.set(x, "sofar", js.undefined)
      
      inline def setTop(value: typings.highlightJsY75vKsj1.Language | CompiledMode): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<.highlight.js-Y75vKsj1.HLJSOptions> */
  trait PartialHLJSOptions extends StObject {
    
    var __emitter: js.UndefOr[EmitterConstructor] = js.undefined
    
    var classPrefix: js.UndefOr[String] = js.undefined
    
    var languageDetectRe: js.UndefOr[js.RegExp] = js.undefined
    
    var languages: js.UndefOr[js.Array[String]] = js.undefined
    
    var noHighlightRe: js.UndefOr[js.RegExp] = js.undefined
    
    var tabReplace: js.UndefOr[String] = js.undefined
    
    var useBR: js.UndefOr[Boolean] = js.undefined
  }
  object PartialHLJSOptions {
    
    inline def apply(): PartialHLJSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHLJSOptions]
    }
    
    extension [Self <: PartialHLJSOptions](x: Self) {
      
      inline def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      inline def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
      
      inline def setLanguageDetectRe(value: js.RegExp): Self = StObject.set(x, "languageDetectRe", value.asInstanceOf[js.Any])
      
      inline def setLanguageDetectReUndefined: Self = StObject.set(x, "languageDetectRe", js.undefined)
      
      inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
      
      inline def setNoHighlightRe(value: js.RegExp): Self = StObject.set(x, "noHighlightRe", value.asInstanceOf[js.Any])
      
      inline def setNoHighlightReUndefined: Self = StObject.set(x, "noHighlightRe", js.undefined)
      
      inline def setTabReplace(value: String): Self = StObject.set(x, "tabReplace", value.asInstanceOf[js.Any])
      
      inline def setTabReplaceUndefined: Self = StObject.set(x, "tabReplace", js.undefined)
      
      inline def setUseBR(value: Boolean): Self = StObject.set(x, "useBR", value.asInstanceOf[js.Any])
      
      inline def setUseBRUndefined: Self = StObject.set(x, "useBR", js.undefined)
      
      inline def set__emitter(value: EmitterConstructor): Self = StObject.set(x, "__emitter", value.asInstanceOf[js.Any])
      
      inline def set__emitterUndefined: Self = StObject.set(x, "__emitter", js.undefined)
    }
  }
  
  /* Inlined std.Partial<.highlight.js-Y75vKsj1.Mode> & {  binary :string | std.RegExp | undefined} */
  trait PartialModebinarystringRe extends StObject {
    
    var __beforeBegin: js.UndefOr[js.Function] = js.undefined
    
    var begin: js.UndefOr[js.RegExp | String] = js.undefined
    
    var beginKeywords: js.UndefOr[String] = js.undefined
    
    var binary: js.UndefOr[String | js.RegExp] = js.undefined
    
    var cachedVariants: js.UndefOr[js.Array[Mode]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contains: js.UndefOr[js.Array[self | Mode]] = js.undefined
    
    var end: js.UndefOr[js.RegExp | String] = js.undefined
    
    var endSameAsBegin: js.UndefOr[Boolean] = js.undefined
    
    var endsParent: js.UndefOr[Boolean] = js.undefined
    
    var endsWithParent: js.UndefOr[Boolean] = js.undefined
    
    var excludeBegin: js.UndefOr[Boolean] = js.undefined
    
    var excludeEnd: js.UndefOr[Boolean] = js.undefined
    
    var illegal: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var isCompiled: js.UndefOr[Boolean] = js.undefined
    
    var keywords: js.UndefOr[(Record[String, Any]) | String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var lexemes: js.UndefOr[String | js.RegExp] = js.undefined
    
    var `match`: js.UndefOr[js.RegExp | String] = js.undefined
    
    @JSName("on:begin")
    var onColonbegin: js.UndefOr[ModeCallback] = js.undefined
    
    @JSName("on:end")
    var onColonend: js.UndefOr[js.Function] = js.undefined
    
    var parent: js.UndefOr[Mode] = js.undefined
    
    var relevance: js.UndefOr[Double] = js.undefined
    
    var returnBegin: js.UndefOr[Boolean] = js.undefined
    
    var returnEnd: js.UndefOr[Boolean] = js.undefined
    
    var skip: js.UndefOr[Boolean] = js.undefined
    
    var starts: js.UndefOr[Mode] = js.undefined
    
    var subLanguage: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var variants: js.UndefOr[js.Array[Mode]] = js.undefined
  }
  object PartialModebinarystringRe {
    
    inline def apply(): PartialModebinarystringRe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialModebinarystringRe]
    }
    
    extension [Self <: PartialModebinarystringRe](x: Self) {
      
      inline def setBegin(value: js.RegExp | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginKeywords(value: String): Self = StObject.set(x, "beginKeywords", value.asInstanceOf[js.Any])
      
      inline def setBeginKeywordsUndefined: Self = StObject.set(x, "beginKeywords", js.undefined)
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setBinary(value: String | js.RegExp): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setCachedVariants(value: js.Array[Mode]): Self = StObject.set(x, "cachedVariants", value.asInstanceOf[js.Any])
      
      inline def setCachedVariantsUndefined: Self = StObject.set(x, "cachedVariants", js.undefined)
      
      inline def setCachedVariantsVarargs(value: Mode*): Self = StObject.set(x, "cachedVariants", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContains(value: js.Array[self | Mode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setContainsVarargs(value: (self | Mode)*): Self = StObject.set(x, "contains", js.Array(value*))
      
      inline def setEnd(value: js.RegExp | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndSameAsBegin(value: Boolean): Self = StObject.set(x, "endSameAsBegin", value.asInstanceOf[js.Any])
      
      inline def setEndSameAsBeginUndefined: Self = StObject.set(x, "endSameAsBegin", js.undefined)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndsParent(value: Boolean): Self = StObject.set(x, "endsParent", value.asInstanceOf[js.Any])
      
      inline def setEndsParentUndefined: Self = StObject.set(x, "endsParent", js.undefined)
      
      inline def setEndsWithParent(value: Boolean): Self = StObject.set(x, "endsWithParent", value.asInstanceOf[js.Any])
      
      inline def setEndsWithParentUndefined: Self = StObject.set(x, "endsWithParent", js.undefined)
      
      inline def setExcludeBegin(value: Boolean): Self = StObject.set(x, "excludeBegin", value.asInstanceOf[js.Any])
      
      inline def setExcludeBeginUndefined: Self = StObject.set(x, "excludeBegin", js.undefined)
      
      inline def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
      
      inline def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
      
      inline def setIllegal(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
      
      inline def setIllegalUndefined: Self = StObject.set(x, "illegal", js.undefined)
      
      inline def setIllegalVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "illegal", js.Array(value*))
      
      inline def setIsCompiled(value: Boolean): Self = StObject.set(x, "isCompiled", value.asInstanceOf[js.Any])
      
      inline def setIsCompiledUndefined: Self = StObject.set(x, "isCompiled", js.undefined)
      
      inline def setKeywords(value: (Record[String, Any]) | String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLexemes(value: String | js.RegExp): Self = StObject.set(x, "lexemes", value.asInstanceOf[js.Any])
      
      inline def setLexemesUndefined: Self = StObject.set(x, "lexemes", js.undefined)
      
      inline def setMatch(value: js.RegExp | String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = StObject.set(x, "on:begin", js.Any.fromFunction2(value))
      
      inline def setOnColonbeginUndefined: Self = StObject.set(x, "on:begin", js.undefined)
      
      inline def setOnColonend(value: js.Function): Self = StObject.set(x, "on:end", value.asInstanceOf[js.Any])
      
      inline def setOnColonendUndefined: Self = StObject.set(x, "on:end", js.undefined)
      
      inline def setParent(value: Mode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
      
      inline def setReturnBegin(value: Boolean): Self = StObject.set(x, "returnBegin", value.asInstanceOf[js.Any])
      
      inline def setReturnBeginUndefined: Self = StObject.set(x, "returnBegin", js.undefined)
      
      inline def setReturnEnd(value: Boolean): Self = StObject.set(x, "returnEnd", value.asInstanceOf[js.Any])
      
      inline def setReturnEndUndefined: Self = StObject.set(x, "returnEnd", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setStarts(value: Mode): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
      
      inline def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
      
      inline def setSubLanguage(value: String | js.Array[String]): Self = StObject.set(x, "subLanguage", value.asInstanceOf[js.Any])
      
      inline def setSubLanguageUndefined: Self = StObject.set(x, "subLanguage", js.undefined)
      
      inline def setSubLanguageVarargs(value: String*): Self = StObject.set(x, "subLanguage", js.Array(value*))
      
      inline def setVariants(value: js.Array[Mode]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setVariantsVarargs(value: Mode*): Self = StObject.set(x, "variants", js.Array(value*))
      
      inline def set__beforeBegin(value: js.Function): Self = StObject.set(x, "__beforeBegin", value.asInstanceOf[js.Any])
      
      inline def set__beforeBeginUndefined: Self = StObject.set(x, "__beforeBegin", js.undefined)
    }
  }
}
