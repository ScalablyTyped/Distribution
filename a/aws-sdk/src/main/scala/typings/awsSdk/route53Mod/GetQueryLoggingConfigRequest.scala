package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryLoggingConfigRequest extends StObject {
  
  /**
    * The ID of the configuration for DNS query logging that you want to get information about.
    */
  var Id: QueryLoggingConfigId
}
object GetQueryLoggingConfigRequest {
  
  inline def apply(Id: QueryLoggingConfigId): GetQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryLoggingConfigRequest]
  }
  
  extension [Self <: GetQueryLoggingConfigRequest](x: Self) {
    
    inline def setId(value: QueryLoggingConfigId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
