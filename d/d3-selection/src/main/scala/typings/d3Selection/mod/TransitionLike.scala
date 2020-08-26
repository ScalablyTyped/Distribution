package typings.d3Selection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionLike[GElement /* <: BaseType */, Datum] extends js.Object {
  def on(`type`: String, listener: Null): TransitionLike[GElement, Datum] = js.native
  def on(`type`: String, listener: ValueFn[GElement, Datum, Unit]): TransitionLike[GElement, Datum] = js.native
  def selection(): Selection_[GElement, Datum, _, _] = js.native
  def tween(name: String, tweenFn: Null): TransitionLike[GElement, Datum] = js.native
  def tween(name: String, tweenFn: ValueFn[GElement, Datum, js.Function1[/* t */ Double, Unit]]): TransitionLike[GElement, Datum] = js.native
}

