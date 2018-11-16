package typings
package chaynsLib.chaynsNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns.storage")
@js.native
object storageNsMembers extends js.Object {
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, accessMode: accessMode): js.Any = js.native
  def remove(key: java.lang.String): stdLib.Promise[_] = js.native
  def remove(key: java.lang.String, accessMode: accessMode): stdLib.Promise[_] = js.native
  def set(key: java.lang.String, value: js.Any): stdLib.Promise[_] = js.native
  def set(key: java.lang.String, value: js.Any, accessMode: accessMode): stdLib.Promise[_] = js.native
  def set(key: java.lang.String, value: js.Any, accessMode: accessMode, tappIds: js.Array[scala.Double]): stdLib.Promise[_] = js.native
}

