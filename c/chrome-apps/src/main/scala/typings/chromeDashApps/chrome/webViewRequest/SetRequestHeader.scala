package typings.chromeDashApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the request header of the specified name to the specified value.
  * If a header with the specified name did not exist before, a new one is created.
  * Header name comparison is always case-insensitive.
  * Each request header name occurs only once in each request.
  */
@JSGlobal("chrome.webViewRequest.SetRequestHeader")
@js.native
class SetRequestHeader protected () extends OnRequestActions {
  def this(parameters: SetRequestHeaderParams) = this()
  val instanceType: String = js.native
  val typeGuard: typings.chromeDashApps.chromeDashAppsStrings.SetRequestHeader = js.native
}

