package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Warning extends js.Object {
  /**
    * The code of the cross-regional warning.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The message explaining what resources are in a different region from the pipeline.  AWS KMS keys must be in the same region as the pipeline. 
    */
  var Message: js.UndefOr[String] = js.native
}

object Warning {
  @scala.inline
  def apply(): Warning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Warning]
  }
  @scala.inline
  implicit class WarningOps[Self <: Warning] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

