package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialValue extends js.Object {
  var initialValue: js.Any
  var `object`: js.Any
  var property: java.lang.String
  var value: js.Any
}

object Anon_InitialValue {
  @scala.inline
  def apply(initialValue: js.Any, `object`: js.Any, property: java.lang.String, value: js.Any): Anon_InitialValue = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("initialValue")(initialValue)
    __obj.updateDynamic("property")(property)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_InitialValue]
  }
}

