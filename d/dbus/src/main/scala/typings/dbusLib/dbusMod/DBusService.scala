package typings
package dbusLib.dbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusService extends js.Object {
  def createObject(path: java.lang.String): DBusServiceObject
  def disconnect(): scala.Unit
  def removeObject(service: DBusServiceObject): scala.Unit
}

object DBusService {
  @scala.inline
  def apply(
    createObject: java.lang.String => DBusServiceObject,
    disconnect: () => scala.Unit,
    removeObject: DBusServiceObject => scala.Unit
  ): DBusService = {
    val __obj = js.Dynamic.literal(createObject = js.Any.fromFunction1(createObject), disconnect = js.Any.fromFunction0(disconnect), removeObject = js.Any.fromFunction1(removeObject))
  
    __obj.asInstanceOf[DBusService]
  }
}

