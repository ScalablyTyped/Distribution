package typings.cliInteract

import typings.cliInteract.cliInteractBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined cli-interact.cli-interact.ChoiceOptions & {  returnNumeric :true} */
  trait ChoiceOptionsreturnNumeri extends StObject {
    
    var allowNoAnswer: js.UndefOr[Boolean] = js.undefined
    
    var returnNumeric: js.UndefOr[Boolean] & `true`
  }
  object ChoiceOptionsreturnNumeri {
    
    @scala.inline
    def apply(returnNumeric: js.UndefOr[Boolean] & `true`): ChoiceOptionsreturnNumeri = {
      val __obj = js.Dynamic.literal(returnNumeric = returnNumeric.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChoiceOptionsreturnNumeri]
    }
    
    @scala.inline
    implicit class ChoiceOptionsreturnNumeriMutableBuilder[Self <: ChoiceOptionsreturnNumeri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNoAnswer(value: Boolean): Self = StObject.set(x, "allowNoAnswer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNoAnswerUndefined: Self = StObject.set(x, "allowNoAnswer", js.undefined)
      
      @scala.inline
      def setReturnNumeric(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "returnNumeric", value.asInstanceOf[js.Any])
    }
  }
}
