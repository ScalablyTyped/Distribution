package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCollectionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the collection.
    */
  var CollectionARN: js.UndefOr[String] = js.native
  
  /**
    * The number of milliseconds since the Unix epoch time until the creation of the collection. The Unix epoch time is 00:00:00 Coordinated Universal Time (UTC), Thursday, 1 January 1970.
    */
  var CreationTimestamp: js.UndefOr[DateTime] = js.native
  
  /**
    * The number of faces that are indexed into the collection. To index faces into a collection, use IndexFaces.
    */
  var FaceCount: js.UndefOr[ULong] = js.native
  
  /**
    * The version of the face model that's used by the collection for face detection. For more information, see Model Versioning in the Amazon Rekognition Developer Guide.
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
}
object DescribeCollectionResponse {
  
  @scala.inline
  def apply(): DescribeCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCollectionResponse]
  }
  
  @scala.inline
  implicit class DescribeCollectionResponseMutableBuilder[Self <: DescribeCollectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionARN(value: String): Self = StObject.set(x, "CollectionARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionARNUndefined: Self = StObject.set(x, "CollectionARN", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: DateTime): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setFaceCount(value: ULong): Self = StObject.set(x, "FaceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceCountUndefined: Self = StObject.set(x, "FaceCount", js.undefined)
    
    @scala.inline
    def setFaceModelVersion(value: String): Self = StObject.set(x, "FaceModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceModelVersionUndefined: Self = StObject.set(x, "FaceModelVersion", js.undefined)
  }
}
