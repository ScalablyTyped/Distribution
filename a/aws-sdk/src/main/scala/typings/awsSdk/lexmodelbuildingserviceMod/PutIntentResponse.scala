package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutIntentResponse extends js.Object {
  /**
    * Checksum of the $LATESTversion of the intent created or updated.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * After the Lambda function specified in thefulfillmentActivityintent fulfills the intent, Amazon Lex conveys this statement to the user.
    */
  var conclusionStatement: js.UndefOr[Statement] = js.native
  /**
    * If defined in the intent, Amazon Lex prompts the user to confirm the intent before fulfilling it.
    */
  var confirmationPrompt: js.UndefOr[Prompt] = js.native
  /**
    *  True if a new version of the intent was created. If the createVersion field was not specified in the request, the createVersion field is set to false in the response.
    */
  var createVersion: js.UndefOr[Boolean] = js.native
  /**
    * The date that the intent was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * If defined in the intent, Amazon Lex invokes this Lambda function for each user input.
    */
  var dialogCodeHook: js.UndefOr[CodeHook] = js.native
  /**
    * If defined in the intent, Amazon Lex uses this prompt to solicit additional user activity after the intent is fulfilled.
    */
  var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.native
  /**
    * If defined in the intent, Amazon Lex invokes this Lambda function to fulfill the intent after the user provides all of the information required by the intent.
    */
  var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.native
  /**
    * Configuration information, if any, required to connect to an Amazon Kendra index and use the AMAZON.KendraSearchIntent intent.
    */
  var kendraConfiguration: js.UndefOr[KendraConfiguration] = js.native
  /**
    * The date that the intent was updated. When you create a resource, the creation date and last update dates are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the intent.
    */
  var name: js.UndefOr[IntentName] = js.native
  /**
    * A unique identifier for the built-in intent that this intent is based on.
    */
  var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.native
  /**
    * If the user answers "no" to the question defined in confirmationPrompt Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
    */
  var rejectionStatement: js.UndefOr[Statement] = js.native
  /**
    *  An array of sample utterances that are configured for the intent. 
    */
  var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.native
  /**
    * An array of intent slots that are configured for the intent.
    */
  var slots: js.UndefOr[SlotList] = js.native
  /**
    * The version of the intent. For a new intent, the version is always $LATEST.
    */
  var version: js.UndefOr[Version] = js.native
}

object PutIntentResponse {
  @scala.inline
  def apply(
    checksum: String = null,
    conclusionStatement: Statement = null,
    confirmationPrompt: Prompt = null,
    createVersion: js.UndefOr[Boolean] = js.undefined,
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
  ): PutIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (conclusionStatement != null) __obj.updateDynamic("conclusionStatement")(conclusionStatement.asInstanceOf[js.Any])
    if (confirmationPrompt != null) __obj.updateDynamic("confirmationPrompt")(confirmationPrompt.asInstanceOf[js.Any])
    if (!js.isUndefined(createVersion)) __obj.updateDynamic("createVersion")(createVersion.get.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[PutIntentResponse]
  }
}

