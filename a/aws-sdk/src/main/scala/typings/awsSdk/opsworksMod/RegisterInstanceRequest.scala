package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterInstanceRequest extends js.Object {
  /**
    * The instance's hostname.
    */
  var Hostname: js.UndefOr[String] = js.native
  /**
    * An InstanceIdentity object that contains the instance's identity.
    */
  var InstanceIdentity: js.UndefOr[typings.awsSdk.opsworksMod.InstanceIdentity] = js.native
  /**
    * The instance's private IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.native
  /**
    * The instance's public IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * The instances public RSA key. This key is used to encrypt communication between the instance and the service.
    */
  var RsaPublicKey: js.UndefOr[String] = js.native
  /**
    * The instances public RSA key fingerprint.
    */
  var RsaPublicKeyFingerprint: js.UndefOr[String] = js.native
  /**
    * The ID of the stack that the instance is to be registered with.
    */
  var StackId: String = js.native
}

object RegisterInstanceRequest {
  @scala.inline
  def apply(
    StackId: String,
    Hostname: String = null,
    InstanceIdentity: InstanceIdentity = null,
    PrivateIp: String = null,
    PublicIp: String = null,
    RsaPublicKey: String = null,
    RsaPublicKeyFingerprint: String = null
  ): RegisterInstanceRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname.asInstanceOf[js.Any])
    if (InstanceIdentity != null) __obj.updateDynamic("InstanceIdentity")(InstanceIdentity.asInstanceOf[js.Any])
    if (PrivateIp != null) __obj.updateDynamic("PrivateIp")(PrivateIp.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    if (RsaPublicKey != null) __obj.updateDynamic("RsaPublicKey")(RsaPublicKey.asInstanceOf[js.Any])
    if (RsaPublicKeyFingerprint != null) __obj.updateDynamic("RsaPublicKeyFingerprint")(RsaPublicKeyFingerprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterInstanceRequest]
  }
}

