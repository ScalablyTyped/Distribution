package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSArrayType
  extends Node
     with TSType {
  
  var elementType: TSType = js.native
  
  @JSName("type")
  var type_TSArrayType: typings.babelTypes.babelTypesStrings.TSArrayType = js.native
}
object TSArrayType {
  
  @JSImport("babel-types/ts3.6", "TSArrayType")
  @js.native
  def apply(elementType: TSType): TSArrayType = js.native
  
  @scala.inline
  implicit class TSArrayTypeMutableBuilder[Self <: TSArrayType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: TSType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
