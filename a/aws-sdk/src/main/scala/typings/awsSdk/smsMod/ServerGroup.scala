package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerGroup extends StObject {
  
  /**
    * The name of a server group.
    */
  var name: js.UndefOr[ServerGroupName] = js.undefined
  
  /**
    * The ID of a server group.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
  
  /**
    * The servers that belong to a server group.
    */
  var serverList: js.UndefOr[ServerList] = js.undefined
}
object ServerGroup {
  
  @scala.inline
  def apply(): ServerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroup]
  }
  
  @scala.inline
  implicit class ServerGroupMutableBuilder[Self <: ServerGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ServerGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServerGroupId(value: ServerGroupId): Self = StObject.set(x, "serverGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerGroupIdUndefined: Self = StObject.set(x, "serverGroupId", js.undefined)
    
    @scala.inline
    def setServerList(value: ServerList): Self = StObject.set(x, "serverList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerListUndefined: Self = StObject.set(x, "serverList", js.undefined)
    
    @scala.inline
    def setServerListVarargs(value: Server*): Self = StObject.set(x, "serverList", js.Array(value :_*))
  }
}
