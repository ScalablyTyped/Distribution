package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeedbackData extends StObject {
  
  /**
    * The relevance of the target this feedback is for.
    */
  var relevance: Relevance
}
object FeedbackData {
  
  inline def apply(relevance: Relevance): FeedbackData = {
    val __obj = js.Dynamic.literal(relevance = relevance.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackData]
  }
  
  extension [Self <: FeedbackData](x: Self) {
    
    inline def setRelevance(value: Relevance): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
  }
}
