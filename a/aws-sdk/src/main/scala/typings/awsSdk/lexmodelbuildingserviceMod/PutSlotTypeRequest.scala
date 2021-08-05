package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSlotTypeRequest extends StObject {
  
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new slot type, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a slot type, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * When set to true a new numbered version of the slot type is created. This is the same as calling the CreateSlotTypeVersion operation. If you do not specify createVersion, the default is false.
    */
  var createVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description of the slot type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A list of EnumerationValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, which are additional values that help train the machine learning model about the values that it resolves for a slot.  A regular expression slot type doesn't require enumeration values. All other slot types require a list of enumeration values. When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible values for the slot. If you are using a Lambda function, this resolution list is passed to the function. If you are not using a Lambda function you can choose to return the value that the user entered or the first value in the resolution list as the slot value. The valueSelectionStrategy field indicates the option to use. 
    */
  var enumerationValues: js.UndefOr[EnumerationValues] = js.undefined
  
  /**
    * The name of the slot type. The name is not case sensitive.  The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For example, because there is a built-in slot type called AMAZON.DATE, you can't create a custom slot type called DATE. For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit.
    */
  var name: SlotTypeName
  
  /**
    * The built-in slot type used as the parent of the slot type. When you define a parent slot type, the new slot type has all of the same configuration as the parent. Only AMAZON.AlphaNumeric is supported.
    */
  var parentSlotTypeSignature: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.undefined
  
  /**
    * Configuration information that extends the parent built-in slot type. The configuration is added to the settings for the parent slot type.
    */
  var slotTypeConfigurations: js.UndefOr[SlotTypeConfigurations] = js.undefined
  
  /**
    * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to one of the following values:    ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to the slot value.    TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in the resolution list as the slot type value. If there is no resolution list, null is returned.   If you don't specify the valueSelectionStrategy, the default is ORIGINAL_VALUE.
    */
  var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined
}
object PutSlotTypeRequest {
  
  inline def apply(name: SlotTypeName): PutSlotTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSlotTypeRequest]
  }
  
  extension [Self <: PutSlotTypeRequest](x: Self) {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setCreateVersion(value: Boolean): Self = StObject.set(x, "createVersion", value.asInstanceOf[js.Any])
    
    inline def setCreateVersionUndefined: Self = StObject.set(x, "createVersion", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnumerationValues(value: EnumerationValues): Self = StObject.set(x, "enumerationValues", value.asInstanceOf[js.Any])
    
    inline def setEnumerationValuesUndefined: Self = StObject.set(x, "enumerationValues", js.undefined)
    
    inline def setEnumerationValuesVarargs(value: EnumerationValue*): Self = StObject.set(x, "enumerationValues", js.Array(value :_*))
    
    inline def setName(value: SlotTypeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentSlotTypeSignature(value: CustomOrBuiltinSlotTypeName): Self = StObject.set(x, "parentSlotTypeSignature", value.asInstanceOf[js.Any])
    
    inline def setParentSlotTypeSignatureUndefined: Self = StObject.set(x, "parentSlotTypeSignature", js.undefined)
    
    inline def setSlotTypeConfigurations(value: SlotTypeConfigurations): Self = StObject.set(x, "slotTypeConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeConfigurationsUndefined: Self = StObject.set(x, "slotTypeConfigurations", js.undefined)
    
    inline def setSlotTypeConfigurationsVarargs(value: SlotTypeConfiguration*): Self = StObject.set(x, "slotTypeConfigurations", js.Array(value :_*))
    
    inline def setValueSelectionStrategy(value: SlotValueSelectionStrategy): Self = StObject.set(x, "valueSelectionStrategy", value.asInstanceOf[js.Any])
    
    inline def setValueSelectionStrategyUndefined: Self = StObject.set(x, "valueSelectionStrategy", js.undefined)
  }
}
