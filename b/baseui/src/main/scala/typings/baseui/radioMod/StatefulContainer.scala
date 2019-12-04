package typings.baseui.radioMod

import typings.react.reactMod.Component
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/radio", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulContainerProps, State, js.Any] {
  def onChange(e: FormEventHandler[HTMLInputElement]): Unit = js.native
  def stateReducer(`type`: String, e: SyntheticEvent[HTMLInputElement, Event]): Unit = js.native
}

