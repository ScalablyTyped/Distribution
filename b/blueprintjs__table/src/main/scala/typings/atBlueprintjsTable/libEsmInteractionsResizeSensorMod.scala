package typings.atBlueprintjsTable

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/resizeSensor", JSImport.Namespace)
@js.native
object libEsmInteractionsResizeSensorMod extends js.Object {
  @js.native
  class ResizeSensor () extends js.Object
  
  /* static members */
  @js.native
  object ResizeSensor extends js.Object {
    var RESIZE_SENSOR_HTML: js.Any = js.native
    var RESIZE_SENSOR_STYLE: js.Any = js.native
    var debounce: js.Any = js.native
    def attach(element: HTMLElement, callback: js.Function0[Unit]): js.Function0[Unit] = js.native
  }
  
}

