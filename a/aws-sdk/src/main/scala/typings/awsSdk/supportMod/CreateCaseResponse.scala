package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCaseResponse extends StObject {
  
  /**
    * The support case ID requested or returned in the call. The case ID is an alphanumeric string in the following format: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.undefined
}
object CreateCaseResponse {
  
  inline def apply(): CreateCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCaseResponse]
  }
  
  extension [Self <: CreateCaseResponse](x: Self) {
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setCaseIdUndefined: Self = StObject.set(x, "caseId", js.undefined)
  }
}
