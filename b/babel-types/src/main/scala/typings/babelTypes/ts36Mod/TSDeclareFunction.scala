package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSDeclareFunction
  extends Node
     with Declaration
     with Statement {
  
  var async: Boolean = js.native
  
  var declare: Boolean | Null = js.native
  
  var generator: Boolean = js.native
  
  var id: Identifier_ | Null = js.native
  
  var params: js.Array[LVal] = js.native
  
  var returnType: TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Noop_ | Null = js.native
  
  @JSName("type")
  var type_TSDeclareFunction: typings.babelTypes.babelTypesStrings.TSDeclareFunction = js.native
}
@JSImport("babel-types/ts3.6", "TSDeclareFunction")
@js.native
object TSDeclareFunction extends js.Object {
  
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[LVal],
    returnType: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null]
  ): TSDeclareFunction = js.native
}
