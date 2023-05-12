package typings.csstoolsCascadeLayerNameParser

import typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilModelMod {
  
  @JSImport("@csstools/cascade-layer-name-parser/dist/util/model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLayerToModel(layers: js.Array[LayerName], currentLayerNames: js.Array[LayerName]): js.Array[LayerName] = (^.asInstanceOf[js.Dynamic].applyDynamic("addLayerToModel")(layers.asInstanceOf[js.Any], currentLayerNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[LayerName]]
}
