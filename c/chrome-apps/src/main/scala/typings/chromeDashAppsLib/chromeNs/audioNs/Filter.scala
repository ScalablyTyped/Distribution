package typings
package chromeDashAppsLib.chromeNs.audioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Device properties by which to filter the list of returned audio devices.
         * If the filter is not set or set to {}, returned device list will contain all available audio devices.
         */

trait Filter extends js.Object {
  /**
               * If set, only audio devices whose active state matches this value will satisfy the filter.
               */
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * If set, only audio devices whose stream type is included in this list will satisfy the filter.
               */
  var streamTypes: js.UndefOr[js.Array[StreamType]] = js.undefined
}

