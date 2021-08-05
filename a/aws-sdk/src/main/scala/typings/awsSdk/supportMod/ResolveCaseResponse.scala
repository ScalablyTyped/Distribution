package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveCaseResponse extends StObject {
  
  /**
    * The status of the case after the ResolveCase request was processed.
    */
  var finalCaseStatus: js.UndefOr[CaseStatus] = js.undefined
  
  /**
    * The status of the case when the ResolveCase request was sent.
    */
  var initialCaseStatus: js.UndefOr[CaseStatus] = js.undefined
}
object ResolveCaseResponse {
  
  inline def apply(): ResolveCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveCaseResponse]
  }
  
  extension [Self <: ResolveCaseResponse](x: Self) {
    
    inline def setFinalCaseStatus(value: CaseStatus): Self = StObject.set(x, "finalCaseStatus", value.asInstanceOf[js.Any])
    
    inline def setFinalCaseStatusUndefined: Self = StObject.set(x, "finalCaseStatus", js.undefined)
    
    inline def setInitialCaseStatus(value: CaseStatus): Self = StObject.set(x, "initialCaseStatus", value.asInstanceOf[js.Any])
    
    inline def setInitialCaseStatusUndefined: Self = StObject.set(x, "initialCaseStatus", js.undefined)
  }
}
