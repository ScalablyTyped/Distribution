package typings.awsSdk.iotfleethubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationRequest extends StObject {
  
  /**
    * The unique Id of the web application.
    */
  var applicationId: Id
}
object DescribeApplicationRequest {
  
  inline def apply(applicationId: Id): DescribeApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationRequest]
  }
  
  extension [Self <: DescribeApplicationRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
  }
}
