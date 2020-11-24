package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityMetrics extends js.Object {
  
  /**
    * A container for whether the activity metrics are enabled.
    */
  var IsEnabled: js.UndefOr[typings.awsSdk.s3controlMod.IsEnabled] = js.native
}
object ActivityMetrics {
  
  @scala.inline
  def apply(): ActivityMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityMetrics]
  }
  
  @scala.inline
  implicit class ActivityMetricsOps[Self <: ActivityMetrics] (val x: Self) extends AnyVal {
    
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
    def setIsEnabled(value: IsEnabled): Self = this.set("IsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("IsEnabled", js.undefined)
  }
}
