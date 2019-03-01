package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropIndexOptions extends js.Object {
  /**
    * If true, attempting to drop on a bucket without the specified index won't cause an error to be thrown.
    */
  var ignoreIfNotExists: js.UndefOr[scala.Boolean] = js.undefined
}

object DropIndexOptions {
  @scala.inline
  def apply(ignoreIfNotExists: js.UndefOr[scala.Boolean] = js.undefined): DropIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfNotExists)) __obj.updateDynamic("ignoreIfNotExists")(ignoreIfNotExists)
    __obj.asInstanceOf[DropIndexOptions]
  }
}

