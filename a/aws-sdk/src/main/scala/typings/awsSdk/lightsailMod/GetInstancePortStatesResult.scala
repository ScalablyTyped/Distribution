package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstancePortStatesResult extends StObject {
  
  /**
    * An array of objects that describe the firewall port states for the specified instance.
    */
  var portStates: js.UndefOr[InstancePortStateList] = js.undefined
}
object GetInstancePortStatesResult {
  
  @scala.inline
  def apply(): GetInstancePortStatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstancePortStatesResult]
  }
  
  @scala.inline
  implicit class GetInstancePortStatesResultMutableBuilder[Self <: GetInstancePortStatesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortStates(value: InstancePortStateList): Self = StObject.set(x, "portStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortStatesUndefined: Self = StObject.set(x, "portStates", js.undefined)
    
    @scala.inline
    def setPortStatesVarargs(value: InstancePortState*): Self = StObject.set(x, "portStates", js.Array(value :_*))
  }
}
