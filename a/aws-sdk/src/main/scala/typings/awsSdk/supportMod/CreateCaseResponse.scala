package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCaseResponse extends js.Object {
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.native
}

object CreateCaseResponse {
  @scala.inline
  def apply(caseId: CaseId = null): CreateCaseResponse = {
    val __obj = js.Dynamic.literal()
    if (caseId != null) __obj.updateDynamic("caseId")(caseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCaseResponse]
  }
}

