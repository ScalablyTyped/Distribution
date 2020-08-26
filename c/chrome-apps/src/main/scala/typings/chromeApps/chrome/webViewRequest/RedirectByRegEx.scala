package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Redirects a request by applying a regular expression on the URL.
  * The regular expressions use the RE2 syntax.
  * @see[RE2 syntax]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
  */
@js.native
trait RedirectByRegEx extends OnRequestActions {
  val instanceType: String = js.native
  val typeGuard: typings.chromeApps.chromeAppsStrings.RedirectByRegEx = js.native
}

object RedirectByRegEx {
  @scala.inline
  def apply(instanceType: String, typeGuard: typings.chromeApps.chromeAppsStrings.RedirectByRegEx): RedirectByRegEx = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectByRegEx]
  }
  @scala.inline
  implicit class RedirectByRegExOps[Self <: RedirectByRegEx] (val x: Self) extends AnyVal {
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
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RedirectByRegEx): Self = this.set("typeGuard", value.asInstanceOf[js.Any])
  }
  
}

