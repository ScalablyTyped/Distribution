package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixLevelStorageMetrics extends StObject {
  
  /**
    * A container for whether prefix-level storage metrics are enabled.
    */
  var IsEnabled: js.UndefOr[typings.awsSdk.s3controlMod.IsEnabled] = js.undefined
  
  var SelectionCriteria: js.UndefOr[typings.awsSdk.s3controlMod.SelectionCriteria] = js.undefined
}
object PrefixLevelStorageMetrics {
  
  @scala.inline
  def apply(): PrefixLevelStorageMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixLevelStorageMetrics]
  }
  
  @scala.inline
  implicit class PrefixLevelStorageMetricsMutableBuilder[Self <: PrefixLevelStorageMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEnabled(value: IsEnabled): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "IsEnabled", js.undefined)
    
    @scala.inline
    def setSelectionCriteria(value: SelectionCriteria): Self = StObject.set(x, "SelectionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionCriteriaUndefined: Self = StObject.set(x, "SelectionCriteria", js.undefined)
  }
}
