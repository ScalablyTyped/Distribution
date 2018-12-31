package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareMethod extends Node {
  var `abstract`: scala.Boolean | scala.Null
  var access: babelDashTypesLib.babelDashTypesLibStrings.public | babelDashTypesLib.babelDashTypesLibStrings.`private` | babelDashTypesLib.babelDashTypesLibStrings.`protected` | scala.Null
  var accessibility: babelDashTypesLib.babelDashTypesLibStrings.public | babelDashTypesLib.babelDashTypesLibStrings.`private` | babelDashTypesLib.babelDashTypesLibStrings.`protected` | scala.Null
  var async: scala.Boolean
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var generator: scala.Boolean
  var key: Expression
  var kind: babelDashTypesLib.babelDashTypesLibStrings.get | babelDashTypesLib.babelDashTypesLibStrings.set | babelDashTypesLib.babelDashTypesLibStrings.method | babelDashTypesLib.babelDashTypesLibStrings.constructor
  var optional: scala.Boolean | scala.Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var static: scala.Boolean | scala.Null
  var typeParameters: TypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_TSDeclareMethod: babelDashTypesLib.babelDashTypesLibStrings.TSDeclareMethod
}

