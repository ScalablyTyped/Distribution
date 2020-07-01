package typings.calidation.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorsProviderProps[T /* <: js.Object */] extends js.Object {
  var validators: Record[String, CustomValidatorFunction[T]]
}

object ValidatorsProviderProps {
  @scala.inline
  def apply[/* <: js.Object */ T](validators: Record[String, CustomValidatorFunction[T]]): ValidatorsProviderProps[T] = {
    val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorsProviderProps[T]]
  }
}

