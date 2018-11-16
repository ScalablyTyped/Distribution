package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthenticationChallengeEvent
  extends chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function2[
        /* details */ WebAuthenticationChallengeDetails, 
        /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, scala.Unit]], 
        scala.Unit
      ]
    ] {
  def addListener(
    callback: js.Function2[
      /* details */ WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, scala.Unit]], 
      scala.Unit
    ],
    filter: RequestFilter
  ): scala.Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, scala.Unit]], 
      scala.Unit
    ],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

