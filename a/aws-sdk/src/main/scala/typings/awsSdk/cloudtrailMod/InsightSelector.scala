package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightSelector extends StObject {
  
  /**
    * The type of insights to log on a trail. In this release, only ApiCallRateInsight is supported as an insight type.
    */
  var InsightType: js.UndefOr[typings.awsSdk.cloudtrailMod.InsightType] = js.undefined
}
object InsightSelector {
  
  inline def apply(): InsightSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightSelector]
  }
  
  extension [Self <: InsightSelector](x: Self) {
    
    inline def setInsightType(value: InsightType): Self = StObject.set(x, "InsightType", value.asInstanceOf[js.Any])
    
    inline def setInsightTypeUndefined: Self = StObject.set(x, "InsightType", js.undefined)
  }
}
