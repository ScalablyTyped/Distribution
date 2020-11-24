package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeploymentTargetsOutput extends js.Object {
  
  /**
    *  If a large amount of information is returned, a token identifier is also returned. It can be used in a subsequent ListDeploymentTargets call to return the next set of deployment targets in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    *  The unique IDs of deployment targets. 
    */
  var targetIds: js.UndefOr[TargetIdList] = js.native
}
object ListDeploymentTargetsOutput {
  
  @scala.inline
  def apply(): ListDeploymentTargetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentTargetsOutput]
  }
  
  @scala.inline
  implicit class ListDeploymentTargetsOutputOps[Self <: ListDeploymentTargetsOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setTargetIdsVarargs(value: TargetId*): Self = this.set("targetIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetIds(value: TargetIdList): Self = this.set("targetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetIds: Self = this.set("targetIds", js.undefined)
  }
}
