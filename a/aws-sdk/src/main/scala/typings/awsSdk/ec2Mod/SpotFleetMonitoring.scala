package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetMonitoring extends js.Object {
  
  /**
    * Enables monitoring for the instance. Default: false 
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object SpotFleetMonitoring {
  
  @scala.inline
  def apply(): SpotFleetMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetMonitoring]
  }
  
  @scala.inline
  implicit class SpotFleetMonitoringOps[Self <: SpotFleetMonitoring] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
}
