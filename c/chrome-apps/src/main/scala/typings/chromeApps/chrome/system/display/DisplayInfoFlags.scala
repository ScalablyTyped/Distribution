package typings.chromeApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options affecting how the information is returned.
  * @since Chrome 59
  */
trait DisplayInfoFlags extends js.Object {
  /**
    * If set to true, only a single DisplayUnitInfo will be returned by getInfo when in unified desktop mode.
    * @see[enableUnifiedDesktop]
    * @default false
    */
  var singleUnified: js.UndefOr[Boolean] = js.undefined
}

object DisplayInfoFlags {
  @scala.inline
  def apply(singleUnified: js.UndefOr[Boolean] = js.undefined): DisplayInfoFlags = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(singleUnified)) __obj.updateDynamic("singleUnified")(singleUnified.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayInfoFlags]
  }
}

