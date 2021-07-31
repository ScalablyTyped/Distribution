package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsInput extends StObject {
  
  /**
    * An identifier returned from the previous list applications call. It can be used to return the next set of applications in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApplicationsInput {
  
  @scala.inline
  def apply(): ListApplicationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsInput]
  }
  
  @scala.inline
  implicit class ListApplicationsInputMutableBuilder[Self <: ListApplicationsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
