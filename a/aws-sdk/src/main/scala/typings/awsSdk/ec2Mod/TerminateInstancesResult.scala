package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateInstancesResult extends StObject {
  
  /**
    * Information about the terminated instances.
    */
  var TerminatingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
}
object TerminateInstancesResult {
  
  @scala.inline
  def apply(): TerminateInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateInstancesResult]
  }
  
  @scala.inline
  implicit class TerminateInstancesResultMutableBuilder[Self <: TerminateInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTerminatingInstances(value: InstanceStateChangeList): Self = StObject.set(x, "TerminatingInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminatingInstancesUndefined: Self = StObject.set(x, "TerminatingInstances", js.undefined)
    
    @scala.inline
    def setTerminatingInstancesVarargs(value: InstanceStateChange*): Self = StObject.set(x, "TerminatingInstances", js.Array(value :_*))
  }
}
