package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpFilter extends js.Object {
  /**
    * A finding's CIDR value.
    */
  var Cidr: js.UndefOr[NonEmptyString] = js.native
}

object IpFilter {
  @scala.inline
  def apply(): IpFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpFilter]
  }
  @scala.inline
  implicit class IpFilterOps[Self <: IpFilter] (val x: Self) extends AnyVal {
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
    def setCidr(value: NonEmptyString): Self = this.set("Cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidr: Self = this.set("Cidr", js.undefined)
  }
  
}

