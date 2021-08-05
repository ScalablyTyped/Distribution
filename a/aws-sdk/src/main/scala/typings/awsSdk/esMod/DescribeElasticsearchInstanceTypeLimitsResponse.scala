package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticsearchInstanceTypeLimitsResponse extends StObject {
  
  var LimitsByRole: js.UndefOr[typings.awsSdk.esMod.LimitsByRole] = js.undefined
}
object DescribeElasticsearchInstanceTypeLimitsResponse {
  
  inline def apply(): DescribeElasticsearchInstanceTypeLimitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsResponse]
  }
  
  extension [Self <: DescribeElasticsearchInstanceTypeLimitsResponse](x: Self) {
    
    inline def setLimitsByRole(value: LimitsByRole): Self = StObject.set(x, "LimitsByRole", value.asInstanceOf[js.Any])
    
    inline def setLimitsByRoleUndefined: Self = StObject.set(x, "LimitsByRole", js.undefined)
  }
}
