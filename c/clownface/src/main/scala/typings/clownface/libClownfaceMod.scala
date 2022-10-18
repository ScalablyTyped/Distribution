package typings.clownface

import typings.clownface.mod.AnyContext
import typings.clownface.mod.AnyPointer
import typings.clownface.mod.ClownfaceInit
import typings.clownface.mod.ClownfaceInitWithTerms
import typings.clownface.mod.ClownfaceInitWithValue
import typings.clownface.mod.ClownfaceInitWithValues
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClownfaceMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("clownface/lib/Clownface", JSImport.Namespace)
  @js.native
  open class ^[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] protected ()
    extends StObject
       with AnyPointer[T, D] {
    def this(options: ClownfaceInit[D]) = this()
    def this(options: ClownfaceInitWithTerms[
            /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? @rdfjs/types.@rdfjs/types/data-model.Term | std.Array<@rdfjs/types.@rdfjs/types/data-model.Term> : T */ js.Any, 
            D
          ]) = this()
    def this(options: ClownfaceInitWithValue[D]) = this()
    def this(options: ClownfaceInitWithValues[D]) = this()
  }
  
  // tslint:disable-next-line no-unnecessary-class
  type ClownfaceImpl[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] = AnyPointer[T, D]
}
