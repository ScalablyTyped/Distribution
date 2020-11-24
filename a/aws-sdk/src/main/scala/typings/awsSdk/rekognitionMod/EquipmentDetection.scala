package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EquipmentDetection extends js.Object {
  
  /**
    * A bounding box surrounding the item of detected PPE.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  
  /**
    * The confidence that Amazon Rekognition has that the bounding box (BoundingBox) contains an item of PPE.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * Information about the body part covered by the detected PPE.
    */
  var CoversBodyPart: js.UndefOr[typings.awsSdk.rekognitionMod.CoversBodyPart] = js.native
  
  /**
    * The type of detected PPE.
    */
  var Type: js.UndefOr[ProtectiveEquipmentType] = js.native
}
object EquipmentDetection {
  
  @scala.inline
  def apply(): EquipmentDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EquipmentDetection]
  }
  
  @scala.inline
  implicit class EquipmentDetectionOps[Self <: EquipmentDetection] (val x: Self) extends AnyVal {
    
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
    def setBoundingBox(value: BoundingBox): Self = this.set("BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBox: Self = this.set("BoundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Percent): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    
    @scala.inline
    def setCoversBodyPart(value: CoversBodyPart): Self = this.set("CoversBodyPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoversBodyPart: Self = this.set("CoversBodyPart", js.undefined)
    
    @scala.inline
    def setType(value: ProtectiveEquipmentType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
