package typings
package chromeDashAppsLib.chromeNs.systemNs.displayNs

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
  var singleUnified: js.UndefOr[scala.Boolean] = js.undefined
}

