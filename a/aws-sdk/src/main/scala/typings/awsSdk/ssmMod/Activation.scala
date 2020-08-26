package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activation extends js.Object {
  /**
    * The ID created by Systems Manager when you submitted the activation.
    */
  var ActivationId: js.UndefOr[typings.awsSdk.ssmMod.ActivationId] = js.native
  /**
    * The date the activation was created.
    */
  var CreatedDate: js.UndefOr[typings.awsSdk.ssmMod.CreatedDate] = js.native
  /**
    * A name for the managed instance when it is created.
    */
  var DefaultInstanceName: js.UndefOr[typings.awsSdk.ssmMod.DefaultInstanceName] = js.native
  /**
    * A user defined description of the activation.
    */
  var Description: js.UndefOr[ActivationDescription] = js.native
  /**
    * The date when this activation can no longer be used to register managed instances.
    */
  var ExpirationDate: js.UndefOr[typings.awsSdk.ssmMod.ExpirationDate] = js.native
  /**
    * Whether or not the activation is expired.
    */
  var Expired: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
    */
  var IamRole: js.UndefOr[typings.awsSdk.ssmMod.IamRole] = js.native
  /**
    * The maximum number of managed instances that can be registered using this activation.
    */
  var RegistrationLimit: js.UndefOr[typings.awsSdk.ssmMod.RegistrationLimit] = js.native
  /**
    * The number of managed instances already registered with this activation.
    */
  var RegistrationsCount: js.UndefOr[typings.awsSdk.ssmMod.RegistrationsCount] = js.native
  /**
    * Tags assigned to the activation.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Activation {
  @scala.inline
  def apply(): Activation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activation]
  }
  @scala.inline
  implicit class ActivationOps[Self <: Activation] (val x: Self) extends AnyVal {
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
    def setActivationId(value: ActivationId): Self = this.set("ActivationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivationId: Self = this.set("ActivationId", js.undefined)
    @scala.inline
    def setCreatedDate(value: CreatedDate): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setDefaultInstanceName(value: DefaultInstanceName): Self = this.set("DefaultInstanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultInstanceName: Self = this.set("DefaultInstanceName", js.undefined)
    @scala.inline
    def setDescription(value: ActivationDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setExpirationDate(value: ExpirationDate): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("ExpirationDate", js.undefined)
    @scala.inline
    def setExpired(value: Boolean): Self = this.set("Expired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpired: Self = this.set("Expired", js.undefined)
    @scala.inline
    def setIamRole(value: IamRole): Self = this.set("IamRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRole: Self = this.set("IamRole", js.undefined)
    @scala.inline
    def setRegistrationLimit(value: RegistrationLimit): Self = this.set("RegistrationLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationLimit: Self = this.set("RegistrationLimit", js.undefined)
    @scala.inline
    def setRegistrationsCount(value: RegistrationsCount): Self = this.set("RegistrationsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationsCount: Self = this.set("RegistrationsCount", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

