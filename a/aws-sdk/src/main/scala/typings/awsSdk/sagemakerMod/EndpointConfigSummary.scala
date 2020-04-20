package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfigSummary extends js.Object {
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: Timestamp = js.native
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: typings.awsSdk.sagemakerMod.EndpointConfigArn = js.native
  /**
    * The name of the endpoint configuration.
    */
  var EndpointConfigName: typings.awsSdk.sagemakerMod.EndpointConfigName = js.native
}

object EndpointConfigSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    EndpointConfigArn: EndpointConfigArn,
    EndpointConfigName: EndpointConfigName
  ): EndpointConfigSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigSummary]
  }
}

