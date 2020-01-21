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
  def apply(
    CollectionARN: String = null,
    CreationTimestamp: DateTime = null,
    FaceCount: Int | Double = null,
    FaceModelVersion: String = null
  ): DescribeCollectionResponse = {
    val __obj = js.Dynamic.literal()
    if (CollectionARN != null) __obj.updateDynamic("CollectionARN")(CollectionARN.asInstanceOf[js.Any])
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (FaceCount != null) __obj.updateDynamic("FaceCount")(FaceCount.asInstanceOf[js.Any])
    if (FaceModelVersion != null) __obj.updateDynamic("FaceModelVersion")(FaceModelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCollectionResponse]
  }
}

