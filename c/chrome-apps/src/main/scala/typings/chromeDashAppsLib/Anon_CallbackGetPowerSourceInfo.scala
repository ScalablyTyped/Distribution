package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackGetPowerSourceInfo extends js.Object {
  /**
    * Event for changes in the set of connected power sources.
    */
  val onPowerChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* powerSourceInfo */ js.Array[chromeDashAppsLib.chromeNs.systemNs.powerSourceNs.PowerSourceInfo], 
      scala.Unit
    ]
  ]
  /**
    * Requests information on attached power sources.
    * @param callback The callback to invoke with the results or undefined if the power source information is not known.
    */
  def getPowerSourceInfo(
    callback: js.Function1[
      /* powerSourceInfo */ js.UndefOr[js.Array[chromeDashAppsLib.chromeNs.systemNs.powerSourceNs.PowerSourceInfo]], 
      scala.Unit
    ]
  ): scala.Unit
  /**
    * Requests a power source status update.
    * Resulting power source status updates are observable using *onPowerChanged*.
    */
  def requestStatusUpdate(): scala.Unit
}

