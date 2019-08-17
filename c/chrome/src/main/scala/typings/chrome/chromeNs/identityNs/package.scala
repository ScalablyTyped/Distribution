package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object identityNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type SignInChangeEvent = Event[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]]
}
