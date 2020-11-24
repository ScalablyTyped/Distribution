package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object vpnProvider {
  
  type VpnConfigCreationEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* id */ java.lang.String, 
      /* name */ java.lang.String, 
      /* data */ js.Object, 
      scala.Unit
    ]
  ]
  
  type VpnConfigRemovalEvent = typings.chrome.chrome.events.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
  
  type VpnPacketReceptionEvent = typings.chrome.chrome.events.Event[js.Function1[/* data */ typings.std.ArrayBuffer, scala.Unit]]
  
  type VpnPlatformMessageEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* id */ java.lang.String, 
      /* message */ java.lang.String, 
      /* error */ java.lang.String, 
      scala.Unit
    ]
  ]
  
  type VpnUiEvent = typings.chrome.chrome.events.Event[
    js.Function2[/* event */ java.lang.String, /* id */ js.UndefOr[java.lang.String], scala.Unit]
  ]
}
