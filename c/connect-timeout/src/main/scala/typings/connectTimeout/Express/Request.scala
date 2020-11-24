package typings.connectTimeout.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  /**
    * @summary Clears the timeout on the request.
    */
  def clearTimeout(): Unit = js.native
  
  /**
    * @summary true if timeout fired; false otherwise.
    */
  var timedout: Boolean = js.native
}
object Request {
  
  @scala.inline
  def apply(clearTimeout: () => Unit, timedout: Boolean): Request = {
    val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction0(clearTimeout), timedout = timedout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setClearTimeout(value: () => Unit): Self = this.set("clearTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimedout(value: Boolean): Self = this.set("timedout", value.asInstanceOf[js.Any])
  }
}
