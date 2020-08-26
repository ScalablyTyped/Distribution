package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationMessage extends js.Object {
  /**
    * The name of the application to delete.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * When set to true, running environments will be terminated before deleting the application.
    */
  var TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.native
}

object DeleteApplicationMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName): DeleteApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationMessage]
  }
  @scala.inline
  implicit class DeleteApplicationMessageOps[Self <: DeleteApplicationMessage] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerminateEnvByForce(value: TerminateEnvForce): Self = this.set("TerminateEnvByForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminateEnvByForce: Self = this.set("TerminateEnvByForce", js.undefined)
  }
  
}

