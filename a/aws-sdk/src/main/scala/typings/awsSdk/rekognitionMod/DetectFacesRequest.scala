package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectFacesRequest extends js.Object {
  /**
    * An array of facial attributes you want to be returned. This can be the default list of attributes or all attributes. If you don't specify a value for Attributes or if you specify ["DEFAULT"], the API returns the following subset of facial attributes: BoundingBox, Confidence, Pose, Quality, and Landmarks. If you provide ["ALL"], all facial attributes are returned, but the operation takes longer to complete. If you provide both, ["ALL", "DEFAULT"], the service uses a logical AND operator to determine which attributes to return (in this case, all attributes). 
    */
  var Attributes: js.UndefOr[typings.awsSdk.rekognitionMod.Attributes] = js.native
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsSdk.rekognitionMod.Image = js.native
}

object DetectFacesRequest {
  @scala.inline
  def apply(Image: Image): DetectFacesRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectFacesRequest]
  }
  @scala.inline
  implicit class DetectFacesRequestOps[Self <: DetectFacesRequest] (val x: Self) extends AnyVal {
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
    def setImage(value: Image): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
  
}

