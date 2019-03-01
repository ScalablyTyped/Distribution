package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassDeclaration
  extends Node
     with Class
     with Declaration
     with Pureish
     with Scopable
     with Statement {
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

object ClassDeclaration {
  @scala.inline
  def apply(
    body: ClassBody,
    end: scala.Double,
    id: Identifier,
    loc: SourceLocation,
    start: scala.Double,
    superClass: Expression,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ClassDeclaration,
    decorators: js.Array[Decorator] = null,
    implements: js.Array[ClassImplements] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    mixins: js.Array[_] = null,
    superTypeParameters: TypeParameterInstantiation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("superClass")(superClass)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (implements != null) __obj.updateDynamic("implements")(implements)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[ClassDeclaration]
  }
}

