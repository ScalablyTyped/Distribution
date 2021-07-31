package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCollectionRequest extends StObject {
  
  /**
    * ID of the collection to delete.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId
}
object DeleteCollectionRequest {
  
  @scala.inline
  def apply(CollectionId: CollectionId): DeleteCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCollectionRequest]
  }
  
  @scala.inline
  implicit class DeleteCollectionRequestMutableBuilder[Self <: DeleteCollectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
  }
}
