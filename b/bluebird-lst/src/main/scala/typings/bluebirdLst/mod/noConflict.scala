package typings.bluebirdLst.mod

import typings.bluebirdLst.anon.TypeofBluebird
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bluebird-lst", "noConflict")
@js.native
object noConflict extends js.Object {
  
  /**
    * This is relevant to browser environments with no module loader.
    *
    * Release control of the Promise namespace to whatever it was before this library was loaded. Returns a reference to the library namespace so you can attach it to something else.
    */
  def apply(): TypeofBluebird = js.native
}
