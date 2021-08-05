package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBillingGroupResponse extends StObject {
  
  /**
    * The latest version of the billing group.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object UpdateBillingGroupResponse {
  
  inline def apply(): UpdateBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBillingGroupResponse]
  }
  
  extension [Self <: UpdateBillingGroupResponse](x: Self) {
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
