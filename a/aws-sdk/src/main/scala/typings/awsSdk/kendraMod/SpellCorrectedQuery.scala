package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpellCorrectedQuery extends StObject {
  
  /**
    * The corrected misspelled word or words in a query.
    */
  var Corrections: js.UndefOr[CorrectionList] = js.undefined
  
  /**
    * The query with the suggested spell corrections.
    */
  var SuggestedQueryText: js.UndefOr[typings.awsSdk.kendraMod.SuggestedQueryText] = js.undefined
}
object SpellCorrectedQuery {
  
  inline def apply(): SpellCorrectedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpellCorrectedQuery]
  }
  
  extension [Self <: SpellCorrectedQuery](x: Self) {
    
    inline def setCorrections(value: CorrectionList): Self = StObject.set(x, "Corrections", value.asInstanceOf[js.Any])
    
    inline def setCorrectionsUndefined: Self = StObject.set(x, "Corrections", js.undefined)
    
    inline def setCorrectionsVarargs(value: Correction*): Self = StObject.set(x, "Corrections", js.Array(value*))
    
    inline def setSuggestedQueryText(value: SuggestedQueryText): Self = StObject.set(x, "SuggestedQueryText", value.asInstanceOf[js.Any])
    
    inline def setSuggestedQueryTextUndefined: Self = StObject.set(x, "SuggestedQueryText", js.undefined)
  }
}
