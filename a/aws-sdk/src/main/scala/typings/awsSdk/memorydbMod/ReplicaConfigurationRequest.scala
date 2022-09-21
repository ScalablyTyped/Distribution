package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaConfigurationRequest extends StObject {
  
  /**
    * The number of replicas to scale up or down to
    */
  var ReplicaCount: js.UndefOr[Integer] = js.undefined
}
object ReplicaConfigurationRequest {
  
  inline def apply(): ReplicaConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaConfigurationRequest]
  }
  
  extension [Self <: ReplicaConfigurationRequest](x: Self) {
    
    inline def setReplicaCount(value: Integer): Self = StObject.set(x, "ReplicaCount", value.asInstanceOf[js.Any])
    
    inline def setReplicaCountUndefined: Self = StObject.set(x, "ReplicaCount", js.undefined)
  }
}
