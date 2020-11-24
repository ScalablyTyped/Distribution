package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeOperator
  extends Node
     with TSType {
  
  var operator: String | Null = js.native
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSTypeOperator: typings.babelTypes.babelTypesStrings.TSTypeOperator = js.native
}
@JSImport("babel-types/ts3.6", "TSTypeOperator")
@js.native
object TSTypeOperator extends js.Object {
  
  def apply(typeAnnotation: TSType): TSTypeOperator = js.native
}
