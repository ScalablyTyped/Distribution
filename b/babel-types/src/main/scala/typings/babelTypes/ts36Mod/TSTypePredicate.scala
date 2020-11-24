package typings.babelTypes.ts36Mod

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
@JSImport("babel-types/ts3.6", "TSTypePredicate")
@js.native
object TSTypePredicate extends js.Object {
  
  def apply(parameterName: Identifier_, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  def apply(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
}
