package typings
package camoLib.camoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOneOptions extends js.Object {
  /**
  		 * Find all or no references.
  		 * Pass an array of field names to only populate the specified references.
  		 *
  		 * @type {(boolean | string[])}
  		 */
  var populate: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
}

object FindOneOptions {
  @scala.inline
  def apply(populate: scala.Boolean | js.Array[java.lang.String] = null): FindOneOptions = {
    val __obj = js.Dynamic.literal()
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOneOptions]
  }
}

