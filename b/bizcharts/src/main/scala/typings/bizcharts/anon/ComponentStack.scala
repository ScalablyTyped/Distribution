package typings.bizcharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentStack extends StObject {
  
  var componentStack: String
}
object ComponentStack {
  
  inline def apply(componentStack: String): ComponentStack = {
    val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentStack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentStack] (val x: Self) extends AnyVal {
    
    inline def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
  }
}
