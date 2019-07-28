package typings.dbus.dbusMod

import typings.dbus.Anon_Cb
import typings.dbus.Anon_In
import typings.dbus.Anon_Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusServiceInterface extends js.Object {
  def addMethod(
    method: String,
    opts: Anon_In,
    handler: js.Function3[
      /* name */ String, 
      /* quality */ js.Any, 
      /* callback */ js.Function1[/* res */ js.Any, Unit], 
      Unit
    ]
  ): Unit
  def addProperty(name: String, opts: Anon_Cb): Unit
  def addSignal(name: String, opts: Anon_Types): Unit
  def emitSignal(name: String, values: js.Any*): Unit
  def update(): Unit
}

object DBusServiceInterface {
  @scala.inline
  def apply(
    addMethod: (String, Anon_In, js.Function3[
      /* name */ String, 
      /* quality */ js.Any, 
      /* callback */ js.Function1[/* res */ js.Any, Unit], 
      Unit
    ]) => Unit,
    addProperty: (String, Anon_Cb) => Unit,
    addSignal: (String, Anon_Types) => Unit,
    emitSignal: (String, /* repeated */ js.Any) => Unit,
    update: () => Unit
  ): DBusServiceInterface = {
    val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction3(addMethod), addProperty = js.Any.fromFunction2(addProperty), addSignal = js.Any.fromFunction2(addSignal), emitSignal = js.Any.fromFunction2(emitSignal), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[DBusServiceInterface]
  }
}

