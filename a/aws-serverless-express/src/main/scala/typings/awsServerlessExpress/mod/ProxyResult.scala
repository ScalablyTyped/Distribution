package typings.awsServerlessExpress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyResult extends js.Object {
  var promise: js.Promise[Response]
}

object ProxyResult {
  @scala.inline
  def apply(promise: js.Promise[Response]): ProxyResult = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProxyResult]
  }
}

