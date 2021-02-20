package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSlotTypeResponse extends StObject {
  
  /**
    * Checksum of the $LATEST version of the slot type.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    *  True if a new version of the slot type was created. If the createVersion field was not specified in the request, the createVersion field is set to false in the response.
    */
  var createVersion: js.UndefOr[Boolean] = js.native
  
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
    * The date that the slot type was updated. When you create a slot type, the creation date and last update date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the slot type.
    */
  var name: js.UndefOr[SlotTypeName] = js.native
  
  /**
    * The built-in slot type used as the parent of the slot type.
    */
  var parentSlotTypeSignature: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.native
  
  /**
    * Configuration information that extends the parent built-in slot type.
    */
  var slotTypeConfigurations: js.UndefOr[SlotTypeConfigurations] = js.native
  
  /**
    * The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more information, see PutSlotType.
    */
  var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.native
  
  /**
    * The version of the slot type. For a new slot type, the version is always $LATEST. 
    */
  var version: js.UndefOr[Version] = js.native
}
object PutSlotTypeResponse {
  
  @scala.inline
  def apply(): PutSlotTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSlotTypeResponse]
  }
  
  @scala.inline
  implicit class PutSlotTypeResponseMutableBuilder[Self <: PutSlotTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setCreateVersion(value: Boolean): Self = StObject.set(x, "createVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateVersionUndefined: Self = StObject.set(x, "createVersion", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnumerationValues(value: EnumerationValues): Self = StObject.set(x, "enumerationValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerationValuesUndefined: Self = StObject.set(x, "enumerationValues", js.undefined)
    
    @scala.inline
    def setEnumerationValuesVarargs(value: EnumerationValue*): Self = StObject.set(x, "enumerationValues", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: SlotTypeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentSlotTypeSignature(value: CustomOrBuiltinSlotTypeName): Self = StObject.set(x, "parentSlotTypeSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSlotTypeSignatureUndefined: Self = StObject.set(x, "parentSlotTypeSignature", js.undefined)
    
    @scala.inline
    def setSlotTypeConfigurations(value: SlotTypeConfigurations): Self = StObject.set(x, "slotTypeConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotTypeConfigurationsUndefined: Self = StObject.set(x, "slotTypeConfigurations", js.undefined)
    
    @scala.inline
    def setSlotTypeConfigurationsVarargs(value: SlotTypeConfiguration*): Self = StObject.set(x, "slotTypeConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setValueSelectionStrategy(value: SlotValueSelectionStrategy): Self = StObject.set(x, "valueSelectionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSelectionStrategyUndefined: Self = StObject.set(x, "valueSelectionStrategy", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
