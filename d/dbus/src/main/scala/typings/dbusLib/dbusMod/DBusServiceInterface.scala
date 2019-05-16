package typings
package dbusLib.dbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusServiceInterface extends js.Object {
  def addMethod(
    method: java.lang.String,
    opts: dbusLib.Anon_In,
    handler: js.Function3[
      /* name */ java.lang.String, 
      /* quality */ js.Any, 
      /* callback */ js.Function1[/* res */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit
  def addProperty(name: java.lang.String, opts: dbusLib.Anon_Cb): scala.Unit
  def addSignal(name: java.lang.String, opts: dbusLib.Anon_Types): scala.Unit
  def emitSignal(name: java.lang.String, values: js.Any*): scala.Unit
  def update(): scala.Unit
}

object DBusServiceInterface {
  @scala.inline
  def apply(
    addMethod: (java.lang.String, dbusLib.Anon_In, js.Function3[
      /* name */ java.lang.String, 
      /* quality */ js.Any, 
      /* callback */ js.Function1[/* res */ js.Any, scala.Unit], 
      scala.Unit
    ]) => scala.Unit,
    addProperty: (java.lang.String, dbusLib.Anon_Cb) => scala.Unit,
    addSignal: (java.lang.String, dbusLib.Anon_Types) => scala.Unit,
    emitSignal: (java.lang.String, /* repeated */ js.Any) => scala.Unit,
    update: () => scala.Unit
  ): DBusServiceInterface = {
    val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction3(addMethod), addProperty = js.Any.fromFunction2(addProperty), addSignal = js.Any.fromFunction2(addSignal), emitSignal = js.Any.fromFunction2(emitSignal), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[DBusServiceInterface]
  }
}

