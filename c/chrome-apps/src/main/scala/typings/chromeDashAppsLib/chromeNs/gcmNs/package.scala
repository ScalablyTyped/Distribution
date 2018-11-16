package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcmNs {
  type DisallowedKeys = chromeDashAppsLib.chromeDashAppsLibStrings.collapse_key | chromeDashAppsLib.chromeDashAppsLibStrings.goog | chromeDashAppsLib.chromeDashAppsLibStrings.googDOT | chromeDashAppsLib.chromeDashAppsLibStrings.GOOG | chromeDashAppsLib.chromeDashAppsLibStrings.GOOGDOT | chromeDashAppsLib.chromeDashAppsLibStrings.google | chromeDashAppsLib.chromeDashAppsLibStrings.GOOGLE
  type IGCMDataReceive = stdLib.Record[java.lang.String, js.Any]
  type IGCMDataSend = stdLib.Record[stdLib.Exclude[DisallowedKeys, java.lang.String], js.Any]
}
