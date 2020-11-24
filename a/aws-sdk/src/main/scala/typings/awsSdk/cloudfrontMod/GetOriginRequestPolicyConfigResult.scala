package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOriginRequestPolicyConfigResult extends js.Object {
  
  /**
    * The current version of the origin request policy.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The origin request policy configuration.
    */
  var OriginRequestPolicyConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginRequestPolicyConfig] = js.native
}
object GetOriginRequestPolicyConfigResult {
  
  @scala.inline
  def apply(): GetOriginRequestPolicyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOriginRequestPolicyConfigResult]
  }
  
  @scala.inline
  implicit class GetOriginRequestPolicyConfigResultOps[Self <: GetOriginRequestPolicyConfigResult] (val x: Self) extends AnyVal {
    
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
    def setOriginRequestPolicyConfig(value: OriginRequestPolicyConfig): Self = this.set("OriginRequestPolicyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginRequestPolicyConfig: Self = this.set("OriginRequestPolicyConfig", js.undefined)
  }
}
