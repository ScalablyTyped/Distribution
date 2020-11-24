package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeltaTimeSessionWindowConfiguration extends js.Object {
  
  /**
    * A time interval. You can use timeoutInMinutes so that AWS IoT Analytics can batch up late data notifications that have been generated since the last execution. AWS IoT Analytics sends one batch of notifications to Amazon CloudWatch Events at one time. For more information about how to write a timestamp expression, see Date and Time Functions and Operators, in the Presto 0.172 Documentation.
    */
  var timeoutInMinutes: SessionTimeoutInMinutes = js.native
}
object DeltaTimeSessionWindowConfiguration {
  
  @scala.inline
  def apply(timeoutInMinutes: SessionTimeoutInMinutes): DeltaTimeSessionWindowConfiguration = {
    val __obj = js.Dynamic.literal(timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaTimeSessionWindowConfiguration]
  }
  
  @scala.inline
  implicit class DeltaTimeSessionWindowConfigurationOps[Self <: DeltaTimeSessionWindowConfiguration] (val x: Self) extends AnyVal {
    
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
    def setTimeoutInMinutes(value: SessionTimeoutInMinutes): Self = this.set("timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
