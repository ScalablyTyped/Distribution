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
  def apply(): PutIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutIntentResponse]
  }
  @scala.inline
  implicit class PutIntentResponseOps[Self <: PutIntentResponse] (val x: Self) extends AnyVal {
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
    def setCreateVersion(value: Boolean): Self = this.set("createVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateVersion: Self = this.set("createVersion", js.undefined)
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

