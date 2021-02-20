package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeEndpointInfo extends StObject {
  
  /**
    * The time that the request to create the real-time endpoint for the MLModel was received. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.native
  
  /**
    *  The current status of the real-time endpoint for the MLModel. This element can have one of the following values:    NONE - Endpoint does not exist or was previously deleted.  READY - Endpoint is ready to be used for real-time predictions.  UPDATING - Updating/creating the endpoint.  
    */
  var EndpointStatus: js.UndefOr[RealtimeEndpointStatus] = js.native
  
  /**
    * The URI that specifies where to send real-time prediction requests for the MLModel. Note The application must wait until the real-time endpoint is ready before using this URI. 
    */
  var EndpointUrl: js.UndefOr[VipURL] = js.native
  
  /**
    *  The maximum processing rate for the real-time endpoint for MLModel, measured in incoming requests per second.
    */
  var PeakRequestsPerSecond: js.UndefOr[IntegerType] = js.native
}
object RealtimeEndpointInfo {
  
  @scala.inline
  def apply(): RealtimeEndpointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealtimeEndpointInfo]
  }
  
  @scala.inline
  implicit class RealtimeEndpointInfoMutableBuilder[Self <: RealtimeEndpointInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: EpochTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setEndpointStatus(value: RealtimeEndpointStatus): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointStatusUndefined: Self = StObject.set(x, "EndpointStatus", js.undefined)
    
    @scala.inline
    def setEndpointUrl(value: VipURL): Self = StObject.set(x, "EndpointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUrlUndefined: Self = StObject.set(x, "EndpointUrl", js.undefined)
    
    @scala.inline
    def setPeakRequestsPerSecond(value: IntegerType): Self = StObject.set(x, "PeakRequestsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeakRequestsPerSecondUndefined: Self = StObject.set(x, "PeakRequestsPerSecond", js.undefined)
  }
}
