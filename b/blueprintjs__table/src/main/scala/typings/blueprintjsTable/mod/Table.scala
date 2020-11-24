package typings.blueprintjsTable.mod

import typings.blueprintjsTable.anon.ChildrenArray
import typings.blueprintjsTable.anon.ValidationMapIColumnInter
import typings.blueprintjsTable.tableMod.ITableProps
import typings.blueprintjsTable.tableMod.ITableState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Table")
@js.native
class Table protected ()
  extends typings.blueprintjsTable.tableMod.Table {
  def this(props: ITableProps) = this()
  def this(props: ITableProps, context: js.Any) = this()
}
/* static members */
@JSImport("@blueprintjs/table", "Table")
@js.native
object Table extends js.Object {
  
  var SHALLOW_COMPARE_PROP_KEYS_DENYLIST: js.Any = js.native
  
  var SHALLOW_COMPARE_STATE_KEYS_DENYLIST: js.Any = js.native
  
  var childContextTypes: ValidationMapIColumnInter = js.native
  
  var createColumnIdIndex: js.Any = js.native
  
  var defaultProps: ITableProps = js.native
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(props: ITableProps, state: ITableState): ChildrenArray = js.native
  
  var isSelectionModeEnabled: js.Any = js.native
  
  var resizeRowsByApproximateHeightDefaults: js.Any = js.native
}
