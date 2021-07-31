package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDynamicThingGroupResponse extends StObject {
  
  /**
    * The dynamic thing group version.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object UpdateDynamicThingGroupResponse {
  
  @scala.inline
  def apply(): UpdateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDynamicThingGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateDynamicThingGroupResponseMutableBuilder[Self <: UpdateDynamicThingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
