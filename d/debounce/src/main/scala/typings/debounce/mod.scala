package typings.debounce

import typings.debounce.anon.Clear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("debounce", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val debounce: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _debounce */ js.Any = js.native
  def apply[A /* <: js.Function */](f: A): Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: Double): Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: Double, immediate: Boolean): Clear with A = js.native
}

