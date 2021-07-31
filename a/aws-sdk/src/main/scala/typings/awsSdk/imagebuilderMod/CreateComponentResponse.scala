package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentResponse extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the component that was created by this request.
    */
  var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object CreateComponentResponse {
  
  @scala.inline
  def apply(): CreateComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComponentResponse]
  }
  
  @scala.inline
  implicit class CreateComponentResponseMutableBuilder[Self <: CreateComponentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setComponentBuildVersionArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentBuildVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentBuildVersionArnUndefined: Self = StObject.set(x, "componentBuildVersionArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
