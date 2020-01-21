package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartRegistry extends js.Object {
  def clear(): Unit = js.native
  def clear(group: String): Unit = js.native
  def deregister(chart: BaseMixin[_]): Unit = js.native
  def deregister(chart: BaseMixin[_], group: String): Unit = js.native
  def has(chart: BaseMixin[_]): Boolean = js.native
  def list(): js.Array[BaseMixin[_]] = js.native
  def list(group: String): js.Array[BaseMixin[_]] = js.native
  def register(chart: BaseMixin[_]): Unit = js.native
  def register(chart: BaseMixin[_], group: String): Unit = js.native
}

