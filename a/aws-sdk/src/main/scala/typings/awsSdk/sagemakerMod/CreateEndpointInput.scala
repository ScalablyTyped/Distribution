package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointInput extends js.Object {
  /**
    * The name of an endpoint configuration. For more information, see CreateEndpointConfig. 
    */
  var EndpointConfigName: typings.awsSdk.sagemakerMod.EndpointConfigName = js.native
  /**
    * The name of the endpoint. The name must be unique within an AWS Region in your AWS account.
    */
  var EndpointName: typings.awsSdk.sagemakerMod.EndpointName = js.native
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tagsin the AWS Billing and Cost Management User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateEndpointInput {
  @scala.inline
  def apply(EndpointConfigName: EndpointConfigName, EndpointName: EndpointName): CreateEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointInput]
  }
  @scala.inline
  implicit class CreateEndpointInputOps[Self <: CreateEndpointInput] (val x: Self) extends AnyVal {
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
    def setEndpointConfigName(value: EndpointConfigName): Self = this.set("EndpointConfigName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointName(value: EndpointName): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

