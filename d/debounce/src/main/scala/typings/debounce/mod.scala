package typings.debounce

import typings.debounce.anon.Clear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("debounce", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[A /* <: js.Function */](f: A): Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: js.UndefOr[scala.Nothing], immediate: Boolean): Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: Double): Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: Double, immediate: Boolean): Clear with A = js.native
  
  val debounce: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _debounce */ js.Any = js.native
}
