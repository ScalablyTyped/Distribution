package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnProxyError extends js.Object {
  var onProxyError: chromeLib.chromeNs.proxyNs.ProxyErrorEvent
  var settings: chromeLib.chromeNs.typesNs.ChromeSetting
}

object Anon_OnProxyError {
  @scala.inline
  def apply(
    onProxyError: chromeLib.chromeNs.proxyNs.ProxyErrorEvent,
    settings: chromeLib.chromeNs.typesNs.ChromeSetting
  ): Anon_OnProxyError = {
    val __obj = js.Dynamic.literal(onProxyError = onProxyError, settings = settings)
  
    __obj.asInstanceOf[Anon_OnProxyError]
  }
}

