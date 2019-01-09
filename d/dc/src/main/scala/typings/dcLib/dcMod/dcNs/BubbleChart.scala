package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- dcLib.dcMod.dcNs.BubbleMixin because var conflicts: colorAccessor_Original, colorCalculator_Original, colorDomain_Original, colors_Original. Inlined r, r, r_Original, radiusValueAccessor, radiusValueAccessor, radiusValueAccessor_Original, minRadiusWithLabel, minRadiusWithLabel, minRadiusWithLabel_Original, maxBubbleRelativeSize, maxBubbleRelativeSize, maxBubbleRelativeSize_Original */ @js.native
trait BubbleChart extends CoordinateGridMixin[BubbleChart] {
  @JSName("elasticRadius")
  var elasticRadius_Original: IGetSet[scala.Boolean, BubbleChart] = js.native
  @JSName("maxBubbleRelativeSize")
  var maxBubbleRelativeSize_Original: IGetSet[scala.Double, BubbleChart] = js.native
  @JSName("minRadiusWithLabel")
  var minRadiusWithLabel_Original: IGetSet[scala.Double, BubbleChart] = js.native
  @JSName("r")
  var r_Original: IGetSet[Scale[scala.Double], BubbleChart] = js.native
  @JSName("radiusValueAccessor")
  var radiusValueAccessor_Original: IGetSet[Accessor[_, scala.Double], BubbleChart] = js.native
  def elasticRadius(): scala.Boolean = js.native
  def elasticRadius(t: scala.Boolean): BubbleChart = js.native
  def maxBubbleRelativeSize(): scala.Double = js.native
  def maxBubbleRelativeSize(t: scala.Double): scala.Double = js.native
  def minRadiusWithLabel(): scala.Double = js.native
  def minRadiusWithLabel(t: scala.Double): scala.Double = js.native
  def r(): Scale[scala.Double] = js.native
  def r(t: Scale[scala.Double]): Scale[scala.Double] = js.native
  def radiusValueAccessor(): Accessor[_, scala.Double] = js.native
  def radiusValueAccessor(t: Accessor[_, scala.Double]): Accessor[_, scala.Double] = js.native
}

