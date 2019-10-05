package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  type ChromeSettingChangedEvent = typings.chromeDashApps.chrome.events.Event[DetailsCallback]
  /**
    * @param details Details of the currently effective value.
    */
  type DetailsCallback = js.Function1[/* details */ ChromeSettingGetResultDetails, Unit]
}
