package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsVpcPeeredResult extends js.Object {
  /**
    * Returns true if the Lightsail VPC is peered; otherwise, false.
    */
  var isPeered: js.UndefOr[Boolean] = js.native
}

object IsVpcPeeredResult {
  @scala.inline
  def apply(): IsVpcPeeredResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsVpcPeeredResult]
  }
  @scala.inline
  implicit class IsVpcPeeredResultOps[Self <: IsVpcPeeredResult] (val x: Self) extends AnyVal {
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
    def setIsPeered(value: Boolean): Self = this.set("isPeered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPeered: Self = this.set("isPeered", js.undefined)
  }
  
}

