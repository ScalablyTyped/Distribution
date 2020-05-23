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
  def apply(findings: listOfFinding = null): GetFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (findings != null) __obj.updateDynamic("findings")(findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsResponse]
  }
}

