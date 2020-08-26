package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCollectionsResponse extends js.Object {
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
  implicit class ListCollectionsResponseOps[Self <: ListCollectionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollectionIdsVarargs(value: CollectionId*): Self = this.set("CollectionIds", js.Array(value :_*))
    @scala.inline
    def setCollectionIds(value: CollectionIdList): Self = this.set("CollectionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionIds: Self = this.set("CollectionIds", js.undefined)
    @scala.inline
    def setFaceModelVersionsVarargs(value: String*): Self = this.set("FaceModelVersions", js.Array(value :_*))
    @scala.inline
    def setFaceModelVersions(value: FaceModelVersionList): Self = this.set("FaceModelVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceModelVersions: Self = this.set("FaceModelVersions", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

