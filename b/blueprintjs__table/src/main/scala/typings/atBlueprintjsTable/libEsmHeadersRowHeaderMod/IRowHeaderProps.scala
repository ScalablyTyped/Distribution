package typings.atBlueprintjsTable.libEsmHeadersRowHeaderMod

import typings.atBlueprintjsTable.libEsmCommonGridMod.IRowIndices
import typings.atBlueprintjsTable.libEsmHeadersHeaderMod.IHeaderProps
import typings.atBlueprintjsTable.libEsmInteractionsResizableMod.IIndexedResizeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowHeaderProps
  extends IHeaderProps
     with IRowHeights
     with IRowIndices {
  /**
    * A callback invoked when user is done resizing the column
    */
  var onRowHeightChanged: IIndexedResizeCallback = js.native
  /**
    * Renders the cell for each row header
    */
  var rowHeaderCellRenderer: js.UndefOr[IRowHeaderRenderer] = js.native
}

