package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNetworksInput extends StObject {
  
  /**
    * An optional framework specifier. If provided, only networks of this framework type are listed.
    */
  var Framework: js.UndefOr[typings.awsSdk.managedblockchainMod.Framework] = js.undefined
  
  /**
    * The maximum number of networks to list.
    */
  var MaxResults: js.UndefOr[NetworkListMaxResults] = js.undefined
  
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An optional status specifier. If provided, only networks currently in this status are listed.
    */
  var Status: js.UndefOr[NetworkStatus] = js.undefined
}
object ListNetworksInput {
  
  inline def apply(): ListNetworksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworksInput]
  }
  
  extension [Self <: ListNetworksInput](x: Self) {
    
    inline def setFramework(value: Framework): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "Framework", js.undefined)
    
    inline def setMaxResults(value: NetworkListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: NetworkStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
