package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotifyOpts extends js.Object {
  var beforeSend: js.UndefOr[bugsnagDashJsLib.typesCommonMod.BeforeSend] = js.undefined
  var context: js.UndefOr[java.lang.String] = js.undefined
  var device: js.UndefOr[js.Object] = js.undefined
  var metaData: js.UndefOr[js.Object] = js.undefined
  var request: js.UndefOr[js.Object] = js.undefined
  var severity: js.UndefOr[
    bugsnagDashJsLib.bugsnagDashJsLibStrings.info | bugsnagDashJsLib.bugsnagDashJsLibStrings.warning | bugsnagDashJsLib.bugsnagDashJsLibStrings.error
  ] = js.undefined
  var user: js.UndefOr[js.Object] = js.undefined
}

object INotifyOpts {
  @scala.inline
  def apply(
    beforeSend: bugsnagDashJsLib.typesCommonMod.BeforeSend = null,
    context: java.lang.String = null,
    device: js.Object = null,
    metaData: js.Object = null,
    request: js.Object = null,
    severity: bugsnagDashJsLib.bugsnagDashJsLibStrings.info | bugsnagDashJsLib.bugsnagDashJsLibStrings.warning | bugsnagDashJsLib.bugsnagDashJsLibStrings.error = null,
    user: js.Object = null
  ): INotifyOpts = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (context != null) __obj.updateDynamic("context")(context)
    if (device != null) __obj.updateDynamic("device")(device)
    if (metaData != null) __obj.updateDynamic("metaData")(metaData)
    if (request != null) __obj.updateDynamic("request")(request)
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[INotifyOpts]
  }
}

