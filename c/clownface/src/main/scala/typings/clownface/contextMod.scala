package typings.clownface

import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("clownface/lib/Context", JSImport.Namespace)
  @js.native
  class ^[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] protected () extends StObject {
    def this(dataset: D, graph: js.UndefOr[QuadGraph], value: js.Any) = this()
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  trait Context[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] extends StObject {
    
    var dataset: D = js.native
    
    var graph: js.UndefOr[QuadGraph] = js.native
    
    var term: T = js.native
  }
  object Context {
    
    @scala.inline
    def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */](dataset: D, term: T): Context[D, T] = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[D, T]]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context[_, _], D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] (val x: Self with (Context[D, T])) extends AnyVal {
      
      @scala.inline
      def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      @scala.inline
      def setTerm(value: T): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
}
