package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the domain.
    */
  var DomainArn: js.UndefOr[typings.awsSdk.sagemakerMod.DomainArn] = js.native
}

object UpdateDomainResponse {
  @scala.inline
  def apply(): UpdateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainResponse]
  }
  @scala.inline
  implicit class UpdateDomainResponseOps[Self <: UpdateDomainResponse] (val x: Self) extends AnyVal {
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
    def setDomainArn(value: DomainArn): Self = this.set("DomainArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainArn: Self = this.set("DomainArn", js.undefined)
  }
  
}

