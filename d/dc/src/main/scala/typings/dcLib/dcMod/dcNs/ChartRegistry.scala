package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartRegistry extends js.Object {
  def clear(): scala.Unit = js.native
  def clear(group: java.lang.String): scala.Unit = js.native
  def deregister(chart: BaseMixin[_]): scala.Unit = js.native
  def deregister(chart: BaseMixin[_], group: java.lang.String): scala.Unit = js.native
  def has(chart: BaseMixin[_]): scala.Boolean = js.native
  def list(): js.Array[BaseMixin[_]] = js.native
  def list(group: java.lang.String): js.Array[BaseMixin[_]] = js.native
  def register(chart: BaseMixin[_]): scala.Unit = js.native
  def register(chart: BaseMixin[_], group: java.lang.String): scala.Unit = js.native
}

