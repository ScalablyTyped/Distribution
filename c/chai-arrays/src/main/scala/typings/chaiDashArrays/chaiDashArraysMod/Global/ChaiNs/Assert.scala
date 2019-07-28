package typings.chaiDashArrays.chaiDashArraysMod.Global.ChaiNs

import typings.chaiDashArrays.chaiDashArraysMod.Global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends js.Object {
  def array(`val`: Array[_]): Unit = js.native
  def array(`val`: Array[_], msg: String): Unit = js.native
  def containing(`val`: Array[_], value: js.Any): Unit = js.native
  def containing(`val`: Array[_], value: js.Any, msg: String): Unit = js.native
  def containingAllOf(`val`: Array[_], values: Array[_]): Unit = js.native
  def containingAllOf(`val`: Array[_], values: Array[_], msg: String): Unit = js.native
  def containingAnyOf(`val`: Array[_], values: Array[_]): Unit = js.native
  def containingAnyOf(`val`: Array[_], values: Array[_], msg: String): Unit = js.native
  def equalTo(`val`: Array[_], array: Array[_]): Unit = js.native
  def equalTo(`val`: Array[_], array: Array[_], msg: String): Unit = js.native
  def ofSize(`val`: Array[_], size: Double): Unit = js.native
  def ofSize(`val`: Array[_], size: Double, msg: String): Unit = js.native
  def sorted(`val`: Array[_]): Unit = js.native
  def sorted(`val`: Array[_], msg: String): Unit = js.native
}

