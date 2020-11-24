package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCanariesResponse extends js.Object {
  
  /**
    * Returns an array. Each item in the array contains the full information about one canary.
    */
  var Canaries: js.UndefOr[typings.awsSdk.syntheticsMod.Canaries] = js.native
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeCanaries operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object DescribeCanariesResponse {
  
  @scala.inline
  def apply(): DescribeCanariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCanariesResponse]
  }
  
  @scala.inline
  implicit class DescribeCanariesResponseOps[Self <: DescribeCanariesResponse] (val x: Self) extends AnyVal {
    
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
    def setCanariesVarargs(value: Canary*): Self = this.set("Canaries", js.Array(value :_*))
    
    @scala.inline
    def setCanaries(value: Canaries): Self = this.set("Canaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanaries: Self = this.set("Canaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
