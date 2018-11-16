package typings
package cordovaDashPluginDashEmailDashComposerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICordovaPluginEmailComposerOpenOptions extends js.Object {
  /** Attachments can be either base64 encoded datas, files from the the device storage or assets from within the www folder */
  var attachments: js.UndefOr[js.Array[_]] = js.undefined
  var bcc: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var cc: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The default value for isHTML is true */
  var isHtml: js.UndefOr[scala.Boolean] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  /** An configured email account is required to send emails */
  var to: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

