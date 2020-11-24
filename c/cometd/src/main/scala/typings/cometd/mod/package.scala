package typings.cometd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function1[/* data */ js.Any, scala.Unit]
  
  type HandshakeListener = js.Function1[/* message */ typings.cometd.mod.HandshakeMessage, scala.Unit]
  
  type Listener = js.Function1[/* message */ typings.cometd.mod.Message, scala.Unit]
  
  type SubscribeListener = js.Function1[/* message */ typings.cometd.mod.SubscribeMessage, scala.Unit]
}
