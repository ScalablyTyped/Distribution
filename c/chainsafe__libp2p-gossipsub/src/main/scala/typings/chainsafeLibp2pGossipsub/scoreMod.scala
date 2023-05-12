package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.anon.PartialPeerScoreParams
import typings.chainsafeLibp2pGossipsub.anon.PartialPeerScoreThreshold
import typings.chainsafeLibp2pGossipsub.anon.PartialTopicScoreParams
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.Metrics
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreMod.PeerScoreOpts
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreParamsMod.PeerScoreParams
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreParamsMod.TopicScoreParams
import typings.chainsafeLibp2pGossipsub.distSrcScorePeerScoreThresholdsMod.PeerScoreThresholds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object scoreMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/score", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/libp2p-gossipsub/score", "PeerScore")
  @js.native
  open class PeerScore protected ()
    extends typings.chainsafeLibp2pGossipsub.distSrcScoreMod.PeerScore {
    def this(params: PeerScoreParams, metrics: Null, opts: PeerScoreOpts) = this()
    def this(params: PeerScoreParams, metrics: Metrics, opts: PeerScoreOpts) = this()
  }
  
  inline def createPeerScoreParams(): PeerScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreParams")().asInstanceOf[PeerScoreParams]
  inline def createPeerScoreParams(p: PartialPeerScoreParams): PeerScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[PeerScoreParams]
  
  inline def createPeerScoreThresholds(): PeerScoreThresholds = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreThresholds")().asInstanceOf[PeerScoreThresholds]
  inline def createPeerScoreThresholds(p: PartialPeerScoreThreshold): PeerScoreThresholds = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreThresholds")(p.asInstanceOf[js.Any]).asInstanceOf[PeerScoreThresholds]
  
  inline def createTopicScoreParams(): TopicScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createTopicScoreParams")().asInstanceOf[TopicScoreParams]
  inline def createTopicScoreParams(p: PartialTopicScoreParams): TopicScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createTopicScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[TopicScoreParams]
  
  @JSImport("@chainsafe/libp2p-gossipsub/score", "defaultPeerScoreParams")
  @js.native
  val defaultPeerScoreParams: PeerScoreParams = js.native
  
  @JSImport("@chainsafe/libp2p-gossipsub/score", "defaultPeerScoreThresholds")
  @js.native
  val defaultPeerScoreThresholds: PeerScoreThresholds = js.native
  
  @JSImport("@chainsafe/libp2p-gossipsub/score", "defaultTopicScoreParams")
  @js.native
  val defaultTopicScoreParams: TopicScoreParams = js.native
  
  inline def validatePeerScoreParams(p: PeerScoreParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePeerScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validatePeerScoreThresholds(p: PeerScoreThresholds): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePeerScoreThresholds")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateTopicScoreParams(p: TopicScoreParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTopicScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
