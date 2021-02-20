package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCollectionsResponse extends StObject {
  
  /**
    * An array of collection IDs.
    */
  var CollectionIds: js.UndefOr[CollectionIdList] = js.native
  
  /**
    * Version numbers of the face detection models associated with the collections in the array CollectionIds. For example, the value of FaceModelVersions[2] is the version number for the face detection model used by the collection in CollectionId[2].
    */
  var FaceModelVersions: js.UndefOr[FaceModelVersionList] = js.native
  
  /**
    * If the result is truncated, the response provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListCollectionsResponse {
  
  @scala.inline
  def apply(): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsResponse]
  }
  
  @scala.inline
  implicit class ListCollectionsResponseMutableBuilder[Self <: ListCollectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionIds(value: CollectionIdList): Self = StObject.set(x, "CollectionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIdsUndefined: Self = StObject.set(x, "CollectionIds", js.undefined)
    
    @scala.inline
    def setCollectionIdsVarargs(value: CollectionId*): Self = StObject.set(x, "CollectionIds", js.Array(value :_*))
    
    @scala.inline
    def setFaceModelVersions(value: FaceModelVersionList): Self = StObject.set(x, "FaceModelVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceModelVersionsUndefined: Self = StObject.set(x, "FaceModelVersions", js.undefined)
    
    @scala.inline
    def setFaceModelVersionsVarargs(value: String*): Self = StObject.set(x, "FaceModelVersions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
