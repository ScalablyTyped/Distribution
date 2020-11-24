package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRetentionConfigurationResponse extends js.Object {
  
  /**
    * Returns a retention configuration object.
    */
  var RetentionConfiguration: js.UndefOr[typings.awsSdk.configserviceMod.RetentionConfiguration] = js.native
}
object PutRetentionConfigurationResponse {
  
  @scala.inline
  def apply(): PutRetentionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRetentionConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutRetentionConfigurationResponseOps[Self <: PutRetentionConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setRetentionConfiguration(value: RetentionConfiguration): Self = this.set("RetentionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionConfiguration: Self = this.set("RetentionConfiguration", js.undefined)
  }
}
