package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentConfigsInput extends StObject {
  
  /**
    * An identifier returned from the previous ListDeploymentConfigs call. It can be used to return the next set of deployment configurations in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDeploymentConfigsInput {
  
  @scala.inline
  def apply(): ListDeploymentConfigsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentConfigsInput]
  }
  
  @scala.inline
  implicit class ListDeploymentConfigsInputMutableBuilder[Self <: ListDeploymentConfigsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
