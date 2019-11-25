package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait Identifier
  extends Expression
     with BaseNode
     with LVal
     with PatternLike
     with TSEntityName {
  var decorators: js.Array[Decorator] | Null
  var name: String
  var optional: Boolean | Null
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | Null
  @JSName("type")
  var type_Identifier: typings.atBabelTypes.atBabelTypesStrings.Identifier
}

object Identifier {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.atBabelTypes.atBabelTypesStrings.Identifier,
    decorators: js.Array[Decorator] = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop = null
  ): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

@JSImport("@babel/types", "identifier")
@js.native
object identifier extends js.Object {
  def apply(name: String): Identifier = js.native
  def apply(name: String, decorators: js.Array[Decorator]): Identifier = js.native
  def apply(name: String, decorators: js.Array[Decorator], optional: Boolean): Identifier = js.native
  def apply(name: String, decorators: js.Array[Decorator], optional: Boolean, typeAnnotation: Noop): Identifier = js.native
  def apply(name: String, decorators: js.Array[Decorator], optional: Boolean, typeAnnotation: TSTypeAnnotation): Identifier = js.native
  def apply(name: String, decorators: js.Array[Decorator], optional: Boolean, typeAnnotation: TypeAnnotation): Identifier = js.native
  def apply(name: String, decorators: js.Array[Decorator], optional: Null, typeAnnotation: Noop): Identifier = js.native
  def apply(name: String, decorators: js.Array[Decorator], optional: Null, typeAnnotation: TSTypeAnnotation): Identifier = js.native
  def apply(name: String, decorators: js.Array[Decorator], optional: Null, typeAnnotation: TypeAnnotation): Identifier = js.native
  def apply(name: String, decorators: Null, optional: Boolean): Identifier = js.native
  def apply(name: String, decorators: Null, optional: Boolean, typeAnnotation: Noop): Identifier = js.native
  def apply(name: String, decorators: Null, optional: Boolean, typeAnnotation: TSTypeAnnotation): Identifier = js.native
  def apply(name: String, decorators: Null, optional: Boolean, typeAnnotation: TypeAnnotation): Identifier = js.native
  def apply(name: String, decorators: Null, optional: Null, typeAnnotation: Noop): Identifier = js.native
  def apply(name: String, decorators: Null, optional: Null, typeAnnotation: TSTypeAnnotation): Identifier = js.native
  def apply(name: String, decorators: Null, optional: Null, typeAnnotation: TypeAnnotation): Identifier = js.native
}

