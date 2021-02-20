package typings.clownface

import typings.clownface.anon.ToString
import typings.clownface.contextMod.Context
import typings.rdfJs.mod.BlankNode
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Literal
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.Term
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clownface", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInit[D]): AnyPointer[AnyContext, D] = js.native
  @JSImport("clownface", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInitWithValue[D]): AnyPointer[Literal, D] = js.native
  @JSImport("clownface", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInitWithValues[D]): AnyPointer[js.Array[Literal], D] = js.native
  @JSImport("clownface", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term | js.Array[Term] */](options: ClownfaceInitWithTerms[T, D]): AnyPointer[T, D] = js.native
  @JSImport("clownface", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: AnyContext */](other: AnyPointer[T, D]): AnyPointer[T, D] = js.native
  
  type AddCallback[D /* <: DatasetCore[Quad, Quad] */, X /* <: Term */] = js.Function1[/* added */ AnyPointer[X, D], Unit]
  
  type AnyContext = js.UndefOr[Term | js.Array[Term]]
  
  @js.native
  trait AnyPointer[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
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
  
  /* Inlined std.Partial<std.Pick<clownface.clownface.AnyPointer<clownface.clownface.AnyContext, D>, 'dataset' | '_context'> & {  graph :rdf-js.rdf-js.Quad_Graph}> */
  @js.native
  trait ClownfaceInit[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.native
    
    var dataset: js.UndefOr[D] = js.native
    
    var graph: js.UndefOr[QuadGraph] = js.native
  }
  object ClownfaceInit {
    
    @scala.inline
    def apply[D /* <: DatasetCore[Quad, Quad] */](): ClownfaceInit[D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClownfaceInit[D]]
    }
    
    @scala.inline
    implicit class ClownfaceInitMutableBuilder[Self <: ClownfaceInit[_], D /* <: DatasetCore[Quad, Quad] */] (val x: Self with ClownfaceInit[D]) extends AnyVal {
      
      @scala.inline
      def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      @scala.inline
      def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      @scala.inline
      def set_context(value: js.Array[Context[D, Term]]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
      
      @scala.inline
      def set_contextVarargs(value: (Context[D, Term])*): Self = StObject.set(x, "_context", js.Array(value :_*))
    }
  }
  
  /* Inlined clownface.clownface.ClownfaceInit<D> & {  term :T} */
  @js.native
  trait ClownfaceInitWithTerms[T /* <: Term | js.Array[Term] */, D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.native
    
    var dataset: js.UndefOr[D] = js.native
    
    var graph: js.UndefOr[QuadGraph] = js.native
    
    var term: T = js.native
  }
  object ClownfaceInitWithTerms {
    
    @scala.inline
    def apply[T /* <: Term | js.Array[Term] */, D /* <: DatasetCore[Quad, Quad] */](term: T): ClownfaceInitWithTerms[T, D] = {
      val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClownfaceInitWithTerms[T, D]]
    }
    
    @scala.inline
    implicit class ClownfaceInitWithTermsMutableBuilder[Self <: ClownfaceInitWithTerms[_, _], T /* <: Term | js.Array[Term] */, D /* <: DatasetCore[Quad, Quad] */] (val x: Self with (ClownfaceInitWithTerms[T, D])) extends AnyVal {
      
      @scala.inline
      def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      @scala.inline
      def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      @scala.inline
      def setTerm(value: T): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_context(value: js.Array[Context[D, Term]]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
      
      @scala.inline
      def set_contextVarargs(value: (Context[D, Term])*): Self = StObject.set(x, "_context", js.Array(value :_*))
    }
  }
  
  /* Inlined clownface.clownface.ClownfaceInit<D> & {  value :string} */
  @js.native
  trait ClownfaceInitWithValue[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.native
    
    var dataset: js.UndefOr[D] = js.native
    
    var graph: js.UndefOr[QuadGraph] = js.native
    
    var value: String = js.native
  }
  object ClownfaceInitWithValue {
    
    @scala.inline
    def apply[D /* <: DatasetCore[Quad, Quad] */](value: String): ClownfaceInitWithValue[D] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClownfaceInitWithValue[D]]
    }
    
    @scala.inline
    implicit class ClownfaceInitWithValueMutableBuilder[Self <: ClownfaceInitWithValue[_], D /* <: DatasetCore[Quad, Quad] */] (val x: Self with ClownfaceInitWithValue[D]) extends AnyVal {
      
      @scala.inline
      def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      @scala.inline
      def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_context(value: js.Array[Context[D, Term]]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
      
      @scala.inline
      def set_contextVarargs(value: (Context[D, Term])*): Self = StObject.set(x, "_context", js.Array(value :_*))
    }
  }
  
  /* Inlined clownface.clownface.ClownfaceInit<D> & {  value :std.Array<string>} */
  @js.native
  trait ClownfaceInitWithValues[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.native
    
    var dataset: js.UndefOr[D] = js.native
    
    var graph: js.UndefOr[QuadGraph] = js.native
    
    var value: js.Array[String] = js.native
  }
  object ClownfaceInitWithValues {
    
    @scala.inline
    def apply[D /* <: DatasetCore[Quad, Quad] */](value: js.Array[String]): ClownfaceInitWithValues[D] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClownfaceInitWithValues[D]]
    }
    
    @scala.inline
    implicit class ClownfaceInitWithValuesMutableBuilder[Self <: ClownfaceInitWithValues[_], D /* <: DatasetCore[Quad, Quad] */] (val x: Self with ClownfaceInitWithValues[D]) extends AnyVal {
      
      @scala.inline
      def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      @scala.inline
      def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def set_context(value: js.Array[Context[D, Term]]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
      
      @scala.inline
      def set_contextVarargs(value: (Context[D, Term])*): Self = StObject.set(x, "_context", js.Array(value :_*))
    }
  }
  
  type GraphPointer[T /* <: Term */, D /* <: DatasetCore[Quad, Quad] */] = AnyPointer[T, D]
  
  type Iteratee[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] = AnyPointer[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any) | T, 
    D
  ]
  
  type MultiPointer[T /* <: Term */, D /* <: DatasetCore[Quad, Quad] */] = AnyPointer[T | js.Array[T], D]
  
  @js.native
  trait NodeOptions extends StObject {
    
    var datatype: js.UndefOr[Term | ToString] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[
        typings.clownface.clownfaceStrings.BlankNode | typings.clownface.clownfaceStrings.Literal | typings.clownface.clownfaceStrings.NamedNode
      ] = js.native
  }
  object NodeOptions {
    
    @scala.inline
    def apply(): NodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeOptions]
    }
    
    @scala.inline
    implicit class NodeOptionsMutableBuilder[Self <: NodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatatype(value: Term | ToString): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setType(
        value: typings.clownface.clownfaceStrings.BlankNode | typings.clownface.clownfaceStrings.Literal | typings.clownface.clownfaceStrings.NamedNode
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait OutOptions extends StObject {
    
    var language: js.UndefOr[String | js.Array[String]] = js.native
  }
  object OutOptions {
    
    @scala.inline
    def apply(): OutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutOptions]
    }
    
    @scala.inline
    implicit class OutOptionsMutableBuilder[Self <: OutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: String | js.Array[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLanguageVarargs(value: String*): Self = StObject.set(x, "language", js.Array(value :_*))
    }
  }
  
  type SingleOrArray[T] = T | js.Array[T]
  
  type SingleOrArrayOfTerms[X /* <: Term */] = SingleOrArray[X] | (MultiPointer[X, DatasetCore[Quad, Quad]])
  
  type SingleOrArrayOfTermsOrLiterals[X /* <: Term */] = SingleOrArray[TermOrLiteral[X]]
  
  type SingleOrOneElementArray[T] = T | js.Array[T]
  
  type TermOrClownface[X /* <: Term */] = (MultiPointer[X, DatasetCore[Quad, Quad]]) | X
  
  type TermOrLiteral[X /* <: Term */] = TermOrClownface[X] | String | Double | Boolean
}
