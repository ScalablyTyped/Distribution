package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.FunctionDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait FunctionDeclaration_
  extends BlockParent
     with BaseNode
     with Declaration
     with Function
     with FunctionParent
     with Pureish
     with Scopable
     with Statement {
  var async: Boolean
  var body: BlockStatement_
  var declare: Boolean | Null
  var generator: Boolean
  var id: Identifier_ | Null
  var params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  var returnType: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  var typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ | Null
  @JSName("type")
  var type_FunctionDeclaration_ : FunctionDeclaration
}

object FunctionDeclaration_ {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: FunctionDeclaration,
    declare: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    id: Identifier_ = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    returnType: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ = null
  ): FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration_]
  }
}

