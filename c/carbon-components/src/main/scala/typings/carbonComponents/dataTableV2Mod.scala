package typings.carbonComponents

import typings.carbonComponents.anon.Actionbarcancel
import typings.carbonComponents.anon.ClassActionBarActive
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/components/data-table-v2/data-table-v2", JSImport.Namespace)
@js.native
object dataTableV2Mod extends js.Object {
  @js.native
  class default protected ()
    extends typings.carbonComponents.dataTableMod.default {
    def this(element: js.Any, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var components: WeakMap[js.Object, _] = js.native
    var eventHandlers: Actionbarcancel = js.native
    def options: ClassActionBarActive = js.native
  }
  
}

