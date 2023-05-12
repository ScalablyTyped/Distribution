package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LensMetric extends StObject {
  
  /**
    * The lens ARN.
    */
  var LensArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensArn] = js.undefined
  
  /**
    * The metrics for the pillars in a lens.
    */
  var Pillars: js.UndefOr[PillarMetrics] = js.undefined
  
  var RiskCounts: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.RiskCounts] = js.undefined
}
object LensMetric {
  
  inline def apply(): LensMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LensMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LensMetric] (val x: Self) extends AnyVal {
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setPillars(value: PillarMetrics): Self = StObject.set(x, "Pillars", value.asInstanceOf[js.Any])
    
    inline def setPillarsUndefined: Self = StObject.set(x, "Pillars", js.undefined)
    
    inline def setPillarsVarargs(value: PillarMetric*): Self = StObject.set(x, "Pillars", js.Array(value*))
    
    inline def setRiskCounts(value: RiskCounts): Self = StObject.set(x, "RiskCounts", value.asInstanceOf[js.Any])
    
    inline def setRiskCountsUndefined: Self = StObject.set(x, "RiskCounts", js.undefined)
  }
}
