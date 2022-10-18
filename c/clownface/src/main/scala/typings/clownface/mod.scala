package typings.clownface

import typings.clownface.anon.ToString
import typings.clownface.libContextMod.Context
import typings.rdfjsTypes.dataModelMod.BlankNode
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.QuadGraph
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInit[D]): AnyPointer[AnyContext, D] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[AnyPointer[AnyContext, D]]
  inline def apply[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInitWithValue[D]): AnyPointer[Literal, D] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[AnyPointer[Literal, D]]
  inline def apply[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInitWithValues[D]): AnyPointer[js.Array[Literal], D] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[AnyPointer[js.Array[Literal], D]]
  inline def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term | js.Array[Term] */](options: ClownfaceInitWithTerms[T, D]): AnyPointer[T, D] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[AnyPointer[T, D]]
  inline def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: AnyContext */](other: AnyPointer[T, D]): AnyPointer[T, D] = ^.asInstanceOf[js.Dynamic].apply(other.asInstanceOf[js.Any]).asInstanceOf[AnyPointer[T, D]]
  
  @JSImport("clownface", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def addIn_X[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term], subjects: SingleOrArrayOfTermsOrLiterals[X]): AnyPointer[T, D] = js.native
    @JSName("addIn")
    def addIn_X[X /* <: Term */](
      predicates: SingleOrArrayOfTerms[Term],
      subjects: SingleOrArrayOfTermsOrLiterals[X],
      callback: AddCallback[D, X]
    ): AnyPointer[T, D] = js.native
    
    def addList[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
    def addList[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term], objects: Unit, callback: AddCallback[D, X]): AnyPointer[T, D] = js.native
    def addList[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term], objects: SingleOrArrayOfTermsOrLiterals[X]): AnyPointer[T, D] = js.native
    def addList[X /* <: Term */](
      predicates: SingleOrArrayOfTerms[Term],
      objects: SingleOrArrayOfTermsOrLiterals[X],
      callback: AddCallback[D, X]
    ): AnyPointer[T, D] = js.native
    
    def addOut(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
    def addOut(predicates: SingleOrArrayOfTerms[Term], bnode: SingleOrOneElementArray[js.UndefOr[Null]]): AnyPointer[T, D] = js.native
    def addOut(
      predicates: SingleOrArrayOfTerms[Term],
      bnode: SingleOrOneElementArray[js.UndefOr[Null]],
      callback: AddCallback[D, BlankNode]
    ): AnyPointer[T, D] = js.native
    def addOut(predicates: SingleOrArrayOfTerms[Term], callback: AddCallback[D, BlankNode]): AnyPointer[T, D] = js.native
    @JSName("addOut")
    def addOut_X[X /* <: Term */](predicates: SingleOrArrayOfTerms[Term], objects: SingleOrArrayOfTermsOrLiterals[X]): AnyPointer[T, D] = js.native
    @JSName("addOut")
    def addOut_X[X /* <: Term */](
      predicates: SingleOrArrayOfTerms[Term],
      objects: SingleOrArrayOfTermsOrLiterals[X],
      callback: AddCallback[D, X]
    ): AnyPointer[T, D] = js.native
    
    def any(): AnyPointer[AnyContext, D] = js.native
    
    def blankNode(): AnyPointer[BlankNode, D] = js.native
    def blankNode(value: (AnyPointer[BlankNode, D]) | (MultiPointer[BlankNode, D])): AnyPointer[BlankNode, D] = js.native
    def blankNode(values: js.Array[String]): AnyPointer[js.Array[BlankNode], D] = js.native
    def blankNode(values: js.Iterable[BlankNode | (GraphPointer[BlankNode, D])]): AnyPointer[js.Array[BlankNode], D] = js.native
    def blankNode(value: SingleOrOneElementArray[String]): AnyPointer[BlankNode, D] = js.native
    
    val dataset: D = js.native
    
    val datasets: js.Array[D] = js.native
    
    def deleteIn(): AnyPointer[T, D] = js.native
    def deleteIn(predicates: Unit, subjects: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
    def deleteIn(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
    def deleteIn(predicates: SingleOrArrayOfTerms[Term], subjects: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
    
    def deleteList(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
    
    def deleteOut(): AnyPointer[T, D] = js.native
    def deleteOut(predicates: Unit, objects: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
    def deleteOut(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
    def deleteOut(predicates: SingleOrArrayOfTerms[Term], objects: SingleOrArrayOfTerms[Term]): AnyPointer[T, D] = js.native
    
    def filter(
      cb: js.Function3[
          /* ptr */ Iteratee[T, D], 
          /* index */ Double, 
          /* pointers */ js.Array[GraphPointer[ExtractContext[T], DatasetCore[Quad, Quad]]], 
          Boolean
        ]
    ): AnyPointer[T, D] = js.native
    @JSName("filter")
    def filter_S[S /* <: T */](cb: FilterCallback[T, D, S]): AnyPointer[S, D] = js.native
    
    def forEach(cb: js.Function1[/* quad */ Iteratee[T, D], Unit]): this.type = js.native
    
    def has(predicates: SingleOrArrayOfTerms[Term]): AnyPointer[js.Array[NamedNode[String] | BlankNode], D] = js.native
    def has(predicates: SingleOrArrayOfTerms[Term], objects: SingleOrArrayOfTermsOrLiterals[Term]): AnyPointer[js.Array[NamedNode[String] | BlankNode], D] = js.native
    
    def in(): MultiPointer[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? never : @rdfjs/types.@rdfjs/types/data-model.NamedNode<string> | @rdfjs/types.@rdfjs/types/data-model.BlankNode */ js.Any, 
        D
      ] = js.native
    def in(predicates: SingleOrArrayOfTerms[Term]): MultiPointer[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? never : @rdfjs/types.@rdfjs/types/data-model.NamedNode<string> | @rdfjs/types.@rdfjs/types/data-model.BlankNode */ js.Any, 
        D
      ] = js.native
    
    def isList(): Boolean = js.native
    
    def list(): (js.Iterable[Iteratee[Term, D]]) | Null = js.native
    
    def literal(value: (AnyPointer[Literal, D]) | (MultiPointer[Literal, D])): AnyPointer[Literal, D] = js.native
    def literal(value: (AnyPointer[Literal, D]) | (MultiPointer[Literal, D]), languageOrDatatype: String): AnyPointer[Literal, D] = js.native
    def literal(
      value: (AnyPointer[Literal, D]) | (MultiPointer[Literal, D]),
      languageOrDatatype: NamedNode[String]
    ): AnyPointer[Literal, D] = js.native
    def literal(values: js.Array[Boolean | String | Double | Null]): AnyPointer[js.Array[Literal], D] = js.native
    def literal(values: js.Array[Boolean | String | Double | Null], languageOrDatatype: String): AnyPointer[js.Array[Literal], D] = js.native
    def literal(values: js.Array[Boolean | String | Double | Null], languageOrDatatype: NamedNode[String]): AnyPointer[js.Array[Literal], D] = js.native
    def literal(values: js.Iterable[(GraphPointer[Literal, D]) | Literal]): AnyPointer[js.Array[Literal], D] = js.native
    def literal(values: js.Iterable[(GraphPointer[Literal, D]) | Literal], languageOrDatatype: String): AnyPointer[js.Array[Literal], D] = js.native
    def literal(values: js.Iterable[(GraphPointer[Literal, D]) | Literal], languageOrDatatype: NamedNode[String]): AnyPointer[js.Array[Literal], D] = js.native
    def literal(value: SingleOrOneElementArray[Boolean | String | Double | Term | Null]): AnyPointer[Literal, D] = js.native
    def literal(
      value: SingleOrOneElementArray[Boolean | String | Double | Term | Null],
      languageOrDatatype: String
    ): AnyPointer[Literal, D] = js.native
    def literal(
      value: SingleOrOneElementArray[Boolean | String | Double | Term | Null],
      languageOrDatatype: NamedNode[String]
    ): AnyPointer[Literal, D] = js.native
    
    def map[X](cb: js.Function2[/* quad */ Iteratee[T, D], /* index */ Double, X]): js.Array[X] = js.native
    
    def namedNode(values: js.Array[String | NamedNode[String]]): AnyPointer[js.Array[NamedNode[String]], D] = js.native
    def namedNode(values: js.Iterable[(GraphPointer[NamedNode[String], D]) | NamedNode[String]]): AnyPointer[js.Array[NamedNode[String]], D] = js.native
    def namedNode(values: MultiPointer[NamedNode[String], D]): AnyPointer[js.Array[NamedNode[String]], D] = js.native
    def namedNode[Iri /* <: String */](value: SingleOrOneElementArray[String | NamedNode[Iri] | (AnyPointer[NamedNode[Iri], D])]): AnyPointer[NamedNode[Iri], D] = js.native
    
    def node(): AnyPointer[BlankNode, D] = js.native
    def node(value: Null, options: NodeOptions): AnyPointer[BlankNode, D] = js.native
    def node(values: js.Array[Boolean | Double | Null | String | Term]): AnyPointer[js.Array[Literal], D] = js.native
    def node(values: js.Array[Boolean | Double | Null | String | Term], options: NodeOptions): AnyPointer[js.Array[Literal], D] = js.native
    def node(values: js.Iterable[BlankNode | Term]): AnyPointer[js.Array[BlankNode], D] = js.native
    def node(values: js.Iterable[BlankNode | Term], options: NodeOptions): AnyPointer[js.Array[BlankNode], D] = js.native
    def node(value: SingleOrOneElementArray[Boolean | String | Double]): AnyPointer[Literal, D] = js.native
    def node(value: SingleOrOneElementArray[Boolean | String | Double], options: NodeOptions): AnyPointer[Literal, D] = js.native
    def node[X /* <: Term */](value: (AnyPointer[X, D]) | (MultiPointer[X, D])): AnyPointer[X, D] = js.native
    def node[X /* <: Term */](value: (AnyPointer[X, D]) | (MultiPointer[X, D]), options: NodeOptions): AnyPointer[X, D] = js.native
    @JSName("node")
    def node_X[X /* <: Term */](value: SingleOrOneElementArray[X] | X): AnyPointer[X, D] = js.native
    @JSName("node")
    def node_X[X /* <: Term */](value: SingleOrOneElementArray[X] | X, options: NodeOptions): AnyPointer[X, D] = js.native
    @JSName("node")
    def node_X[X /* <: Term */](value: js.Iterable[X]): AnyPointer[js.Array[X], D] = js.native
    @JSName("node")
    def node_X[X /* <: Term */](value: js.Iterable[X], options: NodeOptions): AnyPointer[js.Array[X], D] = js.native
    @JSName("node")
    def node_X_MultiPointer[X /* <: Term */](value: js.Iterable[GraphPointer[X, D]]): MultiPointer[X, D] = js.native
    @JSName("node")
    def node_X_MultiPointer[X /* <: Term */](value: js.Iterable[GraphPointer[X, D]], options: NodeOptions): MultiPointer[X, D] = js.native
    
    def out(): MultiPointer[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? never : @rdfjs/types.@rdfjs/types/data-model.Term */ js.Any, 
        D
      ] = js.native
    def out(predicates: Unit, options: OutOptions): MultiPointer[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? never : @rdfjs/types.@rdfjs/types/data-model.Literal */ js.Any, 
        D
      ] = js.native
    def out(predicates: SingleOrArrayOfTerms[Term]): MultiPointer[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? never : @rdfjs/types.@rdfjs/types/data-model.Term */ js.Any, 
        D
      ] = js.native
    def out(predicates: SingleOrArrayOfTerms[Term], options: OutOptions): MultiPointer[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? never : @rdfjs/types.@rdfjs/types/data-model.Literal */ js.Any, 
        D
      ] = js.native
    
    val term: /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : T extends std.Array<any> ? undefined | T[0] : T */ js.Any = js.native
    
    val terms: /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? std.Array<@rdfjs/types.@rdfjs/types/data-model.Term> : T extends std.Array<any> ? T : [T] */ js.Any = js.native
    
    def toArray(): js.Array[AnyPointer[ExtractContext[T], D]] = js.native
    
    val value: /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : T extends std.Array<any> ? undefined | string[0] : string */ js.Any = js.native
    
    val values: /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? std.Array<string> : T extends std.Array<any> ? std.Array<string> : [string] */ js.Any = js.native
  }
  
  /* Inlined std.Partial<std.Pick<clownface.clownface.AnyPointer<clownface.clownface.AnyContext, D>, 'dataset' | '_context'> & {  graph :rdf-js.rdf-js.Quad_Graph}> */
  trait ClownfaceInit[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.undefined
    
    var dataset: js.UndefOr[D] = js.undefined
    
    var graph: js.UndefOr[QuadGraph] = js.undefined
  }
  object ClownfaceInit {
    
    inline def apply[D /* <: DatasetCore[Quad, Quad] */](): ClownfaceInit[D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClownfaceInit[D]]
    }
    
    extension [Self <: ClownfaceInit[?], D /* <: DatasetCore[Quad, Quad] */](x: Self & ClownfaceInit[D]) {
      
      inline def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      inline def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      inline def set_context(value: js.Array[Context[D, Term]]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      inline def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
      
      inline def set_contextVarargs(value: (Context[D, Term])*): Self = StObject.set(x, "_context", js.Array(value*))
    }
  }
  
  /* Inlined clownface.clownface.ClownfaceInit<D> & {  term :T} */
  trait ClownfaceInitWithTerms[T /* <: Term | js.Array[Term] */, D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.undefined
    
    var dataset: js.UndefOr[D] = js.undefined
    
    var graph: js.UndefOr[QuadGraph] = js.undefined
    
    var term: T
  }
  object ClownfaceInitWithTerms {
    
    inline def apply[T /* <: Term | js.Array[Term] */, D /* <: DatasetCore[Quad, Quad] */](term: T): ClownfaceInitWithTerms[T, D] = {
      val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClownfaceInitWithTerms[T, D]]
    }
    
    extension [Self <: ClownfaceInitWithTerms[?, ?], T /* <: Term | js.Array[Term] */, D /* <: DatasetCore[Quad, Quad] */](x: Self & (ClownfaceInitWithTerms[T, D])) {
      
      inline def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      inline def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      inline def setTerm(value: T): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def set_context(value: js.Array[Context[D, Term]]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      inline def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
      
      inline def set_contextVarargs(value: (Context[D, Term])*): Self = StObject.set(x, "_context", js.Array(value*))
    }
  }
  
  /* Inlined clownface.clownface.ClownfaceInit<D> & {  value :string} */
  trait ClownfaceInitWithValue[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.undefined
    
    var dataset: js.UndefOr[D] = js.undefined
    
    var graph: js.UndefOr[QuadGraph] = js.undefined
    
    var value: String
  }
  object ClownfaceInitWithValue {
    
    inline def apply[D /* <: DatasetCore[Quad, Quad] */](value: String): ClownfaceInitWithValue[D] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClownfaceInitWithValue[D]]
    }
    
    extension [Self <: ClownfaceInitWithValue[?], D /* <: DatasetCore[Quad, Quad] */](x: Self & ClownfaceInitWithValue[D]) {
      
      inline def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      inline def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def set_context(value: js.Array[Context[D, Term]]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      inline def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
      
      inline def set_contextVarargs(value: (Context[D, Term])*): Self = StObject.set(x, "_context", js.Array(value*))
    }
  }
  
  /* Inlined clownface.clownface.ClownfaceInit<D> & {  value :std.Array<string>} */
  trait ClownfaceInitWithValues[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.undefined
    
    var dataset: js.UndefOr[D] = js.undefined
    
    var graph: js.UndefOr[QuadGraph] = js.undefined
    
    var value: js.Array[String]
  }
  object ClownfaceInitWithValues {
    
    inline def apply[D /* <: DatasetCore[Quad, Quad] */](value: js.Array[String]): ClownfaceInitWithValues[D] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClownfaceInitWithValues[D]]
    }
    
    extension [Self <: ClownfaceInitWithValues[?], D /* <: DatasetCore[Quad, Quad] */](x: Self & ClownfaceInitWithValues[D]) {
      
      inline def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      inline def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def set_context(value: js.Array[Context[D, Term]]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      inline def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
      
      inline def set_contextVarargs(value: (Context[D, Term])*): Self = StObject.set(x, "_context", js.Array(value*))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends undefined ? never : T extends std.Array<any> ? T[0] : T
    }}}
    */
  @js.native
  trait ExtractContext[T /* <: AnyContext */] extends StObject
  
  type FilterCallback[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */, S /* <: T */] = js.Function3[
    /* ptr */ Iteratee[T, D], 
    /* index */ Double, 
    /* pointers */ js.Array[GraphPointer[ExtractContext[T], DatasetCore[Quad, Quad]]], 
    /* is clownface.clownface.Predicate<S, any> */ Boolean
  ]
  
  type GraphPointer[T /* <: Term */, D /* <: DatasetCore[Quad, Quad] */] = AnyPointer[T, D]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends undefined ? never : T extends std.Array<any> ? clownface.clownface.AnyPointer<T[0], D> : clownface.clownface.AnyPointer<T, D>
    }}}
    */
  @js.native
  trait Iteratee[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] extends StObject
  
  @js.native
  trait ListPointer[T /* <: Term */, D /* <: DatasetCore[Quad, Quad] */]
    extends StObject
       with AnyPointer[T, D]
  
  type MultiPointer[T /* <: Term */, D /* <: DatasetCore[Quad, Quad] */] = AnyPointer[T | js.Array[T], D]
  
  trait NodeOptions extends StObject {
    
    var datatype: js.UndefOr[Term | ToString] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[
        typings.clownface.clownfaceStrings.BlankNode | typings.clownface.clownfaceStrings.Literal | typings.clownface.clownfaceStrings.NamedNode
      ] = js.undefined
  }
  object NodeOptions {
    
    inline def apply(): NodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeOptions]
    }
    
    extension [Self <: NodeOptions](x: Self) {
      
      inline def setDatatype(value: Term | ToString): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setType(
        value: typings.clownface.clownfaceStrings.BlankNode | typings.clownface.clownfaceStrings.Literal | typings.clownface.clownfaceStrings.NamedNode
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OutOptions extends StObject {
    
    var language: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object OutOptions {
    
    inline def apply(): OutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutOptions]
    }
    
    extension [Self <: OutOptions](x: Self) {
      
      inline def setLanguage(value: String | js.Array[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLanguageVarargs(value: String*): Self = StObject.set(x, "language", js.Array(value*))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends undefined ? never : T extends std.Array<any> ? clownface.clownface.Iteratee<T[0], D> : clownface.clownface.Iteratee<T, D>
    }}}
    */
  @js.native
  trait Predicate[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] extends StObject
  
  type SingleOrArray[T] = T | js.Array[T]
  
  type SingleOrArrayOfTerms[X /* <: Term */] = SingleOrArray[X] | (MultiPointer[X, DatasetCore[Quad, Quad]])
  
  type SingleOrArrayOfTermsOrLiterals[X /* <: Term */] = SingleOrArray[TermOrLiteral[X]]
  
  type SingleOrOneElementArray[T] = T | js.Array[T]
  
  type TermOrClownface[X /* <: Term */] = (MultiPointer[X, DatasetCore[Quad, Quad]]) | X
  
  type TermOrLiteral[X /* <: Term */] = TermOrClownface[X] | String | Double | Boolean
}
