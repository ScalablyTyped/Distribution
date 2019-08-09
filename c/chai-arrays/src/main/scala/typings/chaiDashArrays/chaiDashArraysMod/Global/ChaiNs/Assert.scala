package typings.chaiDashArrays.chaiDashArraysMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends js.Object {
  def array(`val`: js.Array[_]): Unit = js.native
  def array(`val`: js.Array[_], msg: String): Unit = js.native
  def containing(`val`: js.Array[_], value: js.Any): Unit = js.native
  def containing(`val`: js.Array[_], value: js.Any, msg: String): Unit = js.native
  def containingAllOf(`val`: js.Array[_], values: js.Array[_]): Unit = js.native
  def containingAllOf(`val`: js.Array[_], values: js.Array[_], msg: String): Unit = js.native
  def containingAnyOf(`val`: js.Array[_], values: js.Array[_]): Unit = js.native
  def containingAnyOf(`val`: js.Array[_], values: js.Array[_], msg: String): Unit = js.native
  def equalTo(`val`: js.Array[_], array: js.Array[_]): Unit = js.native
  def equalTo(`val`: js.Array[_], array: js.Array[_], msg: String): Unit = js.native
  def ofSize(`val`: js.Array[_], size: Double): Unit = js.native
  def ofSize(`val`: js.Array[_], size: Double, msg: String): Unit = js.native
  def sorted(`val`: js.Array[_]): Unit = js.native
  def sorted(`val`: js.Array[_], msg: String): Unit = js.native
}

