package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrincipalIdFormat extends js.Object {
  /**
    * PrincipalIdFormatARN description
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * PrincipalIdFormatStatuses description
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
}

object PrincipalIdFormat {
  @scala.inline
  def apply(): PrincipalIdFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalIdFormat]
  }
  @scala.inline
  implicit class PrincipalIdFormatOps[Self <: PrincipalIdFormat] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setStatusesVarargs(value: IdFormat*): Self = this.set("Statuses", js.Array(value :_*))
    @scala.inline
    def setStatuses(value: IdFormatList): Self = this.set("Statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatuses: Self = this.set("Statuses", js.undefined)
  }
  
}

