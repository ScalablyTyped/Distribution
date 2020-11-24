package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapMixin[T] extends js.Object {
  
  def cap(): Double = js.native
  def cap(t: Double): T = js.native
  @JSName("cap")
  var cap_Original: IGetSet[Double, T] = js.native
  
  def othersGrouper(): js.Function1[/* data */ js.Array[_], js.Array[_]] = js.native
  def othersGrouper(t: js.Function1[/* data */ js.Array[_], js.Array[_]]): T = js.native
  @JSName("othersGrouper")
  var othersGrouper_Original: IGetSet[js.Function1[/* data */ js.Array[_], js.Array[_]], T] = js.native
  
  def othersLabel(): String = js.native
  def othersLabel(t: String): T = js.native
  @JSName("othersLabel")
  var othersLabel_Original: IGetSet[String, T] = js.native
}
