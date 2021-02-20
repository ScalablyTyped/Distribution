package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelImageCreationRequest extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent.
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image whose creation you want to cancel.
    */
  var imageBuildVersionArn: ImageBuildVersionArn = js.native
}
object CancelImageCreationRequest {
  
  @scala.inline
  def apply(clientToken: ClientToken, imageBuildVersionArn: ImageBuildVersionArn): CancelImageCreationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelImageCreationRequest]
  }
  
  @scala.inline
  implicit class CancelImageCreationRequestMutableBuilder[Self <: CancelImageCreationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
