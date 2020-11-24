package typings.consolidate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consolidate extends ConsolidateType {
  
  /**
    * Clear the cache.
    *
    * @api public
    */
  def clearCache(): Unit = js.native
  
  /**
    * expose the instance of the engine
    */
  var requires: RequiresType = js.native
}
