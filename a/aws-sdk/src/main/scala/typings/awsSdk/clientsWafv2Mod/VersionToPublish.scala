package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionToPublish extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the vendor's rule group that's used in the published managed rule group version. 
    */
  var AssociatedRuleGroupArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The amount of time the vendor expects this version of the managed rule group to last, in days. 
    */
  var ForecastedLifetime: js.UndefOr[TimeWindowDay] = js.undefined
}
object VersionToPublish {
  
  inline def apply(): VersionToPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionToPublish]
  }
  
  extension [Self <: VersionToPublish](x: Self) {
    
    inline def setAssociatedRuleGroupArn(value: ResourceArn): Self = StObject.set(x, "AssociatedRuleGroupArn", value.asInstanceOf[js.Any])
    
    inline def setAssociatedRuleGroupArnUndefined: Self = StObject.set(x, "AssociatedRuleGroupArn", js.undefined)
    
    inline def setForecastedLifetime(value: TimeWindowDay): Self = StObject.set(x, "ForecastedLifetime", value.asInstanceOf[js.Any])
    
    inline def setForecastedLifetimeUndefined: Self = StObject.set(x, "ForecastedLifetime", js.undefined)
  }
}
