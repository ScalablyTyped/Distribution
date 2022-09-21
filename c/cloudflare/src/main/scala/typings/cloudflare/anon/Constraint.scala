package typings.cloudflare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constraint extends StObject {
  
  var constraint: Operator
  
  var target: String
}
object Constraint {
  
  inline def apply(constraint: Operator, target: String): Constraint = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
  
  extension [Self <: Constraint](x: Self) {
    
    inline def setConstraint(value: Operator): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
