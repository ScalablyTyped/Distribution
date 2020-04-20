package typings.ckeditorCkeditor5Engine.mod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaItemDefinition extends js.Object {
  var allowAttributes: String | js.Array[String]
  var allowAttributesOf: String | js.Array[String]
  var allowContentOf: String | js.Array[String]
  var allowIn: String | js.Array[String]
  var allowWhere: String | js.Array[String]
  var inheritAllFrom: String | js.Array[String]
  var inheritTypesFrom: String | js.Array[String]
  var isBlock: Boolean
  var isLimit: Boolean
  var isObject: Boolean
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
}

