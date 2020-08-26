package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsConfiguration extends js.Object {
  /**
    * An array of Amazon EBS volume specifications attached to a cluster instance.
    */
  var EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList] = js.native
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.native
}

object EbsConfiguration {
  @scala.inline
  def apply(): EbsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsConfiguration]
  }
  @scala.inline
  implicit class EbsConfigurationOps[Self <: EbsConfiguration] (val x: Self) extends AnyVal {
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
    def setEbsBlockDeviceConfigsVarargs(value: EbsBlockDeviceConfig*): Self = this.set("EbsBlockDeviceConfigs", js.Array(value :_*))
    @scala.inline
    def setEbsBlockDeviceConfigs(value: EbsBlockDeviceConfigList): Self = this.set("EbsBlockDeviceConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsBlockDeviceConfigs: Self = this.set("EbsBlockDeviceConfigs", js.undefined)
    @scala.inline
    def setEbsOptimized(value: BooleanObject): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
  }
  
}

