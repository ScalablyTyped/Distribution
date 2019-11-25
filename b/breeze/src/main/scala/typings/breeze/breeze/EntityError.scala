package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityError extends js.Object {
  var entity: Entity
  var errorMessage: String
  var errorName: String
  var isServerError: Boolean
  var propertyName: String
}

object EntityError {
  @scala.inline
  def apply(
    entity: Entity,
    errorMessage: String,
    errorName: String,
    isServerError: Boolean,
    propertyName: String
  ): EntityError = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], errorName = errorName.asInstanceOf[js.Any], isServerError = isServerError.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityError]
  }
}

