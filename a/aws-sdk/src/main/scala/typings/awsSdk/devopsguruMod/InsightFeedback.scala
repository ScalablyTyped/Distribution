package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightFeedback extends StObject {
  
  /**
    *  The feedback provided by the customer. 
    */
  var Feedback: js.UndefOr[InsightFeedbackOption] = js.undefined
  
  /**
    *  The insight feedback ID. 
    */
  var Id: js.UndefOr[InsightId] = js.undefined
}
object InsightFeedback {
  
  inline def apply(): InsightFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightFeedback]
  }
  
  extension [Self <: InsightFeedback](x: Self) {
    
    inline def setFeedback(value: InsightFeedbackOption): Self = StObject.set(x, "Feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "Feedback", js.undefined)
    
    inline def setId(value: InsightId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
