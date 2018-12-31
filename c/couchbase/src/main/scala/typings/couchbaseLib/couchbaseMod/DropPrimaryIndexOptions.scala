package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropPrimaryIndexOptions extends js.Object {
  /**
    * If true, attempting to drop on a bucket without the specified index won't cause an error to be thrown.
    */
  var ignoreIfNotExists: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The custom name for the primary index.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

