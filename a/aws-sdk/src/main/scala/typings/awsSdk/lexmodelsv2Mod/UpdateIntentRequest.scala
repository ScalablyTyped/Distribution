package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIntentRequest extends StObject {
  
  /**
    * The identifier of the bot that contains the intent.
    */
  var botId: Id
  
  /**
    * The version of the bot that contains the intent. Must be DRAFT.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The new description of the intent.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The new Lambda function to use between each turn of the conversation with the bot.
    */
  var dialogCodeHook: js.UndefOr[DialogCodeHookSettings] = js.undefined
  
  /**
    * The new Lambda function to call when all of the intents required slots are provided and the intent is ready for fulfillment.
    */
  var fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings] = js.undefined
  
  /**
    * 
    */
  var initialResponseSetting: js.UndefOr[InitialResponseSetting] = js.undefined
  
  /**
    * A new list of contexts that must be active in order for Amazon Lex to consider the intent.
    */
  var inputContexts: js.UndefOr[InputContextsList] = js.undefined
  
  /**
    * The new response that Amazon Lex sends the user when the intent is closed.
    */
  var intentClosingSetting: js.UndefOr[IntentClosingSetting] = js.undefined
  
  /**
    * New prompts that Amazon Lex sends to the user to confirm the completion of an intent.
    */
  var intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting] = js.undefined
  
  /**
    * The unique identifier of the intent to update.
    */
  var intentId: Id
  
  /**
    * The new name for the intent.
    */
  var intentName: Name
  
  /**
    * New configuration settings for connecting to an Amazon Kendra index.
    */
  var kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined
  
  /**
    * The identifier of the language and locale where this intent is used. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * A new list of contexts that Amazon Lex activates when the intent is fulfilled.
    */
  var outputContexts: js.UndefOr[OutputContextsList] = js.undefined
  
  /**
    * The signature of the new built-in intent to use as the parent of this intent.
    */
  var parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined
  
  /**
    * New utterances used to invoke the intent.
    */
  var sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined
  
  /**
    * A new list of slots and their priorities that are contained by the intent.
    */
  var slotPriorities: js.UndefOr[SlotPrioritiesList] = js.undefined
}
object UpdateIntentRequest {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, intentId: Id, intentName: Name, localeId: LocaleId): UpdateIntentRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], intentId = intentId.asInstanceOf[js.Any], intentName = intentName.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIntentRequest]
  }
  
  extension [Self <: UpdateIntentRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDialogCodeHook(value: DialogCodeHookSettings): Self = StObject.set(x, "dialogCodeHook", value.asInstanceOf[js.Any])
    
    inline def setDialogCodeHookUndefined: Self = StObject.set(x, "dialogCodeHook", js.undefined)
    
    inline def setFulfillmentCodeHook(value: FulfillmentCodeHookSettings): Self = StObject.set(x, "fulfillmentCodeHook", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentCodeHookUndefined: Self = StObject.set(x, "fulfillmentCodeHook", js.undefined)
    
    inline def setInitialResponseSetting(value: InitialResponseSetting): Self = StObject.set(x, "initialResponseSetting", value.asInstanceOf[js.Any])
    
    inline def setInitialResponseSettingUndefined: Self = StObject.set(x, "initialResponseSetting", js.undefined)
    
    inline def setInputContexts(value: InputContextsList): Self = StObject.set(x, "inputContexts", value.asInstanceOf[js.Any])
    
    inline def setInputContextsUndefined: Self = StObject.set(x, "inputContexts", js.undefined)
    
    inline def setInputContextsVarargs(value: InputContext*): Self = StObject.set(x, "inputContexts", js.Array(value*))
    
    inline def setIntentClosingSetting(value: IntentClosingSetting): Self = StObject.set(x, "intentClosingSetting", value.asInstanceOf[js.Any])
    
    inline def setIntentClosingSettingUndefined: Self = StObject.set(x, "intentClosingSetting", js.undefined)
    
    inline def setIntentConfirmationSetting(value: IntentConfirmationSetting): Self = StObject.set(x, "intentConfirmationSetting", value.asInstanceOf[js.Any])
    
    inline def setIntentConfirmationSettingUndefined: Self = StObject.set(x, "intentConfirmationSetting", js.undefined)
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setIntentName(value: Name): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    inline def setKendraConfiguration(value: KendraConfiguration): Self = StObject.set(x, "kendraConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKendraConfigurationUndefined: Self = StObject.set(x, "kendraConfiguration", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setOutputContexts(value: OutputContextsList): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: OutputContext*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParentIntentSignature(value: IntentSignature): Self = StObject.set(x, "parentIntentSignature", value.asInstanceOf[js.Any])
    
    inline def setParentIntentSignatureUndefined: Self = StObject.set(x, "parentIntentSignature", js.undefined)
    
    inline def setSampleUtterances(value: SampleUtterancesList): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    inline def setSampleUtterancesVarargs(value: SampleUtterance*): Self = StObject.set(x, "sampleUtterances", js.Array(value*))
    
    inline def setSlotPriorities(value: SlotPrioritiesList): Self = StObject.set(x, "slotPriorities", value.asInstanceOf[js.Any])
    
    inline def setSlotPrioritiesUndefined: Self = StObject.set(x, "slotPriorities", js.undefined)
    
    inline def setSlotPrioritiesVarargs(value: SlotPriority*): Self = StObject.set(x, "slotPriorities", js.Array(value*))
  }
}
