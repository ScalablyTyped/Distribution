package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IamInstanceProfileAssociation extends js.Object {
  /**
    * The ID of the association.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[typings.awsSdk.ec2Mod.IamInstanceProfile] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The state of the association.
    */
  var State: js.UndefOr[IamInstanceProfileAssociationState] = js.native
  /**
    * The time the IAM instance profile was associated with the instance.
    */
  var Timestamp: js.UndefOr[DateTime] = js.native
}

object IamInstanceProfileAssociation {
  @scala.inline
  def apply(): IamInstanceProfileAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamInstanceProfileAssociation]
  }
  @scala.inline
  implicit class IamInstanceProfileAssociationOps[Self <: IamInstanceProfileAssociation] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: String): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    @scala.inline
    def setIamInstanceProfile(value: IamInstanceProfile): Self = this.set("IamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("IamInstanceProfile", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setState(value: IamInstanceProfileAssociationState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTimestamp(value: DateTime): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
  
}

