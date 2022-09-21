package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlertRequest extends StObject {
  
  /**
    * The ARN of the alert to describe.
    */
  var AlertArn: Arn
}
object DescribeAlertRequest {
  
  inline def apply(AlertArn: Arn): DescribeAlertRequest = {
    val __obj = js.Dynamic.literal(AlertArn = AlertArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlertRequest]
  }
  
  extension [Self <: DescribeAlertRequest](x: Self) {
    
    inline def setAlertArn(value: Arn): Self = StObject.set(x, "AlertArn", value.asInstanceOf[js.Any])
  }
}
