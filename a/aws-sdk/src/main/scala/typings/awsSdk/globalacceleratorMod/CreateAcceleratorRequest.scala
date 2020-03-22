package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAcceleratorRequest extends js.Object {
  /**
    * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of an accelerator.
    */
  var IdempotencyToken: typings.awsSdk.globalacceleratorMod.IdempotencyToken = js.native
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.globalacceleratorMod.IpAddressType] = js.native
  /**
    * Optionally, if you've added your own IP address pool to Global Accelerator, you can choose IP addresses from your own pool to use for the accelerator's static IP addresses. You can specify one or two addresses, separated by a comma. Do not include the /32 suffix. If you specify only one IP address from your IP address range, Global Accelerator assigns a second static IP address for the accelerator from the AWS IP address pool. For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  var IpAddresses: js.UndefOr[typings.awsSdk.globalacceleratorMod.IpAddresses] = js.native
  /**
    * The name of an accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: GenericString = js.native
  /**
    * Create tags for an accelerator. For more information, see Tagging in AWS Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.globalacceleratorMod.Tags] = js.native
}

object CreateAcceleratorRequest {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    Name: GenericString,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    IpAddressType: IpAddressType = null,
    IpAddresses: IpAddresses = null,
    Tags: Tags = null
  ): CreateAcceleratorRequest = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    if (IpAddresses != null) __obj.updateDynamic("IpAddresses")(IpAddresses.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAcceleratorRequest]
  }
}

