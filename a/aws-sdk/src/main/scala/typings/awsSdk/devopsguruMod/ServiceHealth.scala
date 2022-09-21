package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceHealth extends StObject {
  
  /**
    * Represents the health of an Amazon Web Services service. This is a ServiceInsightHealth that contains the number of open proactive and reactive insights for this service.
    */
  var Insight: js.UndefOr[ServiceInsightHealth] = js.undefined
  
  /**
    * The name of the Amazon Web Services service.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.devopsguruMod.ServiceName] = js.undefined
}
object ServiceHealth {
  
  inline def apply(): ServiceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceHealth]
  }
  
  extension [Self <: ServiceHealth](x: Self) {
    
    inline def setInsight(value: ServiceInsightHealth): Self = StObject.set(x, "Insight", value.asInstanceOf[js.Any])
    
    inline def setInsightUndefined: Self = StObject.set(x, "Insight", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
  }
}
