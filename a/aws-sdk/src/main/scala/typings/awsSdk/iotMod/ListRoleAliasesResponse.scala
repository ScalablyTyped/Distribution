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
  
  inline def apply(): ListRoleAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoleAliasesResponse]
  }
  
  extension [Self <: ListRoleAliasesResponse](x: Self) {
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
    
    inline def setRoleAliases(value: RoleAliases): Self = StObject.set(x, "roleAliases", value.asInstanceOf[js.Any])
    
    inline def setRoleAliasesUndefined: Self = StObject.set(x, "roleAliases", js.undefined)
    
    inline def setRoleAliasesVarargs(value: RoleAlias*): Self = StObject.set(x, "roleAliases", js.Array(value :_*))
  }
}
