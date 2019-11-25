package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBody
  extends BaseNode
     with _Node {
  var body: js.Array[
    ClassMethod | ClassPrivateMethod | ClassProperty | ClassPrivateProperty | TSDeclareMethod | TSIndexSignature
  ]
  @JSName("type")
  var type_ClassBody: typings.atBabelTypes.atBabelTypesStrings.ClassBody
}

object ClassBody {
  @scala.inline
  def apply(
    body: js.Array[
      ClassMethod | ClassPrivateMethod | ClassProperty | ClassPrivateProperty | TSDeclareMethod | TSIndexSignature
    ],
    `type`: typings.atBabelTypes.atBabelTypesStrings.ClassBody,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBody]
  }
}

@JSImport("@babel/types", "classBody")
@js.native
object classBody extends js.Object {
  def apply(
    body: js.Array[
      ClassMethod | ClassPrivateMethod | ClassProperty | ClassPrivateProperty | TSDeclareMethod | TSIndexSignature
    ]
  ): ClassBody = js.native
}

