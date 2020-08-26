package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableEbsEncryptionByDefaultResult extends js.Object {
  /**
    * The updated status of encryption by default.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.native
}

object EnableEbsEncryptionByDefaultResult {
  @scala.inline
  def apply(): EnableEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableEbsEncryptionByDefaultResult]
  }
  @scala.inline
  implicit class EnableEbsEncryptionByDefaultResultOps[Self <: EnableEbsEncryptionByDefaultResult] (val x: Self) extends AnyVal {
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
    def setEbsEncryptionByDefault(value: Boolean): Self = this.set("EbsEncryptionByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsEncryptionByDefault: Self = this.set("EbsEncryptionByDefault", js.undefined)
  }
  
}

