package typings.commandDashLineDashArgs.commandDashLineDashArgsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionDefinition extends js.Object {
  /**
    * A getopt-style short option name. Can be any single character except a digit or hyphen.
    */
  var alias: js.UndefOr[String] = js.undefined
  /**
    * Any values unaccounted for by an option definition will be set on the `defaultOption`. This flag is typically set
    * on the most commonly-used option to enable more concise usage.
    */
  var defaultOption: js.UndefOr[Boolean] = js.undefined
  /**
    * An initial value for the option.
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * One or more group names the option belongs to.
    */
  var group: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Identical to `multiple` but with greedy parsing disabled.
    */
  var lazyMultiple: js.UndefOr[Boolean] = js.undefined
  /**
    * Set this flag if the option accepts multiple values. In the output, you will receive an array of values each passed through the `type` function.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * The long option name.
    */
  var name: String
  /**
    * A setter function (you receive the output from this) enabling you to be specific about the type and value received. Typical values
    * are `String` (the default), `Number` and `Boolean` but you can use a custom function. If no option value was set you will receive `null`.
    */
  var `type`: js.UndefOr[js.Function1[/* input */ String, _]] = js.undefined
}

object OptionDefinition {
  @scala.inline
  def apply(
    name: String,
    alias: String = null,
    defaultOption: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Any = null,
    group: String | js.Array[String] = null,
    lazyMultiple: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    `type`: /* input */ String => _ = null
  ): OptionDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOption)) __obj.updateDynamic("defaultOption")(defaultOption.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyMultiple)) __obj.updateDynamic("lazyMultiple")(lazyMultiple.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[OptionDefinition]
  }
}

