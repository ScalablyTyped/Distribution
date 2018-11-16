package typings
package chromeLib.chromeNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PacScript extends js.Object {
  /** Optional. A PAC script. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. If true, an invalid PAC script will prevent the network stack from falling back to direct connections. Defaults to false. */
  var mandatory: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. URL of the PAC file to be used. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

