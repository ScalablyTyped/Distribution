package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupResult extends StObject {
  
  /**
    * The group that was created. Contains the name of the group that was created, the Amazon Resource Name (ARN) of the group that was generated based on the group name, the filter expression, and the insight configuration that was assigned to the group.
    */
  var Group: js.UndefOr[typings.awsSdk.xrayMod.Group] = js.undefined
}
object CreateGroupResult {
  
  @scala.inline
  def apply(): CreateGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupResult]
  }
  
  @scala.inline
  implicit class CreateGroupResultMutableBuilder[Self <: CreateGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
