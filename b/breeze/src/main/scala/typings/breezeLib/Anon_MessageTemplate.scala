package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageTemplate extends js.Object {
  var messageTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MessageTemplate {
  @scala.inline
  def apply(messageTemplate: java.lang.String = null): Anon_MessageTemplate = {
    val __obj = js.Dynamic.literal()
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate)
    __obj.asInstanceOf[Anon_MessageTemplate]
  }
}

