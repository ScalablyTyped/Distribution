package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchemaRefType extends js.Object {
  @JSName("$ref")
  var $ref: String
}

object JSONSchemaRefType {
  @scala.inline
  def apply($ref: String): JSONSchemaRefType = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONSchemaRefType]
  }
}

