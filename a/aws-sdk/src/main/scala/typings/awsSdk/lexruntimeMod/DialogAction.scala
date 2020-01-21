package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogAction extends js.Object {
  /**
    * The fulfillment state of the intent. The possible values are:    Failed - The Lambda function associated with the intent failed to fulfill the intent.    Fulfilled - The intent has fulfilled by the Lambda function associated with the intent.     ReadyForFulfillment - All of the information necessary for the intent is present and the intent ready to be fulfilled by the client application.  
    */
  var fulfillmentState: js.UndefOr[FulfillmentState] = js.native
  /**
    * The name of the intent.
    */
  var intentName: js.UndefOr[IntentName] = js.native
  /**
    * The message that should be shown to the user. If you don't specify a message, Amazon Lex will use the message configured for the intent.
    */
  var message: js.UndefOr[Text] = js.native
  /**
    *    PlainText - The message contains plain UTF-8 text.    CustomPayload - The message is a custom format for the client.    SSML - The message contains text formatted for voice output.    Composite - The message contains an escaped JSON object containing one or more messages. For more information, see Message Groups.   
    */
  var messageFormat: js.UndefOr[MessageFormatType] = js.native
  /**
    * The name of the slot that should be elicited from the user.
    */
  var slotToElicit: js.UndefOr[String] = js.native
  /**
    * Map of the slots that have been gathered and their values. 
    */
  var slots: js.UndefOr[StringMap] = js.native
  /**
    * The next action that the bot should take in its interaction with the user. The possible values are:    ConfirmIntent - The next action is asking the user if the intent is complete and ready to be fulfilled. This is a yes/no question such as "Place the order?"    Close - Indicates that the there will not be a response from the user. For example, the statement "Your order has been placed" does not require a response.    Delegate - The next action is determined by Amazon Lex.    ElicitIntent - The next action is to determine the intent that the user wants to fulfill.    ElicitSlot - The next action is to elicit a slot value from the user.  
    */
  var `type`: DialogActionType = js.native
}

object DialogAction {
  @scala.inline
  def apply(
    `type`: DialogActionType,
    fulfillmentState: FulfillmentState = null,
    intentName: IntentName = null,
    message: Text = null,
    messageFormat: MessageFormatType = null,
    slotToElicit: String = null,
    slots: StringMap = null
  ): DialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fulfillmentState != null) __obj.updateDynamic("fulfillmentState")(fulfillmentState.asInstanceOf[js.Any])
    if (intentName != null) __obj.updateDynamic("intentName")(intentName.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (messageFormat != null) __obj.updateDynamic("messageFormat")(messageFormat.asInstanceOf[js.Any])
    if (slotToElicit != null) __obj.updateDynamic("slotToElicit")(slotToElicit.asInstanceOf[js.Any])
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAction]
  }
}

