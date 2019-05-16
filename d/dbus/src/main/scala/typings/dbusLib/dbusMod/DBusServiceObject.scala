package typings
package dbusLib.dbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusServiceObject extends js.Object {
  def createInterface(name: java.lang.String): DBusServiceInterface
}

object DBusServiceObject {
  @scala.inline
  def apply(createInterface: java.lang.String => DBusServiceInterface): DBusServiceObject = {
    val __obj = js.Dynamic.literal(createInterface = js.Any.fromFunction1(createInterface))
  
    __obj.asInstanceOf[DBusServiceObject]
  }
}

