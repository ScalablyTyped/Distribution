package typings.dbus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Getter extends js.Object {
  
  def getter(cb: js.Function1[/* val */ String, Unit]): Unit = js.native
  
  var setter: js.UndefOr[js.Function2[/* value */ js.Any, /* done */ js.Function0[Unit], Unit]] = js.native
  
  var `type`: String = js.native
}
object Getter {
  
  @scala.inline
  def apply(getter: js.Function1[/* val */ String, Unit] => Unit, `type`: String): Getter = {
    val __obj = js.Dynamic.literal(getter = js.Any.fromFunction1(getter))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Getter]
  }
  
  @scala.inline
  implicit class GetterOps[Self <: Getter] (val x: Self) extends AnyVal {
    
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
    def setGetter(value: js.Function1[/* val */ String, Unit] => Unit): Self = this.set("getter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetter(value: (/* value */ js.Any, /* done */ js.Function0[Unit]) => Unit): Self = this.set("setter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetter: Self = this.set("setter", js.undefined)
  }
}
