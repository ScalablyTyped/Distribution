package typings.broadcastChannel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object broadcastChannelMod {
  
  type OnMessageHandler[T] = (js.ThisFunction1[
    /* this */ typings.broadcastChannel.broadcastChannelMod.BroadcastChannel[js.Any], 
    /* ev */ T, 
    js.Any
  ]) | scala.Null
}
