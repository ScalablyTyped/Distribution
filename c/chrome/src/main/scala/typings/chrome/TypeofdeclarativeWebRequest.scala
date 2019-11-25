package typings.chrome

import typings.chrome.chrome.declarativeWebRequest.RequestedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeclarativeWebRequest extends js.Object {
  var onRequest: RequestedEvent
}

object TypeofdeclarativeWebRequest {
  @scala.inline
  def apply(onRequest: RequestedEvent): TypeofdeclarativeWebRequest = {
    val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofdeclarativeWebRequest]
  }
}

