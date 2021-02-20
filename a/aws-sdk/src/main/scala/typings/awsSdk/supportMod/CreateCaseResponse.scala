package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCaseResponse extends StObject {
  
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string in the following format: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.native
}
object CreateCaseResponse {
  
  @scala.inline
  def apply(): CreateCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCaseResponse]
  }
  
  @scala.inline
  implicit class CreateCaseResponseMutableBuilder[Self <: CreateCaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseIdUndefined: Self = StObject.set(x, "caseId", js.undefined)
  }
}
