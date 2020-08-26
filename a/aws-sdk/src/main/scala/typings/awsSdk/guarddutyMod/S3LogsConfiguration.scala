package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3LogsConfiguration extends js.Object {
  /**
    *  The status of S3 data event logs as a data source.
    */
  var Enable: Boolean = js.native
}

object S3LogsConfiguration {
  @scala.inline
  def apply(Enable: Boolean): S3LogsConfiguration = {
    val __obj = js.Dynamic.literal(Enable = Enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LogsConfiguration]
  }
  @scala.inline
  implicit class S3LogsConfigurationOps[Self <: S3LogsConfiguration] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("Enable", value.asInstanceOf[js.Any])
  }
  
}

