package typings.baseui.selectMod

import typings.baseui.Anon_Clearable
import typings.baseui.Anon_Item
import typings.baseui.Anon_OptionOptionState
import typings.baseui.Anon_Option_1721897024
import typings.dateDashFns.Locale
import typings.react.reactMod.Component
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.ReactNode
import typings.std.Event
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
  def getOptionLabel(locale: Locale, hasOption: Anon_OptionOptionState): ReactNode = js.native
  def getSharedProps(): Anon_Clearable = js.native
  def getValueArray(value: Value): js.Array[Option] = js.native
  def getValueLabel(hasOption: Anon_Option_1721897024): ReactNode = js.native
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
  def selectValue(hasItem: Anon_Item): Unit = js.native
  def setValue(value: Value, option: Option, `type`: ChangeAction): Unit = js.native
}

