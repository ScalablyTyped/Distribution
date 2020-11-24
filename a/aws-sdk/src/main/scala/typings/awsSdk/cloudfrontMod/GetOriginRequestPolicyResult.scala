package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOriginRequestPolicyResult extends js.Object {
  
  /**
    * The current version of the origin request policy.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The origin request policy.
    */
  var OriginRequestPolicy: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginRequestPolicy] = js.native
}
object GetOriginRequestPolicyResult {
  
  @scala.inline
  def apply(): GetOriginRequestPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOriginRequestPolicyResult]
  }
  
  @scala.inline
  implicit class GetOriginRequestPolicyResultOps[Self <: GetOriginRequestPolicyResult] (val x: Self) extends AnyVal {
    
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
    def setOriginRequestPolicy(value: OriginRequestPolicy): Self = this.set("OriginRequestPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginRequestPolicy: Self = this.set("OriginRequestPolicy", js.undefined)
  }
}
