package typings.chromeApps.WebView.Events

import typings.chromeApps.WebView.PermissionRequestHandler
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @requires `Permissions:` `audioCapture` and/or `videoCapture`
  * @description
  *
  * Fired when the guest page needs to request special permission from the embedder.
  *
  * The following example code will grant the guest page access to the `webkitGetUserMedia` API.
  * Note that an app using this example code must itself specify `audioCapture` and/or `videoCapture`
  * manifest permissions:
  *
  * @example
  * webview.addEventListener('permissionrequest', (e) => { if (e.permission === 'media') e.request.allow(); });
  */
@js.native
trait PermissionRequestEvent extends Event {
  /** The type of permission being requested. */
  var permission: RequestedPermission = js.native
  /** An object which holds details of the requested permission.*/
  var request: PermissionRequestHandler = js.native
}

