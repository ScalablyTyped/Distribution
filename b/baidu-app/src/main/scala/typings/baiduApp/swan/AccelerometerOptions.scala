package typings.baiduApp.swan

import typings.baiduApp.baiduAppStrings.game
import typings.baiduApp.baiduAppStrings.normal
import typings.baiduApp.baiduAppStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerometerOptions
  extends BaseOptions[js.Any, js.Any] {
  var interval: game | ui | normal = js.native
}

object AccelerometerOptions {
  @scala.inline
  def apply(interval: game | ui | normal): AccelerometerOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerOptions]
  }
  @scala.inline
  implicit class AccelerometerOptionsOps[Self <: AccelerometerOptions] (val x: Self) extends AnyVal {
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
    def setInterval(value: game | ui | normal): Self = this.set("interval", value.asInstanceOf[js.Any])
  }
  
}

