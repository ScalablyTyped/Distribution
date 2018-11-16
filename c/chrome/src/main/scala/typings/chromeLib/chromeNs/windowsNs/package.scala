package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windowsNs {
  type WindowIdEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* windowId */ scala.Double, /* filters */ js.UndefOr[WindowEventFilter], scala.Unit]
  ]
  type WindowReferenceEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* window */ Window, /* filters */ js.UndefOr[WindowEventFilter], scala.Unit]
  ]
}
