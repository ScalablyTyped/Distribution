package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UplinkEchoConfig extends js.Object {
  
  /**
    * ARN of an uplink Config.
    */
  var antennaUplinkConfigArn: ConfigArn = js.native
  
  /**
    * Whether or not an uplink Config is enabled.
    */
  var enabled: Boolean = js.native
}
object UplinkEchoConfig {
  
  @scala.inline
  def apply(antennaUplinkConfigArn: ConfigArn, enabled: Boolean): UplinkEchoConfig = {
    val __obj = js.Dynamic.literal(antennaUplinkConfigArn = antennaUplinkConfigArn.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UplinkEchoConfig]
  }
  
  @scala.inline
  implicit class UplinkEchoConfigOps[Self <: UplinkEchoConfig] (val x: Self) extends AnyVal {
    
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
    def setAntennaUplinkConfigArn(value: ConfigArn): Self = this.set("antennaUplinkConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
}
