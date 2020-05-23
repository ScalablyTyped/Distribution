package typings.baseui.accordionMod

import typings.react.mod.Component
import typings.std.Event
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/accordion", "Panel")
@js.native
class Panel ()
  extends Component[PanelProps, js.Object, js.Any] {
  def getSharedProps(): SharedProps = js.native
  def onClick(e: Event): Unit = js.native
  def onKeyDown(e: KeyboardEvent): Unit = js.native
}

