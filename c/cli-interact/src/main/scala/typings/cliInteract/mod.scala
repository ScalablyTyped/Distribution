package typings.cliInteract

import typings.cliInteract.anon.ChoiceOptionsreturnNumeri
import typings.cliInteract.cliInteractBooleans.`false`
import typings.cliInteract.cliInteractBooleans.`true`
import typings.readlineSync.mod.BasicOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-interact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getChar(promptText: String, allowedCharsAsString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getChar")(promptText.asInstanceOf[js.Any], allowedCharsAsString.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getChar(promptText: String, allowedCharsAsString: String, flagAllowNoAnswer: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getChar")(promptText.asInstanceOf[js.Any], allowedCharsAsString.asInstanceOf[js.Any], flagAllowNoAnswer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getChoice(title: String, choices: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getChoice")(title.asInstanceOf[js.Any], choices.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getChoice(title: String, choices: js.Array[String], opts: ChoiceOptionsreturnNumeri): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getChoice")(title.asInstanceOf[js.Any], choices.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getChoice(title: String, choices: js.Array[String], opts: ChoiceOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getChoice")(title.asInstanceOf[js.Any], choices.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getChoiceByChar(title: String, choices: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getChoiceByChar")(title.asInstanceOf[js.Any], choices.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getChoiceByChar(title: String, choices: js.Array[String], flagAllowNoAnswer: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getChoiceByChar")(title.asInstanceOf[js.Any], choices.asInstanceOf[js.Any], flagAllowNoAnswer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getIPversion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIPversion")().asInstanceOf[String]
  @scala.inline
  def getIPversion(flagAllowNoAnswer: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIPversion")(flagAllowNoAnswer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getInteger(promptText: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteger")(promptText.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getNumber(promptText: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(promptText.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getNumber(promptText: String, opts: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(promptText.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getNumber(promptText: String, opts: NumberOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(promptText.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getYesNo(title: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getYesNo")(title.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def getYesNo_false(title: String, flagAllowNoAnswer: `false`): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getYesNo")(title.asInstanceOf[js.Any], flagAllowNoAnswer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getYesNo_true(title: String, flagAllowNoAnswer: `true`): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getYesNo")(title.asInstanceOf[js.Any], flagAllowNoAnswer.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  @scala.inline
  def question(prompt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("question")(prompt.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def question(prompt: String, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("question")(prompt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ChoiceOptions extends StObject {
    
    var allowNoAnswer: js.UndefOr[Boolean] = js.undefined
    
    var returnNumeric: js.UndefOr[Boolean] = js.undefined
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
  
  trait NumberOptions extends StObject {
    
    var allowNoAnswer: js.UndefOr[Boolean] = js.undefined
    
    var requireInteger: js.UndefOr[Boolean] = js.undefined
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
