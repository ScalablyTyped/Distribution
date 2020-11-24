package typings.awsSdk.s3outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEndpointResult extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: js.UndefOr[typings.awsSdk.s3outpostsMod.EndpointArn] = js.native
}
object CreateEndpointResult {
  
  @scala.inline
  def apply(): CreateEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEndpointResult]
  }
  
  @scala.inline
  implicit class CreateEndpointResultOps[Self <: CreateEndpointResult] (val x: Self) extends AnyVal {
    
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
    def setEndpointArn(value: EndpointArn): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointArn: Self = this.set("EndpointArn", js.undefined)
  }
}
