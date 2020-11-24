package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRoleAliasesResponse extends js.Object {
  
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  
  /**
    * The role aliases.
    */
  var roleAliases: js.UndefOr[RoleAliases] = js.native
}
object ListRoleAliasesResponse {
  
  @scala.inline
  def apply(): ListRoleAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoleAliasesResponse]
  }
  
  @scala.inline
  implicit class ListRoleAliasesResponseOps[Self <: ListRoleAliasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("nextMarker", js.undefined)
    
    @scala.inline
    def setRoleAliasesVarargs(value: RoleAlias*): Self = this.set("roleAliases", js.Array(value :_*))
    
    @scala.inline
    def setRoleAliases(value: RoleAliases): Self = this.set("roleAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleAliases: Self = this.set("roleAliases", js.undefined)
  }
}
