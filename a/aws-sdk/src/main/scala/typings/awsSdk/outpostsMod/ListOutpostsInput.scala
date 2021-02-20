package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOutpostsInput extends StObject {
  
  var MaxResults: js.UndefOr[MaxResults1000] = js.native
  
  var NextToken: js.UndefOr[Token] = js.native
}
object ListOutpostsInput {
  
  @scala.inline
  def apply(): ListOutpostsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutpostsInput]
  }
  
  @scala.inline
  implicit class ListOutpostsInputMutableBuilder[Self <: ListOutpostsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
