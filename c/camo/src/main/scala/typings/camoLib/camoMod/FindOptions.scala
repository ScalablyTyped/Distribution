package typings
package camoLib.camoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions extends js.Object {
  /**
  		 * Limits the number of documents returned.
  		 *
  		 * @type {number}
  		 */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Find all or no references.
  		 * Pass an array of field names to only populate the specified references.
  		 *
  		 * @type {(boolean | string[])}
  		 */
  var populate: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
  		 * Skips the given number of documents and returns the rest.
  		 *
  		 * @type {number}
  		 */
  var skip: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Sort the documents by the given field(s).
  		 *
  		 * @type {TypeOrArrayOfType<string>}
  		 */
  var sort: js.UndefOr[TypeOrArrayOfType[java.lang.String]] = js.undefined
}

