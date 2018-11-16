package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenusNs {
  type MediaType = chromeDashAppsLib.chromeDashAppsLibStrings.image | chromeDashAppsLib.chromeDashAppsLibStrings.video | chromeDashAppsLib.chromeDashAppsLibStrings.audio
  type MenuClickedEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* info */ OnClickData, scala.Unit]]
}
