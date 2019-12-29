package typings.clownface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clownfaceMod {
  import typings.clownface.Anon_Graph
  import typings.clownface.clownfaceStrings._context
  import typings.clownface.clownfaceStrings.dataset
  import typings.rdfDashJs.rdfDashJsMod.DatasetCore
  import typings.rdfDashJs.rdfDashJsMod.Quad
  import typings.rdfDashJs.rdfDashJsMod.Term
  import typings.std.Partial
  import typings.std.Pick

  type AddCallback[D /* <: DatasetCore[Quad] */, X /* <: Term */] = js.Function1[/* added */ SingleContextClownface[D, X], Unit]
  type ClownfaceInit[D /* <: DatasetCore[Quad] */, T /* <: Term */] = Partial[(Pick[Clownface[D, T], dataset | _context]) with Anon_Graph]
  type SingleOrArray[T] = T | js.Array[T]
  type SingleOrArrayOfTerms = SingleOrArray[TermOrClownface]
  type SingleOrArrayOfTermsOrLiterals = SingleOrArray[TermOrLiteral]
  type TermOrClownface = (Clownface[DatasetCore[Quad], Term]) | Term
  type TermOrLiteral = TermOrClownface | String | Double | Boolean
}
