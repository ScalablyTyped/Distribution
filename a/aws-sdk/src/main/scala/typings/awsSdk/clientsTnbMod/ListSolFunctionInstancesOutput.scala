package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolFunctionInstancesOutput extends StObject {
  
  /**
    * Network function instances.
    */
  var functionInstances: js.UndefOr[ListSolFunctionInstanceResources] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListSolFunctionInstancesOutput {
  
  inline def apply(): ListSolFunctionInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolFunctionInstancesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolFunctionInstancesOutput] (val x: Self) extends AnyVal {
    
    inline def setFunctionInstances(value: ListSolFunctionInstanceResources): Self = StObject.set(x, "functionInstances", value.asInstanceOf[js.Any])
    
    inline def setFunctionInstancesUndefined: Self = StObject.set(x, "functionInstances", js.undefined)
    
    inline def setFunctionInstancesVarargs(value: ListSolFunctionInstanceInfo*): Self = StObject.set(x, "functionInstances", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
