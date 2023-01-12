package typings.clownface

import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.QuadGraph
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("clownface/lib/Context", JSImport.Namespace)
  @js.native
  open class ^[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] protected ()
    extends StObject
       with Context[D, T] {
    def this(dataset: D, graph: Unit, value: Any) = this()
    def this(dataset: D, graph: QuadGraph, value: Any) = this()
    
    /* CompleteClass */
    var dataset: D = js.native
    
    /* CompleteClass */
    var term: T = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  trait Context[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] extends StObject {
    
    var dataset: D
    
    var graph: js.UndefOr[QuadGraph] = js.undefined
    
    var term: T
  }
  object Context {
    
    inline def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */](dataset: D, term: T): Context[D, T] = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[D, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context[?, ?], D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] (val x: Self & (Context[D, T])) extends AnyVal {
      
      inline def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      inline def setTerm(value: T): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
}
