package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.facetDotDTsMod.FacetModel
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facetDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/facet.d.ts", "FacetNode")
  @js.native
  open class FacetNode protected () extends DataFlowNode {
    /**
      * @param model The facet model.
      * @param name The name that this facet source will have.
      * @param data The source data for this facet data.
      */
    def this(parent: DataFlowNode, model: FacetModel, name: String, data: String) = this()
    
    def assemble(): js.Array[VgData] = js.native
    
    /* private */ var assembleFacetHeaderData: Any = js.native
    
    /* private */ var assembleRowColumnHeaderData: Any = js.native
    
    /* private */ val childModel: Any = js.native
    
    /* private */ val column: Any = js.native
    
    var data: String = js.native
    
    /* private */ val facet: Any = js.native
    
    def fields: js.Array[String] = js.native
    
    /* private */ var getChildIndependentFieldsWithStep: Any = js.native
    
    /**
      * The name to reference this source is its name.
      */
    def getSource(): String = js.native
    
    val model: FacetModel = js.native
    
    val name: String = js.native
    
    /* private */ val row: Any = js.native
  }
}
