package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollectionRequest extends StObject {
  
  /**
    * ID for the collection that you are creating.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId
}
object CreateCollectionRequest {
  
  @scala.inline
  def apply(CollectionId: CollectionId): CreateCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionRequest]
  }
  
  @scala.inline
  implicit class CreateCollectionRequestMutableBuilder[Self <: CreateCollectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
  }
}
