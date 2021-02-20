package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypePredicate
  extends Node
     with TSType {
  
  var parameterName: Identifier_ | TSThisType = js.native
  
  var typeAnnotation: TSTypeAnnotation = js.native
  
  @JSName("type")
  var type_TSTypePredicate: typings.babelTypes.babelTypesStrings.TSTypePredicate = js.native
}
object TSTypePredicate {
  
  @JSImport("babel-types/ts3.6", "TSTypePredicate")
  @js.native
  def apply(parameterName: Identifier_, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  @JSImport("babel-types/ts3.6", "TSTypePredicate")
  @js.native
  def apply(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  
  @scala.inline
  implicit class TSTypePredicateMutableBuilder[Self <: TSTypePredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterName(value: Identifier_ | TSThisType): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSTypePredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
