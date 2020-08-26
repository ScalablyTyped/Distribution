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
  @scala.inline
  implicit class RotateEncryptionKeyMessageOps[Self <: RotateEncryptionKeyMessage] (val x: Self) extends AnyVal {
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
  }
  
}

