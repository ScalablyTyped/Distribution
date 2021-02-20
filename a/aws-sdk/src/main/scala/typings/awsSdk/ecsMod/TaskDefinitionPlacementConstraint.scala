package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionPlacementConstraint extends StObject {
  
  /**
    * A cluster query language expression to apply to the constraint. For more information, see Cluster Query Language in the Amazon Elastic Container Service Developer Guide.
    */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * The type of constraint. The MemberOf constraint restricts selection to be from a group of valid candidates.
    */
  var `type`: js.UndefOr[TaskDefinitionPlacementConstraintType] = js.native
}
object TaskDefinitionPlacementConstraint {
  
  @scala.inline
  def apply(): TaskDefinitionPlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinitionPlacementConstraint]
  }
  
  @scala.inline
  implicit class TaskDefinitionPlacementConstraintMutableBuilder[Self <: TaskDefinitionPlacementConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setType(value: TaskDefinitionPlacementConstraintType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
