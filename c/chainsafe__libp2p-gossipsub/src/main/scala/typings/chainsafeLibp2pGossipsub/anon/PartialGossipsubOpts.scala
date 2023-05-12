package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMessageCacheMod.MessageCache
import typings.chainsafeLibp2pGossipsub.distSrcMessageDecodeRpcMod.DecodeRPCLimits
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.MetricsRegister
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicStrToLabel
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

/* Inlined std.Partial<@chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub.GossipsubOpts> */
trait PartialGossipsubOpts extends StObject {
  
  var D: js.UndefOr[Double] = js.undefined
  
  var Dhi: js.UndefOr[Double] = js.undefined
  
  var Dlazy: js.UndefOr[Double] = js.undefined
  
  var Dlo: js.UndefOr[Double] = js.undefined
  
  var Dout: js.UndefOr[Double] = js.undefined
  
  var Dscore: js.UndefOr[Double] = js.undefined
  
  var allowPublishToZeroPeers: js.UndefOr[Boolean] = js.undefined
  
  var allowedTopics: js.UndefOr[js.Array[String] | Set[String]] = js.undefined
  
  var asyncValidation: js.UndefOr[Boolean] = js.undefined
  
  var awaitRpcHandler: js.UndefOr[Boolean] = js.undefined
  
  var awaitRpcMessageHandler: js.UndefOr[Boolean] = js.undefined
  
  var canRelayMessage: js.UndefOr[Boolean] = js.undefined
  
  var dataTransform: js.UndefOr[DataTransform] = js.undefined
  
  var debugName: js.UndefOr[String] = js.undefined
  
  var decodeRpcLimits: js.UndefOr[DecodeRPCLimits] = js.undefined
  
  var directConnectTicks: js.UndefOr[Double] = js.undefined
  
  var directPeers: js.UndefOr[js.Array[AddrInfo]] = js.undefined
  
  var doPX: js.UndefOr[Boolean] = js.undefined
  
  var emitSelf: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var fallbackToFloodsub: js.UndefOr[Boolean] = js.undefined
  
  var fanoutTTL: js.UndefOr[Double] = js.undefined
  
  var fastMsgIdFn: js.UndefOr[FastMsgIdFn] = js.undefined
  
  var floodPublish: js.UndefOr[Boolean] = js.undefined
  
  var globalSignaturePolicy: js.UndefOr[SignaturePolicy] = js.undefined
  
  var gossipsubIWantFollowupMs: js.UndefOr[Double] = js.undefined
  
  var graftFloodThreshold: js.UndefOr[Double] = js.undefined
  
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  
  var ignoreDuplicatePublishError: js.UndefOr[Boolean] = js.undefined
  
  var maxInboundDataLength: js.UndefOr[Double] = js.undefined
  
  var maxInboundStreams: js.UndefOr[Double] = js.undefined
  
  var maxOutboundBufferSize: js.UndefOr[Double] = js.undefined
  
  var maxOutboundStreams: js.UndefOr[Double] = js.undefined
  
  var mcacheGossip: js.UndefOr[Double] = js.undefined
  
  var mcacheLength: js.UndefOr[Double] = js.undefined
  
  var messageCache: js.UndefOr[MessageCache] = js.undefined
  
  var messageProcessingConcurrency: js.UndefOr[Double] = js.undefined
  
  var metricsRegister: js.UndefOr[MetricsRegister | Null] = js.undefined
  
  var metricsTopicStrToLabel: js.UndefOr[TopicStrToLabel] = js.undefined
  
  var msgIdFn: js.UndefOr[MsgIdFn] = js.undefined
  
  var msgIdToStrFn: js.UndefOr[MsgIdToStrFn] = js.undefined
  
  var multicodecs: js.UndefOr[js.Array[String]] = js.undefined
  
  var opportunisticGraftPeers: js.UndefOr[Double] = js.undefined
  
  var opportunisticGraftTicks: js.UndefOr[Double] = js.undefined
  
  var pruneBackoff: js.UndefOr[Double] = js.undefined
  
  var prunePeers: js.UndefOr[Double] = js.undefined
  
  var scoreParams: js.UndefOr[PartialPeerScoreParams] = js.undefined
  
