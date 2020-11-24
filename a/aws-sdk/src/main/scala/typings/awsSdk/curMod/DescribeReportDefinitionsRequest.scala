package typings.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReportDefinitionsRequest extends js.Object {
  
  var MaxResults: js.UndefOr[typings.awsSdk.curMod.MaxResults] = js.native
  
  var NextToken: js.UndefOr[GenericString] = js.native
}
object DescribeReportDefinitionsRequest {
  
  @scala.inline
  def apply(): DescribeReportDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReportDefinitionsRequest]
  }
  
  @scala.inline
  implicit class DescribeReportDefinitionsRequestOps[Self <: DescribeReportDefinitionsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
