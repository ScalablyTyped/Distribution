package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeElasticsearchInstanceTypeLimitsResponse extends StObject {
  
  var LimitsByRole: js.UndefOr[typings.awsSdk.esMod.LimitsByRole] = js.native
}
object DescribeElasticsearchInstanceTypeLimitsResponse {
  
  @scala.inline
  def apply(): DescribeElasticsearchInstanceTypeLimitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsResponse]
  }
  
  @scala.inline
  implicit class DescribeElasticsearchInstanceTypeLimitsResponseMutableBuilder[Self <: DescribeElasticsearchInstanceTypeLimitsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimitsByRole(value: LimitsByRole): Self = StObject.set(x, "LimitsByRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsByRoleUndefined: Self = StObject.set(x, "LimitsByRole", js.undefined)
  }
}
