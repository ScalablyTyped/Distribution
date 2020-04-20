package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHarvestJobRequest extends js.Object {
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
}

