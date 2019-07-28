package typings.chrome

import typings.chrome.chromeNs.declarativeWebRequestNs.RequestedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeclarativeWebRequest extends js.Object {
  var onRequest: RequestedEvent
}

object TypeofdeclarativeWebRequest {
  @scala.inline
  def apply(onRequest: RequestedEvent): TypeofdeclarativeWebRequest = {
    val __obj = js.Dynamic.literal(onRequest = onRequest)
  
    __obj.asInstanceOf[TypeofdeclarativeWebRequest]
  }
}

