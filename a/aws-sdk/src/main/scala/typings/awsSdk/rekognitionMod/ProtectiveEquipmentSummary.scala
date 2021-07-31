package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectiveEquipmentSummary extends StObject {
  
  /**
    * An array of IDs for persons where it was not possible to determine if they are wearing personal protective equipment. 
    */
  var PersonsIndeterminate: js.UndefOr[ProtectiveEquipmentPersonIds] = js.undefined
  
  /**
    * An array of IDs for persons who are wearing detected personal protective equipment. 
    */
  var PersonsWithRequiredEquipment: js.UndefOr[ProtectiveEquipmentPersonIds] = js.undefined
  
  /**
    * An array of IDs for persons who are not wearing all of the types of PPE specified in the RequiredEquipmentTypes field of the detected personal protective equipment. 
    */
  var PersonsWithoutRequiredEquipment: js.UndefOr[ProtectiveEquipmentPersonIds] = js.undefined
}
object ProtectiveEquipmentSummary {
  
  @scala.inline
  def apply(): ProtectiveEquipmentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectiveEquipmentSummary]
  }
  
  @scala.inline
  implicit class ProtectiveEquipmentSummaryMutableBuilder[Self <: ProtectiveEquipmentSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPersonsIndeterminate(value: ProtectiveEquipmentPersonIds): Self = StObject.set(x, "PersonsIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonsIndeterminateUndefined: Self = StObject.set(x, "PersonsIndeterminate", js.undefined)
    
    @scala.inline
    def setPersonsIndeterminateVarargs(value: UInteger*): Self = StObject.set(x, "PersonsIndeterminate", js.Array(value :_*))
    
    @scala.inline
    def setPersonsWithRequiredEquipment(value: ProtectiveEquipmentPersonIds): Self = StObject.set(x, "PersonsWithRequiredEquipment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonsWithRequiredEquipmentUndefined: Self = StObject.set(x, "PersonsWithRequiredEquipment", js.undefined)
    
    @scala.inline
    def setPersonsWithRequiredEquipmentVarargs(value: UInteger*): Self = StObject.set(x, "PersonsWithRequiredEquipment", js.Array(value :_*))
    
    @scala.inline
    def setPersonsWithoutRequiredEquipment(value: ProtectiveEquipmentPersonIds): Self = StObject.set(x, "PersonsWithoutRequiredEquipment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonsWithoutRequiredEquipmentUndefined: Self = StObject.set(x, "PersonsWithoutRequiredEquipment", js.undefined)
    
    @scala.inline
    def setPersonsWithoutRequiredEquipmentVarargs(value: UInteger*): Self = StObject.set(x, "PersonsWithoutRequiredEquipment", js.Array(value :_*))
  }
}
