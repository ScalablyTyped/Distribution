package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectProtectiveEquipmentResponse extends StObject {
  
  /**
    * An array of persons detected in the image (including persons not wearing PPE).
    */
  var Persons: js.UndefOr[ProtectiveEquipmentPersons] = js.undefined
  
  /**
    * The version number of the PPE detection model used to detect PPE in the image.
    */
  var ProtectiveEquipmentModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Summary information for the types of PPE specified in the SummarizationAttributes input parameter.
    */
  var Summary: js.UndefOr[ProtectiveEquipmentSummary] = js.undefined
}
object DetectProtectiveEquipmentResponse {
  
  inline def apply(): DetectProtectiveEquipmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectProtectiveEquipmentResponse]
  }
  
  extension [Self <: DetectProtectiveEquipmentResponse](x: Self) {
    
    inline def setPersons(value: ProtectiveEquipmentPersons): Self = StObject.set(x, "Persons", value.asInstanceOf[js.Any])
    
    inline def setPersonsUndefined: Self = StObject.set(x, "Persons", js.undefined)
    
    inline def setPersonsVarargs(value: ProtectiveEquipmentPerson*): Self = StObject.set(x, "Persons", js.Array(value :_*))
    
    inline def setProtectiveEquipmentModelVersion(value: String): Self = StObject.set(x, "ProtectiveEquipmentModelVersion", value.asInstanceOf[js.Any])
    
    inline def setProtectiveEquipmentModelVersionUndefined: Self = StObject.set(x, "ProtectiveEquipmentModelVersion", js.undefined)
    
    inline def setSummary(value: ProtectiveEquipmentSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
  }
}
