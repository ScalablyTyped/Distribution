package typings.blueprintjsTable

import typings.blueprintjsTable.copyCellsMenuItemMod.ICopyCellsMenuItemProps
import typings.blueprintjsTable.esmRegionsMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menusMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/menus", "CopyCellsMenuItem")
  @js.native
  open class CopyCellsMenuItem protected ()
    extends typings.blueprintjsTable.copyCellsMenuItemMod.CopyCellsMenuItem {
    def this(props: ICopyCellsMenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICopyCellsMenuItemProps, context: Any) = this()
  }
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/menus", "MenuContext")
  @js.native
  open class MenuContext protected ()
    extends typings.blueprintjsTable.menuContextMod.MenuContext {
    def this(target: Region, selectedRegions: js.Array[Region], numRows: Double, numCols: Double) = this()
  }
}
