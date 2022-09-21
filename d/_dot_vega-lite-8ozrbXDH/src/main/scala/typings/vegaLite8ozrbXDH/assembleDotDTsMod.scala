package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataDTsMod.InlineDataset
import typings.vegaLite8ozrbXDH.facetDTsMod.FacetNode
import typings.vegaLite8ozrbXDH.indexDTsMod.DataComponent
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assembleDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/assemble.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleFacetData(root: FacetNode): js.Array[VgData] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleFacetData")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[VgData]]
  
  inline def assembleRootData(dataComponent: DataComponent, datasets: Dict[InlineDataset]): js.Array[VgData] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleRootData")(dataComponent.asInstanceOf[js.Any], datasets.asInstanceOf[js.Any])).asInstanceOf[js.Array[VgData]]
}
