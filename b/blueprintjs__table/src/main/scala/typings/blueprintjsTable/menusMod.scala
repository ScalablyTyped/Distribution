package typings.blueprintjsTable

import typings.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/interactions/menus", JSImport.Namespace)
@js.native
object menusMod extends js.Object {
  
  @js.native
  class CopyCellsMenuItem ()
    extends typings.blueprintjsTable.copyCellsMenuItemMod.CopyCellsMenuItem
  
  @js.native
  class MenuContext protected ()
    extends typings.blueprintjsTable.menuContextMod.MenuContext {
    def this(target: IRegion, selectedRegions: js.Array[IRegion], numRows: Double, numCols: Double) = this()
  }
}
