package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIntentVersionResponse extends StObject {
  
  /**
    * Checksum of the intent version created.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * After the Lambda function specified in the fulfillmentActivity field fulfills the intent, Amazon Lex conveys this statement to the user. 
    */
  var conclusionStatement: js.UndefOr[Statement] = js.native
  
  /**
    * If defined, the prompt that Amazon Lex uses to confirm the user's intent before fulfilling it. 
    */
  var confirmationPrompt: js.UndefOr[Prompt] = js.native
  
  /**
    * The date that the intent was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * If defined, Amazon Lex invokes this Lambda function for each user input.
    */
  var dialogCodeHook: js.UndefOr[CodeHook] = js.native
  
  /**
    * If defined, Amazon Lex uses this prompt to solicit additional user activity after the intent is fulfilled. 
    */
  var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.native
  
  /**
    *  Describes how the intent is fulfilled. 
    */
  var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.native
  
  /**
    * An array of InputContext objects that lists the contexts that must be active for Amazon Lex to choose the intent in a conversation with the user.
    */
  var inputContexts: js.UndefOr[InputContextList] = js.native
  
  /**
    * Configuration information, if any, for connecting an Amazon Kendra index with the AMAZON.KendraSearchIntent intent.
    */
  var kendraConfiguration: js.UndefOr[KendraConfiguration] = js.native
  
  /**
    * The date that the intent was updated. 
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the intent.
    */
  var name: js.UndefOr[IntentName] = js.native
  
  /**
    * An array of OutputContext objects that lists the contexts that the intent activates when the intent is fulfilled.
    */
  var outputContexts: js.UndefOr[OutputContextList] = js.native
  
  /**
    * A unique identifier for a built-in intent.
    */
  var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.native
  
  /**
    * If the user answers "no" to the question defined in confirmationPrompt, Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
    */
  var rejectionStatement: js.UndefOr[Statement] = js.native
  
  /**
    * An array of sample utterances configured for the intent. 
    */
  var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.native
  
  /**
    * An array of slot types that defines the information required to fulfill the intent.
    */
  var slots: js.UndefOr[SlotList] = js.native
  
  /**
    * The version number assigned to the new version of the intent.
    */
  var version: js.UndefOr[Version] = js.native
}
object CreateIntentVersionResponse {
  
  @scala.inline
  def apply(): CreateIntentVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntentVersionResponse]
  }
  
  @scala.inline
  implicit class CreateIntentVersionResponseMutableBuilder[Self <: CreateIntentVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setConclusionStatement(value: Statement): Self = StObject.set(x, "conclusionStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusionStatementUndefined: Self = StObject.set(x, "conclusionStatement", js.undefined)
    
    @scala.inline
    def setConfirmationPrompt(value: Prompt): Self = StObject.set(x, "confirmationPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationPromptUndefined: Self = StObject.set(x, "confirmationPrompt", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDialogCodeHook(value: CodeHook): Self = StObject.set(x, "dialogCodeHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogCodeHookUndefined: Self = StObject.set(x, "dialogCodeHook", js.undefined)
    
    @scala.inline
    def setFollowUpPrompt(value: FollowUpPrompt): Self = StObject.set(x, "followUpPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUpPromptUndefined: Self = StObject.set(x, "followUpPrompt", js.undefined)
    
    @scala.inline
    def setFulfillmentActivity(value: FulfillmentActivity): Self = StObject.set(x, "fulfillmentActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentActivityUndefined: Self = StObject.set(x, "fulfillmentActivity", js.undefined)
    
    @scala.inline
    def setInputContexts(value: InputContextList): Self = StObject.set(x, "inputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContextsUndefined: Self = StObject.set(x, "inputContexts", js.undefined)
    
    @scala.inline
    def setInputContextsVarargs(value: InputContext*): Self = StObject.set(x, "inputContexts", js.Array(value :_*))
    
    @scala.inline
    def setKendraConfiguration(value: KendraConfiguration): Self = StObject.set(x, "kendraConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKendraConfigurationUndefined: Self = StObject.set(x, "kendraConfiguration", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: IntentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputContexts(value: OutputContextList): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: OutputContext*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setParentIntentSignature(value: BuiltinIntentSignature): Self = StObject.set(x, "parentIntentSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIntentSignatureUndefined: Self = StObject.set(x, "parentIntentSignature", js.undefined)
    
    @scala.inline
    def setRejectionStatement(value: Statement): Self = StObject.set(x, "rejectionStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionStatementUndefined: Self = StObject.set(x, "rejectionStatement", js.undefined)
    
    @scala.inline
    def setSampleUtterances(value: IntentUtteranceList): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    @scala.inline
    def setSampleUtterancesVarargs(value: Utterance*): Self = StObject.set(x, "sampleUtterances", js.Array(value :_*))
    
    @scala.inline
    def setSlots(value: SlotList): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    @scala.inline
    def setSlotsVarargs(value: Slot*): Self = StObject.set(x, "slots", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
