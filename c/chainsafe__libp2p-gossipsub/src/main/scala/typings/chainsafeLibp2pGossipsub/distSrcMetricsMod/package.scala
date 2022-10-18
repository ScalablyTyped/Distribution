package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import typings.chainsafeLibp2pGossipsub.anon.AsyncValidationMcacheHit
import typings.chainsafeLibp2pGossipsub.anon.BehaviourPenaltyThreshold
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.^
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr
import typings.std.Map
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getMetrics(register: MetricsRegister, topicStrToLabel: TopicStrToLabel, opts: BehaviourPenaltyThreshold): AsyncValidationMcacheHit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetrics")(register.asInstanceOf[js.Any], topicStrToLabel.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AsyncValidationMcacheHit]

type AvgMinMaxConfig[Labels /* <: LabelsGeneric */] = GaugeConfig[Labels]

type CollectFn[Labels /* <: LabelsGeneric */] = js.Function1[/* metric */ Gauge[Labels], Unit]

type LabelsGeneric = Record[String, js.UndefOr[String]]

type Metrics = ReturnType[
js.Function3[
  /* register */ MetricsRegister, 
  /* topicStrToLabel */ TopicStrToLabel, 
  /* opts */ BehaviourPenaltyThreshold, 
  AsyncValidationMcacheHit
]]

type PeersByScoreThreshold = Record[ScoreThreshold, Double]

type TopicLabel = String

type TopicStrToLabel = Map[TopicStr, TopicLabel]
