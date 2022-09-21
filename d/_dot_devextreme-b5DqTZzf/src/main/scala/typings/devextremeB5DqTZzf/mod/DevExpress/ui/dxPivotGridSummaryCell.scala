package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.data.PivotGridDataSource.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object exposing methods that manipulate a summary cell and provide access to its neighboring cells.
  * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
  */
@js.native
trait dxPivotGridSummaryCell extends StObject {
  
  def child(direction: String, fieldValue: String): dxPivotGridSummaryCell = js.native
  /**
    * Gets the child cell in a specified direction.
    */
  def child(direction: String, fieldValue: Double): dxPivotGridSummaryCell = js.native
  
  /**
    * Gets all child cells in a specified direction.
    */
  def children(direction: String): js.Array[dxPivotGridSummaryCell] = js.native
  
  /**
    * Gets a pivot grid field that corresponds to the summary cell.
    */
  def field(area: String): Field = js.native
  
  /**
    * Gets the Grand Total of the entire pivot grid.
    */
  def grandTotal(): dxPivotGridSummaryCell = js.native
  /**
    * Gets a partial Grand Total cell of a row or column.
    */
  def grandTotal(direction: String): dxPivotGridSummaryCell = js.native
  
  def isPostProcessed(field: String): Boolean = js.native
  /**
    * Indicates whether the summaryDisplayMode or calculateSummaryValue post-processed the summary value.
    */
  def isPostProcessed(field: Field): Boolean = js.native
  
  /**
    * Gets the cell next to the current one in a specified direction.
    */
  def next(direction: String): dxPivotGridSummaryCell = js.native
  /**
    * Gets the cell next to current in a specified direction.
    */
  def next(direction: String, allowCrossGroup: Boolean): dxPivotGridSummaryCell = js.native
  
  /**
    * Gets the parent cell in a specified direction.
    */
  def parent(direction: String): dxPivotGridSummaryCell = js.native
  
  /**
    * Gets the cell prior to the current one in a specified direction.
    */
  def prev(direction: String): dxPivotGridSummaryCell = js.native
  /**
    * Gets the cell previous to current in a specified direction.
    */
  def prev(direction: String, allowCrossGroup: Boolean): dxPivotGridSummaryCell = js.native
  
  def slice(field: Field, value: String): dxPivotGridSummaryCell = js.native
  /**
    * Gets the cell located by the path of the source cell with one field value changed.
    */
  def slice(field: Field, value: Double): dxPivotGridSummaryCell = js.native
  
  /**
    * Gets the summary cell value.
    */
  def value(): Any = js.native
  def value(field: String): Any = js.native
  def value(field: String, postProcessed: Boolean): Any = js.native
  /**
    * Gets the value of any field associated with the summary cell.
    */
  def value(field: Field): Any = js.native
  /**
    * Gets the value of any field associated with the summary cell.
    */
  def value(field: Field, postProcessed: Boolean): Any = js.native
  /**
    * Gets the summary cell value.
    */
  def value(postProcessed: Boolean): Any = js.native
}
