package typings.chromeDashApps.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcmNs {
  import typings.std.Exclude
  import typings.std.Record

  type IGCMDataReceive = Record[String, js.Any]
  type IGCMDataSend = Record[Exclude[DisallowedKeys, String], js.Any]
}
