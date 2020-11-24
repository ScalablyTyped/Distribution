package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeByoipCidrsResult extends js.Object {
  
  /**
    * Information about your address ranges.
    */
  var ByoipCidrs: js.UndefOr[ByoipCidrSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeByoipCidrsResult {
  
  @scala.inline
  def apply(): DescribeByoipCidrsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeByoipCidrsResult]
  }
  
  @scala.inline
  implicit class DescribeByoipCidrsResultOps[Self <: DescribeByoipCidrsResult] (val x: Self) extends AnyVal {
    
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
    def setByoipCidrsVarargs(value: ByoipCidr*): Self = this.set("ByoipCidrs", js.Array(value :_*))
    
    @scala.inline
    def setByoipCidrs(value: ByoipCidrSet): Self = this.set("ByoipCidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByoipCidrs: Self = this.set("ByoipCidrs", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
