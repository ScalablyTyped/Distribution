package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassDeclaration extends Node {
  var body: ClassBody
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var id: Identifier
  var implements: js.UndefOr[js.Array[ClassImplements]] = js.undefined
  var mixins: js.UndefOr[js.Array[_]] = js.undefined
  var superClass: Expression
  var superTypeParameters: js.UndefOr[TypeParameterInstantiation] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_ClassDeclaration: babelDashTypesLib.babelDashTypesLibStrings.ClassDeclaration
}

