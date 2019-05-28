package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeclarativeWebRequest extends js.Object {
  var onRequest: chromeLib.chromeNs.declarativeWebRequestNs.RequestedEvent
}

object TypeofdeclarativeWebRequest {
  @scala.inline
  def apply(onRequest: chromeLib.chromeNs.declarativeWebRequestNs.RequestedEvent): TypeofdeclarativeWebRequest = {
    val __obj = js.Dynamic.literal(onRequest = onRequest)
  
    __obj.asInstanceOf[TypeofdeclarativeWebRequest]
  }
}

