package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.Metrics
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MsgIdStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MsgIdToStrFn
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PeerIdStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTracerMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/tracer", "IWantTracer")
  @js.native
  open class IWantTracer protected () extends StObject {
    def this(gossipsubIWantFollowupMs: Double, msgIdToStrFn: MsgIdToStrFn) = this()
    def this(gossipsubIWantFollowupMs: Double, msgIdToStrFn: MsgIdToStrFn, metrics: Metrics) = this()
    
    /**
      * Track a promise to deliver a message from a list of msgIds we are requesting
      */
    def addPromise(from: PeerIdStr, msgIds: js.Array[js.typedarray.Uint8Array]): Unit = js.native
    
    def clear(): Unit = js.native
    
    /**
      * Someone delivered a message, stop tracking promises for it
      */
    def deliverMessage(msgIdStr: MsgIdStr): Unit = js.native
    
    /**
      * Returns the number of broken promises for each peer who didn't follow up on an IWANT request.
      *
      * This should be called not too often relative to the expire times, since it iterates over the whole data.
      */
    def getBrokenPromises(): Map[PeerIdStr, Double] = js.native
    
    /* private */ val gossipsubIWantFollowupMs: Any = js.native
    
    /* private */ val metrics: Any = js.native
    
    /* private */ val msgIdToStrFn: Any = js.native
    
    /**
      * Promises to deliver a message
      * Map per message id, per peer, promise expiration time
      */
    /* private */ val promises: Any = js.native
    
    def prune(): Unit = js.native
    
    /**
      * A message got rejected, so we can stop tracking promises and let the score penalty apply from invalid message delivery,
      * unless its an obviously invalid message.
      */
    def rejectMessage(msgIdStr: MsgIdStr, reason: RejectReason): Unit = js.native
    
    /**
      * First request time by msgId. Used for metrics to track expire times.
      * Necessary to know if peers are actually breaking promises or simply sending them a bit later
      */
    /* private */ val requestMsByMsg: Any = js.native
    
    /* private */ val requestMsByMsgExpire: Any = js.native
    
    def requestMsByMsgSize: Double = js.native
    
    def size: Double = js.native
    
    /* private */ var trackMessage: Any = js.native
  }
}
