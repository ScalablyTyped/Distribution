package typings.clownface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddCallback[D /* <: typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad] */, X /* <: typings.rdfJs.mod.Term */] = js.Function1[/* added */ typings.clownface.mod.SingleContextClownface[D, X], scala.Unit]
  type ClownfaceInit[D /* <: typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad] */, T /* <: typings.rdfJs.mod.Term */] = typings.std.Partial[
    (typings.std.Pick[
      typings.clownface.mod.Clownface[D, T], 
      typings.clownface.clownfaceStrings.dataset | typings.clownface.clownfaceStrings._context
    ]) with typings.clownface.AnonGraph
  ]
  type ClownfaceInitWithNodes[D /* <: typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad] */, T /* <: typings.rdfJs.mod.Term */] = ((typings.clownface.mod.ClownfaceInit[D, typings.rdfJs.mod.Term]) with typings.clownface.mod.WithTerms[T]) | ((typings.clownface.mod.ClownfaceInit[D, typings.rdfJs.mod.Term]) with typings.clownface.mod.WithValues)
  type ClownfaceInitWithSingleNode[D /* <: typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad] */, T /* <: typings.rdfJs.mod.Term */] = ((typings.clownface.mod.ClownfaceInit[D, typings.rdfJs.mod.Term]) with typings.clownface.mod.WithSingleTerm[T]) | ((typings.clownface.mod.ClownfaceInit[D, typings.rdfJs.mod.Term]) with typings.clownface.mod.WithSingleValue)
  type SingleOrArray[T] = T | js.Array[T]
  type SingleOrArrayOfTerms = typings.clownface.mod.SingleOrArray[typings.clownface.mod.TermOrClownface]
  type SingleOrArrayOfTermsOrLiterals = typings.clownface.mod.SingleOrArray[typings.clownface.mod.TermOrLiteral]
  type SingleOrOneElementArray[T] = T | js.Array[T]
  type TermOrClownface = (typings.clownface.mod.Clownface[
    typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad], 
    typings.rdfJs.mod.Term
  ]) | typings.rdfJs.mod.Term
  type TermOrLiteral = typings.clownface.mod.TermOrClownface | java.lang.String | scala.Double | scala.Boolean
}
