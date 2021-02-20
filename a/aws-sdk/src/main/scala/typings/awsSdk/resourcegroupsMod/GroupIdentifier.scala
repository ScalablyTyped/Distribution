package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupIdentifier extends StObject {
  
  /**
    * The ARN of the resource group.
    */
  var GroupArn: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupArn] = js.native
  
  /**
    * The name of the resource group.
    */
  var GroupName: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupName] = js.native
}
object GroupIdentifier {
  
  @scala.inline
  def apply(): GroupIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupIdentifier]
  }
  
  @scala.inline
  implicit class GroupIdentifierMutableBuilder[Self <: GroupIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupArn(value: GroupArn): Self = StObject.set(x, "GroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupArnUndefined: Self = StObject.set(x, "GroupArn", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
