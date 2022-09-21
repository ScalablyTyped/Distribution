package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSlotTypeRequest extends StObject {
  
  /**
    * The identifier of the bot associated with this slot type.
    */
  var botId: Id
  
  /**
    * The identifier of the bot version associated with this slot type.
    */
  var botVersion: DraftBotVersion
  
  /**
    * Specifications for a composite slot type.
    */
  var compositeSlotTypeSetting: js.UndefOr[CompositeSlotTypeSetting] = js.undefined
  
  /**
    * A description of the slot type. Use the description to help identify the slot type in lists.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Sets the type of external information used to create the slot type.
    */
  var externalSourceSetting: js.UndefOr[ExternalSourceSetting] = js.undefined
  
  /**
    * The identifier of the language and locale that the slot type will be used in. The string must match one of the supported locales. All of the bots, intents, and slots used by the slot type must have the same locale. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * The built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type has the configuration of the parent slot type. Only AMAZON.AlphaNumeric is supported.
    */
  var parentSlotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined
  
  /**
    * The name for the slot. A slot type name must be unique within the account.
    */
  var slotTypeName: Name
  
  /**
    * A list of SlotTypeValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot.
    */
  var slotTypeValues: js.UndefOr[SlotTypeValues] = js.undefined
  
  /**
    * Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be set to one of the following values:    OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.    TopResolution - If there is a resolution list for the slot, return the first value in the resolution list. If there is no resolution list, return null.   If you don't specify the valueSelectionSetting parameter, the default is OriginalValue.
    */
  var valueSelectionSetting: js.UndefOr[SlotValueSelectionSetting] = js.undefined
}
object CreateSlotTypeRequest {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, localeId: LocaleId, slotTypeName: Name): CreateSlotTypeRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], slotTypeName = slotTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSlotTypeRequest]
  }
  
  extension [Self <: CreateSlotTypeRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setCompositeSlotTypeSetting(value: CompositeSlotTypeSetting): Self = StObject.set(x, "compositeSlotTypeSetting", value.asInstanceOf[js.Any])
    
    inline def setCompositeSlotTypeSettingUndefined: Self = StObject.set(x, "compositeSlotTypeSetting", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExternalSourceSetting(value: ExternalSourceSetting): Self = StObject.set(x, "externalSourceSetting", value.asInstanceOf[js.Any])
    
    inline def setExternalSourceSettingUndefined: Self = StObject.set(x, "externalSourceSetting", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setParentSlotTypeSignature(value: SlotTypeSignature): Self = StObject.set(x, "parentSlotTypeSignature", value.asInstanceOf[js.Any])
    
    inline def setParentSlotTypeSignatureUndefined: Self = StObject.set(x, "parentSlotTypeSignature", js.undefined)
    
    inline def setSlotTypeName(value: Name): Self = StObject.set(x, "slotTypeName", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeValues(value: SlotTypeValues): Self = StObject.set(x, "slotTypeValues", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeValuesUndefined: Self = StObject.set(x, "slotTypeValues", js.undefined)
    
    inline def setSlotTypeValuesVarargs(value: SlotTypeValue*): Self = StObject.set(x, "slotTypeValues", js.Array(value*))
    
    inline def setValueSelectionSetting(value: SlotValueSelectionSetting): Self = StObject.set(x, "valueSelectionSetting", value.asInstanceOf[js.Any])
    
    inline def setValueSelectionSettingUndefined: Self = StObject.set(x, "valueSelectionSetting", js.undefined)
  }
}
