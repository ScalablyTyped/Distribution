package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourcePermissionsResponse extends StObject {
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  
  /**
    * The principals.
    */
  var Principals: js.UndefOr[PrincipalList] = js.undefined
}
object DescribeResourcePermissionsResponse {
  
  inline def apply(): DescribeResourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourcePermissionsResponse]
  }
  
  extension [Self <: DescribeResourcePermissionsResponse](x: Self) {
    
    inline def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setPrincipals(value: PrincipalList): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "Principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: Principal*): Self = StObject.set(x, "Principals", js.Array(value*))
  }
}
