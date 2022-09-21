package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeControlPanelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the control panel.
    */
  var ControlPanelArn: string
}
object DescribeControlPanelRequest {
  
  inline def apply(ControlPanelArn: string): DescribeControlPanelRequest = {
    val __obj = js.Dynamic.literal(ControlPanelArn = ControlPanelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeControlPanelRequest]
  }
  
  extension [Self <: DescribeControlPanelRequest](x: Self) {
    
    inline def setControlPanelArn(value: string): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
  }
}
