package typings
package calidationLib.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorContext extends js.Object {
  var errors: Errors
  var fields: Fields
  var isDirty: scala.Boolean
}

object ValidatorContext {
  @scala.inline
  def apply(errors: Errors, fields: Fields, isDirty: scala.Boolean): ValidatorContext = {
    val __obj = js.Dynamic.literal(errors = errors, fields = fields, isDirty = isDirty)
  
    __obj.asInstanceOf[ValidatorContext]
  }
}

