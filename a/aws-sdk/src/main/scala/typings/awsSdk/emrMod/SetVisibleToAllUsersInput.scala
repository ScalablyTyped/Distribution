package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class SetVisibleToAllUsersInputOps[Self <: SetVisibleToAllUsersInput] (val x: Self) extends AnyVal {
    
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
    def setJobFlowIdsVarargs(value: XmlString*): Self = this.set("JobFlowIds", js.Array(value :_*))
    
    @scala.inline
    def setJobFlowIds(value: XmlStringList): Self = this.set("JobFlowIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleToAllUsers(value: Boolean): Self = this.set("VisibleToAllUsers", value.asInstanceOf[js.Any])
  }
}
