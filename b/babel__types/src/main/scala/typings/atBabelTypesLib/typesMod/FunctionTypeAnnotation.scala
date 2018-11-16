package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FunctionTypeAnnotation extends BaseNode {
  var params: js.Array[FunctionTypeParam]
  var rest: FunctionTypeParam | scala.Null
  var returnType: FlowType
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_FunctionTypeAnnotation: atBabelTypesLib.atBabelTypesLibStrings.FunctionTypeAnnotation
}

