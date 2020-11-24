package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerGroup extends js.Object {
  
  /**
    * The name of a server group.
    */
  var name: js.UndefOr[ServerGroupName] = js.native
  
  /**
    * The ID of a server group.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  
  /**
    * The servers that belong to a server group.
    */
  var serverList: js.UndefOr[ServerList] = js.native
}
object ServerGroup {
  
  @scala.inline
  def apply(): ServerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroup]
  }
  
  @scala.inline
  implicit class ServerGroupOps[Self <: ServerGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: ServerGroupName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServerGroupId(value: ServerGroupId): Self = this.set("serverGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerGroupId: Self = this.set("serverGroupId", js.undefined)
    
    @scala.inline
    def setServerListVarargs(value: Server*): Self = this.set("serverList", js.Array(value :_*))
    
    @scala.inline
    def setServerList(value: ServerList): Self = this.set("serverList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerList: Self = this.set("serverList", js.undefined)
  }
}
