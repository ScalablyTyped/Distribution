package typings.azureDashSb.libModelsAcstokenresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dictionary<string | Dictionary<string>> * / any */ trait AcsTokenResponse extends js.Object {
  var WrapAccessToken: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
  var WrapAccessTokenExpiresIn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
}

object AcsTokenResponse {
  @scala.inline
  def apply(
    WrapAccessToken: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any,
    WrapAccessTokenExpiresIn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
  ): AcsTokenResponse = {
    val __obj = js.Dynamic.literal(WrapAccessToken = WrapAccessToken, WrapAccessTokenExpiresIn = WrapAccessTokenExpiresIn)
  
    __obj.asInstanceOf[AcsTokenResponse]
  }
}

