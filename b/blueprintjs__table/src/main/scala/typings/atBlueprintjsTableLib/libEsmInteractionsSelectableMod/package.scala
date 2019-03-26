package typings
package atBlueprintjsTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmInteractionsSelectableMod {
  type ISelectedRegionTransform = js.Function3[
    /* region */ atBlueprintjsTableLib.libEsmRegionsMod.IRegion, 
    /* event */ stdLib.MouseEvent | stdLib.KeyboardEvent, 
    /* coords */ js.UndefOr[atBlueprintjsTableLib.libEsmInteractionsDraggableMod.ICoordinateData], 
    atBlueprintjsTableLib.libEsmRegionsMod.IRegion
  ]
}
