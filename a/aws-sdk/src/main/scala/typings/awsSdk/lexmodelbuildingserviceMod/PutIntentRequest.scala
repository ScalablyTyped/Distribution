package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutIntentRequest extends StObject {
  
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new intent, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a intent, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    *  The statement that you want Amazon Lex to convey to the user after the intent is successfully fulfilled by the Lambda function.  This element is relevant only if you provide a Lambda function in the fulfillmentActivity. If you return the intent to the client application, you can't specify this element.  The followUpPrompt and conclusionStatement are mutually exclusive. You can specify only one. 
    */
  var conclusionStatement: js.UndefOr[Statement] = js.undefined
  
  /**
    * Prompts the user to confirm the intent. This question should have a yes or no answer. Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For example, with the OrderPizza intent, you might want to confirm that the order is correct before placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask the user for confirmation before providing the information.   You you must provide both the rejectionStatement and the confirmationPrompt, or neither. 
    */
  var confirmationPrompt: js.UndefOr[Prompt] = js.undefined
  
  /**
    * When set to true a new numbered version of the intent is created. This is the same as calling the CreateIntentVersion operation. If you do not specify createVersion, the default is false.
    */
  var createVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    *  Specifies a Lambda function to invoke for each user input. You can invoke this Lambda function to personalize user interaction.  For example, suppose your bot determines that the user is John. Your Lambda function might retrieve John's information from a backend database and prepopulate some of the values. For example, if you find that John is gluten intolerant, you might set the corresponding intent slot, GlutenIntolerant, to true. You might find John's phone number and set the corresponding session attribute. 
    */
  var dialogCodeHook: js.UndefOr[CodeHook] = js.undefined
  
  /**
    * Amazon Lex uses this prompt to solicit additional activity after fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the user to order a drink. The action that Amazon Lex takes depends on the user's response, as follows:   If the user says "Yes" it responds with the clarification prompt that is configured for the bot.   if the user says "Yes" and continues with an utterance that triggers an intent it starts a conversation for the intent.   If the user says "No" it responds with the rejection statement configured for the the follow-up prompt.   If it doesn't recognize the utterance it repeats the follow-up prompt again.   The followUpPrompt field and the conclusionStatement field are mutually exclusive. You can specify only one. 
    */
  var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined
  
  /**
    * Required. Describes how the intent is fulfilled. For example, after a user provides all of the information for a pizza order, fulfillmentActivity defines how the bot places an order with a local pizza store.   You might configure Amazon Lex to return all of the intent information to the client application, or direct it to invoke a Lambda function that can process the intent (for example, place an order with a pizzeria). 
    */
  var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined
  
  /**
    * An array of InputContext objects that lists the contexts that must be active for Amazon Lex to choose the intent in a conversation with the user.
    */
  var inputContexts: js.UndefOr[InputContextList] = js.undefined
  
  /**
    * Configuration information required to use the AMAZON.KendraSearchIntent intent to connect to an Amazon Kendra index. For more information, see  AMAZON.KendraSearchIntent.
    */
  var kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined
  
  /**
    * The name of the intent. The name is not case sensitive.  The name can't match a built-in intent name, or a built-in intent name with "AMAZON." removed. For example, because there is a built-in intent called AMAZON.HelpIntent, you can't create a custom intent called HelpIntent. For a list of built-in intents, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var name: IntentName
  
  /**
    * An array of OutputContext objects that lists the contexts that the intent activates when the intent is fulfilled.
    */
  var outputContexts: js.UndefOr[OutputContextList] = js.undefined
  
  /**
    * A unique identifier for the built-in intent to base this intent on. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined
  
  /**
    * When the user answers "no" to the question defined in confirmationPrompt, Amazon Lex responds with this statement to acknowledge that the intent was canceled.   You must provide both the rejectionStatement and the confirmationPrompt, or neither. 
    */
  var rejectionStatement: js.UndefOr[Statement] = js.undefined
  
  /**
    * An array of utterances (strings) that a user might say to signal the intent. For example, "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas".  In each utterance, a slot name is enclosed in curly braces. 
    */
  var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined
  
  /**
    * An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts defined in the slots. For more information, see how-it-works. 
    */
  var slots: js.UndefOr[SlotList] = js.undefined
}
object PutIntentRequest {
  
  inline def apply(name: IntentName): PutIntentRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutIntentRequest]
  }
  
  extension [Self <: PutIntentRequest](x: Self) {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setConclusionStatement(value: Statement): Self = StObject.set(x, "conclusionStatement", value.asInstanceOf[js.Any])
    
    inline def setConclusionStatementUndefined: Self = StObject.set(x, "conclusionStatement", js.undefined)
    
    inline def setConfirmationPrompt(value: Prompt): Self = StObject.set(x, "confirmationPrompt", value.asInstanceOf[js.Any])
    
    inline def setConfirmationPromptUndefined: Self = StObject.set(x, "confirmationPrompt", js.undefined)
    
    inline def setCreateVersion(value: Boolean): Self = StObject.set(x, "createVersion", value.asInstanceOf[js.Any])
    
    inline def setCreateVersionUndefined: Self = StObject.set(x, "createVersion", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDialogCodeHook(value: CodeHook): Self = StObject.set(x, "dialogCodeHook", value.asInstanceOf[js.Any])
    
    inline def setDialogCodeHookUndefined: Self = StObject.set(x, "dialogCodeHook", js.undefined)
    
    inline def setFollowUpPrompt(value: FollowUpPrompt): Self = StObject.set(x, "followUpPrompt", value.asInstanceOf[js.Any])
    
    inline def setFollowUpPromptUndefined: Self = StObject.set(x, "followUpPrompt", js.undefined)
    
    inline def setFulfillmentActivity(value: FulfillmentActivity): Self = StObject.set(x, "fulfillmentActivity", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentActivityUndefined: Self = StObject.set(x, "fulfillmentActivity", js.undefined)
    
    inline def setInputContexts(value: InputContextList): Self = StObject.set(x, "inputContexts", value.asInstanceOf[js.Any])
    
    inline def setInputContextsUndefined: Self = StObject.set(x, "inputContexts", js.undefined)
    
    inline def setInputContextsVarargs(value: InputContext*): Self = StObject.set(x, "inputContexts", js.Array(value :_*))
    
    inline def setKendraConfiguration(value: KendraConfiguration): Self = StObject.set(x, "kendraConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKendraConfigurationUndefined: Self = StObject.set(x, "kendraConfiguration", js.undefined)
    
    inline def setName(value: IntentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputContexts(value: OutputContextList): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: OutputContext*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
    inline def setParentIntentSignature(value: BuiltinIntentSignature): Self = StObject.set(x, "parentIntentSignature", value.asInstanceOf[js.Any])
    
    inline def setParentIntentSignatureUndefined: Self = StObject.set(x, "parentIntentSignature", js.undefined)
    
    inline def setRejectionStatement(value: Statement): Self = StObject.set(x, "rejectionStatement", value.asInstanceOf[js.Any])
    
    inline def setRejectionStatementUndefined: Self = StObject.set(x, "rejectionStatement", js.undefined)
    
    inline def setSampleUtterances(value: IntentUtteranceList): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    inline def setSampleUtterancesVarargs(value: Utterance*): Self = StObject.set(x, "sampleUtterances", js.Array(value :_*))
    
    inline def setSlots(value: SlotList): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setSlotsVarargs(value: Slot*): Self = StObject.set(x, "slots", js.Array(value :_*))
  }
}
