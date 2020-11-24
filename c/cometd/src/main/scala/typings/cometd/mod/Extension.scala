package typings.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends js.Object {
  
  var incoming: js.UndefOr[Listener] = js.native
  
  var outgoing: js.UndefOr[Listener] = js.native
  
  var registered: js.UndefOr[js.Function2[/* name */ String, /* cometd */ CometD, Unit]] = js.native
  
  var unregistered: js.UndefOr[js.Function0[Unit]] = js.native
}
object Extension {
  
  @scala.inline
  def apply(): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    
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
    def setIncoming(value: /* message */ Message => Unit): Self = this.set("incoming", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIncoming: Self = this.set("incoming", js.undefined)
    
    @scala.inline
    def setOutgoing(value: /* message */ Message => Unit): Self = this.set("outgoing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOutgoing: Self = this.set("outgoing", js.undefined)
    
    @scala.inline
    def setRegistered(value: (/* name */ String, /* cometd */ CometD) => Unit): Self = this.set("registered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRegistered: Self = this.set("registered", js.undefined)
    
    @scala.inline
    def setUnregistered(value: () => Unit): Self = this.set("unregistered", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnregistered: Self = this.set("unregistered", js.undefined)
  }
}
