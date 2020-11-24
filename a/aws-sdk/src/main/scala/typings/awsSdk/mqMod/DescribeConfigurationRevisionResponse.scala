package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationRevisionResponse extends js.Object {
  
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: js.UndefOr[string] = js.native
  
  /**
    * Required. The date and time of the configuration.
    */
  var Created: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * Required. The base64-encoded XML configuration.
    */
  var Data: js.UndefOr[string] = js.native
  
  /**
    * The description of the configuration.
    */
  var Description: js.UndefOr[string] = js.native
}
object DescribeConfigurationRevisionResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationRevisionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationRevisionResponseOps[Self <: DescribeConfigurationRevisionResponse] (val x: Self) extends AnyVal {
    
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
    def setConfigurationId(value: string): Self = this.set("ConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationId: Self = this.set("ConfigurationId", js.undefined)
    
    @scala.inline
    def setCreated(value: timestampIso8601): Self = this.set("Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("Created", js.undefined)
    
    @scala.inline
    def setData(value: string): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
}
