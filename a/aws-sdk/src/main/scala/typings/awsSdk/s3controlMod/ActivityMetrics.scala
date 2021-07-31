package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityMetrics extends StObject {
  
  /**
    * A container for whether the activity metrics are enabled.
    */
  var IsEnabled: js.UndefOr[typings.awsSdk.s3controlMod.IsEnabled] = js.undefined
}
object ActivityMetrics {
  
  @scala.inline
  def apply(): ActivityMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityMetrics]
  }
  
  @scala.inline
  implicit class ActivityMetricsMutableBuilder[Self <: ActivityMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEnabled(value: IsEnabled): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "IsEnabled", js.undefined)
  }
}
