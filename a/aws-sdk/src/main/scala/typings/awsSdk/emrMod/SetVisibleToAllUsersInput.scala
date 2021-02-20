package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetVisibleToAllUsersInput extends StObject {
  
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
  implicit class SetVisibleToAllUsersInputMutableBuilder[Self <: SetVisibleToAllUsersInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobFlowIds(value: XmlStringList): Self = StObject.set(x, "JobFlowIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowIdsVarargs(value: XmlString*): Self = StObject.set(x, "JobFlowIds", js.Array(value :_*))
    
    @scala.inline
    def setVisibleToAllUsers(value: Boolean): Self = StObject.set(x, "VisibleToAllUsers", value.asInstanceOf[js.Any])
  }
}
