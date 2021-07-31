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
  
  @scala.inline
  def apply(): DescribeResourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourcePermissionsResponse]
  }
  
  @scala.inline
  implicit class DescribeResourcePermissionsResponseMutableBuilder[Self <: DescribeResourcePermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setPrincipals(value: PrincipalList): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsUndefined: Self = StObject.set(x, "Principals", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: Principal*): Self = StObject.set(x, "Principals", js.Array(value :_*))
  }
}
