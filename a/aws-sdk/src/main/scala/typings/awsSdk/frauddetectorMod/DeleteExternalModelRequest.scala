package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteExternalModelRequest extends js.Object {
  
  /**
    * The endpoint of the Amazon Sagemaker model to delete.
    */
  var modelEndpoint: sageMakerEndpointIdentifier = js.native
}
object DeleteExternalModelRequest {
  
  @scala.inline
  def apply(modelEndpoint: sageMakerEndpointIdentifier): DeleteExternalModelRequest = {
    val __obj = js.Dynamic.literal(modelEndpoint = modelEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExternalModelRequest]
  }
  
  @scala.inline
  implicit class DeleteExternalModelRequestOps[Self <: DeleteExternalModelRequest] (val x: Self) extends AnyVal {
    
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
    def setModelEndpoint(value: sageMakerEndpointIdentifier): Self = this.set("modelEndpoint", value.asInstanceOf[js.Any])
  }
}
