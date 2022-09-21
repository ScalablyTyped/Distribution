package typings.highlightJsY75vKsj1

import typings.highlightJsY75vKsj1.anon.OmitHighlightResultsecond
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightResult extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var emitter: Emitter
  
  var errorRaised: js.UndefOr[js.Error] = js.undefined
  
  var illegal: Boolean
  
  var illegalBy: js.UndefOr[illegalData] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var relevance: Double
  
  // * for auto-highlight
  var second_best: js.UndefOr[OmitHighlightResultsecond] = js.undefined
  
  var sofar: js.UndefOr[String] = js.undefined
  
  var top: js.UndefOr[Language | CompiledMode] = js.undefined
  
  var value: String
}
object HighlightResult {
  
  inline def apply(emitter: Emitter, illegal: Boolean, relevance: Double, value: String): HighlightResult = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], illegal = illegal.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightResult]
  }
  
  extension [Self <: HighlightResult](x: Self) {
    
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
    
    inline def setSecond_best(value: OmitHighlightResultsecond): Self = StObject.set(x, "second_best", value.asInstanceOf[js.Any])
    
    inline def setSecond_bestUndefined: Self = StObject.set(x, "second_best", js.undefined)
    
    inline def setSofar(value: String): Self = StObject.set(x, "sofar", value.asInstanceOf[js.Any])
    
    inline def setSofarUndefined: Self = StObject.set(x, "sofar", js.undefined)
    
    inline def setTop(value: Language | CompiledMode): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
