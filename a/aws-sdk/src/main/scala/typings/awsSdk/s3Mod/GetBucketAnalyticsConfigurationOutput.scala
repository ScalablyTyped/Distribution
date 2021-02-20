package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketAnalyticsConfigurationOutput extends StObject {
  
  /**
    * The configuration and any analyses for the analytics filter.
    */
  var AnalyticsConfiguration: js.UndefOr[typings.awsSdk.s3Mod.AnalyticsConfiguration] = js.native
}
object GetBucketAnalyticsConfigurationOutput {
  
  @scala.inline
  def apply(): GetBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetBucketAnalyticsConfigurationOutputMutableBuilder[Self <: GetBucketAnalyticsConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsConfiguration(value: AnalyticsConfiguration): Self = StObject.set(x, "AnalyticsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsConfigurationUndefined: Self = StObject.set(x, "AnalyticsConfiguration", js.undefined)
  }
}
