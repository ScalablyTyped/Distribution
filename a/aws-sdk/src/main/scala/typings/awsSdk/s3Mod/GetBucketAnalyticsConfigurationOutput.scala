package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketAnalyticsConfigurationOutput extends js.Object {
  
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
  implicit class GetBucketAnalyticsConfigurationOutputOps[Self <: GetBucketAnalyticsConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalyticsConfiguration(value: AnalyticsConfiguration): Self = this.set("AnalyticsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsConfiguration: Self = this.set("AnalyticsConfiguration", js.undefined)
  }
}
