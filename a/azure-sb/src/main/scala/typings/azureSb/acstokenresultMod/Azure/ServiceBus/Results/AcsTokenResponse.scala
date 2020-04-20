package typings.azureSb.acstokenresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string | Dictionary<string>> * / any */ trait AcsTokenResponse extends js.Object {
  var WrapAccessToken: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
  var WrapAccessTokenExpiresIn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
}

object AcsTokenResponse {
  @scala.inline
  def apply(
    WrapAccessToken: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any,
    WrapAccessTokenExpiresIn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
  ): AcsTokenResponse = {
    val __obj = js.Dynamic.literal(WrapAccessToken = WrapAccessToken.asInstanceOf[js.Any], WrapAccessTokenExpiresIn = WrapAccessTokenExpiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcsTokenResponse]
  }
}

