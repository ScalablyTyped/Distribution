package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCommandInvocationsResult extends StObject {
  
  /**
    * (Optional) A list of all invocations. 
    */
  var CommandInvocations: js.UndefOr[CommandInvocationList] = js.native
  
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object ListCommandInvocationsResult {
  
  @scala.inline
  def apply(): ListCommandInvocationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCommandInvocationsResult]
  }
  
  @scala.inline
  implicit class ListCommandInvocationsResultMutableBuilder[Self <: ListCommandInvocationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandInvocations(value: CommandInvocationList): Self = StObject.set(x, "CommandInvocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandInvocationsUndefined: Self = StObject.set(x, "CommandInvocations", js.undefined)
    
    @scala.inline
    def setCommandInvocationsVarargs(value: CommandInvocation*): Self = StObject.set(x, "CommandInvocations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
