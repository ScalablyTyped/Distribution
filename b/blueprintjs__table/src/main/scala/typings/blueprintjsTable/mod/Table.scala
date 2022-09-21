package typings.blueprintjsTable.mod

import typings.blueprintjsTable.anon.ChildrenArray
import typings.blueprintjsTable.anon.ValidationMapColumnIntera
import typings.blueprintjsTable.tablePropsMod.TablePropsDefaults
import typings.blueprintjsTable.tablePropsMod.TablePropsWithDefaults
import typings.blueprintjsTable.tableStateMod.TableState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Table")
@js.native
open class Table protected ()
  extends typings.blueprintjsTable.tableMod.Table {
  def this(props: TablePropsWithDefaults) = this()
  def this(props: TablePropsWithDefaults, context: Any) = this()
}
/* static members */
object Table {
  
  @JSImport("@blueprintjs/table", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "Table.SHALLOW_COMPARE_PROP_KEYS_DENYLIST")
  @js.native
  def SHALLOW_COMPARE_PROP_KEYS_DENYLIST: Any = js.native
  inline def SHALLOW_COMPARE_PROP_KEYS_DENYLIST_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHALLOW_COMPARE_PROP_KEYS_DENYLIST")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Table.SHALLOW_COMPARE_STATE_KEYS_DENYLIST")
  @js.native
  def SHALLOW_COMPARE_STATE_KEYS_DENYLIST: Any = js.native
  inline def SHALLOW_COMPARE_STATE_KEYS_DENYLIST_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHALLOW_COMPARE_STATE_KEYS_DENYLIST")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Table.childContextTypes")
  @js.native
  def childContextTypes: ValidationMapColumnIntera = js.native
  inline def childContextTypes_=(x: ValidationMapColumnIntera): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Table.createColumnIdIndex")
  @js.native
  def createColumnIdIndex: Any = js.native
  inline def createColumnIdIndex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createColumnIdIndex")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Table.defaultProps")
  @js.native
  def defaultProps: TablePropsDefaults = js.native
  inline def defaultProps_=(x: TablePropsDefaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Table.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(props: TablePropsWithDefaults, state: TableState): ChildrenArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ChildrenArray | Null]
  
  @JSImport("@blueprintjs/table", "Table.isSelectionModeEnabled")
  @js.native
  def isSelectionModeEnabled: Any = js.native
  inline def isSelectionModeEnabled_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelectionModeEnabled")(x.asInstanceOf[js.Any])
}
