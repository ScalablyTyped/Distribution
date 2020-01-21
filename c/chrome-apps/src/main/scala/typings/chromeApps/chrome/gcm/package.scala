package typings.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcm {
  type IGCMDataReceive = typings.std.Record[java.lang.String, js.Any]
  type IGCMDataSend = typings.std.Record[
    typings.std.Exclude[typings.chromeApps.chrome.gcm.DisallowedKeys, java.lang.String], 
    js.Any
  ]
}
