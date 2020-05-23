package typings.cordovaPluginEmailComposer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICordovaPluginEmailComposerOpenOptions extends js.Object {
  /** Attachments can be either base64 encoded datas, files from the the device storage or assets from within the www folder */
  var attachments: js.UndefOr[js.Array[_]] = js.undefined
  var bcc: js.UndefOr[js.Array[String]] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var cc: js.UndefOr[js.Array[String]] = js.undefined
  /** The default value for isHTML is true */
  var isHtml: js.UndefOr[Boolean] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  /** An configured email account is required to send emails */
  var to: js.UndefOr[js.Array[String]] = js.undefined
}

object ICordovaPluginEmailComposerOpenOptions {
  @scala.inline
  def apply(
    attachments: js.Array[_] = null,
    bcc: js.Array[String] = null,
    body: String = null,
    cc: js.Array[String] = null,
    isHtml: js.UndefOr[Boolean] = js.undefined,
    subject: String = null,
    to: js.Array[String] = null
  ): ICordovaPluginEmailComposerOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (!js.isUndefined(isHtml)) __obj.updateDynamic("isHtml")(isHtml.get.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICordovaPluginEmailComposerOpenOptions]
  }
}

