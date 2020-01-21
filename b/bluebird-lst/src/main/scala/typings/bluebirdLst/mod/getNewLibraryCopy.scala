package typings.bluebirdLst.mod

import typings.bluebirdLst.TypeofClassBluebird
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bluebird-lst", "getNewLibraryCopy")
@js.native
object getNewLibraryCopy extends js.Object {
  /**
    * Returns a new independent copy of the Bluebird library.
    *
    * This method should be used before you use any of the methods which would otherwise alter the global Bluebird object - to avoid polluting global state.
    */
  def apply(): TypeofClassBluebird = js.native
}

