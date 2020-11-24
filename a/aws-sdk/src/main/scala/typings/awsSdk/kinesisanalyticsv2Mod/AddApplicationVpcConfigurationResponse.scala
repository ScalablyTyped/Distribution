package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddApplicationVpcConfigurationResponse extends js.Object {
  
  /**
    * The ARN of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application. 
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  
  /**
    * The parameters of the new VPC configuration.
    */
  var VpcConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationDescription] = js.native
}
object AddApplicationVpcConfigurationResponse {
  
  @scala.inline
  def apply(): AddApplicationVpcConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationVpcConfigurationResponse]
  }
  
  @scala.inline
  implicit class AddApplicationVpcConfigurationResponseOps[Self <: AddApplicationVpcConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setApplicationARN(value: ResourceARN): Self = this.set("ApplicationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationARN: Self = this.set("ApplicationARN", js.undefined)
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = this.set("ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationVersionId: Self = this.set("ApplicationVersionId", js.undefined)
    
    @scala.inline
    def setVpcConfigurationDescription(value: VpcConfigurationDescription): Self = this.set("VpcConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfigurationDescription: Self = this.set("VpcConfigurationDescription", js.undefined)
  }
}
