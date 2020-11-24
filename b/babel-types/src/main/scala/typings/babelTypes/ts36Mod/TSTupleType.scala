package typings.babelTypes.ts36Mod

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
@JSImport("babel-types/ts3.6", "TSTupleType")
@js.native
object TSTupleType extends js.Object {
  
  def apply(elementTypes: js.Array[TSType]): TSTupleType = js.native
}
