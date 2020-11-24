package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCanaryRunsResponse extends js.Object {
  
  /**
    * An array of structures. Each structure contains the details of one of the retrieved canary runs.
    */
  var CanaryRuns: js.UndefOr[typings.awsSdk.syntheticsMod.CanaryRuns] = js.native
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent GetCanaryRuns operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetCanaryRunsResponse {
  
  @scala.inline
  def apply(): GetCanaryRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCanaryRunsResponse]
  }
  
  @scala.inline
  implicit class GetCanaryRunsResponseOps[Self <: GetCanaryRunsResponse] (val x: Self) extends AnyVal {
    
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
    def setCanaryRunsVarargs(value: CanaryRun*): Self = this.set("CanaryRuns", js.Array(value :_*))
    
    @scala.inline
    def setCanaryRuns(value: CanaryRuns): Self = this.set("CanaryRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanaryRuns: Self = this.set("CanaryRuns", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
