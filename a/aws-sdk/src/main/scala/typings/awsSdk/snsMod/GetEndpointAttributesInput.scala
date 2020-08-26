package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEndpointAttributesInput extends js.Object {
  /**
    * EndpointArn for GetEndpointAttributes input.
    */
  var EndpointArn: String = js.native
}

object GetEndpointAttributesInput {
  @scala.inline
  def apply(EndpointArn: String): GetEndpointAttributesInput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointAttributesInput]
  }
  @scala.inline
  implicit class GetEndpointAttributesInputOps[Self <: GetEndpointAttributesInput] (val x: Self) extends AnyVal {
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
    def setEndpointArn(value: String): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
  }
  
}

