package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRoutingControlResponse extends StObject {
  
  /**
    * Information about the routing control.
    */
  var RoutingControl: js.UndefOr[typings.awsSdk.route53recoverycontrolconfigMod.RoutingControl] = js.undefined
}
object DescribeRoutingControlResponse {
  
  inline def apply(): DescribeRoutingControlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRoutingControlResponse]
  }
  
  extension [Self <: DescribeRoutingControlResponse](x: Self) {
    
    inline def setRoutingControl(value: RoutingControl): Self = StObject.set(x, "RoutingControl", value.asInstanceOf[js.Any])
    
    inline def setRoutingControlUndefined: Self = StObject.set(x, "RoutingControl", js.undefined)
  }
}
