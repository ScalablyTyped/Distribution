package typings.dbus.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBusInterface
  extends /**
  * ...args
  * options: {timeout: number}
  * callback: (err: DBusError|undefined, res: any)=>void
  */
/* methodName */ StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] {
  def getProperties(callback: js.Function2[/* err */ DBusError, /* properties */ js.Array[StringDictionary[_]], Unit]): Unit = js.native
  def getProperty(name: String, callback: js.Function2[/* err */ DBusError, /* name */ String, Unit]): Unit = js.native
  def setProperty(name: String, value: js.Any, callback: js.Function1[/* err */ DBusError, Unit]): Unit = js.native
}

object DBusInterface {
  @scala.inline
  def apply(
    getProperties: js.Function2[/* err */ DBusError, /* properties */ js.Array[StringDictionary[_]], Unit] => Unit,
    getProperty: (String, js.Function2[/* err */ DBusError, /* name */ String, Unit]) => Unit,
    setProperty: (String, js.Any, js.Function1[/* err */ DBusError, Unit]) => Unit
  ): DBusInterface = {
    val __obj = js.Dynamic.literal(getProperties = js.Any.fromFunction1(getProperties), getProperty = js.Any.fromFunction2(getProperty), setProperty = js.Any.fromFunction3(setProperty))
    __obj.asInstanceOf[DBusInterface]
  }
  @scala.inline
  implicit class DBusInterfaceOps[Self <: DBusInterface] (val x: Self) extends AnyVal {
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
    def setGetProperties(
      value: js.Function2[/* err */ DBusError, /* properties */ js.Array[StringDictionary[_]], Unit] => Unit
    ): Self = this.set("getProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProperty(value: (String, js.Function2[/* err */ DBusError, /* name */ String, Unit]) => Unit): Self = this.set("getProperty", js.Any.fromFunction2(value))
    @scala.inline
    def setSetProperty(value: (String, js.Any, js.Function1[/* err */ DBusError, Unit]) => Unit): Self = this.set("setProperty", js.Any.fromFunction3(value))
  }
  
}

