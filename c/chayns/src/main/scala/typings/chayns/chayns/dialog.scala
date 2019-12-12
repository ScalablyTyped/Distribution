package typings.chayns.chayns

import org.scalablytyped.runtime.TopLevel
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
import typings.chayns.chayns.dialog.buttonText.CANCEL
import typings.chayns.chayns.dialog.buttonText.NO
import typings.chayns.chayns.dialog.buttonText.OK
import typings.chayns.chayns.dialog.buttonText.YES
import typings.chayns.chayns.dialog.buttonType
import typings.chayns.chayns.dialog.buttonType.NEGATIVE
import typings.chayns.chayns.dialog.buttonType.POSITIVE
import typings.chayns.chayns.dialog.dateType
import typings.chayns.chayns.dialog.dateType.DATE
import typings.chayns.chayns.dialog.dateType.DATE_TIME
import typings.chayns.chayns.dialog.dateType.TIME
import typings.chayns.chayns.dialog.inputType
import typings.chayns.chayns.dialog.inputType.DEFAULT
import typings.chayns.chayns.dialog.inputType.PASSWORD
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[buttonText with String] = js.native
    /* "Abbrechen" */ @js.native
    object CANCEL extends TopLevel[CANCEL with String]
    
    /* "Nein" */ @js.native
    object NO extends TopLevel[NO with String]
    
    /* "OK" */ @js.native
    object OK extends TopLevel[OK with String]
    
    /* "Ja" */ @js.native
    object YES extends TopLevel[YES with String]
    
  }
  
  @js.native
  object buttonType extends js.Object {
    @js.native
    sealed trait CANCEL extends buttonType
    
    @js.native
    sealed trait NEGATIVE extends buttonType
    
    @js.native
    sealed trait POSITIVE extends buttonType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[buttonType with Double] = js.native
    /* -1 */ @js.native
    object CANCEL
      extends TopLevel[typings.chayns.chayns.dialog.buttonType.CANCEL with Double]
    
    /* 0 */ @js.native
    object NEGATIVE extends TopLevel[NEGATIVE with Double]
    
    /* 1 */ @js.native
    object POSITIVE extends TopLevel[POSITIVE with Double]
    
  }
  
  @js.native
  object dateType extends js.Object {
    @js.native
    sealed trait DATE extends dateType
    
    @js.native
    sealed trait DATE_TIME extends dateType
    
    @js.native
    sealed trait TIME extends dateType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[dateType with Double] = js.native
    /* 0 */ @js.native
    object DATE extends TopLevel[DATE with Double]
    
    /* 2 */ @js.native
    object DATE_TIME extends TopLevel[DATE_TIME with Double]
    
    /* 1 */ @js.native
    object TIME extends TopLevel[TIME with Double]
    
  }
  
  @js.native
  object inputType extends js.Object {
    @js.native
    sealed trait DEFAULT extends inputType
    
    @js.native
    sealed trait PASSWORD extends inputType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[inputType with Double] = js.native
    /* 0 */ @js.native
    object DEFAULT extends TopLevel[DEFAULT with Double]
    
    /* 1 */ @js.native
    object PASSWORD extends TopLevel[PASSWORD with Double]
    
  }
  
}

