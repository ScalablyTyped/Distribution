package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.IProduction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionIdx extends StObject {
  
  var definition: js.Array[IProduction]
  
  var idx: js.UndefOr[Double] = js.undefined
}
object DefinitionIdx {
  
  inline def apply(definition: js.Array[IProduction]): DefinitionIdx = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionIdx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinitionIdx] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
  }
}
