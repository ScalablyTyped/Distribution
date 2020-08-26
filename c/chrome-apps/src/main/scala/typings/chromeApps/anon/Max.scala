package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.tls1
import typings.chromeApps.chromeAppsStrings.tls1Dot1
import typings.chromeApps.chromeAppsStrings.tls1Dot2
import typings.chromeApps.chromeAppsStrings.tls1Dot3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Max extends js.Object {
  var max: js.UndefOr[tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3] = js.native
  var min: js.UndefOr[tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3] = js.native
}

object Max {
  @scala.inline
  def apply(): Max = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Max]
  }
  @scala.inline
  implicit class MaxOps[Self <: Max] (val x: Self) extends AnyVal {
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
    def setMax(value: tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

