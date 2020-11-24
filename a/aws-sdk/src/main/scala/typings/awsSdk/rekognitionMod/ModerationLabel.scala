package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModerationLabel extends js.Object {
  
  /**
    * Specifies the confidence that Amazon Rekognition has that the label has been correctly identified. If you don't specify the MinConfidence parameter in the call to DetectModerationLabels, the operation returns labels with a confidence value greater than or equal to 50 percent.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * The label name for the type of unsafe content detected in the image.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The name for the parent label. Labels at the top level of the hierarchy have the parent label "".
    */
  var ParentName: js.UndefOr[String] = js.native
}
object ModerationLabel {
  
  @scala.inline
  def apply(): ModerationLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModerationLabel]
  }
  
  @scala.inline
  implicit class ModerationLabelOps[Self <: ModerationLabel] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Percent): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setParentName(value: String): Self = this.set("ParentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentName: Self = this.set("ParentName", js.undefined)
  }
}
