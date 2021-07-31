package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeResponseType extends StObject {
  
  /**
    * The challenge name
    */
  var ChallengeName: js.UndefOr[typings.awsSdk.cognitoidentityserviceproviderMod.ChallengeName] = js.undefined
  
  /**
    * The challenge response.
    */
  var ChallengeResponse: js.UndefOr[typings.awsSdk.cognitoidentityserviceproviderMod.ChallengeResponse] = js.undefined
}
object ChallengeResponseType {
  
  @scala.inline
  def apply(): ChallengeResponseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChallengeResponseType]
  }
  
  @scala.inline
  implicit class ChallengeResponseTypeMutableBuilder[Self <: ChallengeResponseType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallengeName(value: ChallengeName): Self = StObject.set(x, "ChallengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeNameUndefined: Self = StObject.set(x, "ChallengeName", js.undefined)
    
    @scala.inline
    def setChallengeResponse(value: ChallengeResponse): Self = StObject.set(x, "ChallengeResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeResponseUndefined: Self = StObject.set(x, "ChallengeResponse", js.undefined)
  }
}
