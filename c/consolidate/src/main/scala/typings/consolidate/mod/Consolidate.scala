package typings.consolidate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consolidate extends ConsolidateType {
  /**
    * expose the instance of the engine
    */
  var requires: RequiresType = js.native
  /**
    * Clear the cache.
    *
    * @api public
    */
  def clearCache(): Unit = js.native
}

