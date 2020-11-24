package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSSLPoliciesOutput extends js.Object {
  
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  
  /**
    * Information about the security policies.
    */
  var SslPolicies: js.UndefOr[typings.awsSdk.elbv2Mod.SslPolicies] = js.native
}
object DescribeSSLPoliciesOutput {
  
  @scala.inline
  def apply(): DescribeSSLPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSSLPoliciesOutput]
  }
  
  @scala.inline
  implicit class DescribeSSLPoliciesOutputOps[Self <: DescribeSSLPoliciesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    
    @scala.inline
    def setSslPoliciesVarargs(value: SslPolicy*): Self = this.set("SslPolicies", js.Array(value :_*))
    
    @scala.inline
    def setSslPolicies(value: SslPolicies): Self = this.set("SslPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslPolicies: Self = this.set("SslPolicies", js.undefined)
  }
}
