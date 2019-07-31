package typings.atBlueprintjsTable.atBlueprintjsTableMod

import typings.atBlueprintjsTable.libEsmCommonContextMod.IColumnInteractionBarContextTypes
import typings.atBlueprintjsTable.libEsmTableMod.ITableProps
import typings.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "Table")
@js.native
class Table protected ()
  extends typings.atBlueprintjsTable.libEsmTableMod.Table {
  def this(props: ITableProps) = this()
  def this(props: ITableProps, context: js.Any) = this()
}

/* static members */
@JSImport("@blueprintjs/table", "Table")
@js.native
object Table extends js.Object {
  var SHALLOW_COMPARE_PROP_KEYS_BLACKLIST: js.Any = js.native
  var SHALLOW_COMPARE_STATE_KEYS_BLACKLIST: js.Any = js.native
  var childContextTypes: ValidationMap[IColumnInteractionBarContextTypes] = js.native
  var createColumnIdIndex: js.Any = js.native
  var defaultProps: ITableProps = js.native
  var displayName: String = js.native
  var resizeRowsByApproximateHeightDefaults: js.Any = js.native
}

