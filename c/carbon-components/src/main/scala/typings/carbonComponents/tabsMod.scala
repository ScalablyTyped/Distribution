package typings.carbonComponents

import typings.carbonComponents.anon.BACKWARD
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/components/tabs/tabs", JSImport.Namespace)
@js.native
object tabsMod extends js.Object {
  @js.native
  trait Tab
    extends typings.carbonComponents.contentSwitcherMod.default {
    def _changeState(detail: js.Any, callback: js.Any): Unit = js.native
    def _handleDocumentClick(event: js.Any): Unit = js.native
    def _handleKeyDown(event: js.Any): Unit = js.native
    def _updateMenuState(force: js.Any): Unit = js.native
    def _updateTriggerText(target: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Tab {
    def this(element: js.Any, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var NAVIGATE: BACKWARD = js.native
    var components: WeakMap[js.Object, _] = js.native
    def options: js.Any = js.native
  }
  
}

