package typings.awsSdkRoute53IdNormalizerMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifierBearer extends js.Object {
  var DelegationSetId: js.UndefOr[String] = js.native
  var HostedZoneId: js.UndefOr[String] = js.native
  var Id: js.UndefOr[String] = js.native
}

object IdentifierBearer {
  @scala.inline
  def apply(): IdentifierBearer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifierBearer]
  }
  @scala.inline
  implicit class IdentifierBearerOps[Self <: IdentifierBearer] (val x: Self) extends AnyVal {
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
    def setDelegationSetId(value: String): Self = this.set("DelegationSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegationSetId: Self = this.set("DelegationSetId", js.undefined)
    @scala.inline
    def setHostedZoneId(value: String): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedZoneId: Self = this.set("HostedZoneId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

