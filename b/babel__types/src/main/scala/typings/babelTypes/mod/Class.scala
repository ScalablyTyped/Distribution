package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassDeclaration
import typings.babelTypes.babelTypesStrings.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ClassExpression_
  - typings.babelTypes.mod.ClassDeclaration_
*/
trait Class extends _Node

object Class {
  @scala.inline
  def ClassExpression_(
    body: ClassBody_,
    `type`: ClassExpression,
    decorators: js.Array[Decorator_] = null,
    end: Double = null.asInstanceOf[Double],
    id: Identifier_ = null,
    implements: js.Array[TSExpressionWithTypeArguments_ | ClassImplements_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    mixins: InterfaceExtends_ = null,
    start: Double = null.asInstanceOf[Double],
    superClass: Expression = null,
    superTypeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ = null
  ): Class = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any], superTypeParameters = superTypeParameters.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  def ClassDeclaration_(
    body: ClassBody_,
    id: Identifier_,
    `type`: ClassDeclaration,
    `abstract`: Boolean = null.asInstanceOf[Boolean],
    declare: Boolean = null.asInstanceOf[Boolean],
    decorators: js.Array[Decorator_] = null,
    end: Double = null.asInstanceOf[Double],
    implements: js.Array[TSExpressionWithTypeArguments_ | ClassImplements_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    mixins: InterfaceExtends_ = null,
    start: Double = null.asInstanceOf[Double],
    superClass: Expression = null,
    superTypeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ = null
  ): Class = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any], superTypeParameters = superTypeParameters.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

