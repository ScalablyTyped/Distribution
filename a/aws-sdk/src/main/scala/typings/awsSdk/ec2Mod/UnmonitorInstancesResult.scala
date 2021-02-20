package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmonitorInstancesResult extends StObject {
  
  /**
    * The monitoring information.
    */
  var InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.native
}
object UnmonitorInstancesResult {
  
  @scala.inline
  def apply(): UnmonitorInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmonitorInstancesResult]
  }
  
  @scala.inline
  implicit class UnmonitorInstancesResultMutableBuilder[Self <: UnmonitorInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceMonitorings(value: InstanceMonitoringList): Self = StObject.set(x, "InstanceMonitorings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceMonitoringsUndefined: Self = StObject.set(x, "InstanceMonitorings", js.undefined)
    
    @scala.inline
    def setInstanceMonitoringsVarargs(value: InstanceMonitoring*): Self = StObject.set(x, "InstanceMonitorings", js.Array(value :_*))
  }
}
