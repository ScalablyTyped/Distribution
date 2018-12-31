package typings
package chromeDashAppsLib.chromeNs.bluetoothSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenOptions extends js.Object {
  /**
    * Length of the socket's listen queue.
    * The default value depends on the operating system's host subsystem.
    * */
  var backlog: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * The RFCOMM Channel used by listenUsingRfcomm.
    * If specified, this channel must not be previously
    * in use or the method call will fail. When not specified,
    * an unused channel will be automatically allocated.
    */
  var channel: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * The L2CAP PSM used by listenUsingL2cap.
    * If specified, this PSM must not be previously
    * in use or the method call with fail. When not specified,
    * an unused PSM will be automatically allocated.
    * */
  var psm: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

