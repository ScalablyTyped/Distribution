package typings
package dbusLib.dbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusInterface
  extends /**
  * ...args
  * options: {timeout: number}
  * callback: (err: DBusError|undefined, res: any)=>void
  */
/* methodName */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, scala.Unit]] {
  def getProperties(
    callback: js.Function2[
      /* err */ DBusError, 
      /* properties */ js.Array[org.scalablytyped.runtime.StringDictionary[_]], 
      scala.Unit
    ]
  ): scala.Unit
  def getProperty(
    name: java.lang.String,
    callback: js.Function2[/* err */ DBusError, /* name */ java.lang.String, scala.Unit]
  ): scala.Unit
  def setProperty(name: java.lang.String, value: js.Any, callback: js.Function1[/* err */ DBusError, scala.Unit]): scala.Unit
}

object DBusInterface {
  @scala.inline
  def apply(
    getProperties: js.Function2[
      /* err */ DBusError, 
      /* properties */ js.Array[org.scalablytyped.runtime.StringDictionary[_]], 
      scala.Unit
    ] => scala.Unit,
    getProperty: (java.lang.String, js.Function2[/* err */ DBusError, /* name */ java.lang.String, scala.Unit]) => scala.Unit,
    setProperty: (java.lang.String, js.Any, js.Function1[/* err */ DBusError, scala.Unit]) => scala.Unit,
    StringDictionary: /**
    * ...args
    * options: {timeout: number}
    * callback: (err: DBusError|undefined, res: any)=>void
    */
  /* methodName */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, scala.Unit]] = null
  ): DBusInterface = {
    val __obj = js.Dynamic.literal(getProperties = js.Any.fromFunction1(getProperties), getProperty = js.Any.fromFunction2(getProperty), setProperty = js.Any.fromFunction3(setProperty))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DBusInterface]
  }
}

