package typings.camo.camoMod

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
  var populate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}

object FindOneOptions {
  @scala.inline
  def apply(populate: Boolean | js.Array[String] = null): FindOneOptions = {
    val __obj = js.Dynamic.literal()
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOneOptions]
  }
}

