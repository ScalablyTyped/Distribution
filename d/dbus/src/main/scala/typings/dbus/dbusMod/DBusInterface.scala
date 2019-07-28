package typings.dbus.dbusMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusInterface
  extends /**
  * ...args
  * options: {timeout: number}
  * callback: (err: DBusError|undefined, res: any)=>void
  */
/* methodName */ StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] {
  def getProperties(callback: js.Function2[/* err */ DBusError, /* properties */ js.Array[StringDictionary[_]], Unit]): Unit
  def getProperty(name: String, callback: js.Function2[/* err */ DBusError, /* name */ String, Unit]): Unit
  def setProperty(name: String, value: js.Any, callback: js.Function1[/* err */ DBusError, Unit]): Unit
}

object DBusInterface {
  @scala.inline
  def apply(
    getProperties: js.Function2[/* err */ DBusError, /* properties */ js.Array[StringDictionary[_]], Unit] => Unit,
    getProperty: (String, js.Function2[/* err */ DBusError, /* name */ String, Unit]) => Unit,
    setProperty: (String, js.Any, js.Function1[/* err */ DBusError, Unit]) => Unit,
    StringDictionary: /**
    * ...args
    * options: {timeout: number}
    * callback: (err: DBusError|undefined, res: any)=>void
    */
  /* methodName */ StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = null
  ): DBusInterface = {
    val __obj = js.Dynamic.literal(getProperties = js.Any.fromFunction1(getProperties), getProperty = js.Any.fromFunction2(getProperty), setProperty = js.Any.fromFunction3(setProperty))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DBusInterface]
  }
}

