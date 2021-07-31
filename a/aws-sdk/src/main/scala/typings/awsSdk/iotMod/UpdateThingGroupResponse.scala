package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThingGroupResponse extends StObject {
  
  /**
    * The version of the updated thing group.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object UpdateThingGroupResponse {
  
  @scala.inline
  def apply(): UpdateThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThingGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateThingGroupResponseMutableBuilder[Self <: UpdateThingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
