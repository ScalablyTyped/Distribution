package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelImageCreationResponse extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image whose creation has been cancelled.
    */
  var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.native
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object CancelImageCreationResponse {
  
  @scala.inline
  def apply(): CancelImageCreationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelImageCreationResponse]
  }
  
  @scala.inline
  implicit class CancelImageCreationResponseMutableBuilder[Self <: CancelImageCreationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBuildVersionArnUndefined: Self = StObject.set(x, "imageBuildVersionArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
