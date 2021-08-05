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
    
    inline def apply(returnNumeric: js.UndefOr[Boolean] & `true`): ChoiceOptionsreturnNumeri = {
      val __obj = js.Dynamic.literal(returnNumeric = returnNumeric.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChoiceOptionsreturnNumeri]
    }
    
    extension [Self <: ChoiceOptionsreturnNumeri](x: Self) {
      
      inline def setAllowNoAnswer(value: Boolean): Self = StObject.set(x, "allowNoAnswer", value.asInstanceOf[js.Any])
      
      inline def setAllowNoAnswerUndefined: Self = StObject.set(x, "allowNoAnswer", js.undefined)
      
      inline def setReturnNumeric(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "returnNumeric", value.asInstanceOf[js.Any])
    }
  }
}
