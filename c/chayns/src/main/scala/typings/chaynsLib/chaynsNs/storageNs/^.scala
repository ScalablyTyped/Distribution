package typings
package chaynsLib.chaynsNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns.storage")
@js.native
object ^ extends js.Object {
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, accessMode: accessMode): js.Any = js.native
  def remove(key: java.lang.String): js.Promise[_] = js.native
  def remove(key: java.lang.String, accessMode: accessMode): js.Promise[_] = js.native
  def set(key: java.lang.String, value: js.Any): js.Promise[_] = js.native
  def set(key: java.lang.String, value: js.Any, accessMode: accessMode): js.Promise[_] = js.native
  def set(key: java.lang.String, value: js.Any, accessMode: accessMode, tappIds: js.Array[scala.Double]): js.Promise[_] = js.native
}

