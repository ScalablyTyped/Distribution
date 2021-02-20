package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSParenthesizedType
  extends Node
     with TSType {
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSParenthesizedType: typings.babelTypes.babelTypesStrings.TSParenthesizedType = js.native
}
object TSParenthesizedType {
  
  @JSImport("babel-types/ts3.6", "TSParenthesizedType")
  @js.native
  def apply(typeAnnotation: TSType): TSParenthesizedType = js.native
  
  @scala.inline
  implicit class TSParenthesizedTypeMutableBuilder[Self <: TSParenthesizedType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSParenthesizedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
