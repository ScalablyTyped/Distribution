package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMessageCacheMod.MessageCache
import typings.chainsafeLibp2pGossipsub.distSrcMessageDecodeRpcMod.DecodeRPCLimits
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.MetricsRegister
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicStrToLabel
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreParamsMod.PeerScoreParams
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreThresholdsMod.PeerScoreThresholds
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.AddrInfo
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.DataTransform
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.FastMsgIdFn
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MsgIdFn
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MsgIdToStrFn
import typings.libp2pInterfacePubsub.mod.SignaturePolicy
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub.GossipOptions> */
trait RequiredGossipOptions extends StObject {
  
  var D: Double
  
  var Dhi: Double
  
  var Dlazy: Double
  
  var Dlo: Double
  
  var Dout: Double
  
  var Dscore: Double
  
  var allowPublishToZeroPeers: Boolean
  
  var allowedTopics: js.Array[String] | Set[String]
  
  var asyncValidation: Boolean
  
  var awaitRpcHandler: Boolean
  
  var awaitRpcMessageHandler: Boolean
  
  var canRelayMessage: Boolean
  
  var dataTransform: DataTransform
  
  var debugName: String
  
  var decodeRpcLimits: DecodeRPCLimits
  
  var directConnectTicks: Double
  
  var directPeers: js.Array[AddrInfo]
  
  var doPX: Boolean
  
  var emitSelf: Boolean
  
  var enabled: Boolean
  
  var fallbackToFloodsub: Boolean
  
  var fanoutTTL: Double
  
  def fastMsgIdFn(msg: IMessage): String | Double
  @JSName("fastMsgIdFn")
  var fastMsgIdFn_Original: FastMsgIdFn
  
  var floodPublish: Boolean
  
  var globalSignaturePolicy: SignaturePolicy
  
  var gossipsubIWantFollowupMs: Double
  
  var graftFloodThreshold: Double
  
  var heartbeatInterval: Double
  
  var ignoreDuplicatePublishError: Boolean
  
  var maxInboundDataLength: Double
  
  var maxInboundStreams: Double
  
  var maxOutboundBufferSize: Double
  
  var maxOutboundStreams: Double
  
  var mcacheGossip: Double
  
  var mcacheLength: Double
  
  var messageCache: MessageCache
  
  var messageProcessingConcurrency: Double
  
  var metricsRegister: MetricsRegister
  
  var metricsTopicStrToLabel: TopicStrToLabel
  
  def msgIdFn(msg: typings.libp2pInterfacePubsub.mod.Message): js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array
  @JSName("msgIdFn")
  var msgIdFn_Original: MsgIdFn
  
  def msgIdToStrFn(msgId: js.typedarray.Uint8Array): String
  @JSName("msgIdToStrFn")
  var msgIdToStrFn_Original: MsgIdToStrFn
  
  var multicodecs: js.Array[String]
  
  var opportunisticGraftPeers: Double
  
  var opportunisticGraftTicks: Double
  
  var pruneBackoff: Double
  
  var prunePeers: Double
  
  var scoreParams: PeerScoreParams
  
  var scoreThresholds: PeerScoreThresholds
  
  var seenTTL: Double
}
object RequiredGossipOptions {
  
