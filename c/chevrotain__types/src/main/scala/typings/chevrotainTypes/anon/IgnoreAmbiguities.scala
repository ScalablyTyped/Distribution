package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.IProduction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreAmbiguities extends StObject {
  
  var definition: js.Array[IProduction]
  
  var ignoreAmbiguities: js.UndefOr[Boolean] = js.undefined
}
object IgnoreAmbiguities {
  
  inline def apply(definition: js.Array[IProduction]): IgnoreAmbiguities = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreAmbiguities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoreAmbiguities] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setIgnoreAmbiguities(value: Boolean): Self = StObject.set(x, "ignoreAmbiguities", value.asInstanceOf[js.Any])
    
    inline def setIgnoreAmbiguitiesUndefined: Self = StObject.set(x, "ignoreAmbiguities", js.undefined)
  }
}
