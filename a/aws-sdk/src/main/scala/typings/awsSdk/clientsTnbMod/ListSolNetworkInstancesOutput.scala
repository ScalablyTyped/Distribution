package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolNetworkInstancesOutput extends StObject {
  
  /**
    * Lists network instances.
    */
  var networkInstances: js.UndefOr[ListSolNetworkInstanceResources] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListSolNetworkInstancesOutput {
  
  inline def apply(): ListSolNetworkInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolNetworkInstancesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolNetworkInstancesOutput] (val x: Self) extends AnyVal {
    
    inline def setNetworkInstances(value: ListSolNetworkInstanceResources): Self = StObject.set(x, "networkInstances", value.asInstanceOf[js.Any])
    
    inline def setNetworkInstancesUndefined: Self = StObject.set(x, "networkInstances", js.undefined)
    
    inline def setNetworkInstancesVarargs(value: ListSolNetworkInstanceInfo*): Self = StObject.set(x, "networkInstances", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
