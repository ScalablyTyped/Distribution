package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaConfigType extends js.Object {
  /**
    * Creates an authentication challenge.
    */
  var CreateAuthChallenge: js.UndefOr[ArnType] = js.native
  /**
    * A custom Message AWS Lambda trigger.
    */
  var CustomMessage: js.UndefOr[ArnType] = js.native
  /**
    * Defines the authentication challenge.
    */
  var DefineAuthChallenge: js.UndefOr[ArnType] = js.native
  /**
    * A post-authentication AWS Lambda trigger.
    */
  var PostAuthentication: js.UndefOr[ArnType] = js.native
  /**
    * A post-confirmation AWS Lambda trigger.
    */
  var PostConfirmation: js.UndefOr[ArnType] = js.native
  /**
    * A pre-authentication AWS Lambda trigger.
    */
  var PreAuthentication: js.UndefOr[ArnType] = js.native
  /**
    * A pre-registration AWS Lambda trigger.
    */
  var PreSignUp: js.UndefOr[ArnType] = js.native
  /**
    * A Lambda trigger that is invoked before token generation.
    */
  var PreTokenGeneration: js.UndefOr[ArnType] = js.native
  /**
    * The user migration Lambda config type.
    */
  var UserMigration: js.UndefOr[ArnType] = js.native
  /**
    * Verifies the authentication challenge response.
    */
  var VerifyAuthChallengeResponse: js.UndefOr[ArnType] = js.native
}

object LambdaConfigType {
  @scala.inline
  def apply(
    CreateAuthChallenge: ArnType = null,
    CustomMessage: ArnType = null,
    DefineAuthChallenge: ArnType = null,
    PostAuthentication: ArnType = null,
    PostConfirmation: ArnType = null,
    PreAuthentication: ArnType = null,
    PreSignUp: ArnType = null,
    PreTokenGeneration: ArnType = null,
    UserMigration: ArnType = null,
    VerifyAuthChallengeResponse: ArnType = null
  ): LambdaConfigType = {
    val __obj = js.Dynamic.literal()
    if (CreateAuthChallenge != null) __obj.updateDynamic("CreateAuthChallenge")(CreateAuthChallenge.asInstanceOf[js.Any])
    if (CustomMessage != null) __obj.updateDynamic("CustomMessage")(CustomMessage.asInstanceOf[js.Any])
    if (DefineAuthChallenge != null) __obj.updateDynamic("DefineAuthChallenge")(DefineAuthChallenge.asInstanceOf[js.Any])
    if (PostAuthentication != null) __obj.updateDynamic("PostAuthentication")(PostAuthentication.asInstanceOf[js.Any])
    if (PostConfirmation != null) __obj.updateDynamic("PostConfirmation")(PostConfirmation.asInstanceOf[js.Any])
    if (PreAuthentication != null) __obj.updateDynamic("PreAuthentication")(PreAuthentication.asInstanceOf[js.Any])
    if (PreSignUp != null) __obj.updateDynamic("PreSignUp")(PreSignUp.asInstanceOf[js.Any])
    if (PreTokenGeneration != null) __obj.updateDynamic("PreTokenGeneration")(PreTokenGeneration.asInstanceOf[js.Any])
    if (UserMigration != null) __obj.updateDynamic("UserMigration")(UserMigration.asInstanceOf[js.Any])
    if (VerifyAuthChallengeResponse != null) __obj.updateDynamic("VerifyAuthChallengeResponse")(VerifyAuthChallengeResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaConfigType]
  }
}

