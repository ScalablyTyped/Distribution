package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInputsResponse extends StObject {
  
  var Inputs: js.UndefOr[listOfInput] = js.native
  
  var NextToken: js.UndefOr[string] = js.native
}
object ListInputsResponse {
  
  @scala.inline
  def apply(): ListInputsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputsResponse]
  }
  
  @scala.inline
  implicit class ListInputsResponseMutableBuilder[Self <: ListInputsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: listOfInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: Input*): Self = StObject.set(x, "Inputs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
