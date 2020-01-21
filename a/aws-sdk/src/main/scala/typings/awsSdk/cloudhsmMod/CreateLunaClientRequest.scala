package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLunaClientRequest extends js.Object {
  /**
    * The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
    */
  var Certificate: typings.awsSdk.cloudhsmMod.Certificate = js.native
  /**
    * The label for the client.
    */
  var Label: js.UndefOr[ClientLabel] = js.native
}

object CreateLunaClientRequest {
  @scala.inline
  def apply(Certificate: Certificate, Label: ClientLabel = null): CreateLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLunaClientRequest]
  }
}

