package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/select", "Select")
@js.native
class Select ()
  extends reactLib.reactMod.Component[SelectProps, SelectState, js.Any] {
  def addValue(item: Option): scala.Unit = js.native
  def clearValue(event: stdLib.KeyboardEvent): scala.Unit = js.native
  def clearValue(event: stdLib.MouseEvent): scala.Unit = js.native
  def clearValue(event: stdLib.TouchEvent): scala.Unit = js.native
  def closeMenu(): scala.Unit = js.native
  def filterOption(): Value = js.native
  def filterOption(excludeOptions: Value): Value = js.native
  def focus(): scala.Unit = js.native
  def getOptionLabel(locale: baseuiLib.Locale, hasOption: baseuiLib.Anon_OptionOptionState): reactLib.reactMod.ReactNode = js.native
  def getSharedProps(): baseuiLib.Anon_Clearable = js.native
  def getValueArray(value: Value): js.Array[Option] = js.native
  def getValueLabel(hasOption: baseuiLib.Anon_Option_7372621): reactLib.reactMod.ReactNode = js.native
  def handleBlur(event: stdLib.Event): scala.Unit = js.native
  def handleClick(event: stdLib.MouseEvent): scala.Unit = js.native
  def handleClick(event: stdLib.TouchEvent): scala.Unit = js.native
  def handleClickOutside(event: stdLib.MouseEvent): scala.Unit = js.native
  def handleInputChange(event: reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement]): scala.Unit = js.native
  def handleInputFocus(event: reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement]): scala.Unit = js.native
  def handleKeyDown(event: stdLib.KeyboardEvent): scala.Unit = js.native
  def handleTouchEnd(event: stdLib.TouchEvent): scala.Unit = js.native
  def handleTouchEndClearValue(event: stdLib.TouchEvent): scala.Unit = js.native
  def handleTouchMove(): scala.Unit = js.native
  def handleTouchOutside(event: stdLib.TouchEvent): scala.Unit = js.native
  def handleTouchStart(): scala.Unit = js.native
  def popValue(): scala.Unit = js.native
  def removeValue(item: Option): scala.Unit = js.native
  def renderArrow(): reactLib.reactMod.ReactNode = js.native
  def renderClear(): reactLib.reactMod.ReactNode = js.native
  def renderInput(): reactLib.reactMod.ReactNode = js.native
  def renderLoading(): reactLib.reactMod.ReactNode = js.native
  def renderSearch(): reactLib.reactMod.ReactNode = js.native
  def renderValue(valueArray: Value, isOpen: scala.Boolean, locale: baseuiLib.Locale): reactLib.reactMod.ReactNode = js.native
  def selectValue(hasItem: baseuiLib.Anon_Item): scala.Unit = js.native
  def setValue(value: Value, option: Option, `type`: ChangeAction): scala.Unit = js.native
}

