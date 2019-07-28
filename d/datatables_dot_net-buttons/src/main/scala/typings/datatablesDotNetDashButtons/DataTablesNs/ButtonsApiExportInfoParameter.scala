package typings.datatablesDotNetDashButtons.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonsApiExportInfoParameter extends js.Object {
  var extension: js.UndefOr[String | js.Function0[String]] = js.undefined
  var filename: js.UndefOr[String | js.Function0[String]] = js.undefined
  var messageBottom: js.UndefOr[Null | String | js.Function0[String]] = js.undefined
  var messageTop: js.UndefOr[Null | String | js.Function0[String]] = js.undefined
  var title: js.UndefOr[Null | String | js.Function0[String]] = js.undefined
}

object ButtonsApiExportInfoParameter {
  @scala.inline
  def apply(
    extension: String | js.Function0[String] = null,
    filename: String | js.Function0[String] = null,
    messageBottom: String | js.Function0[String] = null,
    messageTop: String | js.Function0[String] = null,
    title: String | js.Function0[String] = null
  ): ButtonsApiExportInfoParameter = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (messageBottom != null) __obj.updateDynamic("messageBottom")(messageBottom.asInstanceOf[js.Any])
    if (messageTop != null) __obj.updateDynamic("messageTop")(messageTop.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsApiExportInfoParameter]
  }
}

