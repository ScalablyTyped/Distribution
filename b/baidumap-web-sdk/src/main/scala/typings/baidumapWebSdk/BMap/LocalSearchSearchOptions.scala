package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSearchSearchOptions extends js.Object {
  var customData: js.Any = js.native
  var forceLocal: Boolean = js.native
}

object LocalSearchSearchOptions {
  @scala.inline
  def apply(customData: js.Any, forceLocal: Boolean): LocalSearchSearchOptions = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], forceLocal = forceLocal.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSearchSearchOptions]
  }
  @scala.inline
  implicit class LocalSearchSearchOptionsOps[Self <: LocalSearchSearchOptions] (val x: Self) extends AnyVal {
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
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceLocal(value: Boolean): Self = this.set("forceLocal", value.asInstanceOf[js.Any])
  }
  
}

