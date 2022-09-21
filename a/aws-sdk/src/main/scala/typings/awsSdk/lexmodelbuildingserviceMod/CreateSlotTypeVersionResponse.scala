package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSlotTypeVersionResponse extends StObject {
  
  /**
    * Checksum of the $LATEST version of the slot type.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The date that the slot type was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the slot type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A list of EnumerationValue objects that defines the values that the slot type can take.
    */
  var enumerationValues: js.UndefOr[EnumerationValues] = js.undefined
  
  /**
    * The date that the slot type was updated. When you create a resource, the creation date and last update date are the same.
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the slot type.
    */
  var name: js.UndefOr[SlotTypeName] = js.undefined
  
  /**
    * The built-in slot type used a the parent of the slot type.
    */
  var parentSlotTypeSignature: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.undefined
  
  /**
    * Configuration information that extends the parent built-in slot type.
    */
  var slotTypeConfigurations: js.UndefOr[SlotTypeConfigurations] = js.undefined
  
  /**
    * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see PutSlotType.
    */
  var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined
  
  /**
    * The version assigned to the new slot type version. 
    */
  var version: js.UndefOr[Version] = js.undefined
}
object CreateSlotTypeVersionResponse {
  
  inline def apply(): CreateSlotTypeVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlotTypeVersionResponse]
  }
  
  extension [Self <: CreateSlotTypeVersionResponse](x: Self) {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnumerationValues(value: EnumerationValues): Self = StObject.set(x, "enumerationValues", value.asInstanceOf[js.Any])
    
    inline def setEnumerationValuesUndefined: Self = StObject.set(x, "enumerationValues", js.undefined)
    
    inline def setEnumerationValuesVarargs(value: EnumerationValue*): Self = StObject.set(x, "enumerationValues", js.Array(value*))
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    inline def setName(value: SlotTypeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentSlotTypeSignature(value: CustomOrBuiltinSlotTypeName): Self = StObject.set(x, "parentSlotTypeSignature", value.asInstanceOf[js.Any])
    
    inline def setParentSlotTypeSignatureUndefined: Self = StObject.set(x, "parentSlotTypeSignature", js.undefined)
    
    inline def setSlotTypeConfigurations(value: SlotTypeConfigurations): Self = StObject.set(x, "slotTypeConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeConfigurationsUndefined: Self = StObject.set(x, "slotTypeConfigurations", js.undefined)
    
    inline def setSlotTypeConfigurationsVarargs(value: SlotTypeConfiguration*): Self = StObject.set(x, "slotTypeConfigurations", js.Array(value*))
    
    inline def setValueSelectionStrategy(value: SlotValueSelectionStrategy): Self = StObject.set(x, "valueSelectionStrategy", value.asInstanceOf[js.Any])
    
    inline def setValueSelectionStrategyUndefined: Self = StObject.set(x, "valueSelectionStrategy", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
