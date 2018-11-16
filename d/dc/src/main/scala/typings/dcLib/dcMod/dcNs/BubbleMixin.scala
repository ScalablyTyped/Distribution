package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BubbleMixin[T] extends ColorMixin[T] {
  @JSName("maxBubbleRelativeSize")
  var maxBubbleRelativeSize_Original: IGetSet[scala.Double, T] = js.native
  @JSName("minRadiusWithLabel")
  var minRadiusWithLabel_Original: IGetSet[scala.Double, T] = js.native
  @JSName("r")
  var r_Original: IGetSet[Scale[scala.Double], T] = js.native
  @JSName("radiusValueAccessor")
  var radiusValueAccessor_Original: IGetSet[Accessor[_, scala.Double], T] = js.native
  def maxBubbleRelativeSize(): scala.Double = js.native
  def maxBubbleRelativeSize(t: scala.Double): scala.Double = js.native
  def minRadiusWithLabel(): scala.Double = js.native
  def minRadiusWithLabel(t: scala.Double): scala.Double = js.native
  def r(): Scale[scala.Double] = js.native
  def r(t: Scale[scala.Double]): Scale[scala.Double] = js.native
  def radiusValueAccessor(): Accessor[_, scala.Double] = js.native
  def radiusValueAccessor(t: Accessor[_, scala.Double]): Accessor[_, scala.Double] = js.native
}

