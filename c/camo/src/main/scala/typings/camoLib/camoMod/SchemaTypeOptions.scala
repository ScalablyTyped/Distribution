package typings
package camoLib.camoMod

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
  var `match`: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
  		 * Max value (only with Number)
  		 */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Min value (only with Number)
  		 */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Required field
  		 */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Type of data
  		 */
  var `type`: SchemaTypeConstructor
  /**
  		 * Unique value (like ids)
  		 */
  var unique: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Validation function.
  		 *
  		 * @param {Type} value Value taken.
  		 * @returns {boolean} true (validation ok) or false (validation wrong).
  		 */
  var validate: js.UndefOr[js.Function1[/* value */ Type, scala.Boolean]] = js.undefined
}

