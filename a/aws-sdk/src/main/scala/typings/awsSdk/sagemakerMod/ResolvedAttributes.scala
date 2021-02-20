package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedAttributes extends StObject {
  
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
  implicit class ResolvedAttributesMutableBuilder[Self <: ResolvedAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMLJobObjective(value: AutoMLJobObjective): Self = StObject.set(x, "AutoMLJobObjective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobObjectiveUndefined: Self = StObject.set(x, "AutoMLJobObjective", js.undefined)
    
    @scala.inline
    def setCompletionCriteria(value: AutoMLJobCompletionCriteria): Self = StObject.set(x, "CompletionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionCriteriaUndefined: Self = StObject.set(x, "CompletionCriteria", js.undefined)
    
    @scala.inline
    def setProblemType(value: ProblemType): Self = StObject.set(x, "ProblemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblemTypeUndefined: Self = StObject.set(x, "ProblemType", js.undefined)
  }
}
