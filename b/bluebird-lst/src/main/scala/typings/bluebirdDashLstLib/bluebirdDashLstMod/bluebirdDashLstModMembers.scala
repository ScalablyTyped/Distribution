package typings
package bluebirdDashLstLib.bluebirdDashLstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bluebird-lst", JSImport.Namespace)
@js.native
object bluebirdDashLstModMembers extends js.Object {
  /**
     * Returns a new independent copy of the Bluebird library.
     *
     * This method should be used before you use any of the methods which would otherwise alter the global Bluebird object - to avoid polluting global state.
     */
  def getNewLibraryCopy(): bluebirdDashLstLib.Anon_TimeoutError = js.native
  /**
     * This is relevant to browser environments with no module loader.
     *
     * Release control of the Promise namespace to whatever it was before this library was loaded. Returns a reference to the library namespace so you can attach it to something else.
     */
  def noConflict(): bluebirdDashLstLib.Anon_TimeoutError = js.native
  /**
     * Changes how bluebird schedules calls a-synchronously.
     *
     * @param scheduler Should be a function that asynchronously schedules
     *                  the calling of the passed in function
     */
  def setScheduler(scheduler: js.Function1[/* callback */ js.Function1[/* repeated */js.Any, scala.Unit], scala.Unit]): scala.Unit = js.native
}

