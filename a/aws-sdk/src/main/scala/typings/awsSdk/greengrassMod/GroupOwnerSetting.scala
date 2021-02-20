package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupOwnerSetting extends StObject {
  
  /**
    * If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the Lambda process privileges. Thus the Lambda process will have the file access permissions of the added Linux group.
    */
  var AutoAddGroupOwner: js.UndefOr[boolean] = js.native
  
  /**
    * The name of the Linux OS group whose privileges will be added to the Lambda process. This field is optional.
    */
  var GroupOwner: js.UndefOr[string] = js.native
}
object GroupOwnerSetting {
  
  @scala.inline
  def apply(): GroupOwnerSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOwnerSetting]
  }
  
  @scala.inline
  implicit class GroupOwnerSettingMutableBuilder[Self <: GroupOwnerSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoAddGroupOwner(value: boolean): Self = StObject.set(x, "AutoAddGroupOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAddGroupOwnerUndefined: Self = StObject.set(x, "AutoAddGroupOwner", js.undefined)
    
    @scala.inline
    def setGroupOwner(value: string): Self = StObject.set(x, "GroupOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupOwnerUndefined: Self = StObject.set(x, "GroupOwner", js.undefined)
  }
}
