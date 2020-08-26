package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestartAppServerMessage extends js.Object {
  /**
    * The ID of the environment to restart the server for.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * The name of the environment to restart the server for.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
}

object RestartAppServerMessage {
  @scala.inline
  def apply(): RestartAppServerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestartAppServerMessage]
  }
  @scala.inline
  implicit class RestartAppServerMessageOps[Self <: RestartAppServerMessage] (val x: Self) extends AnyVal {
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
    def setEnvironmentId(value: EnvironmentId): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentId: Self = this.set("EnvironmentId", js.undefined)
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
  }
  
}

