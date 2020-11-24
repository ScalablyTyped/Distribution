package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selectableMod {
  
  type ISelectedRegionTransform = js.Function3[
    /* region */ typings.blueprintjsTable.esmRegionsMod.IRegion, 
    /* event */ typings.std.MouseEvent | typings.std.KeyboardEvent, 
    /* coords */ js.UndefOr[typings.blueprintjsTable.dragTypesMod.ICoordinateData], 
    typings.blueprintjsTable.esmRegionsMod.IRegion
  ]
}
