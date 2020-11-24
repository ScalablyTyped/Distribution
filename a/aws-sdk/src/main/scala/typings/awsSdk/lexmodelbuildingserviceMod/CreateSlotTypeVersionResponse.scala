package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSlotTypeVersionResponse extends js.Object {
  
  /**
    * Checksum of the $LATEST version of the slot type.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * The date that the slot type was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * A description of the slot type.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * A list of EnumerationValue objects that defines the values that the slot type can take.
    */
  var enumerationValues: js.UndefOr[EnumerationValues] = js.native
  
  /**
    * The date that the slot type was updated. When you create a resource, the creation date and last update date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the slot type.
    */
  var name: js.UndefOr[SlotTypeName] = js.native
  
  /**
    * The built-in slot type used a the parent of the slot type.
    */
  var parentSlotTypeSignature: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.native
  
  /**
    * Configuration information that extends the parent built-in slot type.
    */
  var slotTypeConfigurations: js.UndefOr[SlotTypeConfigurations] = js.native
  
  /**
    * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see PutSlotType.
    */
  var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.native
  
  /**
    * The version assigned to the new slot type version. 
    */
  var version: js.UndefOr[Version] = js.native
}
object CreateSlotTypeVersionResponse {
  
  @scala.inline
  def apply(): CreateSlotTypeVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlotTypeVersionResponse]
  }
  
  @scala.inline
  implicit class CreateSlotTypeVersionResponseOps[Self <: CreateSlotTypeVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnumerationValuesVarargs(value: EnumerationValue*): Self = this.set("enumerationValues", js.Array(value :_*))
    
    @scala.inline
    def setEnumerationValues(value: EnumerationValues): Self = this.set("enumerationValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumerationValues: Self = this.set("enumerationValues", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: SlotTypeName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentSlotTypeSignature(value: CustomOrBuiltinSlotTypeName): Self = this.set("parentSlotTypeSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSlotTypeSignature: Self = this.set("parentSlotTypeSignature", js.undefined)
    
    @scala.inline
    def setSlotTypeConfigurationsVarargs(value: SlotTypeConfiguration*): Self = this.set("slotTypeConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setSlotTypeConfigurations(value: SlotTypeConfigurations): Self = this.set("slotTypeConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotTypeConfigurations: Self = this.set("slotTypeConfigurations", js.undefined)
    
    @scala.inline
    def setValueSelectionStrategy(value: SlotValueSelectionStrategy): Self = this.set("valueSelectionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSelectionStrategy: Self = this.set("valueSelectionStrategy", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
