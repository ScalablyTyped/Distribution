package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectiveEquipmentPerson extends js.Object {
  
  /**
    * An array of body parts detected on a person's body (including body parts without PPE). 
    */
  var BodyParts: js.UndefOr[typings.awsSdk.rekognitionMod.BodyParts] = js.native
  
  /**
    * A bounding box around the detected person.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  
  /**
    * The confidence that Amazon Rekognition has that the bounding box contains a person.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * The identifier for the detected person. The identifier is only unique for a single call to DetectProtectiveEquipment.
    */
  var Id: js.UndefOr[UInteger] = js.native
}
object ProtectiveEquipmentPerson {
  
  @scala.inline
  def apply(): ProtectiveEquipmentPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectiveEquipmentPerson]
  }
  
  @scala.inline
  implicit class ProtectiveEquipmentPersonOps[Self <: ProtectiveEquipmentPerson] (val x: Self) extends AnyVal {
    
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
    def setBodyPartsVarargs(value: ProtectiveEquipmentBodyPart*): Self = this.set("BodyParts", js.Array(value :_*))
    
    @scala.inline
    def setBodyParts(value: BodyParts): Self = this.set("BodyParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyParts: Self = this.set("BodyParts", js.undefined)
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = this.set("BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBox: Self = this.set("BoundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Percent): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    
    @scala.inline
    def setId(value: UInteger): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
}
