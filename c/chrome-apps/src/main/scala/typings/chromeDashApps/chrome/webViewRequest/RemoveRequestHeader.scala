package typings.chromeDashApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Removes the request header of the specified name.
  * Do not use SetRequestHeader and RemoveRequestHeader with
  * the same header name on the same request.
  * Each request header name occurs only once in each request.
  */
@JSGlobal("chrome.webViewRequest.RemoveRequestHeader")
@js.native
class RemoveRequestHeader protected () extends OnRequestActions {
  def this(parameters: RemoveRequestHeaderParams) = this()
  val instanceType: String = js.native
  val typeGuard: typings.chromeDashApps.chromeDashAppsStrings.RemoveRequestHeader = js.native
}

