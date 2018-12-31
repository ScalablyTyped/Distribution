package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareFunction extends Node {
  var async: scala.Boolean
  var declare: scala.Boolean | scala.Null
  var generator: scala.Boolean
  var id: Identifier | scala.Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_TSDeclareFunction: babelDashTypesLib.babelDashTypesLibStrings.TSDeclareFunction
}

