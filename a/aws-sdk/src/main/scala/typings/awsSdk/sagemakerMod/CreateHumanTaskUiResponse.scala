package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHumanTaskUiResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the human review workflow user interface you create.
    */
  var HumanTaskUiArn: typings.awsSdk.sagemakerMod.HumanTaskUiArn = js.native
}

object CreateHumanTaskUiResponse {
  @scala.inline
  def apply(HumanTaskUiArn: HumanTaskUiArn): CreateHumanTaskUiResponse = {
    val __obj = js.Dynamic.literal(HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHumanTaskUiResponse]
  }
  @scala.inline
  implicit class CreateHumanTaskUiResponseOps[Self <: CreateHumanTaskUiResponse] (val x: Self) extends AnyVal {
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
    def setHumanTaskUiArn(value: HumanTaskUiArn): Self = this.set("HumanTaskUiArn", value.asInstanceOf[js.Any])
  }
  
}

