package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertTarget extends StObject {
  
  /**
    * The ARN of the notification target to which alerts are sent.
    */
  var alertTargetArn: AlertTargetArn
  
  /**
    * The ARN of the role that grants permission to send alerts to the notification target.
    */
  var roleArn: RoleArn
}
object AlertTarget {
  
  inline def apply(alertTargetArn: AlertTargetArn, roleArn: RoleArn): AlertTarget = {
    val __obj = js.Dynamic.literal(alertTargetArn = alertTargetArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertTarget]
  }
  
  extension [Self <: AlertTarget](x: Self) {
    
    inline def setAlertTargetArn(value: AlertTargetArn): Self = StObject.set(x, "alertTargetArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
