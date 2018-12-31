package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassExpression extends BaseNode {
  var body: ClassBody
  var decorators: js.Array[Decorator] | scala.Null
  var id: Identifier | scala.Null
  var implements: (js.Array[TSExpressionWithTypeArguments | ClassImplements]) | scala.Null
  var mixins: js.Any | scala.Null
  var superClass: Expression | scala.Null
  var superTypeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation | scala.Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_ClassExpression: atBabelTypesLib.atBabelTypesLibStrings.ClassExpression
}

