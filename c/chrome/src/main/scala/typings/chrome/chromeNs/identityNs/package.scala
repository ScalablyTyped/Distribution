package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object identityNs {
  type SignInChangeEvent = Event[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]]
}
