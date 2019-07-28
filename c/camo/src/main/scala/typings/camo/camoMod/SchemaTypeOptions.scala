package typings.camo.camoMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaTypeOptions[Type] extends js.Object {
  /**
  		 * Posible options
  		 */
  var choices: js.UndefOr[js.Array[Type]] = js.undefined
  /**
  		 * Default value
  		 */
  var default: js.UndefOr[Type] = js.undefined
  /**
  		 * RegEx to match value
  		 */
  var `match`: js.UndefOr[RegExp] = js.undefined
  /**
  		 * Max value (only with Number)
  		 */
  var max: js.UndefOr[Double] = js.undefined
  /**
  		 * Min value (only with Number)
  		 */
  var min: js.UndefOr[Double] = js.undefined
  /**
  		 * Required field
  		 */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Type of data
  		 */
  var `type`: SchemaTypeConstructor
  /**
  		 * Unique value (like ids)
  		 */
  var unique: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Validation function.
  		 *
  		 * @param {Type} value Value taken.
  		 * @returns {boolean} true (validation ok) or false (validation wrong).
  		 */
  var validate: js.UndefOr[js.Function1[/* value */ Type, Boolean]] = js.undefined
}

object SchemaTypeOptions {
  @scala.inline
  def apply[Type](
    `type`: SchemaTypeConstructor,
    choices: js.Array[Type] = null,
    default: Type = null,
    `match`: RegExp = null,
    max: Int | Double = null,
    min: Int | Double = null,
    required: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined,
    validate: /* value */ Type => Boolean = null
  ): SchemaTypeOptions[Type] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    __obj.asInstanceOf[SchemaTypeOptions[Type]]
  }
}

