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
  @scala.inline
  implicit class EndpointConfigSummaryOps[Self <: EndpointConfigSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointConfigArn(value: EndpointConfigArn): Self = this.set("EndpointConfigArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointConfigName(value: EndpointConfigName): Self = this.set("EndpointConfigName", value.asInstanceOf[js.Any])
  }
  
}

