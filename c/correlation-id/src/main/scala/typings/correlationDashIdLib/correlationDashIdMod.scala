package typings
package correlationDashIdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("correlation-id", JSImport.Namespace)
@js.native
object correlationDashIdMod extends js.Object {
  def bindId[T /* <: js.Function1[/* repeated */js.Any, _] */](id: java.lang.String, work: T): T = js.native
  def bindId[T /* <: js.Function1[/* repeated */js.Any, _] */](work: T): T = js.native
  def getId(): js.UndefOr[java.lang.String] = js.native
  def withId(id: java.lang.String, work: js.Function0[scala.Unit]): scala.Unit = js.native
  def withId(work: js.Function0[scala.Unit]): scala.Unit = js.native
}

