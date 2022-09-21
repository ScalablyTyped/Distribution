package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSearchFilter extends StObject {
  
  var TagFilter: js.UndefOr[ControlPlaneTagFilter] = js.undefined
}
object UserSearchFilter {
  
  inline def apply(): UserSearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSearchFilter]
  }
  
  extension [Self <: UserSearchFilter](x: Self) {
    
    inline def setTagFilter(value: ControlPlaneTagFilter): Self = StObject.set(x, "TagFilter", value.asInstanceOf[js.Any])
    
    inline def setTagFilterUndefined: Self = StObject.set(x, "TagFilter", js.undefined)
  }
}
