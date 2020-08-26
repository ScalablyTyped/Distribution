package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionLogOptions extends js.Object {
  /**
    * The name of the CloudWatch Logs log group. Required if connection logging is enabled.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.native
  /**
    * The name of the CloudWatch Logs log stream to which the connection data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.native
  /**
    * Indicates whether connection logging is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object ConnectionLogOptions {
  @scala.inline
  def apply(): ConnectionLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionLogOptions]
  }
  @scala.inline
  implicit class ConnectionLogOptionsOps[Self <: ConnectionLogOptions] (val x: Self) extends AnyVal {
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
    def setCloudwatchLogGroup(value: String): Self = this.set("CloudwatchLogGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchLogGroup: Self = this.set("CloudwatchLogGroup", js.undefined)
    @scala.inline
    def setCloudwatchLogStream(value: String): Self = this.set("CloudwatchLogStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchLogStream: Self = this.set("CloudwatchLogStream", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
  
}

