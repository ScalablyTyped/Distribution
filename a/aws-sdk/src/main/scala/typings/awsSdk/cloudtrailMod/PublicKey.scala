package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKey extends js.Object {
  /**
    * The fingerprint of the public key.
    */
  var Fingerprint: js.UndefOr[String] = js.native
  /**
    * The ending time of validity of the public key.
    */
  var ValidityEndTime: js.UndefOr[Date] = js.native
  /**
    * The starting time of validity of the public key.
    */
  var ValidityStartTime: js.UndefOr[Date] = js.native
  /**
    * The DER encoded public key value in PKCS#1 format.
    */
  var Value: js.UndefOr[ByteBuffer] = js.native
}

object PublicKey {
  @scala.inline
  def apply(
    Fingerprint: String = null,
    ValidityEndTime: Date = null,
    ValidityStartTime: Date = null,
    Value: ByteBuffer = null
  ): PublicKey = {
    val __obj = js.Dynamic.literal()
    if (Fingerprint != null) __obj.updateDynamic("Fingerprint")(Fingerprint.asInstanceOf[js.Any])
    if (ValidityEndTime != null) __obj.updateDynamic("ValidityEndTime")(ValidityEndTime.asInstanceOf[js.Any])
    if (ValidityStartTime != null) __obj.updateDynamic("ValidityStartTime")(ValidityStartTime.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
}

