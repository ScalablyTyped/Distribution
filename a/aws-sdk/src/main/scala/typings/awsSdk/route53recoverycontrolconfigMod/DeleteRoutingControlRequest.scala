package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRoutingControlRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the routing control that you're deleting.
    */
  var RoutingControlArn: string
}
object DeleteRoutingControlRequest {
  
  inline def apply(RoutingControlArn: string): DeleteRoutingControlRequest = {
    val __obj = js.Dynamic.literal(RoutingControlArn = RoutingControlArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoutingControlRequest]
  }
  
  extension [Self <: DeleteRoutingControlRequest](x: Self) {
    
    inline def setRoutingControlArn(value: string): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
  }
}
