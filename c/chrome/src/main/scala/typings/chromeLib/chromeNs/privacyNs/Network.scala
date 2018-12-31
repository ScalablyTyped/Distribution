package typings
package chromeLib.chromeNs.privacyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  var networkPredictionEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 42. */
  var webRTCMultipleRoutesEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 47. Warning: this is the current Dev channel. */
  var webRTCNonProxiedUdpEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
}

