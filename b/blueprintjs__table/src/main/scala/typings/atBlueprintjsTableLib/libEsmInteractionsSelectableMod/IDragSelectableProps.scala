package typings
package atBlueprintjsTableLib.libEsmInteractionsSelectableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragSelectableProps extends ISelectableProps {
  /**
    * Whether the selection behavior is disabled.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean | (js.Function1[/* event */ stdLib.MouseEvent, scala.Boolean])] = js.native
  /**
    * A list of CSS selectors that should _not_ trigger selection when a `mousedown` occurs inside of them.
    */
  var ignoredSelectors: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * A callback that determines a `Region` for the single `MouseEvent`. If
    * no valid region can be found, `null` may be returned.
    */
  def locateClick(event: stdLib.MouseEvent): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /**
    * A callback that determines a `Region` for the `MouseEvent` and
    * coordinate data representing a drag. If no valid region can be found,
    * `null` may be returned.
    */
  def locateDrag(
    event: stdLib.MouseEvent,
    coords: atBlueprintjsTableLib.libEsmInteractionsDraggableMod.ICoordinateData
  ): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  def locateDrag(
    event: stdLib.MouseEvent,
    coords: atBlueprintjsTableLib.libEsmInteractionsDraggableMod.ICoordinateData,
    returnEndOnly: scala.Boolean
  ): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
}

