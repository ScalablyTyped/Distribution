package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicKeyConfigRequest extends js.Object {
  /**
    * Request the ID for the public key configuration.
    */
  var Id: String = js.native
}

object GetPublicKeyConfigRequest {
  @scala.inline
  def apply(Id: String): GetPublicKeyConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPublicKeyConfigRequest]
  }
}

