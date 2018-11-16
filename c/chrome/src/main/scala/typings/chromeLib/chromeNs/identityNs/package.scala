package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object identityNs {
  type SignInChangeEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* account */ AccountInfo, /* signedIn */ scala.Boolean, scala.Unit]
  ]
}
