package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionConfigResult extends js.Object {
  
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.DistributionConfig] = js.native
  
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}
object GetDistributionConfigResult {
  
  @scala.inline
  def apply(): GetDistributionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionConfigResult]
  }
  
  @scala.inline
  implicit class GetDistributionConfigResultOps[Self <: GetDistributionConfigResult] (val x: Self) extends AnyVal {
    
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
    def setDistributionConfig(value: DistributionConfig): Self = this.set("DistributionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionConfig: Self = this.set("DistributionConfig", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
  }
}
