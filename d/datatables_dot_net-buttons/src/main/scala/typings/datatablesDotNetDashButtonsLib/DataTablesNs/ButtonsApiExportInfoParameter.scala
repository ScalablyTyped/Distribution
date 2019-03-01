package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonsApiExportInfoParameter extends js.Object {
  var extension: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
  var filename: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
  var messageBottom: js.UndefOr[scala.Null | java.lang.String | js.Function0[java.lang.String]] = js.undefined
  var messageTop: js.UndefOr[scala.Null | java.lang.String | js.Function0[java.lang.String]] = js.undefined
  var title: js.UndefOr[scala.Null | java.lang.String | js.Function0[java.lang.String]] = js.undefined
}

object ButtonsApiExportInfoParameter {
  @scala.inline
  def apply(
    extension: java.lang.String | js.Function0[java.lang.String] = null,
    filename: java.lang.String | js.Function0[java.lang.String] = null,
    messageBottom: java.lang.String | js.Function0[java.lang.String] = null,
    messageTop: java.lang.String | js.Function0[java.lang.String] = null,
    title: java.lang.String | js.Function0[java.lang.String] = null
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

