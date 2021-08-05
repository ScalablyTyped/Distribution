package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueryLoggingConfigRequest extends StObject {
  
  /**
    * The ID of the configuration that you want to delete. 
    */
  var Id: QueryLoggingConfigId
}
object DeleteQueryLoggingConfigRequest {
  
  inline def apply(Id: QueryLoggingConfigId): DeleteQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueryLoggingConfigRequest]
  }
  
  extension [Self <: DeleteQueryLoggingConfigRequest](x: Self) {
    
    inline def setId(value: QueryLoggingConfigId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
