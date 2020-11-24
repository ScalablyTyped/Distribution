package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStandardsControlsResponse extends js.Object {
  
  /**
    * A list of security standards controls.
    */
  var Controls: js.UndefOr[StandardsControls] = js.native
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}
object DescribeStandardsControlsResponse {
  
  @scala.inline
  def apply(): DescribeStandardsControlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStandardsControlsResponse]
  }
  
  @scala.inline
  implicit class DescribeStandardsControlsResponseOps[Self <: DescribeStandardsControlsResponse] (val x: Self) extends AnyVal {
    
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
    def setControlsVarargs(value: StandardsControl*): Self = this.set("Controls", js.Array(value :_*))
    
    @scala.inline
    def setControls(value: StandardsControls): Self = this.set("Controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("Controls", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
