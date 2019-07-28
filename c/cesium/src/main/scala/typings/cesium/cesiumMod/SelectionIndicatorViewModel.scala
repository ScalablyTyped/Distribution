package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.SelectionIndicatorViewModelNs.ComputeScreenSpacePosition
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SelectionIndicatorViewModel")
@js.native
class SelectionIndicatorViewModel protected () extends js.Object {
  def this(scene: Scene, selectionIndicatorElement: Element, container: Element) = this()
  @JSName("computeScreenSpacePosition")
  var computeScreenSpacePosition_Original: ComputeScreenSpacePosition = js.native
  var container: Element = js.native
  var isVisible: Boolean = js.native
  var position: Cartesian3 = js.native
  var scene: Scene = js.native
  var selectionIndicatorElement: Element = js.native
  var showSelection: Boolean = js.native
  def animateAppear(): Unit = js.native
  def animateDepart(): Unit = js.native
  def computeScreenSpacePosition(position: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  def update(): Unit = js.native
}

