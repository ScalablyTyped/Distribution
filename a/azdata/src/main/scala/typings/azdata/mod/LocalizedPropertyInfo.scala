package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedPropertyInfo extends js.Object {
  var propertyDisplayName: String
  var propertyName: String
  var propertyValue: String
  var propertyValueDisplayName: String
}

object LocalizedPropertyInfo {
  @scala.inline
  def apply(
    propertyDisplayName: String,
    propertyName: String,
    propertyValue: String,
    propertyValueDisplayName: String
  ): LocalizedPropertyInfo = {
    val __obj = js.Dynamic.literal(propertyDisplayName = propertyDisplayName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], propertyValue = propertyValue.asInstanceOf[js.Any], propertyValueDisplayName = propertyValueDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedPropertyInfo]
  }
}

