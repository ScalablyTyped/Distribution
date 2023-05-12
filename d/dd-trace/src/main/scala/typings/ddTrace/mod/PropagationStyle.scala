package typings.ddTrace.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropagationStyle extends StObject {
  
  /**
    * Selection and priority order of context propagation extraction mechanisms.
    */
  var extract: js.Array[String]
  
  /**
    * Selection of context propagation injection mechanisms.
    */
  var inject: js.Array[String]
}
object PropagationStyle {
  
  inline def apply(extract: js.Array[String], inject: js.Array[String]): PropagationStyle = {
    val __obj = js.Dynamic.literal(extract = extract.asInstanceOf[js.Any], inject = inject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagationStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropagationStyle] (val x: Self) extends AnyVal {
    
    inline def setExtract(value: js.Array[String]): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setExtractVarargs(value: String*): Self = StObject.set(x, "extract", js.Array(value*))
    
    inline def setInject(value: js.Array[String]): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
    
    inline def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value*))
  }
}
