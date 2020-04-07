package typings.cypress

import typings.cypress.cypressMod.Cypress.ObjectLike
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.LogConfig> */
trait PartialLogConfig extends js.Object {
  @JSName("$el")
  var $el: js.UndefOr[JQuery_[HTMLElement]] = js.undefined
  var consoleProps: js.UndefOr[js.Function0[ObjectLike]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[js.Array[_]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object PartialLogConfig {
  @scala.inline
  def apply(
    $el: JQuery_[HTMLElement] = null,
    consoleProps: () => ObjectLike = null,
    displayName: String = null,
    message: js.Array[_] = null,
    name: String = null
  ): PartialLogConfig = {
    val __obj = js.Dynamic.literal()
    if ($el != null) __obj.updateDynamic("$el")($el.asInstanceOf[js.Any])
    if (consoleProps != null) __obj.updateDynamic("consoleProps")(js.Any.fromFunction0(consoleProps))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLogConfig]
  }
}

