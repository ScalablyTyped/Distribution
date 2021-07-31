package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExternalModelRequest extends StObject {
  
  /**
    * The endpoint of the Amazon Sagemaker model to delete.
    */
  var modelEndpoint: sageMakerEndpointIdentifier
}
object DeleteExternalModelRequest {
  
  @scala.inline
  def apply(modelEndpoint: sageMakerEndpointIdentifier): DeleteExternalModelRequest = {
    val __obj = js.Dynamic.literal(modelEndpoint = modelEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExternalModelRequest]
  }
  
  @scala.inline
  implicit class DeleteExternalModelRequestMutableBuilder[Self <: DeleteExternalModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelEndpoint(value: sageMakerEndpointIdentifier): Self = StObject.set(x, "modelEndpoint", value.asInstanceOf[js.Any])
  }
}
