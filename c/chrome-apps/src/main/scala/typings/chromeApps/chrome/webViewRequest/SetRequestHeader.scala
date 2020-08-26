package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the request header of the specified name to the specified value.
  * If a header with the specified name did not exist before, a new one is created.
  * Header name comparison is always case-insensitive.
  * Each request header name occurs only once in each request.
  */
@js.native
trait SetRequestHeader extends OnRequestActions {
  val instanceType: String = js.native
  val typeGuard: typings.chromeApps.chromeAppsStrings.SetRequestHeader = js.native
}

object SetRequestHeader {
  @scala.inline
  def apply(instanceType: String, typeGuard: typings.chromeApps.chromeAppsStrings.SetRequestHeader): SetRequestHeader = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRequestHeader]
  }
  @scala.inline
  implicit class SetRequestHeaderOps[Self <: SetRequestHeader] (val x: Self) extends AnyVal {
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
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.SetRequestHeader): Self = this.set("typeGuard", value.asInstanceOf[js.Any])
  }
  
}

