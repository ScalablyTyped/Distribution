package typings.blueprintjsTable.reorderableMod

import typings.blueprintjsTable.PartialIDragReorderable
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
@js.native
class DragReorderable ()
  extends Component[IDragReorderable, js.Object, js.Any] {
  var getDraggableProps: js.Any = js.native
  var handleActivate: js.Any = js.native
  var handleDragEnd: js.Any = js.native
  var handleDragMove: js.Any = js.native
  var maybeSelectRegion: js.Any = js.native
  var selectedRegionLength: js.Any = js.native
  var selectedRegionStartIndex: js.Any = js.native
  var shouldIgnoreMouseDown: js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
@js.native
object DragReorderable extends js.Object {
  var defaultProps: PartialIDragReorderable = js.native
}

