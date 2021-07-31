package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterEndPointsOutput extends StObject {
  
  /**
    * The updated list of instances for the load balancer.
    */
  var Instances: js.UndefOr[typings.awsSdk.elbMod.Instances] = js.undefined
}
object RegisterEndPointsOutput {
  
  @scala.inline
  def apply(): RegisterEndPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterEndPointsOutput]
  }
  
  @scala.inline
  implicit class RegisterEndPointsOutputMutableBuilder[Self <: RegisterEndPointsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
  }
}
