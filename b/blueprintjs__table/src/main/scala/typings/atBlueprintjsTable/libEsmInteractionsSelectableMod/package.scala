package typings.atBlueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmInteractionsSelectableMod {
  import typings.atBlueprintjsTable.libEsmInteractionsDraggableMod.ICoordinateData
  import typings.atBlueprintjsTable.libEsmRegionsMod.IRegion
  import typings.std.KeyboardEvent
  import typings.std.MouseEvent

  type ISelectedRegionTransform = js.Function3[
    /* region */ IRegion, 
    /* event */ MouseEvent | KeyboardEvent, 
    /* coords */ js.UndefOr[ICoordinateData], 
    IRegion
  ]
}
