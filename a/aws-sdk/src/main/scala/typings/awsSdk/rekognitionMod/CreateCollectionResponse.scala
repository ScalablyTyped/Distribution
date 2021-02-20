package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCollectionResponse extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the collection. You can use this to manage permissions on your resources. 
    */
  var CollectionArn: js.UndefOr[String] = js.native
  
  /**
    * Version number of the face detection model associated with the collection you are creating.
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  
  /**
    * HTTP status code indicating the result of the operation.
    */
  var StatusCode: js.UndefOr[UInteger] = js.native
}
object CreateCollectionResponse {
  
  @scala.inline
  def apply(): CreateCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectionResponse]
  }
  
  @scala.inline
  implicit class CreateCollectionResponseMutableBuilder[Self <: CreateCollectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionArn(value: String): Self = StObject.set(x, "CollectionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionArnUndefined: Self = StObject.set(x, "CollectionArn", js.undefined)
    
    @scala.inline
    def setFaceModelVersion(value: String): Self = StObject.set(x, "FaceModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceModelVersionUndefined: Self = StObject.set(x, "FaceModelVersion", js.undefined)
    
    @scala.inline
    def setStatusCode(value: UInteger): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
