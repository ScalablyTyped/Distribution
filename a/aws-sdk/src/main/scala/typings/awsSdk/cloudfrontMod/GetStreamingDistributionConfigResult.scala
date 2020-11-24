package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStreamingDistributionConfigResult extends js.Object {
  
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL. 
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.StreamingDistributionConfig] = js.native
}
object GetStreamingDistributionConfigResult {
  
  @scala.inline
  def apply(): GetStreamingDistributionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamingDistributionConfigResult]
  }
  
  @scala.inline
  implicit class GetStreamingDistributionConfigResultOps[Self <: GetStreamingDistributionConfigResult] (val x: Self) extends AnyVal {
    
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    
    @scala.inline
    def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = this.set("StreamingDistributionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingDistributionConfig: Self = this.set("StreamingDistributionConfig", js.undefined)
  }
}
