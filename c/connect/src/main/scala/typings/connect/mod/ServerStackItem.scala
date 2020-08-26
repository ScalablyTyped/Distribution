package typings.connect.mod

import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerStackItem extends js.Object {
  var handle: ServerHandle = js.native
  var route: String = js.native
}

object ServerStackItem {
  @scala.inline
  def apply(handle: ServerHandle, route: String): ServerStackItem = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerStackItem]
  }
  @scala.inline
  implicit class ServerStackItemOps[Self <: ServerStackItem] (val x: Self) extends AnyVal {
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
    def setHandleFunction2(value: (/* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = this.set("handle", js.Any.fromFunction2(value))
    @scala.inline
    def setHandleFunction4(
      value: (/* err */ js.Any, /* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction) => Unit
    ): Self = this.set("handle", js.Any.fromFunction4(value))
    @scala.inline
    def setHandleFunction3(value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction) => Unit): Self = this.set("handle", js.Any.fromFunction3(value))
    @scala.inline
    def setHandle(value: ServerHandle): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

