package typings
package d3DashSelectionLib.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionLike[GElement /* <: BaseType */, Datum] extends js.Object {
  def on(`type`: java.lang.String): TransitionLike[GElement, Datum] = js.native
  def on(`type`: java.lang.String, listener: ValueFn[GElement, Datum, scala.Unit]): TransitionLike[GElement, Datum] = js.native
  def selection(): Selection[GElement, Datum, _, _] = js.native
  def tween(name: java.lang.String): TransitionLike[GElement, Datum] = js.native
  def tween(
    name: java.lang.String,
    tweenFn: ValueFn[GElement, Datum, js.Function1[/* t */ scala.Double, scala.Unit]]
  ): TransitionLike[GElement, Datum] = js.native
}

