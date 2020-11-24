package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeParameterDeclaration extends Node {
  
  var params: js.Array[TSTypeParameter] = js.native
  
  @JSName("type")
  var type_TSTypeParameterDeclaration: typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration = js.native
}
@JSImport("babel-types/ts3.6", "TSTypeParameterDeclaration")
@js.native
object TSTypeParameterDeclaration extends js.Object {
  
  def apply(params: js.Array[TSTypeParameter]): TSTypeParameterDeclaration = js.native
}
