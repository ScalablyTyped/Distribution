package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FunctionTypeAnnotation extends Node {
  var params: js.Array[FunctionTypeParam]
  var rest: FunctionTypeParam
  var returnType: FlowTypeAnnotation
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_FunctionTypeAnnotation: babelDashTypesLib.babelDashTypesLibStrings.FunctionTypeAnnotation
}

