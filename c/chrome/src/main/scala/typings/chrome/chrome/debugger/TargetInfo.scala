package typings.chrome.chrome.debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetInfo extends js.Object {
  /** True if debugger is already attached. */
  var attached: Boolean
  /**
    * Optional.
    * Since Chrome 30.
    * The extension id, defined if type = 'background_page'.
    */
  var extensionId: js.UndefOr[String] = js.undefined
  /** Optional. Target favicon URL.  */
  var faviconUrl: js.UndefOr[String] = js.undefined
  /** Target id. */
  var id: String
  /**
    * Optional.
    * Since Chrome 30.
    * The tab id, defined if type == 'page'.
    */
  var tabId: js.UndefOr[Double] = js.undefined
  /** Target page title. */
  var title: String
  /** Target type. */
  var `type`: String
  /** Target URL. */
  var url: String
}

object TargetInfo {
  @scala.inline
  def apply(
    attached: Boolean,
    id: String,
    title: String,
    `type`: String,
    url: String,
    extensionId: String = null,
    faviconUrl: String = null,
    tabId: js.UndefOr[Double] = js.undefined
  ): TargetInfo = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (extensionId != null) __obj.updateDynamic("extensionId")(extensionId.asInstanceOf[js.Any])
    if (faviconUrl != null) __obj.updateDynamic("faviconUrl")(faviconUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfo]
  }
}

