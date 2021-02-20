package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightSelector extends StObject {
  
  /**
    * The type of insights to log on a trail. In this release, only ApiCallRateInsight is supported as an insight type.
    */
  var InsightType: js.UndefOr[typings.awsSdk.cloudtrailMod.InsightType] = js.native
}
object InsightSelector {
  
  @scala.inline
  def apply(): InsightSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightSelector]
  }
  
  @scala.inline
  implicit class InsightSelectorMutableBuilder[Self <: InsightSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightType(value: InsightType): Self = StObject.set(x, "InsightType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightTypeUndefined: Self = StObject.set(x, "InsightType", js.undefined)
  }
}
