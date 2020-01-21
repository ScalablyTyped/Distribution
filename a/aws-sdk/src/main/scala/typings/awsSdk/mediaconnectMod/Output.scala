package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  /**
    * A description of the output.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The address where you want to send the output.
    */
  var Destination: js.UndefOr[string] = js.native
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[typings.awsSdk.mediaconnectMod.Encryption] = js.native
  /**
    * The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
  /**
    * The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that were added by creating a MediaLive input.
    */
  var MediaLiveInputArn: js.UndefOr[string] = js.native
  /**
    * The name of the output. This value must be unique within the current flow.
    */
  var Name: string = js.native
  /**
    * The ARN of the output.
    */
  var OutputArn: string = js.native
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[integer] = js.native
  /**
    * Attributes related to the transport stream that are used in the output.
    */
  var Transport: js.UndefOr[typings.awsSdk.mediaconnectMod.Transport] = js.native
}

object Output {
  @scala.inline
  def apply(
    Name: string,
    OutputArn: string,
    DataTransferSubscriberFeePercent: Int | Double = null,
    Description: string = null,
    Destination: string = null,
    Encryption: Encryption = null,
    EntitlementArn: string = null,
    MediaLiveInputArn: string = null,
    Port: Int | Double = null,
    Transport: Transport = null
  ): Output = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OutputArn = OutputArn.asInstanceOf[js.Any])
    if (DataTransferSubscriberFeePercent != null) __obj.updateDynamic("DataTransferSubscriberFeePercent")(DataTransferSubscriberFeePercent.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn.asInstanceOf[js.Any])
    if (MediaLiveInputArn != null) __obj.updateDynamic("MediaLiveInputArn")(MediaLiveInputArn.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Transport != null) __obj.updateDynamic("Transport")(Transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

