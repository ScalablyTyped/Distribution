package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.EnqueuedCommandAttributes> */
trait PartialEnqueuedCommandAtt extends StObject {
  
  var args: js.UndefOr[js.Array[Any]] = js.undefined
  
  var chainerId: js.UndefOr[String] = js.undefined
  
  var fn: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var injected: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var userInvocationStack: js.UndefOr[String] = js.undefined
}
object PartialEnqueuedCommandAtt {
  
  inline def apply(): PartialEnqueuedCommandAtt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEnqueuedCommandAtt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialEnqueuedCommandAtt] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setChainerId(value: String): Self = StObject.set(x, "chainerId", value.asInstanceOf[js.Any])
    
    inline def setChainerIdUndefined: Self = StObject.set(x, "chainerId", js.undefined)
    
    inline def setFn(value: /* repeated */ Any => Any): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInjected(value: Boolean): Self = StObject.set(x, "injected", value.asInstanceOf[js.Any])
    
    inline def setInjectedUndefined: Self = StObject.set(x, "injected", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuery(value: Boolean): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserInvocationStack(value: String): Self = StObject.set(x, "userInvocationStack", value.asInstanceOf[js.Any])
    
    inline def setUserInvocationStackUndefined: Self = StObject.set(x, "userInvocationStack", js.undefined)
  }
}
