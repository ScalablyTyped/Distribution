package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionAtRest extends js.Object {
  /**
    * 
    The ARN of the AWS KMS key for encrypting data at rest. If you don't specify a KMS key, MSK creates one for you and uses it.
    
    */
  var DataVolumeKMSKeyId: string = js.native
}

object EncryptionAtRest {
  @scala.inline
  def apply(DataVolumeKMSKeyId: string): EncryptionAtRest = {
    val __obj = js.Dynamic.literal(DataVolumeKMSKeyId = DataVolumeKMSKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAtRest]
  }
}

