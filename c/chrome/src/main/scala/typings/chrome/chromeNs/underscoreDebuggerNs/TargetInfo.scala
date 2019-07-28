package typings.chrome.chromeNs.underscoreDebuggerNs

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
    tabId: Int | Double = null
  ): TargetInfo = {
    val __obj = js.Dynamic.literal(attached = attached, id = id, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    if (extensionId != null) __obj.updateDynamic("extensionId")(extensionId)
    if (faviconUrl != null) __obj.updateDynamic("faviconUrl")(faviconUrl)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfo]
  }
}

