package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCommandsResult extends StObject {
  
  /**
    * (Optional) The list of commands requested by the user. 
    */
  var Commands: js.UndefOr[CommandList] = js.undefined
  
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object ListCommandsResult {
  
  @scala.inline
  def apply(): ListCommandsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCommandsResult]
  }
  
  @scala.inline
  implicit class ListCommandsResultMutableBuilder[Self <: ListCommandsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: CommandList): Self = StObject.set(x, "Commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsUndefined: Self = StObject.set(x, "Commands", js.undefined)
    
    @scala.inline
    def setCommandsVarargs(value: Command*): Self = StObject.set(x, "Commands", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
