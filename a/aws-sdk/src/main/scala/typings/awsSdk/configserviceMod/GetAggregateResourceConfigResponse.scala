package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAggregateResourceConfigResponse extends js.Object {
  
  /**
    * Returns a ConfigurationItem object.
    */
  var ConfigurationItem: js.UndefOr[typings.awsSdk.configserviceMod.ConfigurationItem] = js.native
}
object GetAggregateResourceConfigResponse {
  
  @scala.inline
  def apply(): GetAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateResourceConfigResponse]
  }
  
  @scala.inline
  implicit class GetAggregateResourceConfigResponseOps[Self <: GetAggregateResourceConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setConfigurationItem(value: ConfigurationItem): Self = this.set("ConfigurationItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationItem: Self = this.set("ConfigurationItem", js.undefined)
  }
}
