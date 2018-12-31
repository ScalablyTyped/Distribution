package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(dcLib.dcMod.dcNs.BubbleMixin because Would inherit conflicting mutable fields List(colorAccessor_Original, colorCalculator_Original, colorDomain_Original, colors_Original))*/
@js.native
trait BubbleChart extends CoordinateGridMixin[BubbleChart] {
  @JSName("elasticRadius")
  var elasticRadius_Original: IGetSet[scala.Boolean, BubbleChart] = js.native
  def elasticRadius(): scala.Boolean = js.native
  def elasticRadius(t: scala.Boolean): BubbleChart = js.native
}

