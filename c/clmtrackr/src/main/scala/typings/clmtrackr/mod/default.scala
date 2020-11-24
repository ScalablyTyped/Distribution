package typings.clmtrackr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("clmtrackr", JSImport.Default)
@js.native
object default extends js.Object {
  
  val version: String = js.native
  
  @js.native
  class tracker ()
    extends typings.clmtrackr.mod._default.tracker {
    def this(params: TrackerParams) = this()
  }
}
