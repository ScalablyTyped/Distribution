package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISessionPayload extends js.Object {
  var app: js.UndefOr[js.Object] = js.undefined
  var device: js.UndefOr[js.Object] = js.undefined
  var notifier: bugsnagDashJsLib.Anon_Url
  var sessions: js.Array[ISession]
  var user: js.UndefOr[js.Object] = js.undefined
}

