package typings.chromeDashApps.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds the response header to the response of this web request.
  * As multiple response headers may share the same name,
  * you need to first remove and then add a new
  * response header in order to replace one.
  */
@JSGlobal("chrome.webViewRequest.AddResponseHeader")
@js.native
class AddResponseHeader protected () extends OnRequestActions {
  def this(parameters: AddResponseHeaderParams) = this()
  val instanceType: String = js.native
  val typeGuard: typings.chromeDashApps.chromeDashAppsStrings.AddResponseHeader = js.native
}