  var scoreThresholds: js.UndefOr[PartialPeerScoreThreshold] = js.undefined
  
  var seenTTL: js.UndefOr[Double] = js.undefined
}
object PartialGossipsubOpts {
  
  inline def apply(): PartialGossipsubOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGossipsubOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialGossipsubOpts] (val x: Self) extends AnyVal {
    
    inline def setAllowPublishToZeroPeers(value: Boolean): Self = StObject.set(x, "allowPublishToZeroPeers", value.asInstanceOf[js.Any])
    
    inline def setAllowPublishToZeroPeersUndefined: Self = StObject.set(x, "allowPublishToZeroPeers", js.undefined)
    
    inline def setAllowedTopics(value: js.Array[String] | Set[String]): Self = StObject.set(x, "allowedTopics", value.asInstanceOf[js.Any])
    
    inline def setAllowedTopicsUndefined: Self = StObject.set(x, "allowedTopics", js.undefined)
    
    inline def setAllowedTopicsVarargs(value: String*): Self = StObject.set(x, "allowedTopics", js.Array(value*))
    
    inline def setAsyncValidation(value: Boolean): Self = StObject.set(x, "asyncValidation", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidationUndefined: Self = StObject.set(x, "asyncValidation", js.undefined)
    
    inline def setAwaitRpcHandler(value: Boolean): Self = StObject.set(x, "awaitRpcHandler", value.asInstanceOf[js.Any])
    
    inline def setAwaitRpcHandlerUndefined: Self = StObject.set(x, "awaitRpcHandler", js.undefined)
    
    inline def setAwaitRpcMessageHandler(value: Boolean): Self = StObject.set(x, "awaitRpcMessageHandler", value.asInstanceOf[js.Any])
    
    inline def setAwaitRpcMessageHandlerUndefined: Self = StObject.set(x, "awaitRpcMessageHandler", js.undefined)
    
    inline def setCanRelayMessage(value: Boolean): Self = StObject.set(x, "canRelayMessage", value.asInstanceOf[js.Any])
    
    inline def setCanRelayMessageUndefined: Self = StObject.set(x, "canRelayMessage", js.undefined)
    
    inline def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "D", js.undefined)
    
    inline def setDataTransform(value: DataTransform): Self = StObject.set(x, "dataTransform", value.asInstanceOf[js.Any])
    
    inline def setDataTransformUndefined: Self = StObject.set(x, "dataTransform", js.undefined)
    
    inline def setDebugName(value: String): Self = StObject.set(x, "debugName", value.asInstanceOf[js.Any])
    
    inline def setDebugNameUndefined: Self = StObject.set(x, "debugName", js.undefined)
    
    inline def setDecodeRpcLimits(value: DecodeRPCLimits): Self = StObject.set(x, "decodeRpcLimits", value.asInstanceOf[js.Any])
    
    inline def setDecodeRpcLimitsUndefined: Self = StObject.set(x, "decodeRpcLimits", js.undefined)
    
    inline def setDhi(value: Double): Self = StObject.set(x, "Dhi", value.asInstanceOf[js.Any])
    
    inline def setDhiUndefined: Self = StObject.set(x, "Dhi", js.undefined)
    
    inline def setDirectConnectTicks(value: Double): Self = StObject.set(x, "directConnectTicks", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectTicksUndefined: Self = StObject.set(x, "directConnectTicks", js.undefined)
    
    inline def setDirectPeers(value: js.Array[AddrInfo]): Self = StObject.set(x, "directPeers", value.asInstanceOf[js.Any])
    
    inline def setDirectPeersUndefined: Self = StObject.set(x, "directPeers", js.undefined)
    
    inline def setDirectPeersVarargs(value: AddrInfo*): Self = StObject.set(x, "directPeers", js.Array(value*))
    
    inline def setDlazy(value: Double): Self = StObject.set(x, "Dlazy", value.asInstanceOf[js.Any])
    
    inline def setDlazyUndefined: Self = StObject.set(x, "Dlazy", js.undefined)
    
    inline def setDlo(value: Double): Self = StObject.set(x, "Dlo", value.asInstanceOf[js.Any])
    
    inline def setDloUndefined: Self = StObject.set(x, "Dlo", js.undefined)
    
    inline def setDoPX(value: Boolean): Self = StObject.set(x, "doPX", value.asInstanceOf[js.Any])
    
    inline def setDoPXUndefined: Self = StObject.set(x, "doPX", js.undefined)
    
    inline def setDout(value: Double): Self = StObject.set(x, "Dout", value.asInstanceOf[js.Any])
    
    inline def setDoutUndefined: Self = StObject.set(x, "Dout", js.undefined)
    
    inline def setDscore(value: Double): Self = StObject.set(x, "Dscore", value.asInstanceOf[js.Any])
    
    inline def setDscoreUndefined: Self = StObject.set(x, "Dscore", js.undefined)
    
    inline def setEmitSelf(value: Boolean): Self = StObject.set(x, "emitSelf", value.asInstanceOf[js.Any])
    
    inline def setEmitSelfUndefined: Self = StObject.set(x, "emitSelf", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFallbackToFloodsub(value: Boolean): Self = StObject.set(x, "fallbackToFloodsub", value.asInstanceOf[js.Any])
    
    inline def setFallbackToFloodsubUndefined: Self = StObject.set(x, "fallbackToFloodsub", js.undefined)
    
    inline def setFanoutTTL(value: Double): Self = StObject.set(x, "fanoutTTL", value.asInstanceOf[js.Any])
    
    inline def setFanoutTTLUndefined: Self = StObject.set(x, "fanoutTTL", js.undefined)
    
    inline def setFastMsgIdFn(value: /* msg */ IMessage => String | Double): Self = StObject.set(x, "fastMsgIdFn", js.Any.fromFunction1(value))
    
    inline def setFastMsgIdFnUndefined: Self = StObject.set(x, "fastMsgIdFn", js.undefined)
    
    inline def setFloodPublish(value: Boolean): Self = StObject.set(x, "floodPublish", value.asInstanceOf[js.Any])
    
    inline def setFloodPublishUndefined: Self = StObject.set(x, "floodPublish", js.undefined)
    
    inline def setGlobalSignaturePolicy(value: SignaturePolicy): Self = StObject.set(x, "globalSignaturePolicy", value.asInstanceOf[js.Any])
    
    inline def setGlobalSignaturePolicyUndefined: Self = StObject.set(x, "globalSignaturePolicy", js.undefined)
    
    inline def setGossipsubIWantFollowupMs(value: Double): Self = StObject.set(x, "gossipsubIWantFollowupMs", value.asInstanceOf[js.Any])
    
    inline def setGossipsubIWantFollowupMsUndefined: Self = StObject.set(x, "gossipsubIWantFollowupMs", js.undefined)
    
    inline def setGraftFloodThreshold(value: Double): Self = StObject.set(x, "graftFloodThreshold", value.asInstanceOf[js.Any])
    
    inline def setGraftFloodThresholdUndefined: Self = StObject.set(x, "graftFloodThreshold", js.undefined)
    
    inline def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatIntervalUndefined: Self = StObject.set(x, "heartbeatInterval", js.undefined)
    
    inline def setIgnoreDuplicatePublishError(value: Boolean): Self = StObject.set(x, "ignoreDuplicatePublishError", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDuplicatePublishErrorUndefined: Self = StObject.set(x, "ignoreDuplicatePublishError", js.undefined)
    
    inline def setMaxInboundDataLength(value: Double): Self = StObject.set(x, "maxInboundDataLength", value.asInstanceOf[js.Any])
    
    inline def setMaxInboundDataLengthUndefined: Self = StObject.set(x, "maxInboundDataLength", js.undefined)
    
    inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
    
    inline def setMaxOutboundBufferSize(value: Double): Self = StObject.set(x, "maxOutboundBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxOutboundBufferSizeUndefined: Self = StObject.set(x, "maxOutboundBufferSize", js.undefined)
    
    inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
    
    inline def setMcacheGossip(value: Double): Self = StObject.set(x, "mcacheGossip", value.asInstanceOf[js.Any])
    
    inline def setMcacheGossipUndefined: Self = StObject.set(x, "mcacheGossip", js.undefined)
    
    inline def setMcacheLength(value: Double): Self = StObject.set(x, "mcacheLength", value.asInstanceOf[js.Any])
    
    inline def setMcacheLengthUndefined: Self = StObject.set(x, "mcacheLength", js.undefined)
    
    inline def setMessageCache(value: MessageCache): Self = StObject.set(x, "messageCache", value.asInstanceOf[js.Any])
    
    inline def setMessageCacheUndefined: Self = StObject.set(x, "messageCache", js.undefined)
    
    inline def setMessageProcessingConcurrency(value: Double): Self = StObject.set(x, "messageProcessingConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMessageProcessingConcurrencyUndefined: Self = StObject.set(x, "messageProcessingConcurrency", js.undefined)
    
    inline def setMetricsRegister(value: MetricsRegister): Self = StObject.set(x, "metricsRegister", value.asInstanceOf[js.Any])
    
    inline def setMetricsRegisterNull: Self = StObject.set(x, "metricsRegister", null)
    
    inline def setMetricsRegisterUndefined: Self = StObject.set(x, "metricsRegister", js.undefined)
    
    inline def setMetricsTopicStrToLabel(value: TopicStrToLabel): Self = StObject.set(x, "metricsTopicStrToLabel", value.asInstanceOf[js.Any])
    
    inline def setMetricsTopicStrToLabelUndefined: Self = StObject.set(x, "metricsTopicStrToLabel", js.undefined)
    
    inline def setMsgIdFn(
      value: /* msg */ typings.libp2pInterfacePubsub.mod.Message => js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array
    ): Self = StObject.set(x, "msgIdFn", js.Any.fromFunction1(value))
    
    inline def setMsgIdFnUndefined: Self = StObject.set(x, "msgIdFn", js.undefined)
    
    inline def setMsgIdToStrFn(value: /* msgId */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "msgIdToStrFn", js.Any.fromFunction1(value))
    
    inline def setMsgIdToStrFnUndefined: Self = StObject.set(x, "msgIdToStrFn", js.undefined)
    
    inline def setMulticodecs(value: js.Array[String]): Self = StObject.set(x, "multicodecs", value.asInstanceOf[js.Any])
    
    inline def setMulticodecsUndefined: Self = StObject.set(x, "multicodecs", js.undefined)
    
    inline def setMulticodecsVarargs(value: String*): Self = StObject.set(x, "multicodecs", js.Array(value*))
    
    inline def setOpportunisticGraftPeers(value: Double): Self = StObject.set(x, "opportunisticGraftPeers", value.asInstanceOf[js.Any])
    
    inline def setOpportunisticGraftPeersUndefined: Self = StObject.set(x, "opportunisticGraftPeers", js.undefined)
    
    inline def setOpportunisticGraftTicks(value: Double): Self = StObject.set(x, "opportunisticGraftTicks", value.asInstanceOf[js.Any])
    
    inline def setOpportunisticGraftTicksUndefined: Self = StObject.set(x, "opportunisticGraftTicks", js.undefined)
    
    inline def setPruneBackoff(value: Double): Self = StObject.set(x, "pruneBackoff", value.asInstanceOf[js.Any])
    
    inline def setPruneBackoffUndefined: Self = StObject.set(x, "pruneBackoff", js.undefined)
    
    inline def setPrunePeers(value: Double): Self = StObject.set(x, "prunePeers", value.asInstanceOf[js.Any])
    
    inline def setPrunePeersUndefined: Self = StObject.set(x, "prunePeers", js.undefined)
    
    inline def setScoreParams(value: PartialPeerScoreParams): Self = StObject.set(x, "scoreParams", value.asInstanceOf[js.Any])
    
    inline def setScoreParamsUndefined: Self = StObject.set(x, "scoreParams", js.undefined)
    
    inline def setScoreThresholds(value: PartialPeerScoreThreshold): Self = StObject.set(x, "scoreThresholds", value.asInstanceOf[js.Any])
    
    inline def setScoreThresholdsUndefined: Self = StObject.set(x, "scoreThresholds", js.undefined)
    
    inline def setSeenTTL(value: Double): Self = StObject.set(x, "seenTTL", value.asInstanceOf[js.Any])
    
    inline def setSeenTTLUndefined: Self = StObject.set(x, "seenTTL", js.undefined)
  }
}
