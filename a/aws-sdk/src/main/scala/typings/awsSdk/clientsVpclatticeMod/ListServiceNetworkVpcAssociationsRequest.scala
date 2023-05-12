package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceNetworkVpcAssociationsRequest extends StObject {
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A pagination token for the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service network.
    */
  var serviceNetworkIdentifier: js.UndefOr[ServiceNetworkIdentifier] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the VPC.
    */
  var vpcIdentifier: js.UndefOr[VpcId] = js.undefined
}
object ListServiceNetworkVpcAssociationsRequest {
  
  inline def apply(): ListServiceNetworkVpcAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceNetworkVpcAssociationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceNetworkVpcAssociationsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceNetworkIdentifier(value: ServiceNetworkIdentifier): Self = StObject.set(x, "serviceNetworkIdentifier", value.asInstanceOf[js.Any])
    
    inline def setServiceNetworkIdentifierUndefined: Self = StObject.set(x, "serviceNetworkIdentifier", js.undefined)
    
    inline def setVpcIdentifier(value: VpcId): Self = StObject.set(x, "vpcIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVpcIdentifierUndefined: Self = StObject.set(x, "vpcIdentifier", js.undefined)
  }
}
