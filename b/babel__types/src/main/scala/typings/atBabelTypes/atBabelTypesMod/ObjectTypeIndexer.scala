package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ObjectTypeIndexer
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var id: Identifier | Null
  var key: FlowType
  var static: Boolean | Null
  @JSName("type")
  var type_ObjectTypeIndexer: typings.atBabelTypes.atBabelTypesStrings.ObjectTypeIndexer
  var value: FlowType
  var variance: Variance | Null
}

object ObjectTypeIndexer {
  @scala.inline
  def apply(
    key: FlowType,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ObjectTypeIndexer,
    value: FlowType,
    end: Int | Double = null,
    id: Identifier = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    static: js.UndefOr[Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    variance: Variance = null
  ): ObjectTypeIndexer = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (variance != null) __obj.updateDynamic("variance")(variance)
    __obj.asInstanceOf[ObjectTypeIndexer]
  }
}

@JSImport("@babel/types", "objectTypeIndexer")
@js.native
object objectTypeIndexer extends js.Object {
  def apply(id: js.UndefOr[scala.Nothing], key: FlowType, value: FlowType): ObjectTypeIndexer = js.native
  def apply(id: js.UndefOr[scala.Nothing], key: FlowType, value: FlowType, variance: Null, _static: Boolean): ObjectTypeIndexer = js.native
  def apply(id: js.UndefOr[scala.Nothing], key: FlowType, value: FlowType, variance: Variance): ObjectTypeIndexer = js.native
  def apply(
    id: js.UndefOr[scala.Nothing],
    key: FlowType,
    value: FlowType,
    variance: Variance,
    _static: Boolean
  ): ObjectTypeIndexer = js.native
  def apply(id: Null, key: FlowType, value: FlowType): ObjectTypeIndexer = js.native
  def apply(id: Null, key: FlowType, value: FlowType, variance: Null, _static: Boolean): ObjectTypeIndexer = js.native
  def apply(id: Null, key: FlowType, value: FlowType, variance: Variance): ObjectTypeIndexer = js.native
  def apply(id: Null, key: FlowType, value: FlowType, variance: Variance, _static: Boolean): ObjectTypeIndexer = js.native
  def apply(id: Identifier, key: FlowType, value: FlowType): ObjectTypeIndexer = js.native
  def apply(id: Identifier, key: FlowType, value: FlowType, variance: Null, _static: Boolean): ObjectTypeIndexer = js.native
  def apply(id: Identifier, key: FlowType, value: FlowType, variance: Variance): ObjectTypeIndexer = js.native
  def apply(id: Identifier, key: FlowType, value: FlowType, variance: Variance, _static: Boolean): ObjectTypeIndexer = js.native
}

