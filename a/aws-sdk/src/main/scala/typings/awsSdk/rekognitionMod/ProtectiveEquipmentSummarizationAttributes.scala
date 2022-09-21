package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectiveEquipmentSummarizationAttributes extends StObject {
  
  /**
    * The minimum confidence level for which you want summary information. The confidence level applies to person detection, body part detection, equipment detection, and body part coverage. Amazon Rekognition doesn't return summary information with a confidence than this specified value. There isn't a default value. Specify a MinConfidence value that is between 50-100% as DetectProtectiveEquipment returns predictions only where the detection confidence is between 50% - 100%. If you specify a value that is less than 50%, the results are the same specifying a value of 50%.  
    */
  var MinConfidence: Percent
  
  /**
    * An array of personal protective equipment types for which you want summary information. If a person is detected wearing a required requipment type, the person's ID is added to the PersonsWithRequiredEquipment array field returned in ProtectiveEquipmentSummary by DetectProtectiveEquipment. 
    */
  var RequiredEquipmentTypes: ProtectiveEquipmentTypes
}
object ProtectiveEquipmentSummarizationAttributes {
  
  inline def apply(MinConfidence: Percent, RequiredEquipmentTypes: ProtectiveEquipmentTypes): ProtectiveEquipmentSummarizationAttributes = {
    val __obj = js.Dynamic.literal(MinConfidence = MinConfidence.asInstanceOf[js.Any], RequiredEquipmentTypes = RequiredEquipmentTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectiveEquipmentSummarizationAttributes]
  }
  
  extension [Self <: ProtectiveEquipmentSummarizationAttributes](x: Self) {
    
    inline def setMinConfidence(value: Percent): Self = StObject.set(x, "MinConfidence", value.asInstanceOf[js.Any])
    
    inline def setRequiredEquipmentTypes(value: ProtectiveEquipmentTypes): Self = StObject.set(x, "RequiredEquipmentTypes", value.asInstanceOf[js.Any])
    
    inline def setRequiredEquipmentTypesVarargs(value: ProtectiveEquipmentType*): Self = StObject.set(x, "RequiredEquipmentTypes", js.Array(value*))
  }
}
