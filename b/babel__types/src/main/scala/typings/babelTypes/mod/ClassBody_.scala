package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBody_
  extends BaseNode
     with _Node {
  var body: js.Array[
    ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | TSDeclareMethod_ | TSIndexSignature_
  ]
  @JSName("type")
  var type_ClassBody_ : ClassBody
}

object ClassBody_ {
  @scala.inline
  def apply(
    body: js.Array[
      ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | TSDeclareMethod_ | TSIndexSignature_
    ],
    `type`: ClassBody,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ClassBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBody_]
  }
}

