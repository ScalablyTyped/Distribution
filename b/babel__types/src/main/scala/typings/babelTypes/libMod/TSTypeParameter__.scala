package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSTypeParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameter__
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var default: js.UndefOr[TSType | Null] = js.undefined
  
  var constraint: js.UndefOr[TSType | Null] = js.undefined
  
  var in: js.UndefOr[Boolean | Null] = js.undefined
  
  var name: String
  
  var out: js.UndefOr[Boolean | Null] = js.undefined
  
  @JSName("type")
  var type_TSTypeParameter__ : TSTypeParameter
}
object TSTypeParameter__ {
  
  inline def apply(name: String): TSTypeParameter__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[TSTypeParameter__]
  }
  
  extension [Self <: TSTypeParameter__](x: Self) {
    
    inline def setConstraint(value: TSType): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintNull: Self = StObject.set(x, "constraint", null)
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setDefault(value: TSType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInNull: Self = StObject.set(x, "in", null)
    
    inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOutNull: Self = StObject.set(x, "out", null)
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    inline def setType(value: TSTypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
