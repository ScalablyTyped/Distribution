package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCommandInvocationsResult extends StObject {
  
  /**
    * (Optional) A list of all invocations. 
    */
  var CommandInvocations: js.UndefOr[CommandInvocationList] = js.undefined
  
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object ListCommandInvocationsResult {
  
  inline def apply(): ListCommandInvocationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCommandInvocationsResult]
  }
  
  extension [Self <: ListCommandInvocationsResult](x: Self) {
    
    inline def setCommandInvocations(value: CommandInvocationList): Self = StObject.set(x, "CommandInvocations", value.asInstanceOf[js.Any])
    
    inline def setCommandInvocationsUndefined: Self = StObject.set(x, "CommandInvocations", js.undefined)
    
    inline def setCommandInvocationsVarargs(value: CommandInvocation*): Self = StObject.set(x, "CommandInvocations", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
