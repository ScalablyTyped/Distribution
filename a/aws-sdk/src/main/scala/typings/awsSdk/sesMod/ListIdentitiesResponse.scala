package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentitiesResponse extends js.Object {
  /**
    * A list of identities.
    */
  var Identities: IdentityList = js.native
  /**
    * The token used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.native
}

object ListIdentitiesResponse {
  @scala.inline
  def apply(Identities: IdentityList): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
  @scala.inline
  implicit class ListIdentitiesResponseOps[Self <: ListIdentitiesResponse] (val x: Self) extends AnyVal {
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
    def setIdentitiesVarargs(value: Identity*): Self = this.set("Identities", js.Array(value :_*))
    @scala.inline
    def setIdentities(value: IdentityList): Self = this.set("Identities", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

