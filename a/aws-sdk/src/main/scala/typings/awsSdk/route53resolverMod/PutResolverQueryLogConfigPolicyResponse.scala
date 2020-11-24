package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResolverQueryLogConfigPolicyResponse extends js.Object {
  
  /**
    * Whether the PutResolverQueryLogConfigPolicy request was successful.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.native
}
object PutResolverQueryLogConfigPolicyResponse {
  
  @scala.inline
  def apply(): PutResolverQueryLogConfigPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResolverQueryLogConfigPolicyResponse]
  }
  
  @scala.inline
  implicit class PutResolverQueryLogConfigPolicyResponseOps[Self <: PutResolverQueryLogConfigPolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setReturnValue(value: Boolean): Self = this.set("ReturnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnValue: Self = this.set("ReturnValue", js.undefined)
  }
}
