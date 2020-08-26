package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsResponse extends js.Object {
  /**
    * An array of objects, one for each finding that meets the criteria specified in the request.
    */
  var findings: js.UndefOr[listOfFinding] = js.native
}

object GetFindingsResponse {
  @scala.inline
  def apply(): GetFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsResponse]
  }
  @scala.inline
  implicit class GetFindingsResponseOps[Self <: GetFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindingsVarargs(value: Finding*): Self = this.set("findings", js.Array(value :_*))
    @scala.inline
    def setFindings(value: listOfFinding): Self = this.set("findings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindings: Self = this.set("findings", js.undefined)
  }
  
}

