package typings.cliInteract

import typings.cliInteract.anon.ChoiceOptionsreturnNumeri
import typings.cliInteract.cliInteractBooleans.`false`
import typings.cliInteract.cliInteractBooleans.`true`
import typings.readlineSync.mod.BasicOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-interact", "getChar")
  @js.native
  def getChar(promptText: String, allowedCharsAsString: String): String = js.native
  @JSImport("cli-interact", "getChar")
  @js.native
  def getChar(promptText: String, allowedCharsAsString: String, flagAllowNoAnswer: Boolean): String = js.native
  
  @JSImport("cli-interact", "getChoice")
  @js.native
  def getChoice(title: String, choices: js.Array[String]): String = js.native
  @JSImport("cli-interact", "getChoice")
  @js.native
  def getChoice(title: String, choices: js.Array[String], opts: ChoiceOptionsreturnNumeri): Double = js.native
  @JSImport("cli-interact", "getChoice")
  @js.native
  def getChoice(title: String, choices: js.Array[String], opts: ChoiceOptions): String = js.native
  
  @JSImport("cli-interact", "getChoiceByChar")
  @js.native
  def getChoiceByChar(title: String, choices: js.Array[String]): String = js.native
  @JSImport("cli-interact", "getChoiceByChar")
  @js.native
  def getChoiceByChar(title: String, choices: js.Array[String], flagAllowNoAnswer: Boolean): String = js.native
  
  @JSImport("cli-interact", "getIPversion")
  @js.native
  def getIPversion(): String = js.native
  @JSImport("cli-interact", "getIPversion")
  @js.native
  def getIPversion(flagAllowNoAnswer: Boolean): String = js.native
  
  @JSImport("cli-interact", "getInteger")
  @js.native
  def getInteger(promptText: String): Double = js.native
  
  @JSImport("cli-interact", "getNumber")
  @js.native
  def getNumber(promptText: String): Double = js.native
  @JSImport("cli-interact", "getNumber")
  @js.native
  def getNumber(promptText: String, opts: Boolean): Double = js.native
  @JSImport("cli-interact", "getNumber")
  @js.native
  def getNumber(promptText: String, opts: NumberOptions): Double = js.native
  
  @JSImport("cli-interact", "getYesNo")
  @js.native
  def getYesNo(title: String): Boolean = js.native
  @JSImport("cli-interact", "getYesNo")
  @js.native
  def getYesNo_false(title: String, flagAllowNoAnswer: `false`): Boolean = js.native
  @JSImport("cli-interact", "getYesNo")
  @js.native
  def getYesNo_true(title: String, flagAllowNoAnswer: `true`): js.UndefOr[Boolean] = js.native
  
  @JSImport("cli-interact", "question")
  @js.native
  def question(prompt: String): String = js.native
  @JSImport("cli-interact", "question")
  @js.native
  def question(prompt: String, options: BasicOptions): String = js.native
  
  @js.native
  trait ChoiceOptions extends StObject {
    
    var allowNoAnswer: js.UndefOr[Boolean] = js.native
    
    var returnNumeric: js.UndefOr[Boolean] = js.native
  }
  object ChoiceOptions {
    
    @scala.inline
    def apply(): ChoiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChoiceOptions]
    }
    
    @scala.inline
    implicit class ChoiceOptionsMutableBuilder[Self <: ChoiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNoAnswer(value: Boolean): Self = StObject.set(x, "allowNoAnswer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNoAnswerUndefined: Self = StObject.set(x, "allowNoAnswer", js.undefined)
      
      @scala.inline
      def setReturnNumeric(value: Boolean): Self = StObject.set(x, "returnNumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnNumericUndefined: Self = StObject.set(x, "returnNumeric", js.undefined)
    }
  }
  
  @js.native
  trait NumberOptions extends StObject {
    
    var allowNoAnswer: js.UndefOr[Boolean] = js.native
    
    var requireInteger: js.UndefOr[Boolean] = js.native
  }
  object NumberOptions {
    
    @scala.inline
    def apply(): NumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberOptions]
    }
    
    @scala.inline
    implicit class NumberOptionsMutableBuilder[Self <: NumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNoAnswer(value: Boolean): Self = StObject.set(x, "allowNoAnswer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNoAnswerUndefined: Self = StObject.set(x, "allowNoAnswer", js.undefined)
      
      @scala.inline
      def setRequireInteger(value: Boolean): Self = StObject.set(x, "requireInteger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireIntegerUndefined: Self = StObject.set(x, "requireInteger", js.undefined)
    }
  }
}
