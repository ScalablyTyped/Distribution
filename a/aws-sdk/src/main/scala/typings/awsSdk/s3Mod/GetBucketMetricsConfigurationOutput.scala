package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketMetricsConfigurationOutput extends js.Object {
  
  /**
    * Specifies the metrics configuration.
    */
  var MetricsConfiguration: js.UndefOr[typings.awsSdk.s3Mod.MetricsConfiguration] = js.native
}
object GetBucketMetricsConfigurationOutput {
  
  @scala.inline
  def apply(): GetBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetBucketMetricsConfigurationOutputOps[Self <: GetBucketMetricsConfigurationOutput] (val x: Self) extends AnyVal {
    
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
    def setMetricsConfiguration(value: MetricsConfiguration): Self = this.set("MetricsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricsConfiguration: Self = this.set("MetricsConfiguration", js.undefined)
  }
}
