package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadinessCheckSummary extends StObject {
  
  /**
    * The readiness status of this readiness check.
    */
  var Readiness: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.Readiness] = js.undefined
  
  /**
    * The name of a readiness check.
    */
  var ReadinessCheckName: js.UndefOr[string] = js.undefined
}
object ReadinessCheckSummary {
  
  inline def apply(): ReadinessCheckSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadinessCheckSummary]
  }
  
  extension [Self <: ReadinessCheckSummary](x: Self) {
    
    inline def setReadiness(value: Readiness): Self = StObject.set(x, "Readiness", value.asInstanceOf[js.Any])
    
    inline def setReadinessCheckName(value: string): Self = StObject.set(x, "ReadinessCheckName", value.asInstanceOf[js.Any])
    
    inline def setReadinessCheckNameUndefined: Self = StObject.set(x, "ReadinessCheckName", js.undefined)
    
    inline def setReadinessUndefined: Self = StObject.set(x, "Readiness", js.undefined)
  }
}
