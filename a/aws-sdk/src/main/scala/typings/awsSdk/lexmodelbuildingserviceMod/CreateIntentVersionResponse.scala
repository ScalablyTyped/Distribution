package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIntentVersionResponse extends js.Object {
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
    * Configuration information, if any, for connectin an Amazon Kendra index with the AMAZON.KendraSearchIntent intent.
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
  def apply(
    checksum: String = null,
    conclusionStatement: Statement = null,
    confirmationPrompt: Prompt = null,
    createdDate: Timestamp = null,
    description: Description = null,
    dialogCodeHook: CodeHook = null,
    followUpPrompt: FollowUpPrompt = null,
    fulfillmentActivity: FulfillmentActivity = null,
    kendraConfiguration: KendraConfiguration = null,
    lastUpdatedDate: Timestamp = null,
    name: IntentName = null,
    parentIntentSignature: BuiltinIntentSignature = null,
    rejectionStatement: Statement = null,
    sampleUtterances: IntentUtteranceList = null,
    slots: SlotList = null,
    version: Version = null
  ): CreateIntentVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (conclusionStatement != null) __obj.updateDynamic("conclusionStatement")(conclusionStatement.asInstanceOf[js.Any])
    if (confirmationPrompt != null) __obj.updateDynamic("confirmationPrompt")(confirmationPrompt.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dialogCodeHook != null) __obj.updateDynamic("dialogCodeHook")(dialogCodeHook.asInstanceOf[js.Any])
    if (followUpPrompt != null) __obj.updateDynamic("followUpPrompt")(followUpPrompt.asInstanceOf[js.Any])
    if (fulfillmentActivity != null) __obj.updateDynamic("fulfillmentActivity")(fulfillmentActivity.asInstanceOf[js.Any])
    if (kendraConfiguration != null) __obj.updateDynamic("kendraConfiguration")(kendraConfiguration.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentIntentSignature != null) __obj.updateDynamic("parentIntentSignature")(parentIntentSignature.asInstanceOf[js.Any])
    if (rejectionStatement != null) __obj.updateDynamic("rejectionStatement")(rejectionStatement.asInstanceOf[js.Any])
    if (sampleUtterances != null) __obj.updateDynamic("sampleUtterances")(sampleUtterances.asInstanceOf[js.Any])
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntentVersionResponse]
  }
}

