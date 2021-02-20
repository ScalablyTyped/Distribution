package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHarvestJobRequest extends StObject {
  
  /**
    * The end of the time-window which will be harvested
    */
  var EndTime: string = js.native
  
  /**
    * The ID of the HarvestJob. The ID must be unique within the region
  and it cannot be changed after the HarvestJob is submitted
    */
  var Id: string = js.native
  
  /**
    * The ID of the OriginEndpoint that the HarvestJob will harvest from.
  This cannot be changed after the HarvestJob is submitted.
    */
  var OriginEndpointId: string = js.native
  
  var S3Destination: typings.awsSdk.mediapackageMod.S3Destination = js.native
  
  /**
    * The start of the time-window which will be harvested
    */
  var StartTime: string = js.native
}
object CreateHarvestJobRequest {
  
  @scala.inline
  def apply(
    EndTime: string,
    Id: string,
    OriginEndpointId: string,
    S3Destination: S3Destination,
    StartTime: string
  ): CreateHarvestJobRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OriginEndpointId = OriginEndpointId.asInstanceOf[js.Any], S3Destination = S3Destination.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHarvestJobRequest]
  }
  
  @scala.inline
  implicit class CreateHarvestJobRequestMutableBuilder[Self <: CreateHarvestJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: string): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginEndpointId(value: string): Self = StObject.set(x, "OriginEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Destination(value: S3Destination): Self = StObject.set(x, "S3Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: string): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
