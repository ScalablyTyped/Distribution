package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupConfigurationInput extends StObject {
  
  /**
    * The name or the ARN of the resource group.
    */
  var Group: js.UndefOr[GroupString] = js.native
}
object GetGroupConfigurationInput {
  
  @scala.inline
  def apply(): GetGroupConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupConfigurationInput]
  }
  
  @scala.inline
  implicit class GetGroupConfigurationInputMutableBuilder[Self <: GetGroupConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
