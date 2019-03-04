package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxLength extends js.Object {
  var maxLength: scala.Double
  var messageTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MaxLength {
  @scala.inline
  def apply(maxLength: scala.Double, messageTemplate: java.lang.String = null): Anon_MaxLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength)
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate)
    __obj.asInstanceOf[Anon_MaxLength]
  }
}

