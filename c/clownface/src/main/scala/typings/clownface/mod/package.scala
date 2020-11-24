package typings.clownface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AddCallback[D /* <: typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad] */, X /* <: typings.rdfJs.mod.Term */] = js.Function1[/* added */ typings.clownface.mod.AnyPointer[X, D], scala.Unit]
  
  type AnyContext = js.UndefOr[typings.rdfJs.mod.Term | js.Array[typings.rdfJs.mod.Term]]
  
  type GraphPointer[T /* <: typings.rdfJs.mod.Term */, D /* <: typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad] */] = typings.clownface.mod.AnyPointer[T, D]
  
  type Iteratee[T /* <: typings.clownface.mod.AnyContext */, D /* <: typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad] */] = typings.clownface.mod.AnyPointer[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any) | T, 
    D
  ]
  
  type MultiPointer[T /* <: typings.rdfJs.mod.Term */, D /* <: typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad] */] = typings.clownface.mod.AnyPointer[T | js.Array[T], D]
  
  type SingleOrArray[T] = T | js.Array[T]
  
  type SingleOrArrayOfTerms[X /* <: typings.rdfJs.mod.Term */] = typings.clownface.mod.SingleOrArray[X] | (typings.clownface.mod.MultiPointer[X, typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]])
  
  type SingleOrArrayOfTermsOrLiterals[X /* <: typings.rdfJs.mod.Term */] = typings.clownface.mod.SingleOrArray[typings.clownface.mod.TermOrLiteral[X]]
  
  type SingleOrOneElementArray[T] = T | js.Array[T]
  
  type TermOrClownface[X /* <: typings.rdfJs.mod.Term */] = (typings.clownface.mod.MultiPointer[X, typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]]) | X
  
  type TermOrLiteral[X /* <: typings.rdfJs.mod.Term */] = typings.clownface.mod.TermOrClownface[X] | java.lang.String | scala.Double | scala.Boolean
}
