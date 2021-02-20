package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectProtectiveEquipmentResponse extends StObject {
  
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
  implicit class DetectProtectiveEquipmentResponseMutableBuilder[Self <: DetectProtectiveEquipmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPersons(value: ProtectiveEquipmentPersons): Self = StObject.set(x, "Persons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonsUndefined: Self = StObject.set(x, "Persons", js.undefined)
    
    @scala.inline
    def setPersonsVarargs(value: ProtectiveEquipmentPerson*): Self = StObject.set(x, "Persons", js.Array(value :_*))
    
    @scala.inline
    def setProtectiveEquipmentModelVersion(value: String): Self = StObject.set(x, "ProtectiveEquipmentModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectiveEquipmentModelVersionUndefined: Self = StObject.set(x, "ProtectiveEquipmentModelVersion", js.undefined)
    
    @scala.inline
    def setSummary(value: ProtectiveEquipmentSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
  }
}
