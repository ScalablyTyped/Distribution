package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.anon.TypeofsetInterval
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.Metrics
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty
import typings.chainsafeLibp2pGossipsub.distSrcScoreMessageDeliveriesMod.MessageDeliveries
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreParamsMod.PeerScoreParams
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerStatsMod.PeerStats
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MsgIdStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PeerIdStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr
import typings.chainsafeLibp2pGossipsub.distSrcUtilsSetMod.MapDef
import typings.std.Map
import typings.std.Record
import typings.std.ReturnType
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcScorePeerScoreMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score/peer-score", "PeerScore")
  @js.native
  open class PeerScore protected () extends StObject {
    def this(params: PeerScoreParams, metrics: Null, opts: PeerScoreOpts) = this()
    def this(params: PeerScoreParams, metrics: Metrics, opts: PeerScoreOpts) = this()
    
    var _backgroundInterval: js.UndefOr[ReturnType[TypeofsetInterval]] = js.native
    
    /** Adds a new IP to a peer, if the peer is not known the update is ignored */
    def addIP(id: PeerIdStr, ip: String): Unit = js.native
    
    def addPeer(id: PeerIdStr): Unit = js.native
    
    /**
      * Apply a behavioural penalty to a peer
      */
    def addPenalty(id: PeerIdStr, penalty: Double, penaltyLabel: ScorePenalty): Unit = js.native
    
    /**
      * Periodic maintenance
      */
    def background(): Unit = js.native
    
    /* private */ val computeScore: Any = js.native
    
    def deliverMessage(from: PeerIdStr, msgIdStr: MsgIdStr, topic: TopicStr): Unit = js.native
    
    /**
      * Recent message delivery timing/participants
      */
    val deliveryRecords: MessageDeliveries = js.native
    
    def dumpPeerScoreStats(): PeerScoreStatsDump = js.native
    
    def duplicateMessage(from: PeerIdStr, msgIdStr: MsgIdStr, topic: TopicStr): Unit = js.native
    
    /**
      * Returns topic stats if they exist, otherwise if the supplied parameters score the
      * topic, inserts the default stats and returns a reference to those. If neither apply, returns None.
      */
    /* private */ var getPtopicStats: Any = js.native
    
    /** Handles scoring functionality as a peer GRAFTs to a topic. */
    def graft(id: PeerIdStr, topic: TopicStr): Unit = js.native
    
    /**
      * Increments the "mesh message deliveries" counter for messages we've seen before,
      * as long the message was received within the P3 window.
      */
    def markDuplicateMessageDelivery(from: PeerIdStr, topic: TopicStr): Unit = js.native
    def markDuplicateMessageDelivery(from: PeerIdStr, topic: TopicStr, validatedTime: Double): Unit = js.native
    
    /**
      * Increments the "first message deliveries" counter for all scored topics the message is published in,
      * as well as the "mesh message deliveries" counter, if the peer is in the mesh for the topic.
      * Messages already known (with the seenCache) are counted with markDuplicateMessageDelivery()
      */
    def markFirstMessageDelivery(from: PeerIdStr, topic: TopicStr): Unit = js.native
    
    /**
      * Increments the "invalid message deliveries" counter for all scored topics the message is published in.
      */
    def markInvalidMessageDelivery(from: PeerIdStr, topic: TopicStr): Unit = js.native
    
    /* private */ val metrics: Any = js.native
    
    val params: PeerScoreParams = js.native
    
    /**
      * IP colocation tracking; maps IP => set of peers.
      */
    val peerIPs: MapDef[String, Set[String]] = js.native
    
    /**
      * Per-peer stats for score calculation
      */
    val peerStats: Map[String, PeerStats] = js.native
    
    /** Handles scoring functionality as a peer PRUNEs from a topic. */
    def prune(id: PeerIdStr, topic: TopicStr): Unit = js.native
    
    /**
      * Decays scores, and purges score records for disconnected peers once their expiry has elapsed.
      */
    def refreshScores(): Unit = js.native
    
    /**
      * Similar to `rejectMessage` except does not require the message id or reason for an invalid message.
      */
    def rejectInvalidMessage(from: PeerIdStr, topic: TopicStr): Unit = js.native
    
    def rejectMessage(from: PeerIdStr, msgIdStr: MsgIdStr, topic: TopicStr, reason: RejectReason): Unit = js.native
    
    /** Remove peer association with IP */
    def removeIP(id: PeerIdStr, ip: String): Unit = js.native
    
    /**
      * Removes an IP list from the tracking list for a peer.
      */
    /* private */ var removeIPsForPeer: Any = js.native
    
    def removePeer(id: PeerIdStr): Unit = js.native
    
    /**
      * Return the score for a peer
      */
    def score(id: PeerIdStr): Double = js.native
    
    /**
      * Cache score up to decayInterval if topic stats are unchanged.
      */
    val scoreCache: Map[String, ScoreCacheEntry] = js.native
    
    /* private */ val scoreCacheValidityMs: Any = js.native
    
    def size: Double = js.native
    
    /**
      * Start PeerScore instance
      */
    def start(): Unit = js.native
    
    /**
      * Stop PeerScore instance
      */
    def stop(): Unit = js.native
    
    def validateMessage(msgIdStr: MsgIdStr): Unit = js.native
  }
  
  trait PeerScoreOpts extends StObject {
    
    var computeScore: js.UndefOr[
        js.Function4[
          /* peer */ String, 
          /* pstats */ PeerStats, 
          /* params */ PeerScoreParams, 
          /* peerIPs */ Map[String, Set[String]], 
          Double
        ]
      ] = js.undefined
    
    /**
      * Miliseconds to cache computed score per peer
      */
    var scoreCacheValidityMs: Double
  }
  object PeerScoreOpts {
    
    inline def apply(scoreCacheValidityMs: Double): PeerScoreOpts = {
      val __obj = js.Dynamic.literal(scoreCacheValidityMs = scoreCacheValidityMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerScoreOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerScoreOpts] (val x: Self) extends AnyVal {
      
      inline def setComputeScore(
        value: (/* peer */ String, /* pstats */ PeerStats, /* params */ PeerScoreParams, /* peerIPs */ Map[String, Set[String]]) => Double
      ): Self = StObject.set(x, "computeScore", js.Any.fromFunction4(value))
      
      inline def setComputeScoreUndefined: Self = StObject.set(x, "computeScore", js.undefined)
      
      inline def setScoreCacheValidityMs(value: Double): Self = StObject.set(x, "scoreCacheValidityMs", value.asInstanceOf[js.Any])
    }
  }
  
  type PeerScoreStatsDump = Record[PeerIdStr, PeerStats]
  
  trait ScoreCacheEntry extends StObject {
    
    /** Unix timestamp in miliseconds, the time after which the cached score for a peer is no longer valid */
    var cacheUntil: Double
    
    /** The cached score */
    var score: Double
  }
  object ScoreCacheEntry {
    
    inline def apply(cacheUntil: Double, score: Double): ScoreCacheEntry = {
      val __obj = js.Dynamic.literal(cacheUntil = cacheUntil.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScoreCacheEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScoreCacheEntry] (val x: Self) extends AnyVal {
      
      inline def setCacheUntil(value: Double): Self = StObject.set(x, "cacheUntil", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
}
