package typings.awsSdk.cloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignerOptionsWithoutPolicy extends js.Object {
  
  /**
    * A Unix UTC timestamp indicating when the signature should expire. Required unless you pass in a full policy.
    */
  var expires: Double = js.native
  
  /**
    * The URL to which the signature will grant access. Required unless you pass in a full policy.
    */
  var url: String = js.native
}
object SignerOptionsWithoutPolicy {
  
  @scala.inline
  def apply(expires: Double, url: String): SignerOptionsWithoutPolicy = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerOptionsWithoutPolicy]
  }
  
  @scala.inline
  implicit class SignerOptionsWithoutPolicyOps[Self <: SignerOptionsWithoutPolicy] (val x: Self) extends AnyVal {
    
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
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
