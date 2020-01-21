package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectableMod {
  type ISelectedRegionTransform = js.Function3[
    /* region */ typings.blueprintjsTable.esmRegionsMod.IRegion, 
    /* event */ typings.std.MouseEvent | typings.std.KeyboardEvent, 
    /* coords */ js.UndefOr[typings.blueprintjsTable.draggableMod.ICoordinateData], 
    typings.blueprintjsTable.esmRegionsMod.IRegion
  ]
}
