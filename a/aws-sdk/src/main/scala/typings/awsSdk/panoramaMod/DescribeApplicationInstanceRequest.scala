package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationInstanceRequest extends StObject {
  
  /**
    * The application instance's ID.
    */
  var ApplicationInstanceId: typings.awsSdk.panoramaMod.ApplicationInstanceId
}
object DescribeApplicationInstanceRequest {
  
  inline def apply(ApplicationInstanceId: ApplicationInstanceId): DescribeApplicationInstanceRequest = {
    val __obj = js.Dynamic.literal(ApplicationInstanceId = ApplicationInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationInstanceRequest]
  }
  
  extension [Self <: DescribeApplicationInstanceRequest](x: Self) {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
  }
}
