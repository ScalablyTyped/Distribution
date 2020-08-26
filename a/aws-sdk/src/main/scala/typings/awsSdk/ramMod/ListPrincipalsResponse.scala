package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPrincipalsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The principals.
    */
  var principals: js.UndefOr[PrincipalList] = js.native
}

object ListPrincipalsResponse {
  @scala.inline
  def apply(): ListPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPrincipalsResponse]
  }
  @scala.inline
  implicit class ListPrincipalsResponseOps[Self <: ListPrincipalsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setPrincipalsVarargs(value: Principal*): Self = this.set("principals", js.Array(value :_*))
    @scala.inline
    def setPrincipals(value: PrincipalList): Self = this.set("principals", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipals: Self = this.set("principals", js.undefined)
  }
  
}

