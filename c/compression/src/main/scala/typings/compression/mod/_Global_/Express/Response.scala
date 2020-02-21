package typings.compression.mod._Global_.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /**
    * Forces the partially-compressed response to be flushed to the client.
    */
  def flush(): Unit
}

object Response {
  @scala.inline
  def apply(flush: () => Unit): Response = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush))
  
    __obj.asInstanceOf[Response]
  }
}

