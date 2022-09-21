package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIntentResponse extends StObject {
  
  /**
    * The identifier of the bot associated with the intent.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The identifier of the version of the bot associated with the intent.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * A timestamp of the date and time that the intent was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description specified for the intent.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The dialog Lambda function specified for the intent.
    */
  var dialogCodeHook: js.UndefOr[DialogCodeHookSettings] = js.undefined
  
  /**
    * The fulfillment Lambda function specified for the intent.
    */
  var fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings] = js.undefined
  
  /**
    * Configuration settings for the response that is sent to the user at the beginning of a conversation, before eliciting slot values.
    */
  var initialResponseSetting: js.UndefOr[InitialResponseSetting] = js.undefined
  
  /**
    * The list of input contexts specified for the intent.
    */
  var inputContexts: js.UndefOr[InputContextsList] = js.undefined
  
  /**
    * The closing setting specified for the intent.
    */
  var intentClosingSetting: js.UndefOr[IntentClosingSetting] = js.undefined
  
  /**
    * The confirmation setting specified for the intent.
    */
  var intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting] = js.undefined
  
  /**
    * A unique identifier for the intent.
    */
  var intentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name specified for the intent.
    */
  var intentName: js.UndefOr[Name] = js.undefined
  
  /**
    * Configuration for searching a Amazon Kendra index specified for the intent.
    */
  var kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined
  
  /**
    * The locale that the intent is specified to use.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The list of output contexts specified for the intent.
    */
  var outputContexts: js.UndefOr[OutputContextsList] = js.undefined
  
  /**
    * The signature of the parent intent specified for the intent.
    */
  var parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined
  
  /**
    * The sample utterances specified for the intent.
    */
  var sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined
}
object CreateIntentResponse {
  
  inline def apply(): CreateIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntentResponse]
  }
  
  extension [Self <: CreateIntentResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
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
    
    inline def setIntentIdUndefined: Self = StObject.set(x, "intentId", js.undefined)
    
    inline def setIntentName(value: Name): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    inline def setIntentNameUndefined: Self = StObject.set(x, "intentName", js.undefined)
    
    inline def setKendraConfiguration(value: KendraConfiguration): Self = StObject.set(x, "kendraConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKendraConfigurationUndefined: Self = StObject.set(x, "kendraConfiguration", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setOutputContexts(value: OutputContextsList): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: OutputContext*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParentIntentSignature(value: IntentSignature): Self = StObject.set(x, "parentIntentSignature", value.asInstanceOf[js.Any])
    
    inline def setParentIntentSignatureUndefined: Self = StObject.set(x, "parentIntentSignature", js.undefined)
    
    inline def setSampleUtterances(value: SampleUtterancesList): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    inline def setSampleUtterancesVarargs(value: SampleUtterance*): Self = StObject.set(x, "sampleUtterances", js.Array(value*))
  }
}
