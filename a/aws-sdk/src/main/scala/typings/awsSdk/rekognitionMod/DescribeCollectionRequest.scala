package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCollectionRequest extends StObject {
  
  /**
    * The ID of the collection to describe.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId
}
object DescribeCollectionRequest {
  
  @scala.inline
  def apply(CollectionId: CollectionId): DescribeCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCollectionRequest]
  }
  
  @scala.inline
  implicit class DescribeCollectionRequestMutableBuilder[Self <: DescribeCollectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
  }
}
