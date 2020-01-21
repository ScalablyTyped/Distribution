package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionAtRestOptionsStatus extends js.Object {
  /**
    *  Specifies the Encryption At Rest options for the specified Elasticsearch domain.
    */
  var Options: EncryptionAtRestOptions = js.native
  /**
    *  Specifies the status of the Encryption At Rest options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}

object EncryptionAtRestOptionsStatus {
  @scala.inline
  def apply(Options: EncryptionAtRestOptions, Status: OptionStatus): EncryptionAtRestOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptionAtRestOptionsStatus]
  }
}

