package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapMixin[T] extends js.Object {
  @JSName("cap")
  var cap_Original: IGetSet[scala.Double, T] = js.native
  @JSName("othersGrouper")
  var othersGrouper_Original: IGetSet[js.Function1[/* data */ js.Array[_], js.Array[_]], T] = js.native
  @JSName("othersLabel")
  var othersLabel_Original: IGetSet[java.lang.String, T] = js.native
  def cap(): scala.Double = js.native
  def cap(t: scala.Double): scala.Double = js.native
  def othersGrouper(): js.Function1[/* data */ js.Array[_], js.Array[_]] = js.native
  def othersGrouper(t: js.Function1[/* data */ js.Array[_], js.Array[_]]): js.Function1[/* data */ js.Array[_], js.Array[_]] = js.native
  def othersLabel(): java.lang.String = js.native
  def othersLabel(t: java.lang.String): java.lang.String = js.native
}

