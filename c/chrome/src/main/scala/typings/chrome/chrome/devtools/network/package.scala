package typings.chrome.chrome.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object network {
  type HAREntry = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HARFormatEntry */ js.Any
  type HARLog = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HARFormatLog */ js.Any
  type NavigatedEvent = typings.chrome.chrome.events.Event[js.Function1[/* url */ java.lang.String, scala.Unit]]
  type RequestFinishedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* request */ typings.chrome.chrome.devtools.network.Request, scala.Unit]
  ]
}
