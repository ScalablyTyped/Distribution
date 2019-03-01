package typings
package chromeLib.chromeNs.underscoreDebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetInfo extends js.Object {
  /** True if debugger is already attached. */
  var attached: scala.Boolean
  /**
    * Optional.
    * Since Chrome 30.
    * The extension id, defined if type = 'background_page'.
    */
  var extensionId: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Target favicon URL.  */
  var faviconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Target id. */
  var id: java.lang.String
  /**
    * Optional.
    * Since Chrome 30.
    * The tab id, defined if type == 'page'.
    */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** Target page title. */
  var title: java.lang.String
  /** Target type. */
  var `type`: java.lang.String
  /** Target URL. */
  var url: java.lang.String
}

object TargetInfo {
  @scala.inline
  def apply(
    attached: scala.Boolean,
    id: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String,
    extensionId: java.lang.String = null,
    faviconUrl: java.lang.String = null,
    tabId: scala.Int | scala.Double = null
  ): TargetInfo = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("attached")(attached)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    if (extensionId != null) __obj.updateDynamic("extensionId")(extensionId)
    if (faviconUrl != null) __obj.updateDynamic("faviconUrl")(faviconUrl)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfo]
  }
}

