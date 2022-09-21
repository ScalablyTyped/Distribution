package typings.barnard59

import typings.clownface.mod.GraphPointer
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findPipelineMod {
  
  @JSImport("barnard59/findPipeline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dataset: DatasetCore[Quad, Quad]): GraphPointer[Term, DatasetCore[Quad, Quad]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dataset.asInstanceOf[js.Any]).asInstanceOf[GraphPointer[Term, DatasetCore[Quad, Quad]]]
  inline def default(dataset: DatasetCore[Quad, Quad], iri: String): GraphPointer[Term, DatasetCore[Quad, Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dataset.asInstanceOf[js.Any], iri.asInstanceOf[js.Any])).asInstanceOf[GraphPointer[Term, DatasetCore[Quad, Quad]]]
  inline def default(dataset: DatasetCore[Quad, Quad], iri: NamedNode[String]): GraphPointer[Term, DatasetCore[Quad, Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dataset.asInstanceOf[js.Any], iri.asInstanceOf[js.Any])).asInstanceOf[GraphPointer[Term, DatasetCore[Quad, Quad]]]
}
