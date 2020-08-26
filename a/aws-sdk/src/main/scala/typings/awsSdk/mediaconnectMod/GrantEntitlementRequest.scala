package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantEntitlementRequest extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  /**
    * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the subscriber or end user.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The type of encryption that will be used on the output that is associated with this entitlement.
    */
  var Encryption: js.UndefOr[typings.awsSdk.mediaconnectMod.Encryption] = js.native
  /**
    * An indication of whether the new entitlement should be enabled or disabled as soon as it is created. If you don’t specify the entitlementStatus field in your request, MediaConnect sets it to ENABLED.
    */
  var EntitlementStatus: js.UndefOr[typings.awsSdk.mediaconnectMod.EntitlementStatus] = js.native
  /**
    * The name of the entitlement. This value must be unique within the current flow.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flows using your content as the source.
    */
  var Subscribers: listOfString = js.native
}

object GrantEntitlementRequest {
  @scala.inline
  def apply(Subscribers: listOfString): GrantEntitlementRequest = {
    val __obj = js.Dynamic.literal(Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantEntitlementRequest]
  }
  @scala.inline
  implicit class GrantEntitlementRequestOps[Self <: GrantEntitlementRequest] (val x: Self) extends AnyVal {
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
    def setSubscribersVarargs(value: string*): Self = this.set("Subscribers", js.Array(value :_*))
    @scala.inline
    def setSubscribers(value: listOfString): Self = this.set("Subscribers", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataTransferSubscriberFeePercent(value: integer): Self = this.set("DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTransferSubscriberFeePercent: Self = this.set("DataTransferSubscriberFeePercent", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEncryption(value: Encryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setEntitlementStatus(value: EntitlementStatus): Self = this.set("EntitlementStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlementStatus: Self = this.set("EntitlementStatus", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

