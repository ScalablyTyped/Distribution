package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketIntelligentTieringConfigurationOutput extends js.Object {
  
  /**
    * Container for S3 Intelligent-Tiering configuration.
    */
  var IntelligentTieringConfiguration: js.UndefOr[typings.awsSdk.s3Mod.IntelligentTieringConfiguration] = js.native
}
object GetBucketIntelligentTieringConfigurationOutput {
  
  @scala.inline
  def apply(): GetBucketIntelligentTieringConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketIntelligentTieringConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetBucketIntelligentTieringConfigurationOutputOps[Self <: GetBucketIntelligentTieringConfigurationOutput] (val x: Self) extends AnyVal {
    
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
    def setIntelligentTieringConfiguration(value: IntelligentTieringConfiguration): Self = this.set("IntelligentTieringConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntelligentTieringConfiguration: Self = this.set("IntelligentTieringConfiguration", js.undefined)
  }
}
