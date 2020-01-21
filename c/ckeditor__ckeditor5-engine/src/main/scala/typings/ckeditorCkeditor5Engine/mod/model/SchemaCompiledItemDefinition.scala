package typings.ckeditorCkeditor5Engine.mod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaCompiledItemDefinition extends js.Object {
  var allowAttributes: String | js.Array[String]
  var allowIn: String | js.Array[String]
  var isBlock: Boolean
  var isLimit: Boolean
  var isObject: Boolean
  var name: String
}

object SchemaCompiledItemDefinition {
  @scala.inline
  def apply(
    allowAttributes: String | js.Array[String],
    allowIn: String | js.Array[String],
    isBlock: Boolean,
    isLimit: Boolean,
    isObject: Boolean,
    name: String
  ): SchemaCompiledItemDefinition = {
    val __obj = js.Dynamic.literal(allowAttributes = allowAttributes.asInstanceOf[js.Any], allowIn = allowIn.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], isLimit = isLimit.asInstanceOf[js.Any], isObject = isObject.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SchemaCompiledItemDefinition]
  }
}

