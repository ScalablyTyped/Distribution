package typings.awsSdk.cloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPolicy extends js.Object {
  
  var `CloudFront-Key-Pair-Id`: String = js.native
  
  var `CloudFront-Policy`: String = js.native
  
  var `CloudFront-Signature`: String = js.native
}
object CustomPolicy {
  
  @scala.inline
  def apply(`CloudFront-Key-Pair-Id`: String, `CloudFront-Policy`: String, `CloudFront-Signature`: String): CustomPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`.asInstanceOf[js.Any])
    __obj.updateDynamic("CloudFront-Policy")(`CloudFront-Policy`.asInstanceOf[js.Any])
    __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPolicy]
  }
  
  @scala.inline
  implicit class CustomPolicyOps[Self <: CustomPolicy] (val x: Self) extends AnyVal {
    
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
    def `setCloudFront-Key-Pair-Id`(value: String): Self = this.set("CloudFront-Key-Pair-Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCloudFront-Policy`(value: String): Self = this.set("CloudFront-Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCloudFront-Signature`(value: String): Self = this.set("CloudFront-Signature", value.asInstanceOf[js.Any])
  }
}
