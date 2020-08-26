package typings.blueprintjsTable.menuContextMod

import typings.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/menus/menuContext", "MenuContext")
@js.native
class MenuContext protected () extends IMenuContext {
  def this(target: IRegion, selectedRegions: js.Array[IRegion], numRows: Double, numCols: Double) = this()
  var numCols: js.Any = js.native
  var numRows: js.Any = js.native
  var regions: js.Any = js.native
  var selectedRegions: js.Any = js.native
  var target: js.Any = js.native
}

