package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionConfigRequest extends js.Object {
  /**
    * Request the ID for the field-level encryption configuration information.
    */
  var Id: String = js.native
}

object GetFieldLevelEncryptionConfigRequest {
  @scala.inline
  def apply(Id: String): GetFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFieldLevelEncryptionConfigRequest]
  }
}

