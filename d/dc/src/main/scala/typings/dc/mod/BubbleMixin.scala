package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BubbleMixin[T] extends ColorMixin[T] {
  @JSName("maxBubbleRelativeSize")
  var maxBubbleRelativeSize_Original: IGetSet[Double, T] = js.native
  @JSName("minRadiusWithLabel")
  var minRadiusWithLabel_Original: IGetSet[Double, T] = js.native
  @JSName("r")
  var r_Original: IGetSet[Scale[Double], T] = js.native
  @JSName("radiusValueAccessor")
  var radiusValueAccessor_Original: IGetSet[Accessor[_, Double], T] = js.native
  def maxBubbleRelativeSize(): Double = js.native
  def maxBubbleRelativeSize(t: Double): T = js.native
  def minRadiusWithLabel(): Double = js.native
  def minRadiusWithLabel(t: Double): T = js.native
  def r(): Scale[Double] = js.native
  def r(t: Scale[Double]): T = js.native
  def radiusValueAccessor(): Accessor[_, Double] = js.native
  def radiusValueAccessor(t: Accessor[_, Double]): T = js.native
}

