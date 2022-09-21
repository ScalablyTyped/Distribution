package typings.blueprintjsTable

import typings.blueprintjsCore.hotkeyConfigMod.HotkeyConfig
import typings.blueprintjsTable.esmRegionsMod.RegionCardinality
import typings.blueprintjsTable.tableHotkeysMod.TableHotkeys
import typings.blueprintjsTable.tablePropsMod.TablePropsWithDefaults
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object table2UtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/table2Utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareChildren(newChildren: js.Array[ReactElement], oldChildren: js.Array[ReactElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareChildren")(newChildren.asInstanceOf[js.Any], oldChildren.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getHotkeysFromProps(props: TablePropsWithDefaults, hotkeysImpl: TableHotkeys): js.Array[HotkeyConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHotkeysFromProps")(props.asInstanceOf[js.Any], hotkeysImpl.asInstanceOf[js.Any])).asInstanceOf[js.Array[HotkeyConfig]]
  
  inline def isSelectionModeEnabled(props: TablePropsWithDefaults, selectionMode: RegionCardinality): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSelectionModeEnabled")(props.asInstanceOf[js.Any], selectionMode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSelectionModeEnabled(
    props: TablePropsWithDefaults,
    selectionMode: RegionCardinality,
    selectionModes: js.Array[RegionCardinality]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSelectionModeEnabled")(props.asInstanceOf[js.Any], selectionMode.asInstanceOf[js.Any], selectionModes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
