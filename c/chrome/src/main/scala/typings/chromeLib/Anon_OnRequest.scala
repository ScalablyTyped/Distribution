package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRequest extends js.Object {
  var onRequest: chromeLib.chromeNs.declarativeWebRequestNs.RequestedEvent
}

object Anon_OnRequest {
  @scala.inline
  def apply(onRequest: chromeLib.chromeNs.declarativeWebRequestNs.RequestedEvent): Anon_OnRequest = {
    val __obj = js.Dynamic.literal(onRequest = onRequest)
  
    __obj.asInstanceOf[Anon_OnRequest]
  }
}

