package typings.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object bluetoothSocket {
  
  type OnAcceptErrorEvent = typings.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typings.chromeApps.chrome.bluetoothSocket.OnAcceptErrorEventData, 
      scala.Unit
    ]
  ]
  
  type OnAcceptEvent = typings.chromeApps.chrome.events.Event[
    js.Function1[/* info */ typings.chromeApps.chrome.bluetoothSocket.OnAcceptInfoData, scala.Unit]
  ]
  
  type OnReceiveErrorEvent = typings.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typings.chromeApps.chrome.bluetoothSocket.OnReceiveErrorEventData, 
      scala.Unit
    ]
  ]
  
  type OnReceiveEvent = typings.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typings.chromeApps.chrome.bluetoothSocket.OnReceiveEventData, 
      scala.Unit
    ]
  ]
}
