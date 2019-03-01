package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

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
  val instanceType: java.lang.String = js.native
  val typeGuard: chromeDashAppsLib.chromeDashAppsLibStrings.RemoveRequestHeader = js.native
}

