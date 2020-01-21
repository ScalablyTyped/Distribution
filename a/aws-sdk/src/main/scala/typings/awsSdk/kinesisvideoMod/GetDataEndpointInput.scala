package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataEndpointInput extends js.Object {
  /**
    * The name of the API action for which to get an endpoint.
    */
  var APIName: typings.awsSdk.kinesisvideoMod.APIName = js.native
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify either this parameter or a StreamName in the request. 
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream that you want to get the endpoint for. You must specify either this parameter or a StreamARN in the request.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.native
}

object GetDataEndpointInput {
  @scala.inline
  def apply(APIName: APIName, StreamARN: ResourceARN = null, StreamName: StreamName = null): GetDataEndpointInput = {
    val __obj = js.Dynamic.literal(APIName = APIName.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataEndpointInput]
  }
}

