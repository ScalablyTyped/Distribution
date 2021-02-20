package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTupleType
  extends Node
     with TSType {
  
  var elementTypes: js.Array[TSType] = js.native
  
  @JSName("type")
  var type_TSTupleType: typings.babelTypes.babelTypesStrings.TSTupleType = js.native
}
object TSTupleType {
  
  @JSImport("babel-types/ts3.6", "TSTupleType")
  @js.native
  def apply(elementTypes: js.Array[TSType]): TSTupleType = js.native
  
  @scala.inline
  implicit class TSTupleTypeMutableBuilder[Self <: TSTupleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementTypes(value: js.Array[TSType]): Self = StObject.set(x, "elementTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypesVarargs(value: TSType*): Self = StObject.set(x, "elementTypes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSTupleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
