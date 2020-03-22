package typings.chrome

import typings.chrome.chrome.declarativeWebRequest.RequestedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeclarativeWebReque extends js.Object {
  var onRequest: RequestedEvent
}

object TypeofdeclarativeWebReque {
  @scala.inline
  def apply(onRequest: RequestedEvent): TypeofdeclarativeWebReque = {
    val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofdeclarativeWebReque]
  }
}

