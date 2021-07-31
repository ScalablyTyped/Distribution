package typings.baseui.selectMod

import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/select", "AutosizeInput")
@js.native
class AutosizeInput protected ()
  extends Component[AutosizeInputProps, AutosizeInputState, js.Any] {
  def this(props: AutosizeInputProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: AutosizeInputProps, context: js.Any) = this()
  
  def sizerRef(): Unit = js.native
  def sizerRef(el: HTMLElement): Unit = js.native
  
  def updateInputWidth(): Unit = js.native
}
