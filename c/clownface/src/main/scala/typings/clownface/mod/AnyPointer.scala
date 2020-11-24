package typings.clownface.mod

import typings.clownface.contextMod.Context
import typings.rdfJs.mod.BlankNode
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Literal
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyPointer[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] extends js.Object {
  
  val _context: js.Array[Context[D, Term]] = js.native
  
  def addIn(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
  def addIn(predicates: SingleOrArrayOfTerms[Term], bnode: SingleOrOneElementArray[js.UndefOr[Null]]): AnyPointer[T, D] = js.native
  def addIn(
    predicates: SingleOrArrayOfTerms[Term],
    bnode: SingleOrOneElementArray[js.UndefOr[Null]],
    callback: AddCallback[D, BlankNode]
  ): AnyPointer[T, D] = js.native
  def addIn(predicates: SingleOrArrayOfTerms[Term], callback: AddCallback[D, BlankNode]): AnyPointer[T, D] = js.native
  @JSName("addIn")
  def addIn_X_Term[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term], subjects: SingleOrArrayOfTermsOrLiterals[X]): AnyPointer[T, D] = js.native
  @JSName("addIn")
  def addIn_X_Term[X /* <: Term */](
    predicates: SingleOrArrayOfTerms[Term],
    subjects: SingleOrArrayOfTermsOrLiterals[X],
    callback: AddCallback[D, X]
  ): AnyPointer[T, D] = js.native
  
  def addList[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
  def addList[X /* <: Term */](
    predicates: SingleOrArrayOfTerms[Term],
    objects: js.UndefOr[SingleOrArrayOfTermsOrLiterals[X]],
    callback: AddCallback[D, X]
  ): AnyPointer[T, D] = js.native
  def addList[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term], objects: SingleOrArrayOfTermsOrLiterals[X]): AnyPointer[T, D] = js.native
  
  def addOut(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
  def addOut(predicates: SingleOrArrayOfTerms[Term], bnode: SingleOrOneElementArray[js.UndefOr[Null]]): AnyPointer[T, D] = js.native
  def addOut(
    predicates: SingleOrArrayOfTerms[Term],
    bnode: SingleOrOneElementArray[js.UndefOr[Null]],
    callback: AddCallback[D, BlankNode]
  ): AnyPointer[T, D] = js.native
  def addOut(predicates: SingleOrArrayOfTerms[Term], callback: AddCallback[D, BlankNode]): AnyPointer[T, D] = js.native
  @JSName("addOut")
  def addOut_X_Term[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term], objects: SingleOrArrayOfTermsOrLiterals[X]): AnyPointer[T, D] = js.native
  @JSName("addOut")
  def addOut_X_Term[X /* <: Term */](
    predicates: SingleOrArrayOfTerms[Term],
    objects: SingleOrArrayOfTermsOrLiterals[X],
    callback: AddCallback[D, X]
  ): AnyPointer[T, D] = js.native
  
  def any(): AnyPointer[AnyContext, D] = js.native
  
  def blankNode(): AnyPointer[BlankNode, D] = js.native
  def blankNode(value: (AnyPointer[BlankNode, D]) | (MultiPointer[BlankNode, D]) | SingleOrOneElementArray[String]): AnyPointer[BlankNode, D] = js.native
  def blankNode(values: js.Array[String]): AnyPointer[js.Array[BlankNode], D] = js.native
  
  val dataset: D = js.native
  
  val datasets: js.Array[D] = js.native
  
  def deleteIn(): AnyPointer[T, D] = js.native
  def deleteIn(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
  
  def deleteList(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
  
  def deleteOut(): AnyPointer[T, D] = js.native
  def deleteOut(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
  
  def filter(cb: js.Function1[/* quad */ Iteratee[T, D], Boolean]): AnyPointer[T, D] = js.native
  
  def forEach(cb: js.Function1[/* quad */ Iteratee[T, D], Unit]): this.type = js.native
  
  def has(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[js.Array[NamedNode[String] | BlankNode], D] = js.native
  def has(predicates: SingleOrArrayOfTerms[Term], objects: SingleOrArrayOfTermsOrLiterals[Term]): AnyPointer[js.Array[NamedNode[String] | BlankNode], D] = js.native
  
  def in(): MultiPointer[NamedNode[String] | BlankNode, D] = js.native
  def in(predicates: SingleOrArrayOfTerms[Term]): MultiPointer[NamedNode[String] | BlankNode, D] = js.native
  
  def list(): (Iterable[Iteratee[T, D]]) | Null = js.native
  
  def literal(
    value: (AnyPointer[Literal, D]) | (MultiPointer[Literal, D]) | (SingleOrOneElementArray[Boolean | String | Double | Term | Null])
  ): AnyPointer[Literal, D] = js.native
  def literal(
    value: (AnyPointer[Literal, D]) | (MultiPointer[Literal, D]) | (SingleOrOneElementArray[Boolean | String | Double | Term | Null]),
    languageOrDatatype: String
  ): AnyPointer[Literal, D] = js.native
  def literal(
    value: (AnyPointer[Literal, D]) | (MultiPointer[Literal, D]) | (SingleOrOneElementArray[Boolean | String | Double | Term | Null]),
    languageOrDatatype: NamedNode[String]
  ): AnyPointer[Literal, D] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null]): AnyPointer[js.Array[Literal], D] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null], languageOrDatatype: String): AnyPointer[js.Array[Literal], D] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null], languageOrDatatype: NamedNode[String]): AnyPointer[js.Array[Literal], D] = js.native
  
  def map[X](cb: js.Function2[/* quad */ Iteratee[T, D], /* index */ Double, X]): js.Array[X] = js.native
  
  def namedNode(
    value: (AnyPointer[NamedNode[String], D]) | (MultiPointer[NamedNode[String], D]) | (SingleOrOneElementArray[String | NamedNode[String]])
  ): AnyPointer[NamedNode[String], D] = js.native
  def namedNode(values: js.Array[String | NamedNode[String]]): AnyPointer[js.Array[NamedNode[String]], D] = js.native
  
  def node(): AnyPointer[BlankNode, D] = js.native
  def node(value: Null, options: NodeOptions): AnyPointer[BlankNode, D] = js.native
  def node(values: js.Array[Boolean | Double | Null | String | Term]): AnyPointer[js.Array[Literal], D] = js.native
  def node(values: js.Array[Boolean | Double | Null | String | Term], options: NodeOptions): AnyPointer[js.Array[Literal], D] = js.native
  def node(value: SingleOrOneElementArray[Boolean | String | Double]): AnyPointer[Literal, D] = js.native
  def node(value: SingleOrOneElementArray[Boolean | String | Double], options: NodeOptions): AnyPointer[Literal, D] = js.native
  def node[X /* <: js.Array[Term] */](values: X): AnyPointer[X, D] = js.native
  def node[X /* <: js.Array[Term] */](values: X, options: NodeOptions): AnyPointer[X, D] = js.native
  @JSName("node")
  def node_X_Term[X /* <: Term */](value: (AnyPointer[X, D]) | (MultiPointer[X, D]) | SingleOrOneElementArray[X]): AnyPointer[X, D] = js.native
  @JSName("node")
  def node_X_Term[X /* <: Term */](
    value: (AnyPointer[X, D]) | (MultiPointer[X, D]) | SingleOrOneElementArray[X],
    options: NodeOptions
  ): AnyPointer[X, D] = js.native
  
  def out(): MultiPointer[Term, D] = js.native
  def out(predicates: js.UndefOr[SingleOrArrayOfTerms[Term]], options: OutOptions): MultiPointer[Literal, D] = js.native
  def out(predicates: SingleOrArrayOfTerms[Term]): MultiPointer[Term, D] = js.native
  
  val term: js.UndefOr[
    T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  ] = js.native
  
  val terms: (js.Array[T | Term]) | T = js.native
  
  def toArray(): js.Array[
    AnyPointer[
      T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any), 
      D
    ]
  ] = js.native
  
  val value: js.UndefOr[
    String | (/* import warning: importer.ImportType#apply Failed type conversion: string[0] */ js.Any)
  ] = js.native
  
  val values: js.Array[String] = js.native
}
