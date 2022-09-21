package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAutoTerminationPolicyInput extends StObject {
  
  /**
    * Specifies the auto-termination policy to attach to the cluster.
    */
  var AutoTerminationPolicy: js.UndefOr[typings.awsSdk.emrMod.AutoTerminationPolicy] = js.undefined
  
  /**
    * Specifies the ID of the Amazon EMR cluster to which the auto-termination policy will be attached.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId
}
object PutAutoTerminationPolicyInput {
  
  inline def apply(ClusterId: ClusterId): PutAutoTerminationPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAutoTerminationPolicyInput]
  }
  
  extension [Self <: PutAutoTerminationPolicyInput](x: Self) {
    
    inline def setAutoTerminationPolicy(value: AutoTerminationPolicy): Self = StObject.set(x, "AutoTerminationPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoTerminationPolicyUndefined: Self = StObject.set(x, "AutoTerminationPolicy", js.undefined)
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
