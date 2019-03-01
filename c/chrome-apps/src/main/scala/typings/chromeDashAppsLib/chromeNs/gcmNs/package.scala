package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcmNs {
  type IGCMDataReceive = stdLib.Record[java.lang.String, js.Any]
  type IGCMDataSend = stdLib.Record[stdLib.Exclude[DisallowedKeys, java.lang.String], js.Any]
}
