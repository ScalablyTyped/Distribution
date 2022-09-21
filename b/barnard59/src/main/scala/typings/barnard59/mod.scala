package typings.barnard59

import typings.barnard59.runnerMod.Create
import typings.barnard59.runnerMod.Runner
import typings.clownface.mod.GraphPointer
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("barnard59", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findPipeline(dataset: DatasetCore[Quad, Quad]): GraphPointer[Term, DatasetCore[Quad, Quad]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPipeline")(dataset.asInstanceOf[js.Any]).asInstanceOf[GraphPointer[Term, DatasetCore[Quad, Quad]]]
  inline def findPipeline(dataset: DatasetCore[Quad, Quad], iri: String): GraphPointer[Term, DatasetCore[Quad, Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPipeline")(dataset.asInstanceOf[js.Any], iri.asInstanceOf[js.Any])).asInstanceOf[GraphPointer[Term, DatasetCore[Quad, Quad]]]
  inline def findPipeline(dataset: DatasetCore[Quad, Quad], iri: NamedNode[String]): GraphPointer[Term, DatasetCore[Quad, Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPipeline")(dataset.asInstanceOf[js.Any], iri.asInstanceOf[js.Any])).asInstanceOf[GraphPointer[Term, DatasetCore[Quad, Quad]]]
  
  inline def runner(ptr: GraphPointer[Term, DatasetCore[Quad, Quad]]): js.Promise[Runner] = ^.asInstanceOf[js.Dynamic].applyDynamic("runner")(ptr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Runner]]
  inline def runner(ptr: GraphPointer[Term, DatasetCore[Quad, Quad]], args: Create): js.Promise[Runner] = (^.asInstanceOf[js.Dynamic].applyDynamic("runner")(ptr.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Runner]]
}
