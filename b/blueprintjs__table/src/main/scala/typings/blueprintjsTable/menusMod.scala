package typings.blueprintjsTable

import typings.blueprintjsTable.copyCellsMenuItemMod.ICopyCellsMenuItemProps
import typings.blueprintjsTable.esmRegionsMod.IRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menusMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/menus", "CopyCellsMenuItem")
  @js.native
  class CopyCellsMenuItem protected ()
    extends typings.blueprintjsTable.copyCellsMenuItemMod.CopyCellsMenuItem {
    def this(props: ICopyCellsMenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICopyCellsMenuItemProps, context: js.Any) = this()
  }
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/menus", "MenuContext")
  @js.native
  class MenuContext protected ()
    extends typings.blueprintjsTable.menuContextMod.MenuContext {
    def this(target: IRegion, selectedRegions: js.Array[IRegion], numRows: Double, numCols: Double) = this()
  }
}
