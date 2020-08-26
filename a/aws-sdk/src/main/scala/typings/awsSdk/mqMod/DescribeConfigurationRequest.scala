package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: string = js.native
}

object DescribeConfigurationRequest {
  @scala.inline
  def apply(ConfigurationId: string): DescribeConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRequest]
  }
  @scala.inline
  implicit class DescribeConfigurationRequestOps[Self <: DescribeConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setConfigurationId(value: string): Self = this.set("ConfigurationId", value.asInstanceOf[js.Any])
  }
  
}

