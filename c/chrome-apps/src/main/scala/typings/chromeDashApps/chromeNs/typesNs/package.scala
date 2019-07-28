package typings.chromeDashApps.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesNs {
  type ChromeSettingChangedEvent = typings.chromeDashApps.chromeNs.eventsNs.Event[DetailsCallback]
  /**
    * @param details Details of the currently effective value.
    */
  type DetailsCallback = js.Function1[/* details */ ChromeSettingGetResultDetails, Unit]
}
