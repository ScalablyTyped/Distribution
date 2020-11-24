package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchDestination extends js.Object {
  
  /**
    * A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon CloudWatch.
    */
  var DimensionConfigurations: CloudWatchDimensionConfigurations = js.native
}
object CloudWatchDestination {
  
  @scala.inline
  def apply(DimensionConfigurations: CloudWatchDimensionConfigurations): CloudWatchDestination = {
    val __obj = js.Dynamic.literal(DimensionConfigurations = DimensionConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchDestination]
  }
  
  @scala.inline
  implicit class CloudWatchDestinationOps[Self <: CloudWatchDestination] (val x: Self) extends AnyVal {
    
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
    def setDimensionConfigurationsVarargs(value: CloudWatchDimensionConfiguration*): Self = this.set("DimensionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDimensionConfigurations(value: CloudWatchDimensionConfigurations): Self = this.set("DimensionConfigurations", value.asInstanceOf[js.Any])
  }
}
