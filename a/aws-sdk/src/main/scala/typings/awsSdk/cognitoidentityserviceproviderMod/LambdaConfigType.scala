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
  def apply(): LambdaConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaConfigType]
  }
  @scala.inline
  implicit class LambdaConfigTypeOps[Self <: LambdaConfigType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateAuthChallenge(value: ArnType): Self = this.set("CreateAuthChallenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateAuthChallenge: Self = this.set("CreateAuthChallenge", js.undefined)
    @scala.inline
    def setCustomMessage(value: ArnType): Self = this.set("CustomMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMessage: Self = this.set("CustomMessage", js.undefined)
    @scala.inline
    def setDefineAuthChallenge(value: ArnType): Self = this.set("DefineAuthChallenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefineAuthChallenge: Self = this.set("DefineAuthChallenge", js.undefined)
    @scala.inline
    def setPostAuthentication(value: ArnType): Self = this.set("PostAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostAuthentication: Self = this.set("PostAuthentication", js.undefined)
    @scala.inline
    def setPostConfirmation(value: ArnType): Self = this.set("PostConfirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostConfirmation: Self = this.set("PostConfirmation", js.undefined)
    @scala.inline
    def setPreAuthentication(value: ArnType): Self = this.set("PreAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreAuthentication: Self = this.set("PreAuthentication", js.undefined)
    @scala.inline
    def setPreSignUp(value: ArnType): Self = this.set("PreSignUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreSignUp: Self = this.set("PreSignUp", js.undefined)
    @scala.inline
    def setPreTokenGeneration(value: ArnType): Self = this.set("PreTokenGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreTokenGeneration: Self = this.set("PreTokenGeneration", js.undefined)
    @scala.inline
    def setUserMigration(value: ArnType): Self = this.set("UserMigration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMigration: Self = this.set("UserMigration", js.undefined)
    @scala.inline
    def setVerifyAuthChallengeResponse(value: ArnType): Self = this.set("VerifyAuthChallengeResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyAuthChallengeResponse: Self = this.set("VerifyAuthChallengeResponse", js.undefined)
  }
  
}

