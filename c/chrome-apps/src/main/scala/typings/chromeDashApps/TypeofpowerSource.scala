package typings.chromeDashApps

import typings.chromeDashApps.chrome.events.Event
import typings.chromeDashApps.chrome.system.powerSource.PowerSourceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpowerSource extends js.Object {
  /**
    * Event for changes in the set of connected power sources.
    */
  val onPowerChanged: Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]]
  /**
    * Requests information on attached power sources.
    * @param callback The callback to invoke with the results or undefined if the power source information is not known.
    */
  def getPowerSourceInfo(callback: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit]): Unit
  /**
    * Requests a power source status update.
    * Resulting power source status updates are observable using *onPowerChanged*.
    */
  def requestStatusUpdate(): Unit
}

object TypeofpowerSource {
  @scala.inline
  def apply(
    getPowerSourceInfo: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit] => Unit,
    onPowerChanged: Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]],
    requestStatusUpdate: () => Unit
  ): TypeofpowerSource = {
    val __obj = js.Dynamic.literal(getPowerSourceInfo = js.Any.fromFunction1(getPowerSourceInfo), onPowerChanged = onPowerChanged.asInstanceOf[js.Any], requestStatusUpdate = js.Any.fromFunction0(requestStatusUpdate))
  
    __obj.asInstanceOf[TypeofpowerSource]
  }
}

