package typings.baseui.selectMod

import typings.baseui.AnonClearable
import typings.baseui.AnonItem
import typings.baseui.AnonOption1413309453
import typings.baseui.AnonOptionOptionState
import typings.dateFns.Locale
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.ReactNode
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/select", "Select")
@js.native
class Select ()
  extends Component[SelectProps, SelectState, js.Any] {
  def addValue(item: Option): Unit = js.native
  def clearValue(event: KeyboardEvent): Unit = js.native
  def clearValue(event: MouseEvent): Unit = js.native
  def clearValue(event: TouchEvent): Unit = js.native
  def closeMenu(): Unit = js.native
  def filterOption(): Value = js.native
  def filterOption(excludeOptions: Value): Value = js.native
  def focus(): Unit = js.native
  def getOptionLabel(locale: Locale, hasOption: AnonOptionOptionState): ReactNode = js.native
  def getSharedProps(): AnonClearable = js.native
  def getValueArray(value: Value): js.Array[Option] = js.native
  def getValueLabel(hasOption: AnonOption1413309453): ReactNode = js.native
  def handleBlur(event: Event_): Unit = js.native
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
  def selectValue(hasItem: AnonItem): Unit = js.native
  def setValue(value: Value, option: Option, `type`: ChangeAction): Unit = js.native
}

