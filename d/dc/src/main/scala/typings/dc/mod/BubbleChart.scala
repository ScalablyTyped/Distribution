package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.dc.mod.ColorMixin because Already inherited
- typings.dc.mod.BubbleMixin because var conflicts: colorAccessor_Original, colorCalculator_Original, colorDomain_Original, colors_Original. Inlined r, r, r_Original, radiusValueAccessor, radiusValueAccessor, radiusValueAccessor_Original, minRadiusWithLabel, minRadiusWithLabel, minRadiusWithLabel_Original, maxBubbleRelativeSize, maxBubbleRelativeSize, maxBubbleRelativeSize_Original */ @js.native
trait BubbleChart extends CoordinateGridMixin[BubbleChart] {
  @JSName("elasticRadius")
  var elasticRadius_Original: IGetSet[Boolean, BubbleChart] = js.native
  @JSName("maxBubbleRelativeSize")
  var maxBubbleRelativeSize_Original: IGetSet[Double, BubbleChart] = js.native
  @JSName("minRadiusWithLabel")
  var minRadiusWithLabel_Original: IGetSet[Double, BubbleChart] = js.native
  @JSName("r")
  var r_Original: IGetSet[Scale[Double], BubbleChart] = js.native
  @JSName("radiusValueAccessor")
  var radiusValueAccessor_Original: IGetSet[Accessor[_, Double], BubbleChart] = js.native
  def elasticRadius(): Boolean = js.native
  def elasticRadius(t: Boolean): BubbleChart = js.native
  def maxBubbleRelativeSize(): Double = js.native
  def maxBubbleRelativeSize(t: Double): BubbleChart = js.native
  def minRadiusWithLabel(): Double = js.native
  def minRadiusWithLabel(t: Double): BubbleChart = js.native
  def r(): Scale[Double] = js.native
  def r(t: Scale[Double]): BubbleChart = js.native
  def radiusValueAccessor(): Accessor[_, Double] = js.native
  def radiusValueAccessor(t: Accessor[_, Double]): BubbleChart = js.native
}

