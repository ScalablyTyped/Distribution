package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportKeyPairResult extends js.Object {
  /**
    * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
    */
  var KeyFingerprint: js.UndefOr[String] = js.native
  /**
    * The key pair name you provided.
    */
  var KeyName: js.UndefOr[String] = js.native
}

object ImportKeyPairResult {
  @scala.inline
  def apply(KeyFingerprint: String = null, KeyName: String = null): ImportKeyPairResult = {
    val __obj = js.Dynamic.literal()
    if (KeyFingerprint != null) __obj.updateDynamic("KeyFingerprint")(KeyFingerprint.asInstanceOf[js.Any])
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyPairResult]
  }
}

