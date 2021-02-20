package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedZoneLimit extends StObject {
  
  /**
    * The limit that you requested. Valid values include the following:    MAX_RRSETS_BY_ZONE: The maximum number of records that you can create in the specified hosted zone.    MAX_VPCS_ASSOCIATED_BY_ZONE: The maximum number of Amazon VPCs that you can associate with the specified private hosted zone.  
    */
  var Type: HostedZoneLimitType = js.native
  
  /**
    * The current value for the limit that is specified by Type.
    */
  var Value: LimitValue = js.native
}
object HostedZoneLimit {
  
  @scala.inline
  def apply(Type: HostedZoneLimitType, Value: LimitValue): HostedZoneLimit = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedZoneLimit]
  }
  
  @scala.inline
  implicit class HostedZoneLimitMutableBuilder[Self <: HostedZoneLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: HostedZoneLimitType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: LimitValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
