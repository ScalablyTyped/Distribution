package typings.atBlueprintjsTable

import typings.atBlueprintjsTable.libEsmInteractionsDraggableMod.ICoordinateData
import typings.atBlueprintjsTable.libEsmRegionsMod.IRegion
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmInteractionsSelectableMod {
  type ISelectedRegionTransform = js.Function3[
    /* region */ IRegion, 
    /* event */ MouseEvent | KeyboardEvent, 
    /* coords */ js.UndefOr[ICoordinateData], 
    IRegion
  ]
}
