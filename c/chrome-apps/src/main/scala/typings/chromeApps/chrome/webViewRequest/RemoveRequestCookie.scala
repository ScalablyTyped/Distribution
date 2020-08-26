package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Removes one or more cookies of request.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
@js.native
trait RemoveRequestCookie extends OnRequestActions {
  val instanceType: String = js.native
  val typeGuard: typings.chromeApps.chromeAppsStrings.RemoveRequestCookie = js.native
}

object RemoveRequestCookie {
  @scala.inline
  def apply(instanceType: String, typeGuard: typings.chromeApps.chromeAppsStrings.RemoveRequestCookie): RemoveRequestCookie = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRequestCookie]
  }
  @scala.inline
  implicit class RemoveRequestCookieOps[Self <: RemoveRequestCookie] (val x: Self) extends AnyVal {
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
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RemoveRequestCookie): Self = this.set("typeGuard", value.asInstanceOf[js.Any])
  }
  
}

