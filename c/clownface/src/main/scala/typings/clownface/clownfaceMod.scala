package typings.clownface

import typings.clownface.mod.AnyContext
import typings.clownface.mod.AnyPointer
import typings.clownface.mod.ClownfaceInit
import typings.clownface.mod.ClownfaceInitWithTerms
import typings.clownface.mod.ClownfaceInitWithValue
import typings.clownface.mod.ClownfaceInitWithValues
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clownfaceMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("clownface/lib/Clownface", JSImport.Namespace)
  @js.native
  class ^[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] protected () extends AnyPointer[T, D] {
    def this(options: ClownfaceInit[D]) = this()
    def this(options: ClownfaceInitWithTerms[T | Term | js.Array[Term], D]) = this()
    def this(options: ClownfaceInitWithValue[D]) = this()
    def this(options: ClownfaceInitWithValues[D]) = this()
  }
  
  // tslint:disable-next-line no-unnecessary-class
  type ClownfaceImpl[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] = AnyPointer[T, D]
}
