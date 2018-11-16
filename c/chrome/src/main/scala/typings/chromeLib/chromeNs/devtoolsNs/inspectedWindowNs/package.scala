package typings
package chromeLib.chromeNs.devtoolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inspectedWindowNs {
  type ResourceAddedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* resource */ Resource, scala.Unit]]
  type ResourceContentCommittedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* resource */ Resource, /* content */ java.lang.String, scala.Unit]
  ]
}
