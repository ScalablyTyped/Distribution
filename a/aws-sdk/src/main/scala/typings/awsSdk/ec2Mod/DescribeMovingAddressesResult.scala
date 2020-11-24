package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMovingAddressesResult extends js.Object {
  
  /**
    * The status for each Elastic IP address.
    */
  var MovingAddressStatuses: js.UndefOr[MovingAddressStatusSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeMovingAddressesResult {
  
  @scala.inline
  def apply(): DescribeMovingAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMovingAddressesResult]
  }
  
  @scala.inline
  implicit class DescribeMovingAddressesResultOps[Self <: DescribeMovingAddressesResult] (val x: Self) extends AnyVal {
    
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
    def setMovingAddressStatusesVarargs(value: MovingAddressStatus*): Self = this.set("MovingAddressStatuses", js.Array(value :_*))
    
    @scala.inline
    def setMovingAddressStatuses(value: MovingAddressStatusSet): Self = this.set("MovingAddressStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingAddressStatuses: Self = this.set("MovingAddressStatuses", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
