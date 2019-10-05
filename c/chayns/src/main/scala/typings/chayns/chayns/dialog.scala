package typings.chayns.chayns

import typings.chayns.DialogButton
import typings.chayns.DialogDateConfig
import typings.chayns.DialogDateResult
import typings.chayns.DialogFacebookOptions
import typings.chayns.DialogFacebookResult
import typings.chayns.DialogInputConfig
import typings.chayns.DialogInputResult
import typings.chayns.DialogSelectConfig
import typings.chayns.DialogSelectResult
import typings.chayns.chayns.dialog.buttonText
import typings.chayns.chayns.dialog.buttonType
import typings.chayns.chayns.dialog.dateType
import typings.chayns.chayns.dialog.inputType
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
  @js.native
  sealed trait buttonText extends js.Object
  
  @js.native
  sealed trait buttonType extends js.Object
  
  @js.native
  sealed trait dateType extends js.Object
  
  @js.native
  sealed trait inputType extends js.Object
  
  def alert(title: String): js.Promise[buttonType] = js.native
  def alert(title: String, message: String): js.Promise[buttonType] = js.native
  def confirm(title: String): js.Promise[buttonType] = js.native
  def confirm(title: String, message: String): js.Promise[buttonType] = js.native
  def confirm(title: String, message: String, buttons: js.Array[DialogButton]): js.Promise[buttonType] = js.native
  def date(config: DialogDateConfig): js.Promise[DialogDateResult] = js.native
  def facebook(options: DialogFacebookOptions): js.Promise[DialogFacebookResult] = js.native
  def input(config: DialogInputConfig): js.Promise[DialogInputResult] = js.native
  def select(config: DialogSelectConfig): js.Promise[DialogSelectResult] = js.native
  @js.native
  object buttonText extends js.Object {
    @js.native
    sealed trait CANCEL extends buttonText
    
    @js.native
    sealed trait NO extends buttonText
    
    @js.native
    sealed trait OK extends buttonText
    
    @js.native
    sealed trait YES extends buttonText
    
    /* "Abbrechen" */ val CANCEL: typings.chayns.chayns.dialog.buttonText.CANCEL with String = js.native
    /* "Nein" */ val NO: typings.chayns.chayns.dialog.buttonText.NO with String = js.native
    /* "OK" */ val OK: typings.chayns.chayns.dialog.buttonText.OK with String = js.native
    /* "Ja" */ val YES: typings.chayns.chayns.dialog.buttonText.YES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[buttonText with String] = js.native
  }
  
  @js.native
  object buttonType extends js.Object {
    @js.native
    sealed trait CANCEL extends buttonType
    
    @js.native
    sealed trait NEGATIVE extends buttonType
    
    @js.native
    sealed trait POSITIVE extends buttonType
    
    /* -1 */ val CANCEL: typings.chayns.chayns.dialog.buttonType.CANCEL with Double = js.native
    /* 0 */ val NEGATIVE: typings.chayns.chayns.dialog.buttonType.NEGATIVE with Double = js.native
    /* 1 */ val POSITIVE: typings.chayns.chayns.dialog.buttonType.POSITIVE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[buttonType with Double] = js.native
  }
  
  @js.native
  object dateType extends js.Object {
    @js.native
    sealed trait DATE extends dateType
    
    @js.native
    sealed trait DATE_TIME extends dateType
    
    @js.native
    sealed trait TIME extends dateType
    
    /* 0 */ val DATE: typings.chayns.chayns.dialog.dateType.DATE with Double = js.native
    /* 2 */ val DATE_TIME: typings.chayns.chayns.dialog.dateType.DATE_TIME with Double = js.native
    /* 1 */ val TIME: typings.chayns.chayns.dialog.dateType.TIME with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[dateType with Double] = js.native
  }
  
  @js.native
  object inputType extends js.Object {
    @js.native
    sealed trait DEFAULT extends inputType
    
    @js.native
    sealed trait PASSWORD extends inputType
    
    /* 0 */ val DEFAULT: typings.chayns.chayns.dialog.inputType.DEFAULT with Double = js.native
    /* 1 */ val PASSWORD: typings.chayns.chayns.dialog.inputType.PASSWORD with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[inputType with Double] = js.native
  }
  
}

