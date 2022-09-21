package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataDTsMod.Data
import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.indexDTsMod.AncestorParse
import typings.vegaLite8ozrbXDH.indexDTsMod.DataComponent
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.sourceDTsMod.SourceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/parse.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findSource(data: Data, sources: js.Array[SourceNode]): SourceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("findSource")(data.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[SourceNode]
  
  inline def parseData(model: Model): DataComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("parseData")(model.asInstanceOf[js.Any]).asInstanceOf[DataComponent]
  
  inline def parseTransformArray(head: DataFlowNode, model: Model, ancestorParse: AncestorParse): DataFlowNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformArray")(head.asInstanceOf[js.Any], model.asInstanceOf[js.Any], ancestorParse.asInstanceOf[js.Any])).asInstanceOf[DataFlowNode]
}
