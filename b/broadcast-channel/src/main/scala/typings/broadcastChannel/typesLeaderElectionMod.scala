package typings.broadcastChannel

import typings.broadcastChannel.typesBroadcastChannelMod.BroadcastChannel
import typings.broadcastChannel.typesBroadcastChannelMod.OnMessageHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLeaderElectionMod {
  
  @JSImport("broadcast-channel/types/leader-election", "LeaderElector")
  @js.native
  open class LeaderElector () extends StObject {
    
    def applyOnce(): js.Promise[Boolean] = js.native
    def applyOnce(isFromFallbackInterval: Boolean): js.Promise[Boolean] = js.native
    
    def awaitLeadership(): js.Promise[Unit] = js.native
    
    /**
      * The broadcastChannel with which the
      * leader elector was created.
      */
    val broadcastChannel: BroadcastChannel[Any] = js.native
    
    def die(): js.Promise[Unit] = js.native
    
    /**
      * True if this or another instance is leader.
      * False if there is not leader at the moment
      * and we must wait for the election cycle.
      */
    val hasLeader: Boolean = js.native
    
    val isDead: Boolean = js.native
    
    /**
      * IMPORTANT: The leader election is lazy,
      * it will not start before you call awaitLeadership()
      * so isLeader will never become true then
      */
    val isLeader: Boolean = js.native
    
    /**
      * Add an event handler that is run
      * when it is detected that there are duplicate leaders
      */
    var onduplicate: OnMessageHandler[Any] = js.native
    
    val token: String = js.native
  }
  
  @JSImport("broadcast-channel/types/leader-election", "createLeaderElection")
  @js.native
  val createLeaderElection: CreateFunction = js.native
  
  type CreateFunction = js.Function2[
    /* broadcastChannel */ BroadcastChannel[Any], 
    /* options */ js.UndefOr[LeaderElectionOptions], 
    LeaderElector
  ]
  
  trait LeaderElectionOptions extends StObject {
    
    /**
      * Normally, when the leading JavaScript process dies, it will send an I-am-dead
      * message to the other LeaderElectors, so that they can elect a new leader.
      * On rare cases, when the JavaScript process exits ungracefully, it can happen
      * that the other electors do not get a dead-message.
      * So we have to also run the election cycle in an interval to ensure
      * we never stuck on a state where noone is leader and noone is trying to get elected.
      */
    var fallbackInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * This timer value is used when resolving which instance should be leader.
      * In case when your application elects more than one leader increase this value.
      */
    var responseTime: js.UndefOr[Double] = js.undefined
  }
  object LeaderElectionOptions {
    
    inline def apply(): LeaderElectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeaderElectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LeaderElectionOptions] (val x: Self) extends AnyVal {
      
      inline def setFallbackInterval(value: Double): Self = StObject.set(x, "fallbackInterval", value.asInstanceOf[js.Any])
      
      inline def setFallbackIntervalUndefined: Self = StObject.set(x, "fallbackInterval", js.undefined)
      
      inline def setResponseTime(value: Double): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
      
      inline def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
    }
  }
}
