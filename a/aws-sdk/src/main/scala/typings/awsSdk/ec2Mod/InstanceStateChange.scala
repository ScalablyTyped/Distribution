package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceStateChange extends StObject {
  
  /**
    * The current state of the instance.
    */
  var CurrentState: js.UndefOr[InstanceState] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The previous state of the instance.
    */
  var PreviousState: js.UndefOr[InstanceState] = js.undefined
}
object InstanceStateChange {
  
  @scala.inline
  def apply(): InstanceStateChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStateChange]
  }
  
  @scala.inline
  implicit class InstanceStateChangeMutableBuilder[Self <: InstanceStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentState(value: InstanceState): Self = StObject.set(x, "CurrentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStateUndefined: Self = StObject.set(x, "CurrentState", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setPreviousState(value: InstanceState): Self = StObject.set(x, "PreviousState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousStateUndefined: Self = StObject.set(x, "PreviousState", js.undefined)
  }
}
