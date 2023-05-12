package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.IProduction
import typings.chevrotainTypes.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Separator extends StObject {
  
  var definition: js.Array[IProduction]
  
  var idx: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var separator: TokenType
}
object Separator {
  
  inline def apply(definition: js.Array[IProduction], separator: TokenType): Separator = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Separator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Separator] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSeparator(value: TokenType): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
  }
}
