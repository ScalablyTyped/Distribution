package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofproxy extends js.Object {
  var onProxyError: chromeLib.chromeNs.proxyNs.ProxyErrorEvent
  var settings: chromeLib.chromeNs.typesNs.ChromeSetting
}

object Typeofproxy {
  @scala.inline
  def apply(
    onProxyError: chromeLib.chromeNs.proxyNs.ProxyErrorEvent,
    settings: chromeLib.chromeNs.typesNs.ChromeSetting
  ): Typeofproxy = {
    val __obj = js.Dynamic.literal(onProxyError = onProxyError, settings = settings)
  
    __obj.asInstanceOf[Typeofproxy]
  }
}

