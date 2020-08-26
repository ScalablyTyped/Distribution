package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChallengeResponseType extends js.Object {
  /**
    * The challenge name
    */
  var ChallengeName: js.UndefOr[typings.awsSdk.cognitoidentityserviceproviderMod.ChallengeName] = js.native
  /**
    * The challenge response.
    */
  var ChallengeResponse: js.UndefOr[typings.awsSdk.cognitoidentityserviceproviderMod.ChallengeResponse] = js.native
}

object ChallengeResponseType {
  @scala.inline
  def apply(): ChallengeResponseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChallengeResponseType]
  }
  @scala.inline
  implicit class ChallengeResponseTypeOps[Self <: ChallengeResponseType] (val x: Self) extends AnyVal {
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
    def setChallengeName(value: ChallengeName): Self = this.set("ChallengeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallengeName: Self = this.set("ChallengeName", js.undefined)
    @scala.inline
    def setChallengeResponse(value: ChallengeResponse): Self = this.set("ChallengeResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallengeResponse: Self = this.set("ChallengeResponse", js.undefined)
  }
  
}

