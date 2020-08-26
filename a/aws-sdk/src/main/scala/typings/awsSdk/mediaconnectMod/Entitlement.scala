package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entitlement extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  /**
    * A description of the entitlement.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The type of encryption that will be used on the output that is associated with this entitlement.
    */
  var Encryption: js.UndefOr[typings.awsSdk.mediaconnectMod.Encryption] = js.native
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: string = js.native
  /**
    * An indication of whether the entitlement is enabled.
    */
  var EntitlementStatus: js.UndefOr[typings.awsSdk.mediaconnectMod.EntitlementStatus] = js.native
  /**
    * The name of the entitlement.
    */
  var Name: string = js.native
  /**
    * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flow using your content as the source.
    */
  var Subscribers: listOfString = js.native
}

object Entitlement {
  @scala.inline
  def apply(EntitlementArn: string, Name: string, Subscribers: listOfString): Entitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entitlement]
  }
  @scala.inline
  implicit class EntitlementOps[Self <: Entitlement] (val x: Self) extends AnyVal {
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
    def setEntitlementArn(value: string): Self = this.set("EntitlementArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
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
  }
  
}

