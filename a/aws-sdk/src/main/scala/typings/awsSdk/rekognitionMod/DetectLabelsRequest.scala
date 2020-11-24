package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectLabelsRequest extends js.Object {
  
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. Images stored in an S3 Bucket do not need to be base64-encoded. If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsSdk.rekognitionMod.Image = js.native
  
  /**
    * Maximum number of labels you want the service to return in the response. The service returns the specified number of highest confidence labels. 
    */
  var MaxLabels: js.UndefOr[UInteger] = js.native
  
  /**
    * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels with confidence lower than this specified value. If MinConfidence is not specified, the operation returns labels with a confidence values greater than or equal to 55 percent.
    */
  var MinConfidence: js.UndefOr[Percent] = js.native
}
object DetectLabelsRequest {
  
  @scala.inline
  def apply(Image: Image): DetectLabelsRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectLabelsRequest]
  }
  
  @scala.inline
  implicit class DetectLabelsRequestOps[Self <: DetectLabelsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxLabels(value: UInteger): Self = this.set("MaxLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLabels: Self = this.set("MaxLabels", js.undefined)
    
    @scala.inline
    def setMinConfidence(value: Percent): Self = this.set("MinConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinConfidence: Self = this.set("MinConfidence", js.undefined)
  }
}
