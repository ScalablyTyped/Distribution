package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultData extends StObject {
  
  /**
    * The document.
    */
  var document: Document
  
  /**
    * The relevance score of the results.
    */
  var relevanceScore: js.UndefOr[RelevanceScore] = js.undefined
  
  /**
    * The identifier of the result data.
    */
  var resultId: Uuid
}
object ResultData {
  
  inline def apply(document: Document, resultId: Uuid): ResultData = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultData]
  }
  
  extension [Self <: ResultData](x: Self) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setRelevanceScore(value: RelevanceScore): Self = StObject.set(x, "relevanceScore", value.asInstanceOf[js.Any])
    
    inline def setRelevanceScoreUndefined: Self = StObject.set(x, "relevanceScore", js.undefined)
    
    inline def setResultId(value: Uuid): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
  }
}
