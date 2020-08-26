package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.adaptive_
import typings.chromeApps.chromeAppsStrings.asynchronous_
import typings.chromeApps.chromeAppsStrings.synchronous_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ADAPTIVE extends js.Object {
  var ADAPTIVE: adaptive_ = js.native
  var ASYNCHRONOUS: asynchronous_ = js.native
  var SYNCHRONOUS: synchronous_ = js.native
}

object ADAPTIVE {
  @scala.inline
  def apply(ADAPTIVE: adaptive_, ASYNCHRONOUS: asynchronous_, SYNCHRONOUS: synchronous_): ADAPTIVE = {
    val __obj = js.Dynamic.literal(ADAPTIVE = ADAPTIVE.asInstanceOf[js.Any], ASYNCHRONOUS = ASYNCHRONOUS.asInstanceOf[js.Any], SYNCHRONOUS = SYNCHRONOUS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADAPTIVE]
  }
  @scala.inline
  implicit class ADAPTIVEOps[Self <: ADAPTIVE] (val x: Self) extends AnyVal {
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
    def setADAPTIVE(value: adaptive_): Self = this.set("ADAPTIVE", value.asInstanceOf[js.Any])
    @scala.inline
    def setASYNCHRONOUS(value: asynchronous_): Self = this.set("ASYNCHRONOUS", value.asInstanceOf[js.Any])
    @scala.inline
    def setSYNCHRONOUS(value: synchronous_): Self = this.set("SYNCHRONOUS", value.asInstanceOf[js.Any])
  }
  
}

