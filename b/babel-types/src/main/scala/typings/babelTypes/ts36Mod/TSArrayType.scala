package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSArrayType
  extends StObject
     with Node
     with TSType {
  
  var elementType: TSType
  
  @JSName("type")
  var type_TSArrayType: typings.babelTypes.babelTypesStrings.TSArrayType
}
object TSArrayType {
  
  @JSImport("babel-types/ts3.6", "TSArrayType")
  @js.native
  def apply(elementType: TSType): TSArrayType = js.native
  
  extension [Self <: TSArrayType](x: Self) {
    
    inline def setElementType(value: TSType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
