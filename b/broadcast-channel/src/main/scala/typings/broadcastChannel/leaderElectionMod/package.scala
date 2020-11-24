package typings.broadcastChannel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object leaderElectionMod {
  
  type CreateFunction = js.Function2[
    /* channel */ typings.broadcastChannel.broadcastChannelMod.BroadcastChannel[js.Any], 
    /* options */ js.UndefOr[typings.broadcastChannel.leaderElectionMod.LeaderElectionOptions], 
    typings.broadcastChannel.leaderElectionMod.LeaderElector
  ]
}
