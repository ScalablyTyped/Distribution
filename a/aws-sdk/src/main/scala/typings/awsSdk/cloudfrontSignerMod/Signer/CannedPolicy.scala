package typings.awsSdk.cloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CannedPolicy extends js.Object {
  
  var `CloudFront-Expires`: Double = js.native
  
  var `CloudFront-Key-Pair-Id`: String = js.native
  
  var `CloudFront-Signature`: String = js.native
}
object CannedPolicy {
  
  @scala.inline
  def apply(`CloudFront-Expires`: Double, `CloudFront-Key-Pair-Id`: String, `CloudFront-Signature`: String): CannedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CloudFront-Expires")(`CloudFront-Expires`.asInstanceOf[js.Any])
    __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`.asInstanceOf[js.Any])
    __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CannedPolicy]
  }
  
  @scala.inline
  implicit class CannedPolicyOps[Self <: CannedPolicy] (val x: Self) extends AnyVal {
    
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
    def `setCloudFront-Expires`(value: Double): Self = this.set("CloudFront-Expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCloudFront-Key-Pair-Id`(value: String): Self = this.set("CloudFront-Key-Pair-Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCloudFront-Signature`(value: String): Self = this.set("CloudFront-Signature", value.asInstanceOf[js.Any])
  }
}
