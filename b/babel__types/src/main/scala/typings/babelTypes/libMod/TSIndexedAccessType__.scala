package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSIndexedAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSIndexedAccessType__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var indexType: TSType
  
  var objectType: TSType
  
  @JSName("type")
  var type_TSIndexedAccessType__ : TSIndexedAccessType
}
object TSIndexedAccessType__ {
  
  inline def apply(indexType: TSType, objectType: TSType): TSIndexedAccessType__ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[TSIndexedAccessType__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSIndexedAccessType__] (val x: Self) extends AnyVal {
    
    inline def setIndexType(value: TSType): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: TSType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
