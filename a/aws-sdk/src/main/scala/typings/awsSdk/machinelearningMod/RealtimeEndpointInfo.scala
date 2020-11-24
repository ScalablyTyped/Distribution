package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeEndpointInfo extends js.Object {
  
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
  implicit class RealtimeEndpointInfoOps[Self <: RealtimeEndpointInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedAt(value: EpochTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setEndpointStatus(value: RealtimeEndpointStatus): Self = this.set("EndpointStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointStatus: Self = this.set("EndpointStatus", js.undefined)
    
    @scala.inline
    def setEndpointUrl(value: VipURL): Self = this.set("EndpointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointUrl: Self = this.set("EndpointUrl", js.undefined)
    
    @scala.inline
    def setPeakRequestsPerSecond(value: IntegerType): Self = this.set("PeakRequestsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeakRequestsPerSecond: Self = this.set("PeakRequestsPerSecond", js.undefined)
  }
}
