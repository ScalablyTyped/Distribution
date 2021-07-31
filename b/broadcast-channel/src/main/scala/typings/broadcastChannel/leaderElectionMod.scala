package typings.broadcastChannel

import typings.broadcastChannel.broadcastChannelMod.BroadcastChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leaderElectionMod {
  
  @JSImport("broadcast-channel/types/leader-election", "LeaderElector")
  @js.native
  class LeaderElector () extends StObject {
    
    def applyOnce(): js.Promise[Boolean] = js.native
    
    def awaitLeadership(): js.Promise[Unit] = js.native
    
    def die(): js.Promise[Unit] = js.native
    
    val isDead: Boolean = js.native
    
    /**
      * IMPORTANT: The leader election is lazy,
      * it will not start before you call awaitLeadership()
      * so isLeader will never become true then
      */
    val isLeader: Boolean = js.native
    
    val token: String = js.native
  }
  
  @JSImport("broadcast-channel/types/leader-election", "createLeaderElection")
  @js.native
  val createLeaderElection: CreateFunction = js.native
  
  type CreateFunction = js.Function2[
    /* channel */ BroadcastChannel[js.Any], 
    /* options */ js.UndefOr[LeaderElectionOptions], 
    LeaderElector
  ]
  
  trait LeaderElectionOptions extends StObject {
    
    /**
      * This value decides how often instances will renegotiate who is leader.
      * Probably should be at least 2x bigger than responseTime.
      */
    var fallbackInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * This timer value is used when resolving which instance should be leader.
      * In case when your application elects more than one leader increase this value.
      */
    var responseTime: js.UndefOr[Double] = js.undefined
  }
  object LeaderElectionOptions {
    
    @scala.inline
    def apply(): LeaderElectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeaderElectionOptions]
    }
    
    @scala.inline
    implicit class LeaderElectionOptionsMutableBuilder[Self <: LeaderElectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbackInterval(value: Double): Self = StObject.set(x, "fallbackInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackIntervalUndefined: Self = StObject.set(x, "fallbackInterval", js.undefined)
      
      @scala.inline
      def setResponseTime(value: Double): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
    }
  }
}
