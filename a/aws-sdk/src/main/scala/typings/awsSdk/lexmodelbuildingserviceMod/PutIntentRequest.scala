package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutIntentRequest extends js.Object {
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new intent, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a intent, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    *  The statement that you want Amazon Lex to convey to the user after the intent is successfully fulfilled by the Lambda function.  This element is relevant only if you provide a Lambda function in the fulfillmentActivity. If you return the intent to the client application, you can't specify this element.  The followUpPrompt and conclusionStatement are mutually exclusive. You can specify only one. 
    */
  var conclusionStatement: js.UndefOr[Statement] = js.native
  /**
    * Prompts the user to confirm the intent. This question should have a yes or no answer. Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For example, with the OrderPizza intent, you might want to confirm that the order is correct before placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask the user for confirmation before providing the information.   You you must provide both the rejectionStatement and the confirmationPrompt, or neither. 
    */
  var confirmationPrompt: js.UndefOr[Prompt] = js.native
  /**
    * When set to true a new numbered version of the intent is created. This is the same as calling the CreateIntentVersion operation. If you do not specify createVersion, the default is false.
    */
  var createVersion: js.UndefOr[Boolean] = js.native
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  Specifies a Lambda function to invoke for each user input. You can invoke this Lambda function to personalize user interaction.  For example, suppose your bot determines that the user is John. Your Lambda function might retrieve John's information from a backend database and prepopulate some of the values. For example, if you find that John is gluten intolerant, you might set the corresponding intent slot, GlutenIntolerant, to true. You might find John's phone number and set the corresponding session attribute. 
    */
  var dialogCodeHook: js.UndefOr[CodeHook] = js.native
  /**
    * Amazon Lex uses this prompt to solicit additional activity after fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the user to order a drink. The action that Amazon Lex takes depends on the user's response, as follows:   If the user says "Yes" it responds with the clarification prompt that is configured for the bot.   if the user says "Yes" and continues with an utterance that triggers an intent it starts a conversation for the intent.   If the user says "No" it responds with the rejection statement configured for the the follow-up prompt.   If it doesn't recognize the utterance it repeats the follow-up prompt again.   The followUpPrompt field and the conclusionStatement field are mutually exclusive. You can specify only one. 
    */
  var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.native
  /**
    * Required. Describes how the intent is fulfilled. For example, after a user provides all of the information for a pizza order, fulfillmentActivity defines how the bot places an order with a local pizza store.   You might configure Amazon Lex to return all of the intent information to the client application, or direct it to invoke a Lambda function that can process the intent (for example, place an order with a pizzeria). 
    */
  var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.native
  /**
    * Configuration information required to use the AMAZON.KendraSearchIntent intent to connect to an Amazon Kendra index. For more information, see  AMAZON.KendraSearchIntent.
    */
  var kendraConfiguration: js.UndefOr[KendraConfiguration] = js.native
  /**
    * The name of the intent. The name is not case sensitive.  The name can't match a built-in intent name, or a built-in intent name with "AMAZON." removed. For example, because there is a built-in intent called AMAZON.HelpIntent, you can't create a custom intent called HelpIntent. For a list of built-in intents, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var name: IntentName = js.native
  /**
    * A unique identifier for the built-in intent to base this intent on. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.native
  /**
    * When the user answers "no" to the question defined in confirmationPrompt, Amazon Lex responds with this statement to acknowledge that the intent was canceled.   You must provide both the rejectionStatement and the confirmationPrompt, or neither. 
    */
  var rejectionStatement: js.UndefOr[Statement] = js.native
  /**
    * An array of utterances (strings) that a user might say to signal the intent. For example, "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas".  In each utterance, a slot name is enclosed in curly braces. 
    */
  var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.native
  /**
    * An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts defined in the slots. For more information, see how-it-works. 
    */
  var slots: js.UndefOr[SlotList] = js.native
}

object PutIntentRequest {
  @scala.inline
  def apply(name: IntentName): PutIntentRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutIntentRequest]
  }
  @scala.inline
  implicit class PutIntentRequestOps[Self <: PutIntentRequest] (val x: Self) extends AnyVal {
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
    def setName(value: IntentName): Self = this.set("name", value.asInstanceOf[js.Any])
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
    def setCreateVersion(value: Boolean): Self = this.set("createVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateVersion: Self = this.set("createVersion", js.undefined)
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
    def setKendraConfiguration(value: KendraConfiguration): Self = this.set("kendraConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKendraConfiguration: Self = this.set("kendraConfiguration", js.undefined)
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
  }
  
}

