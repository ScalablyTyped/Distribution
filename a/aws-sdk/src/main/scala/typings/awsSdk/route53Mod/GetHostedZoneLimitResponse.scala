package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHostedZoneLimitResponse extends StObject {
  
  /**
    * The current number of entities that you have created of the specified type. For example, if you specified MAX_RRSETS_BY_ZONE for the value of Type in the request, the value of Count is the current number of records that you have created in the specified hosted zone.
    */
  var Count: UsageCount = js.native
  
  /**
    * The current setting for the specified limit. For example, if you specified MAX_RRSETS_BY_ZONE for the value of Type in the request, the value of Limit is the maximum number of records that you can create in the specified hosted zone.
    */
  var Limit: HostedZoneLimit = js.native
}
object GetHostedZoneLimitResponse {
  
  @scala.inline
  def apply(Count: UsageCount, Limit: HostedZoneLimit): GetHostedZoneLimitResponse = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Limit = Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneLimitResponse]
  }
  
  @scala.inline
  implicit class GetHostedZoneLimitResponseMutableBuilder[Self <: GetHostedZoneLimitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: UsageCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: HostedZoneLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
  }
}
