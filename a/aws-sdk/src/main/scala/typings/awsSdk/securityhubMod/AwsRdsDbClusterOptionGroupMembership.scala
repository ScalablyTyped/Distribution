package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbClusterOptionGroupMembership extends js.Object {
  
  /**
    * The name of the DB cluster option group.
    */
  var DbClusterOptionGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the DB cluster option group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbClusterOptionGroupMembership {
  
  @scala.inline
  def apply(): AwsRdsDbClusterOptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbClusterOptionGroupMembership]
  }
  
  @scala.inline
  implicit class AwsRdsDbClusterOptionGroupMembershipOps[Self <: AwsRdsDbClusterOptionGroupMembership] (val x: Self) extends AnyVal {
    
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
    def setDbClusterOptionGroupName(value: NonEmptyString): Self = this.set("DbClusterOptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterOptionGroupName: Self = this.set("DbClusterOptionGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
