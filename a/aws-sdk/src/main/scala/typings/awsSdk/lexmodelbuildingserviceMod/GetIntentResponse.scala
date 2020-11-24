package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIntentResponse extends js.Object {
  
  /**
    * Checksum of the intent.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * After the Lambda function specified in the fulfillmentActivity element fulfills the intent, Amazon Lex conveys this statement to the user.
    */
  var conclusionStatement: js.UndefOr[Statement] = js.native
  
  /**
    * If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request. For more information, see PutIntent. 
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
    * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more information, see PutIntent. 
    */
  var dialogCodeHook: js.UndefOr[CodeHook] = js.native
  
  /**
    * If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is fulfilled. For more information, see PutIntent.
    */
  var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.native
  
  /**
    * Describes how the intent is fulfilled. For more information, see PutIntent. 
    */
  var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.native
  
  /**
    * An array of InputContext objects that lists the contexts that must be active for Amazon Lex to choose the intent in a conversation with the user.
    */
  var inputContexts: js.UndefOr[InputContextList] = js.native
  
  /**
    * Configuration information, if any, to connect to an Amazon Kendra index with the AMAZON.KendraSearchIntent intent.
    */
  var kendraConfiguration: js.UndefOr[KendraConfiguration] = js.native
  
  /**
    * The date that the intent was updated. When you create a resource, the creation date and the last updated date are the same. 
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
    * An array of intent slots configured for the intent.
    */
  var slots: js.UndefOr[SlotList] = js.native
  
  /**
    * The version of the intent.
    */
  var version: js.UndefOr[Version] = js.native
}
object GetIntentResponse {
  
  @scala.inline
  def apply(): GetIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntentResponse]
  }
  
  @scala.inline
  implicit class GetIntentResponseOps[Self <: GetIntentResponse] (val x: Self) extends AnyVal {
    
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
    def setConclusionStatement(value: Statement): Self = this.set("conclusionStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConclusionStatement: Self = this.set("conclusionStatement", js.undefined)
    
    @scala.inline
    def setConfirmationPrompt(value: Prompt): Self = this.set("confirmationPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmationPrompt: Self = this.set("confirmationPrompt", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDialogCodeHook(value: CodeHook): Self = this.set("dialogCodeHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogCodeHook: Self = this.set("dialogCodeHook", js.undefined)
    
    @scala.inline
    def setFollowUpPrompt(value: FollowUpPrompt): Self = this.set("followUpPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowUpPrompt: Self = this.set("followUpPrompt", js.undefined)
    
    @scala.inline
    def setFulfillmentActivity(value: FulfillmentActivity): Self = this.set("fulfillmentActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentActivity: Self = this.set("fulfillmentActivity", js.undefined)
    
    @scala.inline
    def setInputContextsVarargs(value: InputContext*): Self = this.set("inputContexts", js.Array(value :_*))
    
    @scala.inline
    def setInputContexts(value: InputContextList): Self = this.set("inputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputContexts: Self = this.set("inputContexts", js.undefined)
    
    @scala.inline
    def setKendraConfiguration(value: KendraConfiguration): Self = this.set("kendraConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKendraConfiguration: Self = this.set("kendraConfiguration", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: IntentName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: OutputContext*): Self = this.set("outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setOutputContexts(value: OutputContextList): Self = this.set("outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputContexts: Self = this.set("outputContexts", js.undefined)
    
    @scala.inline
    def setParentIntentSignature(value: BuiltinIntentSignature): Self = this.set("parentIntentSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentIntentSignature: Self = this.set("parentIntentSignature", js.undefined)
    
    @scala.inline
    def setRejectionStatement(value: Statement): Self = this.set("rejectionStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectionStatement: Self = this.set("rejectionStatement", js.undefined)
    
    @scala.inline
    def setSampleUtterancesVarargs(value: Utterance*): Self = this.set("sampleUtterances", js.Array(value :_*))
    
    @scala.inline
    def setSampleUtterances(value: IntentUtteranceList): Self = this.set("sampleUtterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleUtterances: Self = this.set("sampleUtterances", js.undefined)
    
    @scala.inline
    def setSlotsVarargs(value: Slot*): Self = this.set("slots", js.Array(value :_*))
    
    @scala.inline
    def setSlots(value: SlotList): Self = this.set("slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
