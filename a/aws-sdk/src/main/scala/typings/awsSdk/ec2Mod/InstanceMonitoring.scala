package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMonitoring extends StObject {
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[typings.awsSdk.ec2Mod.Monitoring] = js.undefined
}
object InstanceMonitoring {
  
  @scala.inline
  def apply(): InstanceMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMonitoring]
  }
  
  @scala.inline
  implicit class InstanceMonitoringMutableBuilder[Self <: InstanceMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setMonitoring(value: Monitoring): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
  }
}
