package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.facetDDotTsMod.FacetFieldDef
import typings.vegaLite8ozrbXDH.facetDDotTsMod.FacetMapping
import typings.vegaLite8ozrbXDH.joinaggregateDTsMod.JoinAggregateTransformNode
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinaggregatefacetDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/joinaggregatefacet.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeJoinAggregateFromFacet(parent: DataFlowNode, facet: FacetMapping[String, FacetFieldDef[String, ExprRef | SignalRef]]): JoinAggregateTransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeJoinAggregateFromFacet")(parent.asInstanceOf[js.Any], facet.asInstanceOf[js.Any])).asInstanceOf[JoinAggregateTransformNode]
}
