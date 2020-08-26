package typings.azureSb.acstokenresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string | Dictionary<string>> * / any */ @js.native
trait AcsTokenResponse extends js.Object {
  var WrapAccessToken: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any = js.native
  var WrapAccessTokenExpiresIn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any = js.native
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
  @scala.inline
  implicit class AcsTokenResponseOps[Self <: AcsTokenResponse] (val x: Self) extends AnyVal {
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
    def setWrapAccessToken(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
    ): Self = this.set("WrapAccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapAccessTokenExpiresIn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
    ): Self = this.set("WrapAccessTokenExpiresIn", value.asInstanceOf[js.Any])
  }
  
}

