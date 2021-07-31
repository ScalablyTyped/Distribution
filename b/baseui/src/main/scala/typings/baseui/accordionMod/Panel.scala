package typings.baseui.accordionMod

import typings.react.mod.Component
import typings.std.Event
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/accordion", "Panel")
@js.native
class Panel protected ()
  extends Component[PanelProps, js.Object, js.Any] {
  def this(props: PanelProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: PanelProps, context: js.Any) = this()
  
  def getSharedProps(): SharedProps = js.native
  
  def onClick(e: Event): Unit = js.native
  
  def onKeyDown(e: KeyboardEvent): Unit = js.native
}
