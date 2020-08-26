package typings.awsServerlessExpress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyResult extends js.Object {
  var promise: js.Promise[Response] = js.native
}

object ProxyResult {
  @scala.inline
  def apply(promise: js.Promise[Response]): ProxyResult = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyResult]
  }
  @scala.inline
  implicit class ProxyResultOps[Self <: ProxyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPromise(value: js.Promise[Response]): Self = this.set("promise", value.asInstanceOf[js.Any])
  }
  
}

