package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataEndpointOutput extends js.Object {
  /**
    * The endpoint value. To read data from the stream or to write data to it, specify this endpoint in your application.
    */
  var DataEndpoint: js.UndefOr[typings.awsSdk.kinesisvideoMod.DataEndpoint] = js.native
}

object GetDataEndpointOutput {
  @scala.inline
  def apply(DataEndpoint: DataEndpoint = null): GetDataEndpointOutput = {
    val __obj = js.Dynamic.literal()
    if (DataEndpoint != null) __obj.updateDynamic("DataEndpoint")(DataEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataEndpointOutput]
  }
}

