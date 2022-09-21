package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAutoTerminationPolicyInput extends StObject {
  
  /**
    * Specifies the ID of the Amazon EMR cluster for which the auto-termination policy will be fetched.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId
}
object GetAutoTerminationPolicyInput {
  
  inline def apply(ClusterId: ClusterId): GetAutoTerminationPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoTerminationPolicyInput]
  }
  
  extension [Self <: GetAutoTerminationPolicyInput](x: Self) {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
