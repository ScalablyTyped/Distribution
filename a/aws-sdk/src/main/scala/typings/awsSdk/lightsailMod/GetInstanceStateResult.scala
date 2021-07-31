package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceStateResult extends StObject {
  
  /**
    * The state of the instance.
    */
  var state: js.UndefOr[InstanceState] = js.undefined
}
object GetInstanceStateResult {
  
  @scala.inline
  def apply(): GetInstanceStateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceStateResult]
  }
  
  @scala.inline
  implicit class GetInstanceStateResultMutableBuilder[Self <: GetInstanceStateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: InstanceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
