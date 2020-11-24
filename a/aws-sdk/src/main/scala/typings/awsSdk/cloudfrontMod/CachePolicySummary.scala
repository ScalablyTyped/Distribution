package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachePolicySummary extends js.Object {
  
  /**
    * The cache policy.
    */
  var CachePolicy: typings.awsSdk.cloudfrontMod.CachePolicy = js.native
  
  /**
    * The type of cache policy, either managed (created by AWS) or custom (created in this AWS account).
    */
  var Type: CachePolicyType = js.native
}
object CachePolicySummary {
  
  @scala.inline
  def apply(CachePolicy: CachePolicy, Type: CachePolicyType): CachePolicySummary = {
    val __obj = js.Dynamic.literal(CachePolicy = CachePolicy.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicySummary]
  }
  
  @scala.inline
  implicit class CachePolicySummaryOps[Self <: CachePolicySummary] (val x: Self) extends AnyVal {
    
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
    def setCachePolicy(value: CachePolicy): Self = this.set("CachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CachePolicyType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
