package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.IRPC
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.AvgMinMax
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.Gauge
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.Histogram
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.LabelsGeneric
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreWeights
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ToSendGroupCount
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicStrToLabel
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreThresholdsMod.PeerScoreThresholds
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageStatus
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PeerIdStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReasonObj
import typings.libp2pInterfacePubsub.mod.TopicValidatorResult
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncValidationMcacheHit extends StObject {
  
  /** When the user validates a message, it tries to re propagate it to its mesh peers. If the
    *  message expires from the memcache before it can be validated, we count this a cache miss
    *  and it is an indicator that the memcache size should be increased.
    *  = rust-libp2p `mcache_misses` */
  var asyncValidationMcacheHit: Gauge[Hit]
  
  /** Message validation results for each topic.
    *  Invalid == Reject?
    *  = rust-libp2p `invalid_messages`, `accepted_messages`, `ignored_messages`, `rejected_messages` */
  var asyncValidationResult: Gauge[Acceptance]
  
  var behaviourPenalty: Histogram[LabelsGeneric]
  
  /** Unbounded cache sizes */
  var cacheSize: Gauge[Cache]
  
  /** Track duplicate message delivery time */
  var duplicateMsgDeliveryDelay: Histogram[LabelsGeneric]
  
  var duplicateMsgIgnored: Gauge[TopicTopicLabel]
  
  /** Total count of late msg delivery total by topic */
  var duplicateMsgLateDelivery: Gauge[TopicTopicLabel]
  
  var fastMsgIdCacheCollision: Gauge[LabelsGeneric]
  
  /** The time it takes to complete one iteration of the heartbeat. */
  var heartbeatDuration: Histogram[LabelsGeneric]
  
  /** Heartbeat run took longer than heartbeat interval so next is skipped */
  var heartbeatSkipped: Gauge[LabelsGeneric]
  
  /** Total received IHAVE messages that we ignore for some reason */
  var ihaveRcvIgnored: Gauge[ReasonIHaveIgnoreReason]
  
  /** Total received IHAVE messages by topic */
  var ihaveRcvMsgids: Gauge[TopicTopicLabel]
  
  /** Total messages per topic we don't have. Not actual requests.
    *  The number of times we have decided that an IWANT control message is required for this
    *  topic. A very high metric might indicate an underperforming network.
    *  = rust-libp2p `topic_iwant_msgs` */
  var ihaveRcvNotSeenMsgids: Gauge[TopicTopicLabel]
  
  var iwantMessagePruned: Gauge[LabelsGeneric]
  
  var iwantPromiseBroken: Gauge[LabelsGeneric]
  
  /** Histogram of delivery time of resolved IWANT promises */
  var iwantPromiseDeliveryTime: Histogram[LabelsGeneric]
  
  /** Total count of resolved IWANT promises */
  var iwantPromiseResolved: Gauge[LabelsGeneric]
  
  /** Total count of resolved IWANT promises from duplicate messages */
  var iwantPromiseResolvedFromDuplicate: Gauge[LabelsGeneric]
  
  /** Total count of peers we have asked IWANT promises that are resolved */
  var iwantPromiseResolvedPeers: Gauge[LabelsGeneric]
  
  var iwantPromiseStarted: Gauge[LabelsGeneric]
  
  var iwantPromiseUntracked: Gauge[LabelsGeneric]
  
  /** Total requested messageIDs that we don't have */
  var iwantRcvDonthaveMsgids: Gauge[LabelsGeneric]
  
  /** Total received IWANT messages by topic */
  var iwantRcvMsgids: Gauge[TopicTopicLabel]
  
  var mcacheNotValidatedCount: Gauge[LabelsGeneric]
  
  /** Current mcache msg count */
  var mcacheSize: Gauge[LabelsGeneric]
  
  /** Number of times we remove peers in a topic mesh for different reasons.
    *  = rust-libp2p `mesh_peer_churn_events` */
  var meshPeerChurnEvents: Gauge[Topic]
  
  /** Number of peers in our mesh. This metric should be updated with the count of peers for a
    *  topic in the mesh regardless of inclusion and churn events.
    *  = rust-libp2p `mesh_peer_counts` */
  var meshPeerCounts: Gauge[TopicStr]
  
  /** Number of times we include peers in a topic mesh for different reasons.
    *  = rust-libp2p `mesh_peer_inclusion_events` */
  var meshPeerInclusionEvents: Gauge[Reason]
  
  /** Total count of msg forwarded by topic */
  var msgForwardCount: Gauge[TopicTopicLabel]
  
  /** Total count of peers that we forward a msg to */
  var msgForwardPeers: Gauge[TopicTopicLabel]
  
  /** Total count of msg publish data.length bytes */
  var msgPublishBytes: Gauge[TopicTopicLabel]
  
  /** Total count of msg published by topic */
  var msgPublishCount: Gauge[TopicTopicLabel]
  
  /** Total count of peers that we publish a msg to */
  var msgPublishPeers: Gauge[TopicTopicLabel]
  
  /** Total count of peers (by group) that we publish a msg to */
  var msgPublishPeersByGroup: Gauge[PeerGroup]
  
  /** Total count of recv msgs error */
  var msgReceivedError: Gauge[TopicTopicLabel]
  
  /** Tracks specific reason of invalid */
  var msgReceivedInvalid: Gauge[Error]
  
  /** Total count of recv msgs before any validation */
  var msgReceivedPreValidation: Gauge[TopicTopicLabel]
  
  /** Tracks distribution of recv msgs by duplicate, invalid, valid */
  var msgReceivedStatus: Gauge[Status]
  
  var newConnectionCount: Gauge[StatusString]
  
  /** Register the inclusion of peers in our mesh due to some reason. */
  def onAddToMesh(
    topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    reason: InclusionReason,
    count: Double
  ): Unit
  
  def onDuplicateMsgDelivery(
    topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    deliveryDelayMs: Double,
    isLateDelivery: Boolean
  ): Unit
  
  def onForwardMsg(topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, tosendCount: Double): Unit
  
  def onIhaveRcv(
    topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    ihave: Double,
    idonthave: Double
  ): Unit
  
  def onIwantRcv(
    iwantByTopic: Map[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double],
    iwantDonthave: Double
  ): Unit
  
  /** We joined a topic */
  def onJoin(topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): Unit
  
  /** We left a topic */
  def onLeave(topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): Unit
  
  def onMsgRecvError(topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): Unit
  
  def onMsgRecvInvalid(topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, reason: RejectReasonObj): Unit
  
  def onMsgRecvPreValidation(topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): Unit
  
  def onMsgRecvResult(topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, status: MessageStatus): Unit
  
  def onPeerReadStreamError(): Unit
  
  def onPublishDuplicateMsg(topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): Unit
  
  def onPublishMsg(
    topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    tosendGroupCount: ToSendGroupCount,
    tosendCount: Double,
    dataLen: Double
  ): Unit
  
  /** Register the removal of peers in our mesh due to some reason */
  def onRemoveFromMesh(
    topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    reason: ChurnReason,
    count: Double
  ): Unit
  
  def onReportValidation(
    topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    acceptance: TopicValidatorResult
  ): Unit
  
  def onReportValidationMcacheHit(hit: Boolean): Unit
  
  def onRpcDataError(): Unit
  
  def onRpcRecv(rpc: IRPC, rpcBytes: Double): Unit
  
  def onRpcRecvError(): Unit
  
  def onRpcSent(rpc: IRPC, rpcBytes: Double): Unit
  
  /**
    * - in handle_graft() Penalty::GraftBackoff
    * - in apply_iwant_penalties() Penalty::BrokenPromise
    * - in metric_score() P3 Penalty::MessageDeficit
    * - in metric_score() P6 Penalty::IPColocation
    */
  def onScorePenalty(penalty: ScorePenalty): Unit
  
  var peerReadStreamError: Gauge[LabelsGeneric]
  
  /** Current count of peers by score threshold */
  var peersByScoreThreshold: Gauge[Threshold]
  
  /** Gossipsub supports floodsub, gossipsub v1.0 and gossipsub v1.1. Peers are classified based
    *  on which protocol they support. This metric keeps track of the number of peers that are
    *  connected of each type. */
  var peersPerProtocol: Gauge[Protocol]
  
  var protocolsEnabled: Gauge[Protocol]
  
  def registerScorePerMesh(
    mesh: Map[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Set[PeerIdStr]],
    scoreByPeer: Map[PeerIdStr, Double]
  ): Unit
  
  def registerScoreWeights(sw: ScoreWeights[js.Array[Double]]): Unit
  
  def registerScores(scores: js.Array[Double], scoreThresholds: PeerScoreThresholds): Unit
  
  var rpcDataError: Gauge[LabelsGeneric]
  
  var rpcRecvBytes: Gauge[LabelsGeneric]
  
  var rpcRecvControl: Gauge[LabelsGeneric]
  
  var rpcRecvCount: Gauge[LabelsGeneric]
  
  var rpcRecvError: Gauge[LabelsGeneric]
  
  var rpcRecvGraft: Gauge[LabelsGeneric]
  
  var rpcRecvIHave: Gauge[LabelsGeneric]
  
  var rpcRecvIWant: Gauge[LabelsGeneric]
  
  var rpcRecvMessage: Gauge[LabelsGeneric]
  
  /** Total count of RPC dropped because acceptFrom() == false */
  var rpcRecvNotAccepted: Gauge[LabelsGeneric]
  
  var rpcRecvPrune: Gauge[LabelsGeneric]
  
  var rpcRecvSubscription: Gauge[LabelsGeneric]
  
  var rpcSentBytes: Gauge[LabelsGeneric]
  
  var rpcSentControl: Gauge[LabelsGeneric]
  
  var rpcSentCount: Gauge[LabelsGeneric]
  
  var rpcSentGraft: Gauge[LabelsGeneric]
  
  var rpcSentIHave: Gauge[LabelsGeneric]
  
  var rpcSentIWant: Gauge[LabelsGeneric]
  
  var rpcSentMessage: Gauge[LabelsGeneric]
  
  var rpcSentPrune: Gauge[LabelsGeneric]
  
  var rpcSentSubscription: Gauge[LabelsGeneric]
  
  var score: AvgMinMax[LabelsGeneric]
  
  var scoreCachedDelta: Histogram[LabelsGeneric]
  
  /** Total times score() is called */
  var scoreFnCalls: Gauge[LabelsGeneric]
  
  /** Total times score() call actually computed computeScore(), no cache */
  var scoreFnRuns: Gauge[LabelsGeneric]
  
  /** Histogram of the scores for each mesh topic. */
  var scorePerMesh: AvgMinMax[TopicTopicLabel]
  
  /** Separate score weights */
  var scoreWeights: AvgMinMax[P]
  
  /** A counter of the kind of penalties being applied to peers. */
  var scoringPenalties: Gauge[Penalty]
  
  def toTopic(topicStr: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): TopicLabel
  
  /** Number of peers subscribed to each topic. This allows us to analyze a topic's behaviour
    * regardless of our subscription status. */
  var topicPeersCount: Gauge[TopicStr]
  
  var topicStrToLabel: TopicStrToLabel
  
  /** Status of our subscription to this topic. This metric allows analyzing other topic metrics
    *  filtered by our current subscription status.
    *  = rust-libp2p `topic_subscription_status` */
  var topicSubscriptionStatus: Gauge[TopicStr]
}
object AsyncValidationMcacheHit {
  
