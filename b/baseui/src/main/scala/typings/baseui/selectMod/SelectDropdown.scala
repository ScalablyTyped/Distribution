package typings.baseui.selectMod

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.anon.Error
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/select", "SelectDropdown")
@js.native
class SelectDropdown protected ()
  extends Component[DropdownProps, js.Object, js.Any] {
  def this(props: DropdownProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: DropdownProps, context: js.Any) = this()
  
  def getItemLabel(option: StringDictionary[js.Any]): ReactNode = js.native
  
  def getSharedProps(): Error = js.native
  
  def onMouseDown(e: Event): Unit = js.native
}
