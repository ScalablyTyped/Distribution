package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateRandomResponse extends js.Object {
  /**
    * The random byte string. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.native
}

object GenerateRandomResponse {
  @scala.inline
  def apply(): GenerateRandomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateRandomResponse]
  }
  @scala.inline
  implicit class GenerateRandomResponseOps[Self <: GenerateRandomResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlaintext(value: PlaintextType): Self = this.set("Plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaintext: Self = this.set("Plaintext", js.undefined)
  }
  
}

