package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoleAliasesResponse extends StObject {
  
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  
  /**
    * The role aliases.
    */
  var roleAliases: js.UndefOr[RoleAliases] = js.undefined
}
object ListRoleAliasesResponse {
  
  @scala.inline
  def apply(): ListRoleAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoleAliasesResponse]
  }
  
  @scala.inline
  implicit class ListRoleAliasesResponseMutableBuilder[Self <: ListRoleAliasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
    
    @scala.inline
    def setRoleAliases(value: RoleAliases): Self = StObject.set(x, "roleAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleAliasesUndefined: Self = StObject.set(x, "roleAliases", js.undefined)
    
    @scala.inline
    def setRoleAliasesVarargs(value: RoleAlias*): Self = StObject.set(x, "roleAliases", js.Array(value :_*))
  }
}
