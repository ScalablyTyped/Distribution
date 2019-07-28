package typings.chayns.chaynsNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns.storage")
@js.native
object ^ extends js.Object {
  def get(key: String): js.Any = js.native
  def get(key: String, accessMode: accessMode): js.Any = js.native
  def remove(key: String): js.Promise[_] = js.native
  def remove(key: String, accessMode: accessMode): js.Promise[_] = js.native
  def set(key: String, value: js.Any): js.Promise[_] = js.native
  def set(key: String, value: js.Any, accessMode: accessMode): js.Promise[_] = js.native
  def set(key: String, value: js.Any, accessMode: accessMode, tappIds: js.Array[Double]): js.Promise[_] = js.native
}

