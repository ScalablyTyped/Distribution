package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCaseResponse extends js.Object {
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
  implicit class CreateCaseResponseOps[Self <: CreateCaseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaseId(value: CaseId): Self = this.set("caseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseId: Self = this.set("caseId", js.undefined)
  }
  
}

