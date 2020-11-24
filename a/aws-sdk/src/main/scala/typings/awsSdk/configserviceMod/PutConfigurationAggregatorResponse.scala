package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutConfigurationAggregatorResponse extends js.Object {
  
  /**
    * Returns a ConfigurationAggregator object.
    */
  var ConfigurationAggregator: js.UndefOr[typings.awsSdk.configserviceMod.ConfigurationAggregator] = js.native
}
object PutConfigurationAggregatorResponse {
  
  @scala.inline
  def apply(): PutConfigurationAggregatorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutConfigurationAggregatorResponse]
  }
  
  @scala.inline
  implicit class PutConfigurationAggregatorResponseOps[Self <: PutConfigurationAggregatorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurationAggregator(value: ConfigurationAggregator): Self = this.set("ConfigurationAggregator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationAggregator: Self = this.set("ConfigurationAggregator", js.undefined)
  }
}
