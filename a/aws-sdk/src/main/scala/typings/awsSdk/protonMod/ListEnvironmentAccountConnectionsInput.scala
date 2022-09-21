package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentAccountConnectionsInput extends StObject {
  
  /**
    * The environment name that's associated with each listed environment account connection.
    */
  var environmentName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The maximum number of environment account connections to list.
    */
  var maxResults: js.UndefOr[MaxPageResults] = js.undefined
  
  /**
    * A token that indicates the location of the next environment account connection in the array of environment account connections, after the list of environment account connections that was previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The type of account making the ListEnvironmentAccountConnections request.
    */
  var requestedBy: EnvironmentAccountConnectionRequesterAccountType
  
  /**
    * The status details for each listed environment account connection.
    */
  var statuses: js.UndefOr[EnvironmentAccountConnectionStatusList] = js.undefined
}
object ListEnvironmentAccountConnectionsInput {
  
  inline def apply(requestedBy: EnvironmentAccountConnectionRequesterAccountType): ListEnvironmentAccountConnectionsInput = {
    val __obj = js.Dynamic.literal(requestedBy = requestedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentAccountConnectionsInput]
  }
  
  extension [Self <: ListEnvironmentAccountConnectionsInput](x: Self) {
    
    inline def setEnvironmentName(value: ResourceName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "environmentName", js.undefined)
    
    inline def setMaxResults(value: MaxPageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestedBy(value: EnvironmentAccountConnectionRequesterAccountType): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    inline def setStatuses(value: EnvironmentAccountConnectionStatusList): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setStatusesVarargs(value: EnvironmentAccountConnectionStatus*): Self = StObject.set(x, "statuses", js.Array(value*))
  }
}
