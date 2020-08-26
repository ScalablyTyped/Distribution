package typings.ckeditorCkeditor5Engine.mod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaItemDefinition extends js.Object {
  var allowAttributes: String | js.Array[String] = js.native
  var allowAttributesOf: String | js.Array[String] = js.native
  var allowContentOf: String | js.Array[String] = js.native
  var allowIn: String | js.Array[String] = js.native
  var allowWhere: String | js.Array[String] = js.native
  var inheritAllFrom: String | js.Array[String] = js.native
  var inheritTypesFrom: String | js.Array[String] = js.native
  var isBlock: Boolean = js.native
  var isLimit: Boolean = js.native
  var isObject: Boolean = js.native
}

object SchemaItemDefinition {
  @scala.inline
  def apply(
    allowAttributes: String | js.Array[String],
    allowAttributesOf: String | js.Array[String],
    allowContentOf: String | js.Array[String],
    allowIn: String | js.Array[String],
    allowWhere: String | js.Array[String],
    inheritAllFrom: String | js.Array[String],
    inheritTypesFrom: String | js.Array[String],
    isBlock: Boolean,
    isLimit: Boolean,
    isObject: Boolean
  ): SchemaItemDefinition = {
    val __obj = js.Dynamic.literal(allowAttributes = allowAttributes.asInstanceOf[js.Any], allowAttributesOf = allowAttributesOf.asInstanceOf[js.Any], allowContentOf = allowContentOf.asInstanceOf[js.Any], allowIn = allowIn.asInstanceOf[js.Any], allowWhere = allowWhere.asInstanceOf[js.Any], inheritAllFrom = inheritAllFrom.asInstanceOf[js.Any], inheritTypesFrom = inheritTypesFrom.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], isLimit = isLimit.asInstanceOf[js.Any], isObject = isObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaItemDefinition]
  }
  @scala.inline
  implicit class SchemaItemDefinitionOps[Self <: SchemaItemDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowAttributesVarargs(value: String*): Self = this.set("allowAttributes", js.Array(value :_*))
    @scala.inline
    def setAllowAttributes(value: String | js.Array[String]): Self = this.set("allowAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowAttributesOfVarargs(value: String*): Self = this.set("allowAttributesOf", js.Array(value :_*))
    @scala.inline
    def setAllowAttributesOf(value: String | js.Array[String]): Self = this.set("allowAttributesOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowContentOfVarargs(value: String*): Self = this.set("allowContentOf", js.Array(value :_*))
    @scala.inline
    def setAllowContentOf(value: String | js.Array[String]): Self = this.set("allowContentOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowInVarargs(value: String*): Self = this.set("allowIn", js.Array(value :_*))
    @scala.inline
    def setAllowIn(value: String | js.Array[String]): Self = this.set("allowIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowWhereVarargs(value: String*): Self = this.set("allowWhere", js.Array(value :_*))
    @scala.inline
    def setAllowWhere(value: String | js.Array[String]): Self = this.set("allowWhere", value.asInstanceOf[js.Any])
    @scala.inline
    def setInheritAllFromVarargs(value: String*): Self = this.set("inheritAllFrom", js.Array(value :_*))
    @scala.inline
    def setInheritAllFrom(value: String | js.Array[String]): Self = this.set("inheritAllFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setInheritTypesFromVarargs(value: String*): Self = this.set("inheritTypesFrom", js.Array(value :_*))
    @scala.inline
    def setInheritTypesFrom(value: String | js.Array[String]): Self = this.set("inheritTypesFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBlock(value: Boolean): Self = this.set("isBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLimit(value: Boolean): Self = this.set("isLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsObject(value: Boolean): Self = this.set("isObject", value.asInstanceOf[js.Any])
  }
  
}

