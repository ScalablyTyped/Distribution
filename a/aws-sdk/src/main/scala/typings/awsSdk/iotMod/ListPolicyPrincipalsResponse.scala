package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPolicyPrincipalsResponse extends js.Object {
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The descriptions of the principals.
    */
  var principals: js.UndefOr[Principals] = js.native
}

object ListPolicyPrincipalsResponse {
  @scala.inline
  def apply(): ListPolicyPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyPrincipalsResponse]
  }
  @scala.inline
  implicit class ListPolicyPrincipalsResponseOps[Self <: ListPolicyPrincipalsResponse] (val x: Self) extends AnyVal {
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
    def setNextMarker(value: Marker): Self = this.set("nextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("nextMarker", js.undefined)
    @scala.inline
    def setPrincipalsVarargs(value: PrincipalArn*): Self = this.set("principals", js.Array(value :_*))
    @scala.inline
    def setPrincipals(value: Principals): Self = this.set("principals", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipals: Self = this.set("principals", js.undefined)
  }
  
}

