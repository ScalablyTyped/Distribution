package typings.chayns.global.chayns

import typings.chayns.DialogButton
import typings.chayns.DialogDateConfig
import typings.chayns.DialogDateResult
import typings.chayns.DialogFacebookOptions
import typings.chayns.DialogFacebookResult
import typings.chayns.DialogInputConfig
import typings.chayns.DialogInputResult
import typings.chayns.DialogSelectConfig
import typings.chayns.DialogSelectResult
import typings.chayns.chayns.dialog.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * chayns.dialog
  */
@JSGlobal("chayns.dialog")
@js.native
object dialog extends js.Object {
  def alert(title: String): js.Promise[buttonType] = js.native
  def alert(title: String, message: String): js.Promise[buttonType] = js.native
  def confirm(title: String): js.Promise[buttonType] = js.native
  def confirm(title: String, message: js.UndefOr[scala.Nothing], buttons: js.Array[DialogButton]): js.Promise[buttonType] = js.native
  def confirm(title: String, message: String): js.Promise[buttonType] = js.native
  def confirm(title: String, message: String, buttons: js.Array[DialogButton]): js.Promise[buttonType] = js.native
  def date(config: DialogDateConfig): js.Promise[DialogDateResult] = js.native
  def facebook(options: DialogFacebookOptions): js.Promise[DialogFacebookResult] = js.native
  def input(config: DialogInputConfig): js.Promise[DialogInputResult] = js.native
  def select(config: DialogSelectConfig): js.Promise[DialogSelectResult] = js.native
  @js.native
  object buttonText extends js.Object {
    /* "Abbrechen" */ val CANCEL: typings.chayns.chayns.dialog.buttonText.CANCEL with String = js.native
    /* "Nein" */ val NO: typings.chayns.chayns.dialog.buttonText.NO with String = js.native
    /* "OK" */ val OK: typings.chayns.chayns.dialog.buttonText.OK with String = js.native
    /* "Ja" */ val YES: typings.chayns.chayns.dialog.buttonText.YES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chayns.chayns.dialog.buttonText with String] = js.native
  }
  
  @js.native
  object buttonType extends js.Object {
    /* -1 */ val CANCEL: typings.chayns.chayns.dialog.buttonType.CANCEL with Double = js.native
    /* 0 */ val NEGATIVE: typings.chayns.chayns.dialog.buttonType.NEGATIVE with Double = js.native
    /* 1 */ val POSITIVE: typings.chayns.chayns.dialog.buttonType.POSITIVE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.chayns.chayns.dialog.buttonType with Double] = js.native
  }
  
  @js.native
  object dateType extends js.Object {
    /* 0 */ val DATE: typings.chayns.chayns.dialog.dateType.DATE with Double = js.native
    /* 2 */ val DATE_TIME: typings.chayns.chayns.dialog.dateType.DATE_TIME with Double = js.native
    /* 1 */ val TIME: typings.chayns.chayns.dialog.dateType.TIME with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.chayns.chayns.dialog.dateType with Double] = js.native
  }
  
  @js.native
  object inputType extends js.Object {
    /* 0 */ val DEFAULT: typings.chayns.chayns.dialog.inputType.DEFAULT with Double = js.native
    /* 1 */ val PASSWORD: typings.chayns.chayns.dialog.inputType.PASSWORD with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.chayns.chayns.dialog.inputType with Double] = js.native
  }
  
}

