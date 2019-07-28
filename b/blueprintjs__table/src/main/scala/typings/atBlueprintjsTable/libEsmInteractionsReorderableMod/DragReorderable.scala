package typings.atBlueprintjsTable.libEsmInteractionsReorderableMod

import typings.react.reactMod.PureComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
@js.native
class DragReorderable ()
  extends PureComponent[IDragReorderable, js.Object, js.Any] {
  var handleActivate: js.Any = js.native
  var handleDragEnd: js.Any = js.native
  var handleDragMove: js.Any = js.native
  var selectedRegionLength: js.Any = js.native
  var selectedRegionStartIndex: js.Any = js.native
  /* private */ def getDraggableProps(): js.Any = js.native
  /* private */ def maybeSelectRegion(region: js.Any): js.Any = js.native
  /* private */ def shouldIgnoreMouseDown(event: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
@js.native
object DragReorderable extends js.Object {
  var defaultProps: Partial[IDragReorderable] = js.native
}

