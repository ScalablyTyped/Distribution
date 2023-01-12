package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSUnionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUnionType__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSUnionType__ : TSUnionType
  
  var types: js.Array[TSType]
}
object TSUnionType__ {
  
  inline def apply(types: js.Array[TSType]): TSUnionType__ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[TSUnionType__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSUnionType__] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
