package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostedZoneCountResponse extends StObject {
  
  /**
    * The total number of public and private hosted zones that are associated with the current AWS account.
    */
  var HostedZoneCount: typings.awsSdk.route53Mod.HostedZoneCount
}
object GetHostedZoneCountResponse {
  
  @scala.inline
  def apply(HostedZoneCount: HostedZoneCount): GetHostedZoneCountResponse = {
    val __obj = js.Dynamic.literal(HostedZoneCount = HostedZoneCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneCountResponse]
  }
  
  @scala.inline
  implicit class GetHostedZoneCountResponseMutableBuilder[Self <: GetHostedZoneCountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostedZoneCount(value: HostedZoneCount): Self = StObject.set(x, "HostedZoneCount", value.asInstanceOf[js.Any])
  }
}
