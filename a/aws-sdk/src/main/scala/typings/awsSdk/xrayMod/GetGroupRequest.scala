package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupRequest extends StObject {
  
  /**
    * The ARN of the group that was generated on creation.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.native
  
  /**
    * The case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.native
}
object GetGroupRequest {
  
  @scala.inline
  def apply(): GetGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupRequest]
  }
  
  @scala.inline
  implicit class GetGroupRequestMutableBuilder[Self <: GetGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
