package typings.highlightJsY75vKsj1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HLJSOptions extends StObject {
  
  var __emitter: EmitterConstructor
  
  var classPrefix: String
  
  var languageDetectRe: js.RegExp
  
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  
  var noHighlightRe: js.RegExp
  
  var tabReplace: js.UndefOr[String] = js.undefined
  
  var useBR: Boolean
}
object HLJSOptions {
  
  inline def apply(
    __emitter: EmitterConstructor,
    classPrefix: String,
    languageDetectRe: js.RegExp,
    noHighlightRe: js.RegExp,
    useBR: Boolean
  ): HLJSOptions = {
    val __obj = js.Dynamic.literal(__emitter = __emitter.asInstanceOf[js.Any], classPrefix = classPrefix.asInstanceOf[js.Any], languageDetectRe = languageDetectRe.asInstanceOf[js.Any], noHighlightRe = noHighlightRe.asInstanceOf[js.Any], useBR = useBR.asInstanceOf[js.Any])
    __obj.asInstanceOf[HLJSOptions]
  }
  
  extension [Self <: HLJSOptions](x: Self) {
    
    inline def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
    
    inline def setLanguageDetectRe(value: js.RegExp): Self = StObject.set(x, "languageDetectRe", value.asInstanceOf[js.Any])
    
    inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
    
    inline def setNoHighlightRe(value: js.RegExp): Self = StObject.set(x, "noHighlightRe", value.asInstanceOf[js.Any])
    
    inline def setTabReplace(value: String): Self = StObject.set(x, "tabReplace", value.asInstanceOf[js.Any])
    
    inline def setTabReplaceUndefined: Self = StObject.set(x, "tabReplace", js.undefined)
    
    inline def setUseBR(value: Boolean): Self = StObject.set(x, "useBR", value.asInstanceOf[js.Any])
    
    inline def set__emitter(value: EmitterConstructor): Self = StObject.set(x, "__emitter", value.asInstanceOf[js.Any])
  }
}
