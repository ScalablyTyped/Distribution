package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Image Builder image resource that was deleted.
    */
  var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object DeleteImageResponse {
  
  inline def apply(): DeleteImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImageResponse]
  }
  
  extension [Self <: DeleteImageResponse](x: Self) {
    
    inline def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageBuildVersionArnUndefined: Self = StObject.set(x, "imageBuildVersionArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
