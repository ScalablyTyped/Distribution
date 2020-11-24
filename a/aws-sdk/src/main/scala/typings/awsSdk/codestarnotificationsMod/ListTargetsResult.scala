package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTargetsResult extends js.Object {
  
  /**
    * An enumeration token that can be used in a request to return the next batch of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.NextToken] = js.native
  
  /**
    * The list of notification rule targets. 
    */
  var Targets: js.UndefOr[TargetsBatch] = js.native
}
object ListTargetsResult {
  
  @scala.inline
  def apply(): ListTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsResult]
  }
  
  @scala.inline
  implicit class ListTargetsResultOps[Self <: ListTargetsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: TargetSummary*): Self = this.set("Targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: TargetsBatch): Self = this.set("Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
}
