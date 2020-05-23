package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCollectionResponse extends js.Object {
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
  def apply(
    CollectionArn: String = null,
    FaceModelVersion: String = null,
    StatusCode: js.UndefOr[UInteger] = js.undefined
  ): CreateCollectionResponse = {
    val __obj = js.Dynamic.literal()
    if (CollectionArn != null) __obj.updateDynamic("CollectionArn")(CollectionArn.asInstanceOf[js.Any])
    if (FaceModelVersion != null) __obj.updateDynamic("FaceModelVersion")(FaceModelVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(StatusCode)) __obj.updateDynamic("StatusCode")(StatusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionResponse]
  }
}

