package typings.dbus.mod

import typings.dbus.anon.Getter
import typings.dbus.anon.In
import typings.dbus.anon.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBusServiceInterface extends js.Object {
  def addMethod(
    method: String,
    opts: In,
    handler: js.Function3[
      /* name */ String, 
      /* quality */ js.Any, 
      /* callback */ js.Function1[/* res */ js.Any, Unit], 
      Unit
    ]
  ): Unit = js.native
  def addProperty(name: String, opts: Getter): Unit = js.native
  def addSignal(name: String, opts: Types): Unit = js.native
  def emitSignal(name: String, values: js.Any*): Unit = js.native
  def update(): Unit = js.native
}

object DBusServiceInterface {
  @scala.inline
  def apply(
    addMethod: (String, In, js.Function3[
      /* name */ String, 
      /* quality */ js.Any, 
      /* callback */ js.Function1[/* res */ js.Any, Unit], 
      Unit
    ]) => Unit,
    addProperty: (String, Getter) => Unit,
    addSignal: (String, Types) => Unit,
    emitSignal: (String, /* repeated */ js.Any) => Unit,
    update: () => Unit
  ): DBusServiceInterface = {
    val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction3(addMethod), addProperty = js.Any.fromFunction2(addProperty), addSignal = js.Any.fromFunction2(addSignal), emitSignal = js.Any.fromFunction2(emitSignal), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[DBusServiceInterface]
  }
  @scala.inline
  implicit class DBusServiceInterfaceOps[Self <: DBusServiceInterface] (val x: Self) extends AnyVal {
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
    def setAddMethod(
      value: (String, In, js.Function3[
          /* name */ String, 
          /* quality */ js.Any, 
          /* callback */ js.Function1[/* res */ js.Any, Unit], 
          Unit
        ]) => Unit
    ): Self = this.set("addMethod", js.Any.fromFunction3(value))
    @scala.inline
    def setAddProperty(value: (String, Getter) => Unit): Self = this.set("addProperty", js.Any.fromFunction2(value))
    @scala.inline
    def setAddSignal(value: (String, Types) => Unit): Self = this.set("addSignal", js.Any.fromFunction2(value))
    @scala.inline
    def setEmitSignal(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("emitSignal", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

