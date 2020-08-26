package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCollectionResponse extends js.Object {
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
  implicit class DescribeCollectionResponseOps[Self <: DescribeCollectionResponse] (val x: Self) extends AnyVal {
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
    def setCollectionARN(value: String): Self = this.set("CollectionARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionARN: Self = this.set("CollectionARN", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: DateTime): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    @scala.inline
    def setFaceCount(value: ULong): Self = this.set("FaceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceCount: Self = this.set("FaceCount", js.undefined)
    @scala.inline
    def setFaceModelVersion(value: String): Self = this.set("FaceModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceModelVersion: Self = this.set("FaceModelVersion", js.undefined)
  }
  
}

