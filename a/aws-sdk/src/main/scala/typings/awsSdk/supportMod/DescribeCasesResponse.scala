package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCasesResponse extends js.Object {
  
  /**
    * The details for the cases that match the request.
    */
  var cases: js.UndefOr[CaseList] = js.native
  
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeCasesResponse {
  
  @scala.inline
  def apply(): DescribeCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCasesResponse]
  }
  
  @scala.inline
  implicit class DescribeCasesResponseOps[Self <: DescribeCasesResponse] (val x: Self) extends AnyVal {
    
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
    def setCasesVarargs(value: CaseDetails*): Self = this.set("cases", js.Array(value :_*))
    
    @scala.inline
    def setCases(value: CaseList): Self = this.set("cases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCases: Self = this.set("cases", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
