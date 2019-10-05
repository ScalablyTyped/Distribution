package typings.chromeDashApps.chrome.identity

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when signin state changes for an account on the user's profile.
  * @since Chrome 33.
  */
@JSGlobal("chrome.identity.onSignInChanged")
@js.native
object onSignInChanged
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]]
    ]

