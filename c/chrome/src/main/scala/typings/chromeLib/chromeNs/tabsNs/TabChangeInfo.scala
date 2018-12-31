package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabChangeInfo extends js.Object {
  /**
    * The tab's new audible state.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The tab's new auto-discardable
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The tab's new discarded state.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The tab's new favicon URL.
    * @since Chrome 27.
    */
  var favIconUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tab's new muted state and the reason for the change.
    * @since Chrome 46. Warning: this is the current Beta channel.
    */
  var mutedInfo: js.UndefOr[MutedInfo] = js.undefined
  /**
    * The tab's new pinned state.
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The status of the tab. Can be either loading or complete. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tab's new title.
    * @since Chrome 48.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The tab's URL if it has changed. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

