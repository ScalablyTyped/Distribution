package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlertResponse extends StObject {
  
  /**
    * Contains information about an alert.
    */
  var Alert: js.UndefOr[typings.awsSdk.lookoutmetricsMod.Alert] = js.undefined
}
object DescribeAlertResponse {
  
  inline def apply(): DescribeAlertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlertResponse]
  }
  
  extension [Self <: DescribeAlertResponse](x: Self) {
    
    inline def setAlert(value: Alert): Self = StObject.set(x, "Alert", value.asInstanceOf[js.Any])
    
    inline def setAlertUndefined: Self = StObject.set(x, "Alert", js.undefined)
  }
}
