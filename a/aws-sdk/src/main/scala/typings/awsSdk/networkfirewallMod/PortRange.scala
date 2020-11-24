package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortRange extends js.Object {
  
  /**
    * The lower limit of the port range. This must be less than or equal to the ToPort specification. 
    */
  var FromPort: PortRangeBound = js.native
  
  /**
    * The upper limit of the port range. This must be greater than or equal to the FromPort specification. 
    */
  var ToPort: PortRangeBound = js.native
}
object PortRange {
  
  @scala.inline
  def apply(FromPort: PortRangeBound, ToPort: PortRangeBound): PortRange = {
    val __obj = js.Dynamic.literal(FromPort = FromPort.asInstanceOf[js.Any], ToPort = ToPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
  
  @scala.inline
  implicit class PortRangeOps[Self <: PortRange] (val x: Self) extends AnyVal {
    
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
    def setFromPort(value: PortRangeBound): Self = this.set("FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPort(value: PortRangeBound): Self = this.set("ToPort", value.asInstanceOf[js.Any])
  }
}
