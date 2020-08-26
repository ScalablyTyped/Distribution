package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionLogResponseOptions extends js.Object {
  /**
    * The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.native
  /**
    * Indicates whether client connection logging is enabled for the Client VPN endpoint.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object ConnectionLogResponseOptions {
  @scala.inline
  def apply(): ConnectionLogResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionLogResponseOptions]
  }
  @scala.inline
  implicit class ConnectionLogResponseOptionsOps[Self <: ConnectionLogResponseOptions] (val x: Self) extends AnyVal {
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

