package typings.carbonComponentsReact.dataTableDataTableMod

import typings.carbonComponentsReact.anon.PickTableContainerPropsst
import typings.carbonComponentsReact.tableExpandHeaderMod.TableExpandHeaderProps
import typings.carbonComponentsReact.tableMod.TableCarbonProps
import typings.carbonComponentsReact.tableToolbarMod.TableToolbarProps
import typings.carbonComponentsReact.typingsSharedMod.ShapeOf
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTableCustomRenderProps[R /* <: DataTableRow[String] */, H /* <: DataTableHeader[String] */] extends StObject {
  
  def expandAll(): Unit = js.native
  
  @JSName("expandRow")
  def expandRow_id(rowId: /* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any): Unit = js.native
  
  def getBatchActionProps[E /* <: js.Object */](): ShapeOf[DataTableCustomBatchActionsProps, E] = js.native
  def getBatchActionProps[E /* <: js.Object */](data: ShapeOf[DataTableCustomBatchActionsData, E]): ShapeOf[DataTableCustomBatchActionsProps, E] = js.native
  
  def getExpandHeaderProps(): TableExpandHeaderProps = js.native
  def getExpandHeaderProps(props: TableExpandHeaderProps): TableExpandHeaderProps = js.native
  
  def getHeaderProps[E /* <: js.Object */](data: ShapeOf[DataTableCustomHeaderData[H], E]): ShapeOf[DataTableCustomHeaderProps[H], E] = js.native
  
  def getRowProps[E /* <: js.Object */](data: ShapeOf[DataTableCustomRowData[DataTableRow[String]], E]): ShapeOf[DataTableCustomRowProps[DataTableRow[String]], E] = js.native
  
  def getSelectionProps[E /* <: js.Object */](): ShapeOf[DataTableCustomSelectionProps[scala.Nothing | R], E] = js.native
  def getSelectionProps[E /* <: js.Object */](data: ShapeOf[DataTableCustomSelectionData[DataTableRow[String]], E]): ShapeOf[DataTableCustomSelectionProps[scala.Nothing | R], E] = js.native
  
  def getTableContainerProps(): PickTableContainerPropsst = js.native
  
  def getTableProps(): TableCarbonProps = js.native
  
  def getToolbarProps(): TableToolbarProps = js.native
  def getToolbarProps(props: TableToolbarProps): TableToolbarProps = js.native
  
  var headers: js.Array[H] = js.native
  
  def onInputChange(event: SyntheticEvent[HTMLInputElement, Event]): Unit = js.native
  
  var radio: js.UndefOr[Boolean] = js.native
  
  var rows: js.Array[DenormalizedRow] = js.native
  
  def selectAll(): Unit = js.native
  
  @JSName("selectRow")
  def selectRow_id(rowId: /* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any): Unit = js.native
  
  var selectedRows: js.Array[DenormalizedRow] = js.native
  
  @JSName("sortBy")
  def sortBy_key(headerKey: /* import warning: importer.ImportType#apply Failed type conversion: H['key'] */ js.Any): Unit = js.native
}
