package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityError extends js.Object {
  var entity: Entity
  var errorMessage: java.lang.String
  var errorName: java.lang.String
  var isServerError: scala.Boolean
  var propertyName: java.lang.String
}

object EntityError {
  @scala.inline
  def apply(
    entity: Entity,
    errorMessage: java.lang.String,
    errorName: java.lang.String,
    isServerError: scala.Boolean,
    propertyName: java.lang.String
  ): EntityError = {
    val __obj = js.Dynamic.literal(entity = entity, errorMessage = errorMessage, errorName = errorName, isServerError = isServerError, propertyName = propertyName)
  
    __obj.asInstanceOf[EntityError]
  }
}

