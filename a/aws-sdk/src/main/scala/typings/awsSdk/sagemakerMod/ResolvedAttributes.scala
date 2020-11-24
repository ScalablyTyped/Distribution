package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedAttributes extends js.Object {
  
  var AutoMLJobObjective: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobObjective] = js.native
  
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.native
  
  /**
    * The problem type.
    */
  var ProblemType: js.UndefOr[typings.awsSdk.sagemakerMod.ProblemType] = js.native
}
object ResolvedAttributes {
  
  @scala.inline
  def apply(): ResolvedAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedAttributes]
  }
  
  @scala.inline
  implicit class ResolvedAttributesOps[Self <: ResolvedAttributes] (val x: Self) extends AnyVal {
    
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
    def setAutoMLJobObjective(value: AutoMLJobObjective): Self = this.set("AutoMLJobObjective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMLJobObjective: Self = this.set("AutoMLJobObjective", js.undefined)
    
    @scala.inline
    def setCompletionCriteria(value: AutoMLJobCompletionCriteria): Self = this.set("CompletionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionCriteria: Self = this.set("CompletionCriteria", js.undefined)
    
    @scala.inline
    def setProblemType(value: ProblemType): Self = this.set("ProblemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProblemType: Self = this.set("ProblemType", js.undefined)
  }
}
