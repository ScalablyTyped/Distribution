package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitHelperBase extends StObject {
  
  val dependencies: js.UndefOr[Array[EmitHelper]] = js.undefined
  
  val name: java.lang.String
  
  val priority: js.UndefOr[Double] = js.undefined
  
  val scoped: Boolean
  
  val text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
}
object EmitHelperBase {
  
  inline def apply(
    name: java.lang.String,
    scoped: Boolean,
    text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
  ): EmitHelperBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitHelperBase]
  }
  
  extension [Self <: EmitHelperBase](x: Self) {
    
    inline def setDependencies(value: Array[EmitHelper]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setText(
      value: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextFunction1(value: /* node */ EmitHelperUniqueNameCallback => java.lang.String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
