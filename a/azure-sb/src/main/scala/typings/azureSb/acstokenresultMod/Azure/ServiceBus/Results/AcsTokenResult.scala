package typings.azureSb.acstokenresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcsTokenResult extends js.Object {
  def parse(acsTokenQueryString: String): AcsTokenResponse = js.native
}

object AcsTokenResult {
  @scala.inline
  def apply(parse: String => AcsTokenResponse): AcsTokenResult = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[AcsTokenResult]
  }
  @scala.inline
  implicit class AcsTokenResultOps[Self <: AcsTokenResult] (val x: Self) extends AnyVal {
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
    def setParse(value: String => AcsTokenResponse): Self = this.set("parse", js.Any.fromFunction1(value))
  }
  
}

