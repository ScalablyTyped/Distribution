package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.anon.PartialGossipsubOpts
import typings.chainsafeLibp2pGossipsub.anon.PartialPeerScoreParams
import typings.chainsafeLibp2pGossipsub.anon.PartialPeerScoreThreshold
import typings.chainsafeLibp2pGossipsub.anon.RequiredGossipOptions
import typings.chainsafeLibp2pGossipsub.distSrcConfigMod.GossipsubOptsSpec
import typings.chainsafeLibp2pGossipsub.distSrcMessageCacheMod.MessageCache
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.IRPC
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlIHave
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlMessage
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.MetricsRegister
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicStrToLabel
import typings.chainsafeLibp2pGossipsub.distSrcScoreMod.PeerScore
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreMod.PeerScoreStatsDump
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreParamsMod.PeerScoreParams
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreThresholdsMod.PeerScoreThresholds
import typings.chainsafeLibp2pGossipsub.distSrcStreamMod.InboundStream
import typings.chainsafeLibp2pGossipsub.distSrcStreamMod.OutboundStream
import typings.chainsafeLibp2pGossipsub.distSrcTracerMod.IWantTracer
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.AddrInfo
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.DataTransform
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.FastMsgIdFn
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageAcceptance
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MsgIdFn
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MsgIdStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MsgIdToStrFn
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PeerIdStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicValidatorFn
import typings.libp2pComponents.mod.Components
import typings.libp2pComponents.mod.Initializable
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.mod.Message
import typings.libp2pInterfacePubsub.mod.PubSub
import typings.libp2pInterfacePubsub.mod.PubSubEvents
import typings.libp2pInterfacePubsub.mod.PubSubInit
import typings.libp2pInterfacePubsub.mod.SubscriptionChangeData
import typings.std.CustomEvent
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chainsafe/libp2p-gossipsub", "GossipSub")
  @js.native
  open class GossipSub ()
    extends PubSub[GossipsubEvents]
       with Initializable {
    def this(options: PartialGossipsubOpts) = this()
    
    /**
      * Whether to accept a message from a peer
      */
    def acceptFrom(id: PeerIdStr): Boolean = js.native
    
    /**
      * Map of peer id and AcceptRequestWhileListEntry
      */
    /* private */ val acceptFromWhitelist: Any = js.native
    
    /**
      * Add standard backoff log for a peer in a topic
      */
    /* private */ var addBackoff: Any = js.native
    
    /**
      * Add a peer to the router
      */
    /* private */ var addPeer: Any = js.native
    
    /**
      * Apply penalties from broken IHAVE/IWANT promises
      */
    /* private */ var applyIwantPenalties: Any = js.native
    
    /** Prune backoff map */
    /* private */ val backoff: Any = js.native
    
    /**
      * Clear expired backoff expiries
      */
    /* private */ var clearBackoff: Any = js.native
    
    /* private */ var components: Any = js.native
    
    /**
      * Connect to a peer using the gossipsub protocol
      */
    /* private */ var connect: Any = js.native
    
    /**
      * Map of control messages
      * peer id => control message
      */
    val control: Map[String, IControlMessage] = js.native
    
    /* private */ var createInboundStream: Any = js.native
    
    /* private */ var createOutboundStream: Any = js.native
    
    /* private */ val dataTransform: Any = js.native
    
    /** Direct peers */
    val direct: Set[String] = js.native
    
    /**
      * Maybe reconnect to direct peers
      */
    /* private */ var directConnect: Any = js.native
    
    /* private */ var directPeerInitial: Any = js.native
    
    /**
      * Add backoff expiry interval for a peer in a topic
      *
      * @param id
      * @param topic
      * @param interval - backoff duration in milliseconds
      */
    /* private */ var doAddBackoff: Any = js.native
    
    /**
      * Send gossip messages to GossipFactor peers above threshold with a minimum of D_lazy
      * Peers are randomly selected from the heartbeat which exclude mesh + fanout peers
      * We also exclude direct peers, as there is no reason to emit gossip to them
      * @param topic
      * @param candidateToGossip - peers to gossip
      * @param messageIDs - message ids to gossip
      */
    /* private */ var doEmitGossip: Any = js.native
    
    /** FOR DEBUG ONLY - Dump peer stats for all peers. Data is cloned, safe to mutate */
    def dumpPeerScoreStats(): PeerScoreStatsDump = js.native
    
    /**
      * Emits gossip - Send IHAVE messages to a random set of gossip peers
      */
    /* private */ var emitGossip: Any = js.native
    
    /**
      * Map of topics to set of peers. These mesh peers are the ones to which we are publishing without a topic membership
      * topic => peer id set
      */
    val fanout: Map[String, Set[String]] = js.native
    
    /**
      * Map of last publish time for fanout topics
      * topic => last publish time
      */
    /* private */ val fanoutLastpub: Any = js.native
    
    /** Maps fast message-id to canonical message-id */
    /* private */ val fastMsgIdCache: Any = js.native
    
    /**
      * A fast message id function used for internal message de-duplication
      */
    /* private */ val fastMsgIdFn: Any = js.native
    
    /** Floodsub peers */
    /* private */ val floodsubPeers: Any = js.native
    
    /**
      * Flush gossip and control messages
      */
    /* private */ var flush: Any = js.native
    
    /**
      * Forwards a message from our peers.
      *
      * For messages published by us (the app layer), this class uses `publish`
      */
    /* private */ var forwardMessage: Any = js.native
    
    /**
      * Get a the peer-ids in a topic mesh
      */
    def getMeshPeers(topic: TopicStr): js.Array[PeerIdStr] = js.native
    
    /**
      * Given a topic, returns up to count peers subscribed to that topic
      * that pass an optional filter function
      *
      * @param topic
      * @param count
      * @param filter - a function to filter acceptable peers
      */
    /* private */ var getRandomGossipPeers: Any = js.native
    
    /**
      * Return score of a peer.
      */
    def getScore(peerId: PeerIdStr): Double = js.native
    
    /**
      * Map of pending messages to gossip
      * peer id => control messages
      */
    val gossip: Map[String, js.Array[IControlIHave]] = js.native
    
    /**
      * Tracks IHAVE/IWANT promises broken by peers
      */
    val gossipTracer: IWantTracer = js.native
    
    /**
      * Handles an rpc control message from a peer
      */
    /* private */ var handleControlMessage: Any = js.native
    
    /**
      * Handles Graft messages
      */
    /* private */ var handleGraft: Any = js.native
    
    /**
      * Handles IHAVE messages
      */
    /* private */ var handleIHave: Any = js.native
    
    /**
      * Handles IWANT messages
      * Returns messages to send back to peer
      */
    /* private */ var handleIWant: Any = js.native
    
    /**
      * Handles Prune messages
      */
    /* private */ var handlePrune: Any = js.native
    
    /**
      * Handles a newly received message from an RPC.
      * May forward to all peers in the mesh.
      */
    /* private */ var handleReceivedMessage: Any = js.native
    
    /**
      * Handles an rpc request from a peer
      */
    def handleReceivedRpc(from: PeerId, rpc: IRPC): js.Promise[Unit] = js.native
    
    /**
      * Handles a subscription change from a peer
      */
    /* private */ var handleReceivedSubscription: Any = js.native
    
    /**
      * Maintains the mesh and fanout maps in gossipsub.
      */
    def heartbeat(): js.Promise[Unit] = js.native
    
    /**
      * Number of heartbeats since the beginning of time
      * This allows us to amortize some resource cleanup -- eg: backoff cleanup
      */
    /* private */ var heartbeatTicks: Any = js.native
    
    /* private */ var heartbeatTimer: Any = js.native
    
    /** Number of messages we have asked from peer in the last heartbeat */
    /* private */ val iasked: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    def isStarted(): Boolean = js.native
    
    /**
      * Join topic
      */
    /* private */ var join: Any = js.native
    
    /**
      * Leave topic
      */
    /* private */ var leave: Any = js.native
    
    /* private */ val log: Any = js.native
    
    /**
      * Make a PRUNE control message for a peer in a topic
      */
    /* private */ var makePrune: Any = js.native
    
    /* private */ var maxInboundStreams: Any = js.native
    
    /* private */ var maxOutboundStreams: Any = js.native
    
    /**
      * A message cache that contains the messages for last few heartbeat ticks
      */
    /* private */ val mcache: Any = js.native
    
    /**
      * Map of topic meshes
      * topic => peer id set
      */
    val mesh: Map[String, Set[String]] = js.native
    
    /* private */ val metrics: Any = js.native
    
    /* private */ val msgIdFn: Any = js.native
    
    /* private */ val msgIdToStrFn: Any = js.native
    
    /**
      * On an inbound stream opened
      */
    /* private */ var onIncomingStream: Any = js.native
    
    /**
      * Registrar notifies an established connection with pubsub protocol
      */
    /* private */ var onPeerConnected: Any = js.native
    
    /**
      * Registrar notifies a closing connection with pubsub protocol
      */
    /* private */ var onPeerDisconnected: Any = js.native
    
    /* private */ var onScrapeMetrics: Any = js.native
    
    val opts: RequiredGossipOptions = js.native
    
    /**
      * Connection direction cache, marks peers with outbound connections
      * peer id => direction
      */
    /* private */ val outbound: Any = js.native
    
    /** Ensures outbound streams are created sequentially */
    /* private */ var outboundInflightQueue: Any = js.native
    
    /**
      * Number of IHAVEs received from peer in the last heartbeat
      */
    /* private */ val peerhave: Any = js.native
    
    val peers: Set[String] = js.native
    
    def piggybackControl(id: PeerIdStr, outRpc: IRPC, ctrl: IControlMessage): Unit = js.native
    
    /* private */ var piggybackGossip: Any = js.native
    
    /**
      * Responsible for processing each RPC message received by other peers.
      */
    /* private */ var pipePeerReadStream: Any = js.native
    
    /* private */ var publishConfig: Any = js.native
    
    /**
      * Short term cache for published message ids. This is used for penalizing peers sending
      * our own messages back if the messages are anonymous or use a random author.
      */
    /* private */ val publishedMessageIds: Any = js.native
    
    /**
      * Adds new IHAVE messages to pending gossip
      */
    /* private */ var pushGossip: Any = js.native
    
    /**
      * Maybe attempt connection given signed peer records
      */
    /* private */ var pxConnect: Any = js.native
    
    /**
      * Removes a peer from the router
      */
    /* private */ var removePeer: Any = js.native
    
    /**
      * This function should be called when `asyncValidation` is `true` after
      * the message got validated by the caller. Messages are stored in the `mcache` and
      * validation is expected to be fast enough that the messages should still exist in the cache.
      * There are three possible validation outcomes and the outcome is given in acceptance.
      *
      * If acceptance = `MessageAcceptance.Accept` the message will get propagated to the
      * network. The `propagation_source` parameter indicates who the message was received by and
      * will not be forwarded back to that peer.
      *
      * If acceptance = `MessageAcceptance.Reject` the message will be deleted from the memcache
      * and the P₄ penalty will be applied to the `propagationSource`.
      *
      * If acceptance = `MessageAcceptance.Ignore` the message will be deleted from the memcache
      * but no P₄ penalty will be applied.
      *
      * This function will return true if the message was found in the cache and false if was not
      * in the cache anymore.
      *
      * This should only be called once per message.
      */
    def reportMessageValidationResult(msgId: MsgIdStr, propagationSource: PeerId, acceptance: MessageAcceptance): Unit = js.native
    
    /* private */ val runHeartbeat: Any = js.native
    
    /** Peer score tracking */
    val score: PeerScore = js.native
    
    /** Cache of seen messages */
    /* private */ val seenCache: Any = js.native
    
    /* private */ var selectPeersToForward: Any = js.native
    
    /* private */ var selectPeersToPublish: Any = js.native
    
    /**
      * Sends a GRAFT message to a peer
      */
    /* private */ var sendGraft: Any = js.native
    
    /**
      * Send graft and prune messages
      *
      * @param tograft - peer id => topic[]
      * @param toprune - peer id => topic[]
      */
    /* private */ var sendGraftPrune: Any = js.native
    
    /**
      * Sends a PRUNE message to a peer
      */
    /* private */ var sendPrune: Any = js.native
    
    /**
      * Send an rpc object to a peer
      */
    /* private */ var sendRpc: Any = js.native
    
    /**
      * Send an rpc object to a peer with subscriptions
      */
    /* private */ var sendSubscriptions: Any = js.native
    
    /**
      * Mounts the gossipsub protocol onto the libp2p node and sends our
      * our subscriptions to every peer connected
      */
    def start(): js.Promise[Unit] = js.native
    
    def started: Boolean = js.native
    
    /* private */ var status: Any = js.native
    
    /**
      * Unmounts the gossipsub protocol and shuts down every connection
      */
    def stop(): js.Promise[Unit] = js.native
    
    val streamsInbound: Map[String, InboundStream] = js.native
    
    val streamsOutbound: Map[String, OutboundStream] = js.native
    
    /**
      * List of our subscriptions
      */
    /* private */ val subscriptions: Any = js.native
    
    val topicValidators: Map[String, TopicValidatorFn] = js.native
    
    /**
      * Map of topics to which peers are subscribed to
      */
    /* private */ val topics: Any = js.native
    
    /**
      * Handles a newly received message from an RPC.
      * May forward to all peers in the mesh.
      */
    /* private */ var validateReceivedMessage: Any = js.native
  }
  /* static members */
  object GossipSub {
    
    @JSImport("@chainsafe/libp2p-gossipsub", "GossipSub")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@chainsafe/libp2p-gossipsub", "GossipSub.multicodec")
    @js.native
    def multicodec: String = js.native
    inline def multicodec_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multicodec")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub", "multicodec")
  @js.native
  val multicodec: String = js.native
  
  trait GossipOptions
    extends StObject
       with GossipsubOpts {
    
    @JSName("scoreParams")
    var scoreParams_GossipOptions: PeerScoreParams
    
    @JSName("scoreThresholds")
    var scoreThresholds_GossipOptions: PeerScoreThresholds
  }
  object GossipOptions {
    
    inline def apply(
      D: Double,
      Dhi: Double,
      Dlazy: Double,
      Dlo: Double,
      Dout: Double,
      Dscore: Double,
      allowPublishToZeroPeers: Boolean,
      asyncValidation: Boolean,
      awaitRpcHandler: Boolean,
      awaitRpcMessageHandler: Boolean,
      directPeers: js.Array[AddrInfo],
      doPX: Boolean,
      fallbackToFloodsub: Boolean,
      fanoutTTL: Double,
      fastMsgIdFn: /* msg */ IMessage => String,
      floodPublish: Boolean,
      gossipsubIWantFollowupMs: Double,
      heartbeatInterval: Double,
      mcacheGossip: Double,
      mcacheLength: Double,
      messageCache: MessageCache,
      msgIdFn: /* msg */ Message => js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array,
      msgIdToStrFn: /* msgId */ js.typedarray.Uint8Array => String,
      scoreParams: PeerScoreParams,
      scoreThresholds: PeerScoreThresholds,
      seenTTL: Double
    ): GossipOptions = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], Dhi = Dhi.asInstanceOf[js.Any], Dlazy = Dlazy.asInstanceOf[js.Any], Dlo = Dlo.asInstanceOf[js.Any], Dout = Dout.asInstanceOf[js.Any], Dscore = Dscore.asInstanceOf[js.Any], allowPublishToZeroPeers = allowPublishToZeroPeers.asInstanceOf[js.Any], asyncValidation = asyncValidation.asInstanceOf[js.Any], awaitRpcHandler = awaitRpcHandler.asInstanceOf[js.Any], awaitRpcMessageHandler = awaitRpcMessageHandler.asInstanceOf[js.Any], directPeers = directPeers.asInstanceOf[js.Any], doPX = doPX.asInstanceOf[js.Any], fallbackToFloodsub = fallbackToFloodsub.asInstanceOf[js.Any], fanoutTTL = fanoutTTL.asInstanceOf[js.Any], fastMsgIdFn = js.Any.fromFunction1(fastMsgIdFn), floodPublish = floodPublish.asInstanceOf[js.Any], gossipsubIWantFollowupMs = gossipsubIWantFollowupMs.asInstanceOf[js.Any], heartbeatInterval = heartbeatInterval.asInstanceOf[js.Any], mcacheGossip = mcacheGossip.asInstanceOf[js.Any], mcacheLength = mcacheLength.asInstanceOf[js.Any], messageCache = messageCache.asInstanceOf[js.Any], msgIdFn = js.Any.fromFunction1(msgIdFn), msgIdToStrFn = js.Any.fromFunction1(msgIdToStrFn), scoreParams = scoreParams.asInstanceOf[js.Any], scoreThresholds = scoreThresholds.asInstanceOf[js.Any], seenTTL = seenTTL.asInstanceOf[js.Any])
      __obj.asInstanceOf[GossipOptions]
    }
    
    extension [Self <: GossipOptions](x: Self) {
      
      inline def setScoreParams(value: PeerScoreParams): Self = StObject.set(x, "scoreParams", value.asInstanceOf[js.Any])
      
      inline def setScoreThresholds(value: PeerScoreThresholds): Self = StObject.set(x, "scoreThresholds", value.asInstanceOf[js.Any])
    }
  }
  
  trait GossipsubEvents
    extends StObject
       with PubSubEvents {
    
    @JSName("gossipsub:heartbeat")
    var gossipsubColonheartbeat: CustomEvent[Any]
    
    @JSName("gossipsub:message")
    var gossipsubColonmessage: CustomEvent[GossipsubMessage]
  }
  object GossipsubEvents {
    
    inline def apply(
      gossipsubColonheartbeat: CustomEvent[Any],
      gossipsubColonmessage: CustomEvent[GossipsubMessage],
      message: CustomEvent[Message],
      `subscription-change`: CustomEvent[SubscriptionChangeData]
    ): GossipsubEvents = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("gossipsub:heartbeat")(gossipsubColonheartbeat.asInstanceOf[js.Any])
      __obj.updateDynamic("gossipsub:message")(gossipsubColonmessage.asInstanceOf[js.Any])
      __obj.updateDynamic("subscription-change")(`subscription-change`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GossipsubEvents]
    }
    
    extension [Self <: GossipsubEvents](x: Self) {
      
      inline def setGossipsubColonheartbeat(value: CustomEvent[Any]): Self = StObject.set(x, "gossipsub:heartbeat", value.asInstanceOf[js.Any])
      
      inline def setGossipsubColonmessage(value: CustomEvent[GossipsubMessage]): Self = StObject.set(x, "gossipsub:message", value.asInstanceOf[js.Any])
    }
  }
  
  trait GossipsubMessage extends StObject {
    
    var msg: Message
    
    var msgId: MsgIdStr
    
    var propagationSource: PeerId
  }
  object GossipsubMessage {
    
    inline def apply(msg: Message, msgId: MsgIdStr, propagationSource: PeerId): GossipsubMessage = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], msgId = msgId.asInstanceOf[js.Any], propagationSource = propagationSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[GossipsubMessage]
    }
    
    extension [Self <: GossipsubMessage](x: Self) {
      
      inline def setMsg(value: Message): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgId(value: MsgIdStr): Self = StObject.set(x, "msgId", value.asInstanceOf[js.Any])
      
      inline def setPropagationSource(value: PeerId): Self = StObject.set(x, "propagationSource", value.asInstanceOf[js.Any])
    }
  }
  
  trait GossipsubOpts
    extends StObject
       with GossipsubOptsSpec
       with PubSubInit {
    
    /** Do not throw `InsufficientPeers` error if publishing to zero peers */
    var allowPublishToZeroPeers: Boolean
    
    /**
      * If true will not forward messages to mesh peers until reportMessageValidationResult() is called.
      * Messages will be cached in mcache for some time after which they are evicted. Calling
      * reportMessageValidationResult() after the message is dropped from mcache won't forward the message.
      */
    var asyncValidation: Boolean
    
    /** For a single stream, await processing each RPC before processing the next */
    var awaitRpcHandler: Boolean
    
    /** For a single RPC, await processing each message before processing the next */
    var awaitRpcMessageHandler: Boolean
    
    var dataTransform: js.UndefOr[DataTransform] = js.undefined
    
    /** Prefix tag for debug logs */
    var debugName: js.UndefOr[String] = js.undefined
    
    var directConnectTicks: js.UndefOr[Double] = js.undefined
    
    /** peers with which we will maintain direct connections */
    var directPeers: js.Array[AddrInfo]
    
    /** whether PX is enabled; this should be enabled in bootstrappers and other well connected/trusted nodes. */
    var doPX: Boolean
    
    /** if dial should fallback to floodsub */
    var fallbackToFloodsub: Boolean
    
    /** fast message id function */
    def fastMsgIdFn(msg: IMessage): String
    /** fast message id function */
    @JSName("fastMsgIdFn")
    var fastMsgIdFn_Original: FastMsgIdFn
    
    /** if self-published messages should be sent to all peers */
    var floodPublish: Boolean
    
    /** customize GossipsubIWantFollowupTime in order not to apply IWANT penalties */
    var gossipsubIWantFollowupMs: Double
    
    var graftFloodThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify max buffer size in bytes for OutboundStream.
      * If full it will throw and reject sending any more data.
      */
    var maxOutboundBufferSize: js.UndefOr[Double] = js.undefined
    
    /** override the default MessageCache */
    var messageCache: MessageCache
    
    var metricsRegister: js.UndefOr[MetricsRegister | Null] = js.undefined
    
    var metricsTopicStrToLabel: js.UndefOr[TopicStrToLabel] = js.undefined
    
    /** message id function */
    def msgIdFn(msg: Message): js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array
    /** message id function */
    @JSName("msgIdFn")
    var msgIdFn_Original: MsgIdFn
    
    /** Uint8Array message id to string function */
    def msgIdToStrFn(msgId: js.typedarray.Uint8Array): String
    /** Uint8Array message id to string function */
    @JSName("msgIdToStrFn")
    var msgIdToStrFn_Original: MsgIdToStrFn
    
    var opportunisticGraftPeers: js.UndefOr[Double] = js.undefined
    
    var opportunisticGraftTicks: js.UndefOr[Double] = js.undefined
    
    var pruneBackoff: js.UndefOr[Double] = js.undefined
    
    /** override constants for fine tuning */
    var prunePeers: js.UndefOr[Double] = js.undefined
    
    /** peer score parameters */
    var scoreParams: PartialPeerScoreParams
    
    /** peer score thresholds */
    var scoreThresholds: PartialPeerScoreThreshold
  }
  object GossipsubOpts {
    
    inline def apply(
      D: Double,
      Dhi: Double,
      Dlazy: Double,
      Dlo: Double,
      Dout: Double,
      Dscore: Double,
      allowPublishToZeroPeers: Boolean,
      asyncValidation: Boolean,
      awaitRpcHandler: Boolean,
      awaitRpcMessageHandler: Boolean,
      directPeers: js.Array[AddrInfo],
      doPX: Boolean,
      fallbackToFloodsub: Boolean,
      fanoutTTL: Double,
      fastMsgIdFn: /* msg */ IMessage => String,
      floodPublish: Boolean,
      gossipsubIWantFollowupMs: Double,
      heartbeatInterval: Double,
      mcacheGossip: Double,
      mcacheLength: Double,
      messageCache: MessageCache,
      msgIdFn: /* msg */ Message => js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array,
      msgIdToStrFn: /* msgId */ js.typedarray.Uint8Array => String,
      scoreParams: PartialPeerScoreParams,
      scoreThresholds: PartialPeerScoreThreshold,
      seenTTL: Double
    ): GossipsubOpts = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], Dhi = Dhi.asInstanceOf[js.Any], Dlazy = Dlazy.asInstanceOf[js.Any], Dlo = Dlo.asInstanceOf[js.Any], Dout = Dout.asInstanceOf[js.Any], Dscore = Dscore.asInstanceOf[js.Any], allowPublishToZeroPeers = allowPublishToZeroPeers.asInstanceOf[js.Any], asyncValidation = asyncValidation.asInstanceOf[js.Any], awaitRpcHandler = awaitRpcHandler.asInstanceOf[js.Any], awaitRpcMessageHandler = awaitRpcMessageHandler.asInstanceOf[js.Any], directPeers = directPeers.asInstanceOf[js.Any], doPX = doPX.asInstanceOf[js.Any], fallbackToFloodsub = fallbackToFloodsub.asInstanceOf[js.Any], fanoutTTL = fanoutTTL.asInstanceOf[js.Any], fastMsgIdFn = js.Any.fromFunction1(fastMsgIdFn), floodPublish = floodPublish.asInstanceOf[js.Any], gossipsubIWantFollowupMs = gossipsubIWantFollowupMs.asInstanceOf[js.Any], heartbeatInterval = heartbeatInterval.asInstanceOf[js.Any], mcacheGossip = mcacheGossip.asInstanceOf[js.Any], mcacheLength = mcacheLength.asInstanceOf[js.Any], messageCache = messageCache.asInstanceOf[js.Any], msgIdFn = js.Any.fromFunction1(msgIdFn), msgIdToStrFn = js.Any.fromFunction1(msgIdToStrFn), scoreParams = scoreParams.asInstanceOf[js.Any], scoreThresholds = scoreThresholds.asInstanceOf[js.Any], seenTTL = seenTTL.asInstanceOf[js.Any])
      __obj.asInstanceOf[GossipsubOpts]
    }
    
    extension [Self <: GossipsubOpts](x: Self) {
      
      inline def setAllowPublishToZeroPeers(value: Boolean): Self = StObject.set(x, "allowPublishToZeroPeers", value.asInstanceOf[js.Any])
      
      inline def setAsyncValidation(value: Boolean): Self = StObject.set(x, "asyncValidation", value.asInstanceOf[js.Any])
      
      inline def setAwaitRpcHandler(value: Boolean): Self = StObject.set(x, "awaitRpcHandler", value.asInstanceOf[js.Any])
      
      inline def setAwaitRpcMessageHandler(value: Boolean): Self = StObject.set(x, "awaitRpcMessageHandler", value.asInstanceOf[js.Any])
      
      inline def setDataTransform(value: DataTransform): Self = StObject.set(x, "dataTransform", value.asInstanceOf[js.Any])
      
      inline def setDataTransformUndefined: Self = StObject.set(x, "dataTransform", js.undefined)
      
      inline def setDebugName(value: String): Self = StObject.set(x, "debugName", value.asInstanceOf[js.Any])
      
      inline def setDebugNameUndefined: Self = StObject.set(x, "debugName", js.undefined)
      
      inline def setDirectConnectTicks(value: Double): Self = StObject.set(x, "directConnectTicks", value.asInstanceOf[js.Any])
      
      inline def setDirectConnectTicksUndefined: Self = StObject.set(x, "directConnectTicks", js.undefined)
      
      inline def setDirectPeers(value: js.Array[AddrInfo]): Self = StObject.set(x, "directPeers", value.asInstanceOf[js.Any])
      
      inline def setDirectPeersVarargs(value: AddrInfo*): Self = StObject.set(x, "directPeers", js.Array(value*))
      
      inline def setDoPX(value: Boolean): Self = StObject.set(x, "doPX", value.asInstanceOf[js.Any])
      
      inline def setFallbackToFloodsub(value: Boolean): Self = StObject.set(x, "fallbackToFloodsub", value.asInstanceOf[js.Any])
      
      inline def setFastMsgIdFn(value: /* msg */ IMessage => String): Self = StObject.set(x, "fastMsgIdFn", js.Any.fromFunction1(value))
      
      inline def setFloodPublish(value: Boolean): Self = StObject.set(x, "floodPublish", value.asInstanceOf[js.Any])
      
      inline def setGossipsubIWantFollowupMs(value: Double): Self = StObject.set(x, "gossipsubIWantFollowupMs", value.asInstanceOf[js.Any])
      
      inline def setGraftFloodThreshold(value: Double): Self = StObject.set(x, "graftFloodThreshold", value.asInstanceOf[js.Any])
      
      inline def setGraftFloodThresholdUndefined: Self = StObject.set(x, "graftFloodThreshold", js.undefined)
      
      inline def setMaxOutboundBufferSize(value: Double): Self = StObject.set(x, "maxOutboundBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundBufferSizeUndefined: Self = StObject.set(x, "maxOutboundBufferSize", js.undefined)
      
      inline def setMessageCache(value: MessageCache): Self = StObject.set(x, "messageCache", value.asInstanceOf[js.Any])
      
      inline def setMetricsRegister(value: MetricsRegister): Self = StObject.set(x, "metricsRegister", value.asInstanceOf[js.Any])
      
      inline def setMetricsRegisterNull: Self = StObject.set(x, "metricsRegister", null)
      
      inline def setMetricsRegisterUndefined: Self = StObject.set(x, "metricsRegister", js.undefined)
      
      inline def setMetricsTopicStrToLabel(value: TopicStrToLabel): Self = StObject.set(x, "metricsTopicStrToLabel", value.asInstanceOf[js.Any])
      
      inline def setMetricsTopicStrToLabelUndefined: Self = StObject.set(x, "metricsTopicStrToLabel", js.undefined)
      
      inline def setMsgIdFn(value: /* msg */ Message => js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array): Self = StObject.set(x, "msgIdFn", js.Any.fromFunction1(value))
      
      inline def setMsgIdToStrFn(value: /* msgId */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "msgIdToStrFn", js.Any.fromFunction1(value))
      
      inline def setOpportunisticGraftPeers(value: Double): Self = StObject.set(x, "opportunisticGraftPeers", value.asInstanceOf[js.Any])
      
      inline def setOpportunisticGraftPeersUndefined: Self = StObject.set(x, "opportunisticGraftPeers", js.undefined)
      
      inline def setOpportunisticGraftTicks(value: Double): Self = StObject.set(x, "opportunisticGraftTicks", value.asInstanceOf[js.Any])
      
      inline def setOpportunisticGraftTicksUndefined: Self = StObject.set(x, "opportunisticGraftTicks", js.undefined)
      
      inline def setPruneBackoff(value: Double): Self = StObject.set(x, "pruneBackoff", value.asInstanceOf[js.Any])
      
      inline def setPruneBackoffUndefined: Self = StObject.set(x, "pruneBackoff", js.undefined)
      
      inline def setPrunePeers(value: Double): Self = StObject.set(x, "prunePeers", value.asInstanceOf[js.Any])
      
      inline def setPrunePeersUndefined: Self = StObject.set(x, "prunePeers", js.undefined)
      
      inline def setScoreParams(value: PartialPeerScoreParams): Self = StObject.set(x, "scoreParams", value.asInstanceOf[js.Any])
      
      inline def setScoreThresholds(value: PartialPeerScoreThreshold): Self = StObject.set(x, "scoreThresholds", value.asInstanceOf[js.Any])
    }
  }
}
