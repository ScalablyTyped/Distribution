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
  
  inline def apply(): ServerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroup]
  }
  
  extension [Self <: ServerGroup](x: Self) {
    
    inline def setName(value: ServerGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServerGroupId(value: ServerGroupId): Self = StObject.set(x, "serverGroupId", value.asInstanceOf[js.Any])
    
    inline def setServerGroupIdUndefined: Self = StObject.set(x, "serverGroupId", js.undefined)
    
    inline def setServerList(value: ServerList): Self = StObject.set(x, "serverList", value.asInstanceOf[js.Any])
    
    inline def setServerListUndefined: Self = StObject.set(x, "serverList", js.undefined)
    
    inline def setServerListVarargs(value: Server*): Self = StObject.set(x, "serverList", js.Array(value :_*))
  }
}
