package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryption extends js.Object {
  /**
    * A complex data type that includes the profile configurations specified for field-level encryption. 
    */
  var FieldLevelEncryptionConfig: typings.awsSdk.cloudfrontMod.FieldLevelEncryptionConfig = js.native
  /**
    * The configuration ID for a field-level encryption configuration which includes a set of profiles that specify certain selected data fields to be encrypted by specific public keys.
    */
  var Id: String = js.native
  /**
    * The last time the field-level encryption configuration was changed. 
    */
  var LastModifiedTime: timestamp = js.native
}

object FieldLevelEncryption {
  @scala.inline
  def apply(FieldLevelEncryptionConfig: FieldLevelEncryptionConfig, Id: String, LastModifiedTime: timestamp): FieldLevelEncryption = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldLevelEncryption]
  }
}

