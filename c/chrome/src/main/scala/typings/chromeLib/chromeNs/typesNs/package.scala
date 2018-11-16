package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesNs {
  type ChromeSettingChangedEvent = chromeLib.chromeNs.eventsNs.Event[DetailsCallback]
  type DetailsCallback = js.Function1[/* details */ ChromeSettingGetResultDetails, scala.Unit]
}
