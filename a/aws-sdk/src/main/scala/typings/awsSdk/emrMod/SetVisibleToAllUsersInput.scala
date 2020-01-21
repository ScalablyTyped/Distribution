package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetVisibleToAllUsersInput extends js.Object {
  /**
    * The unique identifier of the job flow (cluster).
    */
  var JobFlowIds: XmlStringList = js.native
  /**
    * A value of true indicates that all IAM users in the AWS account can perform cluster actions if they have the proper IAM policy permissions. This is the default. A value of false indicates that only the IAM user who created the cluster can perform actions.
    */
  var VisibleToAllUsers: Boolean = js.native
}

object SetVisibleToAllUsersInput {
  @scala.inline
  def apply(JobFlowIds: XmlStringList, VisibleToAllUsers: Boolean): SetVisibleToAllUsersInput = {
    val __obj = js.Dynamic.literal(JobFlowIds = JobFlowIds.asInstanceOf[js.Any], VisibleToAllUsers = VisibleToAllUsers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetVisibleToAllUsersInput]
  }
}

