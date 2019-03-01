package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxLengthMessageTemplate extends js.Object {
  var maxLength: scala.Double
  var messageTemplate: js.UndefOr[java.lang.String] = js.undefined
  var minLength: scala.Double
}

object Anon_MaxLengthMessageTemplate {
  @scala.inline
  def apply(maxLength: scala.Double, minLength: scala.Double, messageTemplate: java.lang.String = null): Anon_MaxLengthMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxLength")(maxLength)
    __obj.updateDynamic("minLength")(minLength)
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate)
    __obj.asInstanceOf[Anon_MaxLengthMessageTemplate]
  }
}

