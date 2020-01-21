package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetApplicationsOutput extends js.Object {
  /**
    * Information about the applications.
    */
  var applicationsInfo: js.UndefOr[ApplicationsInfoList] = js.native
}

object BatchGetApplicationsOutput {
  @scala.inline
  def apply(applicationsInfo: ApplicationsInfoList = null): BatchGetApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    if (applicationsInfo != null) __obj.updateDynamic("applicationsInfo")(applicationsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetApplicationsOutput]
  }
}

