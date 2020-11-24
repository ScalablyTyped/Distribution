package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectProtectiveEquipmentResponse extends js.Object {
  
  /**
    * An array of persons detected in the image (including persons not wearing PPE).
    */
  var Persons: js.UndefOr[ProtectiveEquipmentPersons] = js.native
  
  /**
    * The version number of the PPE detection model used to detect PPE in the image.
    */
  var ProtectiveEquipmentModelVersion: js.UndefOr[String] = js.native
  
  /**
    * Summary information for the types of PPE specified in the SummarizationAttributes input parameter.
    */
  var Summary: js.UndefOr[ProtectiveEquipmentSummary] = js.native
}
object DetectProtectiveEquipmentResponse {
  
  @scala.inline
  def apply(): DetectProtectiveEquipmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectProtectiveEquipmentResponse]
  }
  
  @scala.inline
  implicit class DetectProtectiveEquipmentResponseOps[Self <: DetectProtectiveEquipmentResponse] (val x: Self) extends AnyVal {
    
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
    def setPersonsVarargs(value: ProtectiveEquipmentPerson*): Self = this.set("Persons", js.Array(value :_*))
    
    @scala.inline
    def setPersons(value: ProtectiveEquipmentPersons): Self = this.set("Persons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersons: Self = this.set("Persons", js.undefined)
    
    @scala.inline
    def setProtectiveEquipmentModelVersion(value: String): Self = this.set("ProtectiveEquipmentModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectiveEquipmentModelVersion: Self = this.set("ProtectiveEquipmentModelVersion", js.undefined)
    
    @scala.inline
    def setSummary(value: ProtectiveEquipmentSummary): Self = this.set("Summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("Summary", js.undefined)
  }
}
