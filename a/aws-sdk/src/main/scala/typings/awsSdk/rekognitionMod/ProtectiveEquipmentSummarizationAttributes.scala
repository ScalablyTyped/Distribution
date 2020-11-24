package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectiveEquipmentSummarizationAttributes extends js.Object {
  
  /**
    * The minimum confidence level for which you want summary information. The confidence level applies to person detection, body part detection, equipment detection, and body part coverage. Amazon Rekognition doesn't return summary information with a confidence than this specified value. There isn't a default value. Specify a MinConfidence value that is between 50-100% as DetectProtectiveEquipment returns predictions only where the detection confidence is between 50% - 100%. If you specify a value that is less than 50%, the results are the same specifying a value of 50%.  
    */
  var MinConfidence: Percent = js.native
  
  /**
    * An array of personal protective equipment types for which you want summary information. If a person is detected wearing a required requipment type, the person's ID is added to the PersonsWithRequiredEquipment array field returned in ProtectiveEquipmentSummary by DetectProtectiveEquipment. 
    */
  var RequiredEquipmentTypes: ProtectiveEquipmentTypes = js.native
}
object ProtectiveEquipmentSummarizationAttributes {
  
  @scala.inline
  def apply(MinConfidence: Percent, RequiredEquipmentTypes: ProtectiveEquipmentTypes): ProtectiveEquipmentSummarizationAttributes = {
    val __obj = js.Dynamic.literal(MinConfidence = MinConfidence.asInstanceOf[js.Any], RequiredEquipmentTypes = RequiredEquipmentTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectiveEquipmentSummarizationAttributes]
  }
  
  @scala.inline
  implicit class ProtectiveEquipmentSummarizationAttributesOps[Self <: ProtectiveEquipmentSummarizationAttributes] (val x: Self) extends AnyVal {
    
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
    def setMinConfidence(value: Percent): Self = this.set("MinConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredEquipmentTypesVarargs(value: ProtectiveEquipmentType*): Self = this.set("RequiredEquipmentTypes", js.Array(value :_*))
    
    @scala.inline
    def setRequiredEquipmentTypes(value: ProtectiveEquipmentTypes): Self = this.set("RequiredEquipmentTypes", value.asInstanceOf[js.Any])
  }
}
