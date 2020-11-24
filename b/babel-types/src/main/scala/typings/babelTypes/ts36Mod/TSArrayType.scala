package typings.babelTypes.ts36Mod

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
@JSImport("babel-types/ts3.6", "TSArrayType")
@js.native
object TSArrayType extends js.Object {
  
  def apply(elementType: TSType): TSArrayType = js.native
}
