package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartInstancesResult extends StObject {
  
  /**
    * Information about the started instances.
    */
  var StartingInstances: js.UndefOr[InstanceStateChangeList] = js.native
}
object StartInstancesResult {
  
  @scala.inline
  def apply(): StartInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartInstancesResult]
  }
  
  @scala.inline
  implicit class StartInstancesResultMutableBuilder[Self <: StartInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartingInstances(value: InstanceStateChangeList): Self = StObject.set(x, "StartingInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingInstancesUndefined: Self = StObject.set(x, "StartingInstances", js.undefined)
    
    @scala.inline
    def setStartingInstancesVarargs(value: InstanceStateChange*): Self = StObject.set(x, "StartingInstances", js.Array(value :_*))
  }
}
