package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionKey extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the encryption key being used to encrypt the custom terminology.
    */
  var Id: EncryptionKeyID = js.native
  /**
    * The type of encryption key used by Amazon Translate to encrypt custom terminologies.
    */
  var Type: EncryptionKeyType = js.native
}

object EncryptionKey {
  @scala.inline
  def apply(Id: EncryptionKeyID, Type: EncryptionKeyType): EncryptionKey = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptionKey]
  }
}