  inline def apply(
    D: Double,
    Dhi: Double,
    Dlazy: Double,
    Dlo: Double,
    Dout: Double,
    Dscore: Double,
    allowPublishToZeroPeers: Boolean,
    allowedTopics: js.Array[String] | Set[String],
    asyncValidation: Boolean,
    awaitRpcHandler: Boolean,
    awaitRpcMessageHandler: Boolean,
    canRelayMessage: Boolean,
    dataTransform: DataTransform,
    debugName: String,
    decodeRpcLimits: DecodeRPCLimits,
    directConnectTicks: Double,
    directPeers: js.Array[AddrInfo],
    doPX: Boolean,
    emitSelf: Boolean,
    enabled: Boolean,
    fallbackToFloodsub: Boolean,
    fanoutTTL: Double,
    fastMsgIdFn: /* msg */ IMessage => String | Double,
    floodPublish: Boolean,
    globalSignaturePolicy: SignaturePolicy,
    gossipsubIWantFollowupMs: Double,
    graftFloodThreshold: Double,
    heartbeatInterval: Double,
    ignoreDuplicatePublishError: Boolean,
    maxInboundDataLength: Double,
    maxInboundStreams: Double,
    maxOutboundBufferSize: Double,
    maxOutboundStreams: Double,
    mcacheGossip: Double,
    mcacheLength: Double,
    messageCache: MessageCache,
    messageProcessingConcurrency: Double,
    metricsRegister: MetricsRegister,
    metricsTopicStrToLabel: TopicStrToLabel,
    msgIdFn: /* msg */ typings.libp2pInterfacePubsub.mod.Message => js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array,
    msgIdToStrFn: /* msgId */ js.typedarray.Uint8Array => String,
    multicodecs: js.Array[String],
    opportunisticGraftPeers: Double,
    opportunisticGraftTicks: Double,
    pruneBackoff: Double,
    prunePeers: Double,
    scoreParams: PeerScoreParams,
    scoreThresholds: PeerScoreThresholds,
    seenTTL: Double
  ): RequiredGossipOptions = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], Dhi = Dhi.asInstanceOf[js.Any], Dlazy = Dlazy.asInstanceOf[js.Any], Dlo = Dlo.asInstanceOf[js.Any], Dout = Dout.asInstanceOf[js.Any], Dscore = Dscore.asInstanceOf[js.Any], allowPublishToZeroPeers = allowPublishToZeroPeers.asInstanceOf[js.Any], allowedTopics = allowedTopics.asInstanceOf[js.Any], asyncValidation = asyncValidation.asInstanceOf[js.Any], awaitRpcHandler = awaitRpcHandler.asInstanceOf[js.Any], awaitRpcMessageHandler = awaitRpcMessageHandler.asInstanceOf[js.Any], canRelayMessage = canRelayMessage.asInstanceOf[js.Any], dataTransform = dataTransform.asInstanceOf[js.Any], debugName = debugName.asInstanceOf[js.Any], decodeRpcLimits = decodeRpcLimits.asInstanceOf[js.Any], directConnectTicks = directConnectTicks.asInstanceOf[js.Any], directPeers = directPeers.asInstanceOf[js.Any], doPX = doPX.asInstanceOf[js.Any], emitSelf = emitSelf.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fallbackToFloodsub = fallbackToFloodsub.asInstanceOf[js.Any], fanoutTTL = fanoutTTL.asInstanceOf[js.Any], fastMsgIdFn = js.Any.fromFunction1(fastMsgIdFn), floodPublish = floodPublish.asInstanceOf[js.Any], globalSignaturePolicy = globalSignaturePolicy.asInstanceOf[js.Any], gossipsubIWantFollowupMs = gossipsubIWantFollowupMs.asInstanceOf[js.Any], graftFloodThreshold = graftFloodThreshold.asInstanceOf[js.Any], heartbeatInterval = heartbeatInterval.asInstanceOf[js.Any], ignoreDuplicatePublishError = ignoreDuplicatePublishError.asInstanceOf[js.Any], maxInboundDataLength = maxInboundDataLength.asInstanceOf[js.Any], maxInboundStreams = maxInboundStreams.asInstanceOf[js.Any], maxOutboundBufferSize = maxOutboundBufferSize.asInstanceOf[js.Any], maxOutboundStreams = maxOutboundStreams.asInstanceOf[js.Any], mcacheGossip = mcacheGossip.asInstanceOf[js.Any], mcacheLength = mcacheLength.asInstanceOf[js.Any], messageCache = messageCache.asInstanceOf[js.Any], messageProcessingConcurrency = messageProcessingConcurrency.asInstanceOf[js.Any], metricsRegister = metricsRegister.asInstanceOf[js.Any], metricsTopicStrToLabel = metricsTopicStrToLabel.asInstanceOf[js.Any], msgIdFn = js.Any.fromFunction1(msgIdFn), msgIdToStrFn = js.Any.fromFunction1(msgIdToStrFn), multicodecs = multicodecs.asInstanceOf[js.Any], opportunisticGraftPeers = opportunisticGraftPeers.asInstanceOf[js.Any], opportunisticGraftTicks = opportunisticGraftTicks.asInstanceOf[js.Any], pruneBackoff = pruneBackoff.asInstanceOf[js.Any], prunePeers = prunePeers.asInstanceOf[js.Any], scoreParams = scoreParams.asInstanceOf[js.Any], scoreThresholds = scoreThresholds.asInstanceOf[js.Any], seenTTL = seenTTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredGossipOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredGossipOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowPublishToZeroPeers(value: Boolean): Self = StObject.set(x, "allowPublishToZeroPeers", value.asInstanceOf[js.Any])
    
    inline def setAllowedTopics(value: js.Array[String] | Set[String]): Self = StObject.set(x, "allowedTopics", value.asInstanceOf[js.Any])
    
    inline def setAllowedTopicsVarargs(value: String*): Self = StObject.set(x, "allowedTopics", js.Array(value*))
    
    inline def setAsyncValidation(value: Boolean): Self = StObject.set(x, "asyncValidation", value.asInstanceOf[js.Any])
    
    inline def setAwaitRpcHandler(value: Boolean): Self = StObject.set(x, "awaitRpcHandler", value.asInstanceOf[js.Any])
    
    inline def setAwaitRpcMessageHandler(value: Boolean): Self = StObject.set(x, "awaitRpcMessageHandler", value.asInstanceOf[js.Any])
    
    inline def setCanRelayMessage(value: Boolean): Self = StObject.set(x, "canRelayMessage", value.asInstanceOf[js.Any])
    
    inline def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
    
    inline def setDataTransform(value: DataTransform): Self = StObject.set(x, "dataTransform", value.asInstanceOf[js.Any])
    
    inline def setDebugName(value: String): Self = StObject.set(x, "debugName", value.asInstanceOf[js.Any])
    
    inline def setDecodeRpcLimits(value: DecodeRPCLimits): Self = StObject.set(x, "decodeRpcLimits", value.asInstanceOf[js.Any])
    
    inline def setDhi(value: Double): Self = StObject.set(x, "Dhi", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectTicks(value: Double): Self = StObject.set(x, "directConnectTicks", value.asInstanceOf[js.Any])
    
    inline def setDirectPeers(value: js.Array[AddrInfo]): Self = StObject.set(x, "directPeers", value.asInstanceOf[js.Any])
    
    inline def setDirectPeersVarargs(value: AddrInfo*): Self = StObject.set(x, "directPeers", js.Array(value*))
    
    inline def setDlazy(value: Double): Self = StObject.set(x, "Dlazy", value.asInstanceOf[js.Any])
    
    inline def setDlo(value: Double): Self = StObject.set(x, "Dlo", value.asInstanceOf[js.Any])
    
    inline def setDoPX(value: Boolean): Self = StObject.set(x, "doPX", value.asInstanceOf[js.Any])
    
    inline def setDout(value: Double): Self = StObject.set(x, "Dout", value.asInstanceOf[js.Any])
    
    inline def setDscore(value: Double): Self = StObject.set(x, "Dscore", value.asInstanceOf[js.Any])
    
    inline def setEmitSelf(value: Boolean): Self = StObject.set(x, "emitSelf", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFallbackToFloodsub(value: Boolean): Self = StObject.set(x, "fallbackToFloodsub", value.asInstanceOf[js.Any])
    
    inline def setFanoutTTL(value: Double): Self = StObject.set(x, "fanoutTTL", value.asInstanceOf[js.Any])
    
    inline def setFastMsgIdFn(value: /* msg */ IMessage => String | Double): Self = StObject.set(x, "fastMsgIdFn", js.Any.fromFunction1(value))
    
    inline def setFloodPublish(value: Boolean): Self = StObject.set(x, "floodPublish", value.asInstanceOf[js.Any])
    
    inline def setGlobalSignaturePolicy(value: SignaturePolicy): Self = StObject.set(x, "globalSignaturePolicy", value.asInstanceOf[js.Any])
    
    inline def setGossipsubIWantFollowupMs(value: Double): Self = StObject.set(x, "gossipsubIWantFollowupMs", value.asInstanceOf[js.Any])
    
    inline def setGraftFloodThreshold(value: Double): Self = StObject.set(x, "graftFloodThreshold", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDuplicatePublishError(value: Boolean): Self = StObject.set(x, "ignoreDuplicatePublishError", value.asInstanceOf[js.Any])
    
    inline def setMaxInboundDataLength(value: Double): Self = StObject.set(x, "maxInboundDataLength", value.asInstanceOf[js.Any])
    
    inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxOutboundBufferSize(value: Double): Self = StObject.set(x, "maxOutboundBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMcacheGossip(value: Double): Self = StObject.set(x, "mcacheGossip", value.asInstanceOf[js.Any])
    
    inline def setMcacheLength(value: Double): Self = StObject.set(x, "mcacheLength", value.asInstanceOf[js.Any])
    
    inline def setMessageCache(value: MessageCache): Self = StObject.set(x, "messageCache", value.asInstanceOf[js.Any])
    
    inline def setMessageProcessingConcurrency(value: Double): Self = StObject.set(x, "messageProcessingConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMetricsRegister(value: MetricsRegister): Self = StObject.set(x, "metricsRegister", value.asInstanceOf[js.Any])
    
    inline def setMetricsTopicStrToLabel(value: TopicStrToLabel): Self = StObject.set(x, "metricsTopicStrToLabel", value.asInstanceOf[js.Any])
    
    inline def setMsgIdFn(
      value: /* msg */ typings.libp2pInterfacePubsub.mod.Message => js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array
    ): Self = StObject.set(x, "msgIdFn", js.Any.fromFunction1(value))
    
    inline def setMsgIdToStrFn(value: /* msgId */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "msgIdToStrFn", js.Any.fromFunction1(value))
    
    inline def setMulticodecs(value: js.Array[String]): Self = StObject.set(x, "multicodecs", value.asInstanceOf[js.Any])
    
    inline def setMulticodecsVarargs(value: String*): Self = StObject.set(x, "multicodecs", js.Array(value*))
    
    inline def setOpportunisticGraftPeers(value: Double): Self = StObject.set(x, "opportunisticGraftPeers", value.asInstanceOf[js.Any])
    
    inline def setOpportunisticGraftTicks(value: Double): Self = StObject.set(x, "opportunisticGraftTicks", value.asInstanceOf[js.Any])
    
    inline def setPruneBackoff(value: Double): Self = StObject.set(x, "pruneBackoff", value.asInstanceOf[js.Any])
    
    inline def setPrunePeers(value: Double): Self = StObject.set(x, "prunePeers", value.asInstanceOf[js.Any])
    
    inline def setScoreParams(value: PeerScoreParams): Self = StObject.set(x, "scoreParams", value.asInstanceOf[js.Any])
    
    inline def setScoreThresholds(value: PeerScoreThresholds): Self = StObject.set(x, "scoreThresholds", value.asInstanceOf[js.Any])
    
    inline def setSeenTTL(value: Double): Self = StObject.set(x, "seenTTL", value.asInstanceOf[js.Any])
  }
}
