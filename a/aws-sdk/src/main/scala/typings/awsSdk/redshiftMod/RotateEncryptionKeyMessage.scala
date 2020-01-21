package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateEncryptionKeyMessage extends js.Object {
  /**
    * The unique identifier of the cluster that you want to rotate the encryption keys for. Constraints: Must be the name of valid cluster that has encryption enabled.
    */
  var ClusterIdentifier: String = js.native
}

object RotateEncryptionKeyMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): RotateEncryptionKeyMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RotateEncryptionKeyMessage]
  }
}

