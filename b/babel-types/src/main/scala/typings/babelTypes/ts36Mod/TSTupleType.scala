package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTupleType
  extends StObject
     with Node
     with TSType {
  
  var elementTypes: js.Array[TSType]
  
  @JSName("type")
  var type_TSTupleType: typings.babelTypes.babelTypesStrings.TSTupleType
}
object TSTupleType {
  
  @JSImport("babel-types/ts3.6", "TSTupleType")
  @js.native
  def apply(elementTypes: js.Array[TSType]): TSTupleType = js.native
  
  extension [Self <: TSTupleType](x: Self) {
    
    inline def setElementTypes(value: js.Array[TSType]): Self = StObject.set(x, "elementTypes", value.asInstanceOf[js.Any])
    
    inline def setElementTypesVarargs(value: TSType*): Self = StObject.set(x, "elementTypes", js.Array(value :_*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTupleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
