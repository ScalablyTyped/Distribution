package typings.baseui.selectMod

import typings.baseui.anon.Clearable
import typings.baseui.anon.ItemOption
import typings.baseui.anon.OptionOption
import typings.baseui.anon.OptionState
import typings.dateFns.Locale
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/select", "Select")
@js.native
class Select protected ()
  extends Component[SelectProps, SelectState, js.Any] {
  def this(props: SelectProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SelectProps, context: js.Any) = this()
  
  def addValue(item: Option): Unit = js.native
  
  def clearValue(event: KeyboardEvent): Unit = js.native
  def clearValue(event: MouseEvent): Unit = js.native
  def clearValue(event: TouchEvent): Unit = js.native
  
  def closeMenu(): Unit = js.native
  
  def filterOption(): Value = js.native
  def filterOption(excludeOptions: Value): Value = js.native
  
  def focus(): Unit = js.native
  
  def getOptionLabel(locale: Locale, hasOption: OptionState): ReactNode = js.native
  
  def getSharedProps(): Clearable = js.native
  
  def getValueArray(value: Value): js.Array[Option] = js.native
  
  def getValueLabel(hasOption: OptionOption): ReactNode = js.native
  
  def handleBlur(event: Event): Unit = js.native
  
  def handleClick(event: MouseEvent): Unit = js.native
  def handleClick(event: TouchEvent): Unit = js.native
  
  def handleClickOutside(event: MouseEvent): Unit = js.native
  
  def handleInputChange(event: FormEvent[HTMLInputElement]): Unit = js.native
  
  def handleInputFocus(event: FocusEvent[HTMLElement]): Unit = js.native
  
  def handleKeyDown(event: KeyboardEvent): Unit = js.native
  
  def handleTouchEnd(event: TouchEvent): Unit = js.native
  
  def handleTouchEndClearValue(event: TouchEvent): Unit = js.native
  
  def handleTouchMove(): Unit = js.native
  
  def handleTouchOutside(event: TouchEvent): Unit = js.native
  
  def handleTouchStart(): Unit = js.native
  
  def popValue(): Unit = js.native
  
  def removeValue(item: Option): Unit = js.native
  
  def renderArrow(): ReactNode = js.native
  
  def renderClear(): ReactNode = js.native
  
  def renderInput(): ReactNode = js.native
  
  def renderLoading(): ReactNode = js.native
  
  def renderSearch(): ReactNode = js.native
  
  def renderValue(valueArray: Value, isOpen: Boolean, locale: Locale): ReactNode = js.native
  
  def selectValue(hasItem: ItemOption): Unit = js.native
  
  def setValue(value: Value, option: Option, `type`: ChangeAction): Unit = js.native
}
