package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataflowEndpointConfig extends js.Object {
  /**
    * Name of a dataflow endpoint.
    */
  var dataflowEndpointName: String = js.native
  /**
    * Region of a dataflow endpoint.
    */
  var dataflowEndpointRegion: js.UndefOr[String] = js.native
}

object DataflowEndpointConfig {
  @scala.inline
  def apply(dataflowEndpointName: String, dataflowEndpointRegion: String = null): DataflowEndpointConfig = {
    val __obj = js.Dynamic.literal(dataflowEndpointName = dataflowEndpointName.asInstanceOf[js.Any])
    if (dataflowEndpointRegion != null) __obj.updateDynamic("dataflowEndpointRegion")(dataflowEndpointRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataflowEndpointConfig]
  }
}