  inline def apply(
    asyncValidationMcacheHit: Gauge[Hit],
    asyncValidationResult: Gauge[Acceptance],
    behaviourPenalty: Histogram[LabelsGeneric],
    cacheSize: Gauge[Cache],
    duplicateMsgDeliveryDelay: Histogram[LabelsGeneric],
    duplicateMsgIgnored: Gauge[TopicTopicLabel],
    duplicateMsgLateDelivery: Gauge[TopicTopicLabel],
    fastMsgIdCacheCollision: Gauge[LabelsGeneric],
    heartbeatDuration: Histogram[LabelsGeneric],
    heartbeatSkipped: Gauge[LabelsGeneric],
    ihaveRcvIgnored: Gauge[ReasonIHaveIgnoreReason],
    ihaveRcvMsgids: Gauge[TopicTopicLabel],
    ihaveRcvNotSeenMsgids: Gauge[TopicTopicLabel],
    iwantMessagePruned: Gauge[LabelsGeneric],
    iwantPromiseBroken: Gauge[LabelsGeneric],
    iwantPromiseDeliveryTime: Histogram[LabelsGeneric],
    iwantPromiseResolved: Gauge[LabelsGeneric],
    iwantPromiseResolvedFromDuplicate: Gauge[LabelsGeneric],
    iwantPromiseResolvedPeers: Gauge[LabelsGeneric],
    iwantPromiseStarted: Gauge[LabelsGeneric],
    iwantPromiseUntracked: Gauge[LabelsGeneric],
    iwantRcvDonthaveMsgids: Gauge[LabelsGeneric],
    iwantRcvMsgids: Gauge[TopicTopicLabel],
    mcacheNotValidatedCount: Gauge[LabelsGeneric],
    mcacheSize: Gauge[LabelsGeneric],
    meshPeerChurnEvents: Gauge[Topic],
    meshPeerCounts: Gauge[TopicStr],
    meshPeerInclusionEvents: Gauge[Reason],
    msgForwardCount: Gauge[TopicTopicLabel],
    msgForwardPeers: Gauge[TopicTopicLabel],
    msgPublishBytes: Gauge[TopicTopicLabel],
    msgPublishCount: Gauge[TopicTopicLabel],
    msgPublishPeers: Gauge[TopicTopicLabel],
    msgPublishPeersByGroup: Gauge[PeerGroup],
    msgReceivedError: Gauge[TopicTopicLabel],
    msgReceivedInvalid: Gauge[Error],
    msgReceivedPreValidation: Gauge[TopicTopicLabel],
    msgReceivedStatus: Gauge[Status],
    newConnectionCount: Gauge[StatusString],
    onAddToMesh: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, InclusionReason, Double) => Unit,
    onDuplicateMsgDelivery: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double, Boolean) => Unit,
    onForwardMsg: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double) => Unit,
    onIhaveRcv: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double, Double) => Unit,
    onIwantRcv: (Map[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double], Double) => Unit,
    onJoin: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Unit,
    onLeave: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Unit,
    onMsgRecvError: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Unit,
    onMsgRecvInvalid: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, RejectReasonObj) => Unit,
    onMsgRecvPreValidation: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Unit,
    onMsgRecvResult: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, MessageStatus) => Unit,
    onPeerReadStreamError: () => Unit,
    onPublishDuplicateMsg: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Unit,
    onPublishMsg: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, ToSendGroupCount, Double, Double) => Unit,
    onRemoveFromMesh: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, ChurnReason, Double) => Unit,
    onReportValidation: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, TopicValidatorResult) => Unit,
    onReportValidationMcacheHit: Boolean => Unit,
    onRpcDataError: () => Unit,
    onRpcRecv: (IRPC, Double) => Unit,
    onRpcRecvError: () => Unit,
    onRpcSent: (IRPC, Double) => Unit,
    onScorePenalty: ScorePenalty => Unit,
    peerReadStreamError: Gauge[LabelsGeneric],
    peersByScoreThreshold: Gauge[Threshold],
    peersPerProtocol: Gauge[Protocol],
    protocolsEnabled: Gauge[Protocol],
    registerScorePerMesh: (Map[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Set[PeerIdStr]], Map[PeerIdStr, Double]) => Unit,
    registerScoreWeights: ScoreWeights[js.Array[Double]] => Unit,
    registerScores: (js.Array[Double], PeerScoreThresholds) => Unit,
    rpcDataError: Gauge[LabelsGeneric],
    rpcRecvBytes: Gauge[LabelsGeneric],
    rpcRecvControl: Gauge[LabelsGeneric],
    rpcRecvCount: Gauge[LabelsGeneric],
    rpcRecvError: Gauge[LabelsGeneric],
    rpcRecvGraft: Gauge[LabelsGeneric],
    rpcRecvIHave: Gauge[LabelsGeneric],
    rpcRecvIWant: Gauge[LabelsGeneric],
    rpcRecvMessage: Gauge[LabelsGeneric],
    rpcRecvNotAccepted: Gauge[LabelsGeneric],
    rpcRecvPrune: Gauge[LabelsGeneric],
    rpcRecvSubscription: Gauge[LabelsGeneric],
    rpcSentBytes: Gauge[LabelsGeneric],
    rpcSentControl: Gauge[LabelsGeneric],
    rpcSentCount: Gauge[LabelsGeneric],
    rpcSentGraft: Gauge[LabelsGeneric],
    rpcSentIHave: Gauge[LabelsGeneric],
    rpcSentIWant: Gauge[LabelsGeneric],
    rpcSentMessage: Gauge[LabelsGeneric],
    rpcSentPrune: Gauge[LabelsGeneric],
    rpcSentSubscription: Gauge[LabelsGeneric],
    score: AvgMinMax[LabelsGeneric],
    scoreCachedDelta: Histogram[LabelsGeneric],
    scoreFnCalls: Gauge[LabelsGeneric],
    scoreFnRuns: Gauge[LabelsGeneric],
    scorePerMesh: AvgMinMax[TopicTopicLabel],
    scoreWeights: AvgMinMax[P],
    scoringPenalties: Gauge[Penalty],
    toTopic: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => TopicLabel,
    topicPeersCount: Gauge[TopicStr],
    topicStrToLabel: TopicStrToLabel,
    topicSubscriptionStatus: Gauge[TopicStr]
  ): AsyncValidationMcacheHit = {
    val __obj = js.Dynamic.literal(asyncValidationMcacheHit = asyncValidationMcacheHit.asInstanceOf[js.Any], asyncValidationResult = asyncValidationResult.asInstanceOf[js.Any], behaviourPenalty = behaviourPenalty.asInstanceOf[js.Any], cacheSize = cacheSize.asInstanceOf[js.Any], duplicateMsgDeliveryDelay = duplicateMsgDeliveryDelay.asInstanceOf[js.Any], duplicateMsgIgnored = duplicateMsgIgnored.asInstanceOf[js.Any], duplicateMsgLateDelivery = duplicateMsgLateDelivery.asInstanceOf[js.Any], fastMsgIdCacheCollision = fastMsgIdCacheCollision.asInstanceOf[js.Any], heartbeatDuration = heartbeatDuration.asInstanceOf[js.Any], heartbeatSkipped = heartbeatSkipped.asInstanceOf[js.Any], ihaveRcvIgnored = ihaveRcvIgnored.asInstanceOf[js.Any], ihaveRcvMsgids = ihaveRcvMsgids.asInstanceOf[js.Any], ihaveRcvNotSeenMsgids = ihaveRcvNotSeenMsgids.asInstanceOf[js.Any], iwantMessagePruned = iwantMessagePruned.asInstanceOf[js.Any], iwantPromiseBroken = iwantPromiseBroken.asInstanceOf[js.Any], iwantPromiseDeliveryTime = iwantPromiseDeliveryTime.asInstanceOf[js.Any], iwantPromiseResolved = iwantPromiseResolved.asInstanceOf[js.Any], iwantPromiseResolvedFromDuplicate = iwantPromiseResolvedFromDuplicate.asInstanceOf[js.Any], iwantPromiseResolvedPeers = iwantPromiseResolvedPeers.asInstanceOf[js.Any], iwantPromiseStarted = iwantPromiseStarted.asInstanceOf[js.Any], iwantPromiseUntracked = iwantPromiseUntracked.asInstanceOf[js.Any], iwantRcvDonthaveMsgids = iwantRcvDonthaveMsgids.asInstanceOf[js.Any], iwantRcvMsgids = iwantRcvMsgids.asInstanceOf[js.Any], mcacheNotValidatedCount = mcacheNotValidatedCount.asInstanceOf[js.Any], mcacheSize = mcacheSize.asInstanceOf[js.Any], meshPeerChurnEvents = meshPeerChurnEvents.asInstanceOf[js.Any], meshPeerCounts = meshPeerCounts.asInstanceOf[js.Any], meshPeerInclusionEvents = meshPeerInclusionEvents.asInstanceOf[js.Any], msgForwardCount = msgForwardCount.asInstanceOf[js.Any], msgForwardPeers = msgForwardPeers.asInstanceOf[js.Any], msgPublishBytes = msgPublishBytes.asInstanceOf[js.Any], msgPublishCount = msgPublishCount.asInstanceOf[js.Any], msgPublishPeers = msgPublishPeers.asInstanceOf[js.Any], msgPublishPeersByGroup = msgPublishPeersByGroup.asInstanceOf[js.Any], msgReceivedError = msgReceivedError.asInstanceOf[js.Any], msgReceivedInvalid = msgReceivedInvalid.asInstanceOf[js.Any], msgReceivedPreValidation = msgReceivedPreValidation.asInstanceOf[js.Any], msgReceivedStatus = msgReceivedStatus.asInstanceOf[js.Any], newConnectionCount = newConnectionCount.asInstanceOf[js.Any], onAddToMesh = js.Any.fromFunction3(onAddToMesh), onDuplicateMsgDelivery = js.Any.fromFunction3(onDuplicateMsgDelivery), onForwardMsg = js.Any.fromFunction2(onForwardMsg), onIhaveRcv = js.Any.fromFunction3(onIhaveRcv), onIwantRcv = js.Any.fromFunction2(onIwantRcv), onJoin = js.Any.fromFunction1(onJoin), onLeave = js.Any.fromFunction1(onLeave), onMsgRecvError = js.Any.fromFunction1(onMsgRecvError), onMsgRecvInvalid = js.Any.fromFunction2(onMsgRecvInvalid), onMsgRecvPreValidation = js.Any.fromFunction1(onMsgRecvPreValidation), onMsgRecvResult = js.Any.fromFunction2(onMsgRecvResult), onPeerReadStreamError = js.Any.fromFunction0(onPeerReadStreamError), onPublishDuplicateMsg = js.Any.fromFunction1(onPublishDuplicateMsg), onPublishMsg = js.Any.fromFunction4(onPublishMsg), onRemoveFromMesh = js.Any.fromFunction3(onRemoveFromMesh), onReportValidation = js.Any.fromFunction2(onReportValidation), onReportValidationMcacheHit = js.Any.fromFunction1(onReportValidationMcacheHit), onRpcDataError = js.Any.fromFunction0(onRpcDataError), onRpcRecv = js.Any.fromFunction2(onRpcRecv), onRpcRecvError = js.Any.fromFunction0(onRpcRecvError), onRpcSent = js.Any.fromFunction2(onRpcSent), onScorePenalty = js.Any.fromFunction1(onScorePenalty), peerReadStreamError = peerReadStreamError.asInstanceOf[js.Any], peersByScoreThreshold = peersByScoreThreshold.asInstanceOf[js.Any], peersPerProtocol = peersPerProtocol.asInstanceOf[js.Any], protocolsEnabled = protocolsEnabled.asInstanceOf[js.Any], registerScorePerMesh = js.Any.fromFunction2(registerScorePerMesh), registerScoreWeights = js.Any.fromFunction1(registerScoreWeights), registerScores = js.Any.fromFunction2(registerScores), rpcDataError = rpcDataError.asInstanceOf[js.Any], rpcRecvBytes = rpcRecvBytes.asInstanceOf[js.Any], rpcRecvControl = rpcRecvControl.asInstanceOf[js.Any], rpcRecvCount = rpcRecvCount.asInstanceOf[js.Any], rpcRecvError = rpcRecvError.asInstanceOf[js.Any], rpcRecvGraft = rpcRecvGraft.asInstanceOf[js.Any], rpcRecvIHave = rpcRecvIHave.asInstanceOf[js.Any], rpcRecvIWant = rpcRecvIWant.asInstanceOf[js.Any], rpcRecvMessage = rpcRecvMessage.asInstanceOf[js.Any], rpcRecvNotAccepted = rpcRecvNotAccepted.asInstanceOf[js.Any], rpcRecvPrune = rpcRecvPrune.asInstanceOf[js.Any], rpcRecvSubscription = rpcRecvSubscription.asInstanceOf[js.Any], rpcSentBytes = rpcSentBytes.asInstanceOf[js.Any], rpcSentControl = rpcSentControl.asInstanceOf[js.Any], rpcSentCount = rpcSentCount.asInstanceOf[js.Any], rpcSentGraft = rpcSentGraft.asInstanceOf[js.Any], rpcSentIHave = rpcSentIHave.asInstanceOf[js.Any], rpcSentIWant = rpcSentIWant.asInstanceOf[js.Any], rpcSentMessage = rpcSentMessage.asInstanceOf[js.Any], rpcSentPrune = rpcSentPrune.asInstanceOf[js.Any], rpcSentSubscription = rpcSentSubscription.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], scoreCachedDelta = scoreCachedDelta.asInstanceOf[js.Any], scoreFnCalls = scoreFnCalls.asInstanceOf[js.Any], scoreFnRuns = scoreFnRuns.asInstanceOf[js.Any], scorePerMesh = scorePerMesh.asInstanceOf[js.Any], scoreWeights = scoreWeights.asInstanceOf[js.Any], scoringPenalties = scoringPenalties.asInstanceOf[js.Any], toTopic = js.Any.fromFunction1(toTopic), topicPeersCount = topicPeersCount.asInstanceOf[js.Any], topicStrToLabel = topicStrToLabel.asInstanceOf[js.Any], topicSubscriptionStatus = topicSubscriptionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncValidationMcacheHit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncValidationMcacheHit] (val x: Self) extends AnyVal {
    
    inline def setAsyncValidationMcacheHit(value: Gauge[Hit]): Self = StObject.set(x, "asyncValidationMcacheHit", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidationResult(value: Gauge[Acceptance]): Self = StObject.set(x, "asyncValidationResult", value.asInstanceOf[js.Any])
    
    inline def setBehaviourPenalty(value: Histogram[LabelsGeneric]): Self = StObject.set(x, "behaviourPenalty", value.asInstanceOf[js.Any])
    
    inline def setCacheSize(value: Gauge[Cache]): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    inline def setDuplicateMsgDeliveryDelay(value: Histogram[LabelsGeneric]): Self = StObject.set(x, "duplicateMsgDeliveryDelay", value.asInstanceOf[js.Any])
    
    inline def setDuplicateMsgIgnored(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "duplicateMsgIgnored", value.asInstanceOf[js.Any])
    
    inline def setDuplicateMsgLateDelivery(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "duplicateMsgLateDelivery", value.asInstanceOf[js.Any])
    
    inline def setFastMsgIdCacheCollision(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "fastMsgIdCacheCollision", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatDuration(value: Histogram[LabelsGeneric]): Self = StObject.set(x, "heartbeatDuration", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatSkipped(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "heartbeatSkipped", value.asInstanceOf[js.Any])
    
    inline def setIhaveRcvIgnored(value: Gauge[ReasonIHaveIgnoreReason]): Self = StObject.set(x, "ihaveRcvIgnored", value.asInstanceOf[js.Any])
    
    inline def setIhaveRcvMsgids(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "ihaveRcvMsgids", value.asInstanceOf[js.Any])
    
    inline def setIhaveRcvNotSeenMsgids(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "ihaveRcvNotSeenMsgids", value.asInstanceOf[js.Any])
    
    inline def setIwantMessagePruned(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantMessagePruned", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseBroken(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseBroken", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseDeliveryTime(value: Histogram[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseDeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseResolved(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseResolved", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseResolvedFromDuplicate(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseResolvedFromDuplicate", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseResolvedPeers(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseResolvedPeers", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseStarted(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseStarted", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseUntracked(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseUntracked", value.asInstanceOf[js.Any])
    
    inline def setIwantRcvDonthaveMsgids(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantRcvDonthaveMsgids", value.asInstanceOf[js.Any])
    
    inline def setIwantRcvMsgids(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "iwantRcvMsgids", value.asInstanceOf[js.Any])
    
    inline def setMcacheNotValidatedCount(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "mcacheNotValidatedCount", value.asInstanceOf[js.Any])
    
    inline def setMcacheSize(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "mcacheSize", value.asInstanceOf[js.Any])
    
    inline def setMeshPeerChurnEvents(value: Gauge[Topic]): Self = StObject.set(x, "meshPeerChurnEvents", value.asInstanceOf[js.Any])
    
    inline def setMeshPeerCounts(value: Gauge[TopicStr]): Self = StObject.set(x, "meshPeerCounts", value.asInstanceOf[js.Any])
    
    inline def setMeshPeerInclusionEvents(value: Gauge[Reason]): Self = StObject.set(x, "meshPeerInclusionEvents", value.asInstanceOf[js.Any])
    
    inline def setMsgForwardCount(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgForwardCount", value.asInstanceOf[js.Any])
    
    inline def setMsgForwardPeers(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgForwardPeers", value.asInstanceOf[js.Any])
    
    inline def setMsgPublishBytes(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgPublishBytes", value.asInstanceOf[js.Any])
    
    inline def setMsgPublishCount(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgPublishCount", value.asInstanceOf[js.Any])
    
    inline def setMsgPublishPeers(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgPublishPeers", value.asInstanceOf[js.Any])
    
    inline def setMsgPublishPeersByGroup(value: Gauge[PeerGroup]): Self = StObject.set(x, "msgPublishPeersByGroup", value.asInstanceOf[js.Any])
    
    inline def setMsgReceivedError(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgReceivedError", value.asInstanceOf[js.Any])
    
    inline def setMsgReceivedInvalid(value: Gauge[Error]): Self = StObject.set(x, "msgReceivedInvalid", value.asInstanceOf[js.Any])
    
    inline def setMsgReceivedPreValidation(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgReceivedPreValidation", value.asInstanceOf[js.Any])
    
    inline def setMsgReceivedStatus(value: Gauge[Status]): Self = StObject.set(x, "msgReceivedStatus", value.asInstanceOf[js.Any])
    
    inline def setNewConnectionCount(value: Gauge[StatusString]): Self = StObject.set(x, "newConnectionCount", value.asInstanceOf[js.Any])
    
    inline def setOnAddToMesh(
      value: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, InclusionReason, Double) => Unit
    ): Self = StObject.set(x, "onAddToMesh", js.Any.fromFunction3(value))
    
    inline def setOnDuplicateMsgDelivery(value: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double, Boolean) => Unit): Self = StObject.set(x, "onDuplicateMsgDelivery", js.Any.fromFunction3(value))
    
    inline def setOnForwardMsg(value: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double) => Unit): Self = StObject.set(x, "onForwardMsg", js.Any.fromFunction2(value))
    
    inline def setOnIhaveRcv(value: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double, Double) => Unit): Self = StObject.set(x, "onIhaveRcv", js.Any.fromFunction3(value))
    
    inline def setOnIwantRcv(value: (Map[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double], Double) => Unit): Self = StObject.set(x, "onIwantRcv", js.Any.fromFunction2(value))
    
    inline def setOnJoin(value: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Unit): Self = StObject.set(x, "onJoin", js.Any.fromFunction1(value))
    
    inline def setOnLeave(value: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction1(value))
    
    inline def setOnMsgRecvError(value: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Unit): Self = StObject.set(x, "onMsgRecvError", js.Any.fromFunction1(value))
    
    inline def setOnMsgRecvInvalid(value: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, RejectReasonObj) => Unit): Self = StObject.set(x, "onMsgRecvInvalid", js.Any.fromFunction2(value))
    
    inline def setOnMsgRecvPreValidation(value: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Unit): Self = StObject.set(x, "onMsgRecvPreValidation", js.Any.fromFunction1(value))
    
    inline def setOnMsgRecvResult(value: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, MessageStatus) => Unit): Self = StObject.set(x, "onMsgRecvResult", js.Any.fromFunction2(value))
    
    inline def setOnPeerReadStreamError(value: () => Unit): Self = StObject.set(x, "onPeerReadStreamError", js.Any.fromFunction0(value))
    
    inline def setOnPublishDuplicateMsg(value: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Unit): Self = StObject.set(x, "onPublishDuplicateMsg", js.Any.fromFunction1(value))
    
    inline def setOnPublishMsg(
      value: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, ToSendGroupCount, Double, Double) => Unit
    ): Self = StObject.set(x, "onPublishMsg", js.Any.fromFunction4(value))
    
    inline def setOnRemoveFromMesh(value: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, ChurnReason, Double) => Unit): Self = StObject.set(x, "onRemoveFromMesh", js.Any.fromFunction3(value))
    
    inline def setOnReportValidation(value: (typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, TopicValidatorResult) => Unit): Self = StObject.set(x, "onReportValidation", js.Any.fromFunction2(value))
    
    inline def setOnReportValidationMcacheHit(value: Boolean => Unit): Self = StObject.set(x, "onReportValidationMcacheHit", js.Any.fromFunction1(value))
    
    inline def setOnRpcDataError(value: () => Unit): Self = StObject.set(x, "onRpcDataError", js.Any.fromFunction0(value))
    
    inline def setOnRpcRecv(value: (IRPC, Double) => Unit): Self = StObject.set(x, "onRpcRecv", js.Any.fromFunction2(value))
    
    inline def setOnRpcRecvError(value: () => Unit): Self = StObject.set(x, "onRpcRecvError", js.Any.fromFunction0(value))
    
    inline def setOnRpcSent(value: (IRPC, Double) => Unit): Self = StObject.set(x, "onRpcSent", js.Any.fromFunction2(value))
    
    inline def setOnScorePenalty(value: ScorePenalty => Unit): Self = StObject.set(x, "onScorePenalty", js.Any.fromFunction1(value))
    
    inline def setPeerReadStreamError(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "peerReadStreamError", value.asInstanceOf[js.Any])
    
    inline def setPeersByScoreThreshold(value: Gauge[Threshold]): Self = StObject.set(x, "peersByScoreThreshold", value.asInstanceOf[js.Any])
    
    inline def setPeersPerProtocol(value: Gauge[Protocol]): Self = StObject.set(x, "peersPerProtocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolsEnabled(value: Gauge[Protocol]): Self = StObject.set(x, "protocolsEnabled", value.asInstanceOf[js.Any])
    
    inline def setRegisterScorePerMesh(
      value: (Map[typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Set[PeerIdStr]], Map[PeerIdStr, Double]) => Unit
    ): Self = StObject.set(x, "registerScorePerMesh", js.Any.fromFunction2(value))
    
    inline def setRegisterScoreWeights(value: ScoreWeights[js.Array[Double]] => Unit): Self = StObject.set(x, "registerScoreWeights", js.Any.fromFunction1(value))
    
    inline def setRegisterScores(value: (js.Array[Double], PeerScoreThresholds) => Unit): Self = StObject.set(x, "registerScores", js.Any.fromFunction2(value))
    
    inline def setRpcDataError(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcDataError", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvBytes(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvBytes", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvControl(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvControl", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvCount(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvCount", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvError(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvError", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvGraft(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvGraft", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvIHave(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvIHave", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvIWant(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvIWant", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvMessage(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvMessage", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvNotAccepted(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvNotAccepted", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvPrune(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvPrune", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvSubscription(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvSubscription", value.asInstanceOf[js.Any])
    
    inline def setRpcSentBytes(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentBytes", value.asInstanceOf[js.Any])
    
    inline def setRpcSentControl(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentControl", value.asInstanceOf[js.Any])
    
    inline def setRpcSentCount(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentCount", value.asInstanceOf[js.Any])
    
    inline def setRpcSentGraft(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentGraft", value.asInstanceOf[js.Any])
    
    inline def setRpcSentIHave(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentIHave", value.asInstanceOf[js.Any])
    
    inline def setRpcSentIWant(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentIWant", value.asInstanceOf[js.Any])
    
    inline def setRpcSentMessage(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentMessage", value.asInstanceOf[js.Any])
    
    inline def setRpcSentPrune(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentPrune", value.asInstanceOf[js.Any])
    
    inline def setRpcSentSubscription(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentSubscription", value.asInstanceOf[js.Any])
    
    inline def setScore(value: AvgMinMax[LabelsGeneric]): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreCachedDelta(value: Histogram[LabelsGeneric]): Self = StObject.set(x, "scoreCachedDelta", value.asInstanceOf[js.Any])
    
    inline def setScoreFnCalls(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "scoreFnCalls", value.asInstanceOf[js.Any])
    
    inline def setScoreFnRuns(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "scoreFnRuns", value.asInstanceOf[js.Any])
    
    inline def setScorePerMesh(value: AvgMinMax[TopicTopicLabel]): Self = StObject.set(x, "scorePerMesh", value.asInstanceOf[js.Any])
    
    inline def setScoreWeights(value: AvgMinMax[P]): Self = StObject.set(x, "scoreWeights", value.asInstanceOf[js.Any])
    
    inline def setScoringPenalties(value: Gauge[Penalty]): Self = StObject.set(x, "scoringPenalties", value.asInstanceOf[js.Any])
    
    inline def setToTopic(value: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => TopicLabel): Self = StObject.set(x, "toTopic", js.Any.fromFunction1(value))
    
    inline def setTopicPeersCount(value: Gauge[TopicStr]): Self = StObject.set(x, "topicPeersCount", value.asInstanceOf[js.Any])
    
    inline def setTopicStrToLabel(value: TopicStrToLabel): Self = StObject.set(x, "topicStrToLabel", value.asInstanceOf[js.Any])
    
    inline def setTopicSubscriptionStatus(value: Gauge[TopicStr]): Self = StObject.set(x, "topicSubscriptionStatus", value.asInstanceOf[js.Any])
  }
}
