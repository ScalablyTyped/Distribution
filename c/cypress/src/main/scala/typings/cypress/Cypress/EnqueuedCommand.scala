package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnqueuedCommand extends StObject {
  
  var args: js.Array[Any]
  
  var chainerId: String
  
  def fn(args: Any*): Any
  
  var id: String
  
  var injected: Boolean
  
  var name: String
  
  var `type`: String
  
  var userInvocationStack: js.UndefOr[String] = js.undefined
}
object EnqueuedCommand {
  
  inline def apply(
    args: js.Array[Any],
    chainerId: String,
    fn: /* repeated */ Any => Any,
    id: String,
    injected: Boolean,
    name: String,
    `type`: String
  ): EnqueuedCommand = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], chainerId = chainerId.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), id = id.asInstanceOf[js.Any], injected = injected.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnqueuedCommand]
  }
  
  extension [Self <: EnqueuedCommand](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setChainerId(value: String): Self = StObject.set(x, "chainerId", value.asInstanceOf[js.Any])
    
    inline def setFn(value: /* repeated */ Any => Any): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInjected(value: Boolean): Self = StObject.set(x, "injected", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUserInvocationStack(value: String): Self = StObject.set(x, "userInvocationStack", value.asInstanceOf[js.Any])
    
    inline def setUserInvocationStackUndefined: Self = StObject.set(x, "userInvocationStack", js.undefined)
  }
}
