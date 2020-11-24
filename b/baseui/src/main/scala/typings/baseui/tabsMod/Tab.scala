package typings.baseui.tabsMod

import typings.react.mod.Component
import typings.std.Event
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/tabs", "Tab")
@js.native
class Tab ()
  extends Component[TabProps, js.Object, js.Any] {
  
  def getSharedProps(): SharedProps = js.native
  
  def onClick(e: Event): Unit = js.native
  
  def onKeyDown(e: KeyboardEvent): Unit = js.native
}
