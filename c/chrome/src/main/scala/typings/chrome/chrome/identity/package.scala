package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object identity {
  import typings.chrome.chrome.events.Event

  type SignInChangeEvent = Event[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]]
}
