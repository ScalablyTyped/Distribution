package typings.blueprintjsTable.selectableMod

import typings.blueprintjsTable.anon.PartialIDragSelectablePro
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/interactions/selectable", "DragSelectable")
@js.native
class DragSelectable ()
  extends Component[IDragSelectableProps, js.Object, js.Any] {
  
  var didExpandSelectionOnActivate: js.Any = js.native
  
  /**
    * Expands the last-selected region to the new region, and replaces the
    * last-selected region with the expanded region. If a focused cell is provided,
    * the focused cell will serve as an anchor for the expansion.
    */
  var expandSelectedRegions: js.Any = js.native
  
  var finishInteraction: js.Any = js.native
  
  var getDraggableProps: js.Any = js.native
  
  var handleActivate: js.Any = js.native
  
  var handleAddDisjointSelection: js.Any = js.native
  
  var handleClearAllSelectionsNotAtIndex: js.Any = js.native
  
  var handleClearSelectionAtIndex: js.Any = js.native
  
  var handleClick: js.Any = js.native
  
  var handleDragEnd: js.Any = js.native
  
  var handleDragMove: js.Any = js.native
  
  var handleExpandSelection: js.Any = js.native
  
  var handleReplaceSelection: js.Any = js.native
  
  var invokeOnFocusCallbackForRegion: js.Any = js.native
  
  var lastEmittedSelectedRegions: js.Any = js.native
  
  var maybeInvokeSelectionCallback: js.Any = js.native
  
  var shouldAddDisjointSelection: js.Any = js.native
  
  var shouldExpandSelection: js.Any = js.native
  
  var shouldIgnoreMouseDown: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/table/lib/esm/interactions/selectable", "DragSelectable")
@js.native
object DragSelectable extends js.Object {
  
  var defaultProps: PartialIDragSelectablePro = js.native
}
