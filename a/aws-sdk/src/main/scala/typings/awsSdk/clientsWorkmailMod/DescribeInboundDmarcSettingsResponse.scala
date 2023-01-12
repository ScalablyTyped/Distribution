package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInboundDmarcSettingsResponse extends StObject {
  
  /**
    * Lists the enforcement setting of the applied policy.
    */
  var Enforced: js.UndefOr[Boolean] = js.undefined
}
object DescribeInboundDmarcSettingsResponse {
  
  inline def apply(): DescribeInboundDmarcSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInboundDmarcSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInboundDmarcSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setEnforced(value: Boolean): Self = StObject.set(x, "Enforced", value.asInstanceOf[js.Any])
    
    inline def setEnforcedUndefined: Self = StObject.set(x, "Enforced", js.undefined)
  }
}
