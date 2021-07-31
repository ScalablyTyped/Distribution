package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLinkAssociationsRequest extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetLinkAssociationsRequest {
  
  @scala.inline
  def apply(GlobalNetworkId: String): GetLinkAssociationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinkAssociationsRequest]
  }
  
  @scala.inline
  implicit class GetLinkAssociationsRequestMutableBuilder[Self <: GetLinkAssociationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkId(value: String): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
