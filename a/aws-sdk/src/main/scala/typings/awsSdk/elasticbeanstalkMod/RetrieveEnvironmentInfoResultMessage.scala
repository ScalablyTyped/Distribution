package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveEnvironmentInfoResultMessage extends js.Object {
  /**
    *  The EnvironmentInfoDescription of the environment. 
    */
  var EnvironmentInfo: js.UndefOr[EnvironmentInfoDescriptionList] = js.native
}

object RetrieveEnvironmentInfoResultMessage {
  @scala.inline
  def apply(): RetrieveEnvironmentInfoResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveEnvironmentInfoResultMessage]
  }
  @scala.inline
  implicit class RetrieveEnvironmentInfoResultMessageOps[Self <: RetrieveEnvironmentInfoResultMessage] (val x: Self) extends AnyVal {
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
    def setEnvironmentInfoVarargs(value: EnvironmentInfoDescription*): Self = this.set("EnvironmentInfo", js.Array(value :_*))
    @scala.inline
    def setEnvironmentInfo(value: EnvironmentInfoDescriptionList): Self = this.set("EnvironmentInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentInfo: Self = this.set("EnvironmentInfo", js.undefined)
  }
  
}

