package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementConstraint extends StObject {
  
  /**
    * A cluster query language expression to apply to the constraint. You cannot specify an expression if the constraint type is distinctInstance. For more information, see Cluster Query Language in the Amazon Elastic Container Service Developer Guide.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on a different container instance. Use memberOf to restrict the selection to a group of valid candidates.
    */
  var `type`: js.UndefOr[PlacementConstraintType] = js.undefined
}
object PlacementConstraint {
  
  @scala.inline
  def apply(): PlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementConstraint]
  }
  
  @scala.inline
  implicit class PlacementConstraintMutableBuilder[Self <: PlacementConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setType(value: PlacementConstraintType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
