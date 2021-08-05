package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentInstancesOutput extends StObject {
  
  /**
    * A list of instance IDs.
    */
  var instancesList: js.UndefOr[InstancesList] = js.undefined
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment instances call to return the next set of deployment instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDeploymentInstancesOutput {
  
  inline def apply(): ListDeploymentInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentInstancesOutput]
  }
  
  extension [Self <: ListDeploymentInstancesOutput](x: Self) {
    
    inline def setInstancesList(value: InstancesList): Self = StObject.set(x, "instancesList", value.asInstanceOf[js.Any])
    
    inline def setInstancesListUndefined: Self = StObject.set(x, "instancesList", js.undefined)
    
    inline def setInstancesListVarargs(value: InstanceId*): Self = StObject.set(x, "instancesList", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
