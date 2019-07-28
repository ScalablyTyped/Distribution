package typings.atBlueprintjsTable.libEsmInteractionsReorderableMod

import typings.atBlueprintjsTable.libEsmInteractionsDraggableMod.ICoordinateData
import typings.atBlueprintjsTable.libEsmRegionsMod.IRegion
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragReorderable extends IReorderableProps {
  /**
    * Whether the reordering behavior is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.native
  /**
    * A callback that determines a `Region` for the single `MouseEvent`. If
    * no valid region can be found, `null` may be returned.
    */
  def locateClick(event: MouseEvent): IRegion = js.native
  /**
    * A callback that determines the index at which to show the preview guide.
    * This is equivalent to the absolute index in the old ordering where the
    * reordered element will move.
    */
  def locateDrag(event: MouseEvent, coords: ICoordinateData): Double = js.native
  /**
    * A callback that converts the provided index into a region. The returned
    * region will be used to update the current selection after drag-reordering.
    */
  def toRegion(index1: Double): IRegion = js.native
  def toRegion(index1: Double, index2: Double): IRegion = js.native
}

