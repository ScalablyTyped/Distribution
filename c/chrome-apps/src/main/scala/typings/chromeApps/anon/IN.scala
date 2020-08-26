package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.in_
import typings.chromeApps.chromeAppsStrings.out_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IN extends js.Object {
  var IN: in_ = js.native
  var OUT: out_ = js.native
}

object IN {
  @scala.inline
  def apply(IN: in_, OUT: out_): IN = {
    val __obj = js.Dynamic.literal(IN = IN.asInstanceOf[js.Any], OUT = OUT.asInstanceOf[js.Any])
    __obj.asInstanceOf[IN]
  }
  @scala.inline
  implicit class INOps[Self <: IN] (val x: Self) extends AnyVal {
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
    def setIN(value: in_): Self = this.set("IN", value.asInstanceOf[js.Any])
    @scala.inline
    def setOUT(value: out_): Self = this.set("OUT", value.asInstanceOf[js.Any])
  }
  
}

