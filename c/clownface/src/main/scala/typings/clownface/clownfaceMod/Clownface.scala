package typings.clownface.clownfaceMod

import typings.rdfDashJs.rdfDashJsMod.BlankNode
import typings.rdfDashJs.rdfDashJsMod.DatasetCore
import typings.rdfDashJs.rdfDashJsMod.Literal
import typings.rdfDashJs.rdfDashJsMod.NamedNode
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Term
import typings.std.Iterable
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
  def blankNode(): SingleContextClownface[D, BlankNode] = js.native
  def blankNode(values: js.Array[String]): SafeClownface[D, BlankNode] = js.native
  def blankNode(value: SingleOrOneElementArray[String]): SingleContextClownface[D, BlankNode] = js.native
  def deleteIn[X /* <: Term */](): SafeClownface[D, X] = js.native
  def deleteIn[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def deleteList[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def deleteOut[X /* <: Term */](): SafeClownface[D, X] = js.native
  def deleteOut[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def filter(cb: js.Function1[/* quad */ Clownface[D, T], Boolean]): Clownface[D, T] = js.native
  def forEach(cb: js.Function1[/* quad */ Clownface[D, T], Unit]): Unit = js.native
  def has[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def has[X /* <: Term */](predicates: SingleOrArrayOfTerms, objects: SingleOrArrayOfTermsOrLiterals): SafeClownface[D, X] = js.native
  // tslint:disable:no-unnecessary-generics
  def in[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def list(): Iterable[SingleContextClownface[D, Term]] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null]): SafeClownface[D, Literal] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null], languageOrDatatype: String): SafeClownface[D, Literal] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null], languageOrDatatype: NamedNode): SafeClownface[D, Literal] = js.native
  def literal(value: SingleOrOneElementArray[Boolean | String | Double | Term | Null]): SingleContextClownface[D, Literal] = js.native
  def literal(
    value: SingleOrOneElementArray[Boolean | String | Double | Term | Null],
    languageOrDatatype: String
  ): SingleContextClownface[D, Literal] = js.native
  def literal(
    value: SingleOrOneElementArray[Boolean | String | Double | Term | Null],
    languageOrDatatype: NamedNode
  ): SingleContextClownface[D, Literal] = js.native
  def map[X](cb: js.Function2[/* quad */ Clownface[D, T], /* index */ Double, X]): js.Array[X] = js.native
  def namedNode(values: js.Array[String | NamedNode]): SafeClownface[D, NamedNode] = js.native
  def namedNode(value: SingleOrOneElementArray[String | NamedNode]): SingleContextClownface[D, NamedNode] = js.native
  def node(): SingleContextClownface[D, BlankNode] = js.native
  def node(value: Null, options: NodeOptions): SingleContextClownface[D, BlankNode] = js.native
  def node(values: js.Array[Boolean | Double | Null | String]): SafeClownface[D, Literal] = js.native
  def node(values: js.Array[Boolean | Double | Null | String], options: NodeOptions): SafeClownface[D, Literal] = js.native
  def node(value: SingleOrOneElementArray[Boolean | String | Double]): SingleContextClownface[D, Literal] = js.native
  def node(value: SingleOrOneElementArray[Boolean | String | Double], options: NodeOptions): SingleContextClownface[D, Literal] = js.native
  @JSName("node")
  def node_SafeClownface(values: SingleOrArray[Boolean | String | Double | Term | Null]): SafeClownface[D, Term] = js.native
  @JSName("node")
  def node_SafeClownface(values: SingleOrArray[Boolean | String | Double | Term | Null], options: NodeOptions): SafeClownface[D, Term] = js.native
  @JSName("node")
  def node_X_Term[X /* <: Term */](values: js.Array[X]): SafeClownface[D, X] = js.native
  @JSName("node")
  def node_X_Term[X /* <: Term */](values: js.Array[X], options: NodeOptions): SafeClownface[D, X] = js.native
  @JSName("node")
  def node_X_Term[X /* <: Term */](value: SingleOrOneElementArray[X]): SingleContextClownface[D, X] = js.native
  @JSName("node")
  def node_X_Term[X /* <: Term */](value: SingleOrOneElementArray[X], options: NodeOptions): SingleContextClownface[D, X] = js.native
  def out[X /* <: Term */](predicates: SingleOrArrayOfTerms): SafeClownface[D, X] = js.native
  def toArray(): js.Array[Clownface[D, T]] = js.native
}

