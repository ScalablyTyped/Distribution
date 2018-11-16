package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vpnProviderNs {
  type VpnConfigCreationEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* id */ java.lang.String, 
      /* name */ java.lang.String, 
      /* data */ js.Object, 
      scala.Unit
    ]
  ]
  type VpnConfigRemovalEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
  type VpnPacketReceptionEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* data */ stdLib.ArrayBuffer, scala.Unit]]
  type VpnPlatformMessageEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* id */ java.lang.String, 
      /* message */ java.lang.String, 
      /* error */ java.lang.String, 
      scala.Unit
    ]
  ]
  type VpnUiEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* event */ java.lang.String, /* id */ js.UndefOr[java.lang.String], scala.Unit]
  ]
}
