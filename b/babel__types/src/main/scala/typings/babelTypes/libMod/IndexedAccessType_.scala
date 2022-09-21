package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.IndexedAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedAccessType_
  extends StObject
     with BaseNode
     with Flow
     with FlowType
     with Node {
  
  var indexType: FlowType
  
  var objectType: FlowType
  
  @JSName("type")
  var type_IndexedAccessType_ : IndexedAccessType
}
object IndexedAccessType_ {
  
  inline def apply(indexType: FlowType, objectType: FlowType): IndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexedAccessType")
    __obj.asInstanceOf[IndexedAccessType_]
  }
  
  extension [Self <: IndexedAccessType_](x: Self) {
    
    inline def setIndexType(value: FlowType): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: FlowType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setType(value: IndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
