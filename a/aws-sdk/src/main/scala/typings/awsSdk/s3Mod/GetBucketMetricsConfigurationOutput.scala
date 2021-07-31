package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketMetricsConfigurationOutput extends StObject {
  
  /**
    * Specifies the metrics configuration.
    */
  var MetricsConfiguration: js.UndefOr[typings.awsSdk.s3Mod.MetricsConfiguration] = js.undefined
}
object GetBucketMetricsConfigurationOutput {
  
  @scala.inline
  def apply(): GetBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetBucketMetricsConfigurationOutputMutableBuilder[Self <: GetBucketMetricsConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricsConfiguration(value: MetricsConfiguration): Self = StObject.set(x, "MetricsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsConfigurationUndefined: Self = StObject.set(x, "MetricsConfiguration", js.undefined)
  }
}
