package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsJobAbortConfig extends js.Object {
  /**
    * The list of criteria that determine when and how to abort the job.
    */
  var abortCriteriaList: AwsJobAbortCriteriaList = js.native
}

object AwsJobAbortConfig {
  @scala.inline
  def apply(abortCriteriaList: AwsJobAbortCriteriaList): AwsJobAbortConfig = {
    val __obj = js.Dynamic.literal(abortCriteriaList = abortCriteriaList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsJobAbortConfig]
  }
}

