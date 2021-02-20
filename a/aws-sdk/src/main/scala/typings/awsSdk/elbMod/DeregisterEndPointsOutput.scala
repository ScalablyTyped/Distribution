package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterEndPointsOutput extends StObject {
  
  /**
    * The remaining instances registered with the load balancer.
    */
  var Instances: js.UndefOr[typings.awsSdk.elbMod.Instances] = js.native
}
object DeregisterEndPointsOutput {
  
  @scala.inline
  def apply(): DeregisterEndPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterEndPointsOutput]
  }
  
  @scala.inline
  implicit class DeregisterEndPointsOutputMutableBuilder[Self <: DeregisterEndPointsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
  }
}
