package typings.commandDashLineDashUsage.commandDashLineDashUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a command-line option. Additionally, if generating a usage guide with command-line-usage you could optionally add description and typeLabel properties to each definition. */
trait OptionDefinition extends js.Object {
  /** getopt-style short option names. Can be any single character (unicode included) except a digit or hyphen. */
  var alias: js.UndefOr[String] = js.undefined
  /** Any values unaccounted for by an option definition will be set on the defaultOption. This flag is typically set on the most commonly-used option to make for more concise usage. */
  var defaultOption: js.UndefOr[Boolean] = js.undefined
  /** An initial value for the option. */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /** A string describing the option. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * When your app has a large amount of options it makes sense to organise them in groups.
    *
    * There are two automatic groups: _all (contains all options) and _none (contains options without a group specified in their definition).
    */
  var group: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Identical to multiple but with greedy parsing disabled. */
  var lazyMultiple: js.UndefOr[Boolean] = js.undefined
  /** Set this flag if the option takes a list of values. You will receive an array of values, each passed through the type function (if specified). */
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: String
  /**
    * The type value is a setter function (you receive the output from this), enabling you to be specific about the type and value received.
    *
    * The most common values used are String (the default), Number and Boolean but you can use a custom function.
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
  /** A string to replace the default type string (e.g. <string>). It's often more useful to set a more descriptive type label, like <ms>, <files>, <command>, etc.. */
  var typeLabel: js.UndefOr[String] = js.undefined
}

object OptionDefinition {
  @scala.inline
  def apply(
    name: String,
    alias: String = null,
    defaultOption: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Any = null,
    description: String = null,
    group: String | js.Array[String] = null,
    lazyMultiple: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    `type`: js.Any = null,
    typeLabel: String = null
  ): OptionDefinition = {
    val __obj = js.Dynamic.literal(name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(defaultOption)) __obj.updateDynamic("defaultOption")(defaultOption)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyMultiple)) __obj.updateDynamic("lazyMultiple")(lazyMultiple)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeLabel != null) __obj.updateDynamic("typeLabel")(typeLabel)
    __obj.asInstanceOf[OptionDefinition]
  }
}

