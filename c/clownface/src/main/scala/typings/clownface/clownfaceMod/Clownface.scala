package typings.clownface.clownfaceMod

import typings.rdfDashJs.rdfDashJsMod.BlankNode
import typings.rdfDashJs.rdfDashJsMod.DatasetCore
import typings.rdfDashJs.rdfDashJsMod.Literal
import typings.rdfDashJs.rdfDashJsMod.NamedNode
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Term
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clownface[D /* <: DatasetCore[Quad] */, T /* <: Term */] extends js.Object {
  val _context: js.Any = js.native
  val dataset: D = js.native
  val datasets: js.Array[D] = js.native
  val term: js.UndefOr[T] = js.native
  val terms: js.Array[T] = js.native
  val value: js.UndefOr[String] = js.native
  val values: js.Array[String] = js.native
  def addIn[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def addIn[X /* <: Term */](predicates: SingleOrArrayOfTerms, objectsOrCallback: AddCallback[D, X]): SafeClownface[D, X] = js.native
  def addIn[X /* <: Term */](predicates: SingleOrArrayOfTerms, objectsOrCallback: SingleOrArrayOfTermsOrLiterals): SafeClownface[D, X] = js.native
  def addIn[X /* <: Term */](
    predicates: SingleOrArrayOfTerms,
    objects: SingleOrArrayOfTermsOrLiterals,
    callback: AddCallback[D, X]
  ): SafeClownface[D, X] = js.native
  def addList[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def addList[X /* <: Term */](predicates: SingleOrArrayOfTerms, objects: SingleOrArrayOfTermsOrLiterals): SafeClownface[D, X] = js.native
  def addList[X /* <: Term */](
    predicates: SingleOrArrayOfTerms,
    objects: SingleOrArrayOfTermsOrLiterals,
    callback: AddCallback[D, X]
  ): SafeClownface[D, X] = js.native
  def addOut[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def addOut[X /* <: Term */](predicates: SingleOrArrayOfTerms, objectsOrCallback: AddCallback[D, X]): SafeClownface[D, X] = js.native
  def addOut[X /* <: Term */](predicates: SingleOrArrayOfTerms, objectsOrCallback: SingleOrArrayOfTermsOrLiterals): SafeClownface[D, X] = js.native
  def addOut[X /* <: Term */](
    predicates: SingleOrArrayOfTerms,
    objects: SingleOrArrayOfTermsOrLiterals,
    callback: AddCallback[D, X]
  ): SafeClownface[D, X] = js.native
  def blankNode(): SafeClownface[D, BlankNode] = js.native
  def blankNode(values: SingleOrArray[String]): SafeClownface[D, BlankNode] = js.native
  def deleteIn[X /* <: Term */](): SafeClownface[D, X] = js.native
  def deleteIn[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def deleteList[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def deleteOut[X /* <: Term */](): SafeClownface[D, X] = js.native
  def deleteOut[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def filter(cb: js.Function1[/* quad */ Clownface[D, T], Boolean]): Clownface[D, T] = js.native
  def forEach(cb: js.Function1[/* quad */ Clownface[D, T], Unit]): Unit = js.native
  def has[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def has[X /* <: Term */](predicates: SingleOrArrayOfTerms, objects: SingleOrArrayOfTermsOrLiterals): SafeClownface[D, X] = js.native
  def in[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def list(): Iterator[Term, _, js.UndefOr[scala.Nothing]] = js.native
  def literal(values: SingleOrArray[Boolean | String | Double | Term | Null]): SafeClownface[D, Literal] = js.native
  def literal(values: SingleOrArray[Boolean | String | Double | Term | Null], languageOrDatatype: String): SafeClownface[D, Literal] = js.native
  def literal(values: SingleOrArray[Boolean | String | Double | Term | Null], languageOrDatatype: NamedNode): SafeClownface[D, Literal] = js.native
  def map[X](cb: js.Function2[/* quad */ Clownface[D, T], /* index */ Double, X]): js.Array[X] = js.native
  def namedNode(values: SingleOrArray[String | NamedNode]): SafeClownface[D, NamedNode] = js.native
  // tslint:disable:no-unnecessary-generics
  def node[X /* <: Term */](values: SingleOrArray[Boolean | String | Double | Term | Null]): SafeClownface[D, X] = js.native
  def node[X /* <: Term */](values: SingleOrArray[Boolean | String | Double | Term | Null], options: NodeOptions): SafeClownface[D, X] = js.native
  def out[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def toArray(): js.Array[Clownface[D, T]] = js.native
}

