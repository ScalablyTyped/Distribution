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
  def apply(
    EntitlementArn: string,
    Name: string,
    Subscribers: listOfString,
    DataTransferSubscriberFeePercent: Int | Double = null,
    Description: string = null,
    Encryption: Encryption = null
  ): Entitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    if (DataTransferSubscriberFeePercent != null) __obj.updateDynamic("DataTransferSubscriberFeePercent")(DataTransferSubscriberFeePercent.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entitlement]
  }
}

