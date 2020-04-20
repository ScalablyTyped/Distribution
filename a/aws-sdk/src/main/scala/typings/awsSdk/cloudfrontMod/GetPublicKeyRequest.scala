package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicKeyRequest extends js.Object {
  /**
    * Request the ID for the public key.
    */
  var Id: String = js.native
}

object GetPublicKeyRequest {
  @scala.inline
  def apply(Id: String): GetPublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyRequest]
  }
}

