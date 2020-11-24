package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectProtectiveEquipmentRequest extends js.Object {
  
  /**
    * The image in which you want to detect PPE on detected persons. The image can be passed as image bytes or you can reference an image stored in an Amazon S3 bucket. 
    */
  var Image: typings.awsSdk.rekognitionMod.Image = js.native
  
  /**
    * An array of PPE types that you want to summarize.
    */
  var SummarizationAttributes: js.UndefOr[ProtectiveEquipmentSummarizationAttributes] = js.native
}
object DetectProtectiveEquipmentRequest {
  
  @scala.inline
  def apply(Image: Image): DetectProtectiveEquipmentRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectProtectiveEquipmentRequest]
  }
  
  @scala.inline
  implicit class DetectProtectiveEquipmentRequestOps[Self <: DetectProtectiveEquipmentRequest] (val x: Self) extends AnyVal {
    
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
    def setSummarizationAttributes(value: ProtectiveEquipmentSummarizationAttributes): Self = this.set("SummarizationAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummarizationAttributes: Self = this.set("SummarizationAttributes", js.undefined)
  }
}
