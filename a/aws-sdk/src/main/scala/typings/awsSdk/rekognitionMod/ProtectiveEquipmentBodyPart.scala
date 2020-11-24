package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectiveEquipmentBodyPart extends js.Object {
  
  /**
    * The confidence that Amazon Rekognition has in the detection accuracy of the detected body part. 
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * An array of Personal Protective Equipment items detected around a body part.
    */
  var EquipmentDetections: js.UndefOr[typings.awsSdk.rekognitionMod.EquipmentDetections] = js.native
  
  /**
    * The detected body part.
    */
  var Name: js.UndefOr[BodyPart] = js.native
}
object ProtectiveEquipmentBodyPart {
  
  @scala.inline
  def apply(): ProtectiveEquipmentBodyPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectiveEquipmentBodyPart]
  }
  
  @scala.inline
  implicit class ProtectiveEquipmentBodyPartOps[Self <: ProtectiveEquipmentBodyPart] (val x: Self) extends AnyVal {
    
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
    def setEquipmentDetectionsVarargs(value: EquipmentDetection*): Self = this.set("EquipmentDetections", js.Array(value :_*))
    
    @scala.inline
    def setEquipmentDetections(value: EquipmentDetections): Self = this.set("EquipmentDetections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEquipmentDetections: Self = this.set("EquipmentDetections", js.undefined)
    
    @scala.inline
    def setName(value: BodyPart): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
