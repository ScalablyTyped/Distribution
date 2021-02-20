package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGroupResult extends StObject {
  
  /**
    * The group that was updated. Contains the name of the group that was updated, the ARN of the group that was updated, the updated filter expression, and the updated insight configuration assigned to the group.
    */
  var Group: js.UndefOr[typings.awsSdk.xrayMod.Group] = js.native
}
object UpdateGroupResult {
  
  @scala.inline
  def apply(): UpdateGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupResult]
  }
  
  @scala.inline
  implicit class UpdateGroupResultMutableBuilder[Self <: UpdateGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
