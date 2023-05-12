package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.IProduction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition extends StObject {
  
  var definition: js.Array[IProduction]
  
  var name: String
  
  var orgText: js.UndefOr[String] = js.undefined
}
object Definition {
  
  inline def apply(definition: js.Array[IProduction], name: String): Definition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrgText(value: String): Self = StObject.set(x, "orgText", value.asInstanceOf[js.Any])
    
    inline def setOrgTextUndefined: Self = StObject.set(x, "orgText", js.undefined)
  }
}
