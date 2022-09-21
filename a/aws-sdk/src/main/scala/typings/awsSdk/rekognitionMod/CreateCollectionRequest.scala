package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollectionRequest extends StObject {
  
  /**
    * ID for the collection that you are creating.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId
  
  /**
    *  A set of tags (key-value pairs) that you want to attach to the collection. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateCollectionRequest {
  
  inline def apply(CollectionId: CollectionId): CreateCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionRequest]
  }
  
  extension [Self <: CreateCollectionRequest](x: Self) {
    
    inline def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
