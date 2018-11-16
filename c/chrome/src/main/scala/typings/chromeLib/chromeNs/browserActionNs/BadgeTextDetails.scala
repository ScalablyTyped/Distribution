package typings
package chromeLib.chromeNs.browserActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BadgeTextDetails extends js.Object {
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** Any number of characters can be passed, but only about four can fit in the space. */
  var text: java.lang.String
}

