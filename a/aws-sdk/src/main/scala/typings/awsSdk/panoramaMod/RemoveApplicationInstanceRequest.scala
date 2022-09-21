package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveApplicationInstanceRequest extends StObject {
  
  /**
    * An application instance ID.
    */
  var ApplicationInstanceId: typings.awsSdk.panoramaMod.ApplicationInstanceId
}
object RemoveApplicationInstanceRequest {
  
  inline def apply(ApplicationInstanceId: ApplicationInstanceId): RemoveApplicationInstanceRequest = {
    val __obj = js.Dynamic.literal(ApplicationInstanceId = ApplicationInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveApplicationInstanceRequest]
  }
  
  extension [Self <: RemoveApplicationInstanceRequest](x: Self) {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
  }
}
