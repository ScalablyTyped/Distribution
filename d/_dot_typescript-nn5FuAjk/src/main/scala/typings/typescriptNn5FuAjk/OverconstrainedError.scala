package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverconstrainedError
  extends StObject
     with Error {
  
  val constraint: java.lang.String
}
object OverconstrainedError {
  
  inline def apply(constraint: java.lang.String, message: java.lang.String, name: java.lang.String): OverconstrainedError = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverconstrainedError]
  }
  
  extension [Self <: OverconstrainedError](x: Self) {
    
    inline def setConstraint(value: java.lang.String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
  }
}
