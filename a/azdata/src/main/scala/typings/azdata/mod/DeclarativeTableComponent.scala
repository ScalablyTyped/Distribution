package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.DeclarativeTableProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined data, columns, dataValues, enableRowSelection, selectedRow */ @js.native
trait DeclarativeTableComponent
  extends StObject
     with Component {
  
  /**
    * The column definitions for the table
    */
  var columns: js.Array[DeclarativeTableColumn] = js.native
  
  /**
    * @deprecated Use dataValues instead.
    */
  var data: js.UndefOr[js.Array[js.Array[Any]]] = js.native
  
  /**
    * dataValues will only be used if data is an empty array.
    * To set the dataValues, it is recommended to use the setDataValues method that returns a promise.
    */
  var dataValues: js.UndefOr[js.Array[js.Array[DeclarativeTableCellValue]]] = js.native
  
  /**
    * Gets a boolean value determines whether the row selection is enabled. Default value is false.
    */
  var enableRowSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Event that is fired whenever the data for a cell is changed
    */
  def onDataChanged(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onDataChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onDataChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDataChanged(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * Event that is fired whenever the data for a cell is changed
    */
  @JSName("onDataChanged")
  var onDataChanged_Original: Event[Any] = js.native
  
  /**
    * Event that is fired whenever a row in the table is selected
    */
  def onRowSelected(listener: js.Function1[/* e */ DeclarativeTableRowSelectedEvent, Any]): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ DeclarativeTableRowSelectedEvent, Any], thisArgs: Any): Disposable = js.native
  def onRowSelected(
    listener: js.Function1[/* e */ DeclarativeTableRowSelectedEvent, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onRowSelected(
    listener: js.Function1[/* e */ DeclarativeTableRowSelectedEvent, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * Event that is fired whenever a row in the table is selected
    */
  @JSName("onRowSelected")
  var onRowSelected_Original: Event[DeclarativeTableRowSelectedEvent] = js.native
  
  /**
    * Gets or sets the selected row number of the table. -1 means to no selected row.
    */
  var selectedRow: js.UndefOr[Double] = js.native
  
  /**
    * Sets the data values.
    * @param v The new data values
    */
  def setDataValues(v: js.Array[js.Array[DeclarativeTableCellValue]]): js.Promise[Unit] = js.native
  
  /**
    * Sets the filter currently applied to this table - only rows with index in the given array will be visible. undefined
    * will clear the filter
    */
  def setFilter(): Unit = js.native
  def setFilter(rowIndexes: js.Array[Double]): Unit = js.native
}
