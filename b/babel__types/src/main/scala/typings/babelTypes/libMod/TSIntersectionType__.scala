package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSIntersectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSIntersectionType__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSIntersectionType__ : TSIntersectionType
  
  var types: js.Array[TSType]
}
object TSIntersectionType__ {
  
  inline def apply(types: js.Array[TSType]): TSIntersectionType__ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[TSIntersectionType__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSIntersectionType__] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSIntersectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
