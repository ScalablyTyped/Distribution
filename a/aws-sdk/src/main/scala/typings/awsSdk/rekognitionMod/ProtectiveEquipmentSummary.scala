package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectiveEquipmentSummary extends js.Object {
  
  /**
    * An array of IDs for persons where it was not possible to determine if they are wearing personal protective equipment. 
    */
  var PersonsIndeterminate: js.UndefOr[ProtectiveEquipmentPersonIds] = js.native
  
  /**
    * An array of IDs for persons who are wearing detected personal protective equipment. 
    */
  var PersonsWithRequiredEquipment: js.UndefOr[ProtectiveEquipmentPersonIds] = js.native
  
  /**
    * An array of IDs for persons who are not wearing all of the types of PPE specified in the RequiredEquipmentTypes field of the detected personal protective equipment. 
    */
  var PersonsWithoutRequiredEquipment: js.UndefOr[ProtectiveEquipmentPersonIds] = js.native
}
object ProtectiveEquipmentSummary {
  
  @scala.inline
  def apply(): ProtectiveEquipmentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectiveEquipmentSummary]
  }
  
  @scala.inline
  implicit class ProtectiveEquipmentSummaryOps[Self <: ProtectiveEquipmentSummary] (val x: Self) extends AnyVal {
    
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
    def setPersonsIndeterminateVarargs(value: UInteger*): Self = this.set("PersonsIndeterminate", js.Array(value :_*))
    
    @scala.inline
    def setPersonsIndeterminate(value: ProtectiveEquipmentPersonIds): Self = this.set("PersonsIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonsIndeterminate: Self = this.set("PersonsIndeterminate", js.undefined)
    
    @scala.inline
    def setPersonsWithRequiredEquipmentVarargs(value: UInteger*): Self = this.set("PersonsWithRequiredEquipment", js.Array(value :_*))
    
    @scala.inline
    def setPersonsWithRequiredEquipment(value: ProtectiveEquipmentPersonIds): Self = this.set("PersonsWithRequiredEquipment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonsWithRequiredEquipment: Self = this.set("PersonsWithRequiredEquipment", js.undefined)
    
    @scala.inline
    def setPersonsWithoutRequiredEquipmentVarargs(value: UInteger*): Self = this.set("PersonsWithoutRequiredEquipment", js.Array(value :_*))
    
    @scala.inline
    def setPersonsWithoutRequiredEquipment(value: ProtectiveEquipmentPersonIds): Self = this.set("PersonsWithoutRequiredEquipment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonsWithoutRequiredEquipment: Self = this.set("PersonsWithoutRequiredEquipment", js.undefined)
  }
}
