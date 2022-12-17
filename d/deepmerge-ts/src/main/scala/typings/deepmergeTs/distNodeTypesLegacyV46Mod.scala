package typings.deepmergeTs

import typings.deepmergeTs.anon.PartialDeepMergeMergeFunc
import typings.deepmergeTs.anon.ReadonlyReadonlyArrayunkn
import typings.deepmergeTs.anon.ReadonlyReadonlyMapunknow
import typings.deepmergeTs.anon.ReadonlyReadonlySetunknow
import typings.deepmergeTs.anon.ReadonlydefaultMergesymbo
import typings.deepmergeTs.deepmergeTsBooleans.`false`
import typings.deepmergeTs.deepmergeTsBooleans.`true`
import typings.deepmergeTs.deepmergeTsStrings.__proto__
import typings.std.Exclude
import typings.std.Map
import typings.std.Omit
import typings.std.Partial
import typings.std.PropertyKey
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeTypesLegacyV46Mod {
  
  @JSImport("deepmerge-ts/dist/node/types/legacy/v4_6", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Deeply merge objects.
    *
    * @param objects - The objects to merge.
    */
  inline def deepmerge[Ts /* <: ReadonlyReadonlyArrayunkn */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param objects because its type [...Ts] is not an array type */ objects: /* import warning: importer.ImportType#apply c repeated non-array type: Ts */ js.Array[Ts]
  ): DeepMergeHKT[Ts, DeepMergeMergeFunctionsDefaultURIs, DeepMergeBuiltInMetaData] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(objects.asInstanceOf[js.Any]).asInstanceOf[DeepMergeHKT[Ts, DeepMergeMergeFunctionsDefaultURIs, DeepMergeBuiltInMetaData]]
  
  /**
    * Deeply merge two or more objects using the given options.
    *
    * @param options - The options on how to customize the merge function.
    */
  inline def deepmergeCustom[PMF /* <: PartialDeepMergeMergeFunc */](options: DeepMergeOptions[DeepMergeBuiltInMetaData, DeepMergeBuiltInMetaData]): js.Function1[
    /* objects */ js.Array[Any], 
    DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], DeepMergeBuiltInMetaData]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmergeCustom")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* objects */ js.Array[Any], 
    DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], DeepMergeBuiltInMetaData]
  ]]
  inline def deepmergeCustom[PMF /* <: PartialDeepMergeMergeFunc */, MetaData, MetaMetaData /* <: DeepMergeBuiltInMetaData */](options: DeepMergeOptions[MetaData, MetaMetaData], rootMetaData: MetaData): js.Function1[
    /* objects */ js.Array[Any], 
    DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], MetaData]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmergeCustom")(options.asInstanceOf[js.Any], rootMetaData.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* objects */ js.Array[Any], 
    DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], MetaData]
  ]]
  
  /**
    * Deeply merge two or more objects using the given options and meta data.
    *
    * @param options - The options on how to customize the merge function.
    * @param rootMetaData - The meta data passed to the root items' being merged.
    */
  inline def deepmergeCustom_PMFMetaDataMetaMetaData[PMF /* <: PartialDeepMergeMergeFunc */, MetaData, MetaMetaData /* <: DeepMergeBuiltInMetaData */](options: DeepMergeOptions[MetaData, MetaMetaData]): js.Function1[
    /* objects */ js.Array[Any], 
    DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], MetaData]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmergeCustom")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* objects */ js.Array[Any], 
    DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], MetaData]
  ]]
  
  /**
    * And operator for types.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T1 extends false ? false : T2
    }}}
    */
  type And[T1 /* <: Boolean */, T2 /* <: Boolean */] = T2
  
  /**
    * A union of all the props that should not be included in type information for
    * merged records.
    */
  type BlacklistedRecordProps = __proto__
  
  /**
    * Deep merge 2 arrays.
    */
  type DeepMergeArraysDefaultHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = DeepMergeArraysDefaultHKTHelper[Ts, MF, M, js.Array[Any]]
  
  /**
    * Tail-recursive helper type for DeepMergeArraysDefaultHKT.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Ts extends [infer Head, ...infer Rest] ? Head extends std.ReadonlyArray<unknown> ? Rest extends [std.ReadonlyArray<unknown>, ...std.ReadonlyArray<std.ReadonlyArray<unknown>>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysDefaultHKTHelper<Rest, MF, M, [...Acc, ...Head]> : [...Acc, ...Head] : never : never
    }}}
    */
  @js.native
  trait DeepMergeArraysDefaultHKTHelper[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M, Acc /* <: js.Array[Any] */] extends StObject
  
  /**
    * The default merge function to merge arrays with.
    */
  type DeepMergeArraysDefaultURI = typings.deepmergeTs.deepmergeTsStrings.DeepMergeArraysDefaultURI
  
  /**
    * Deep merge arrays.
    */
  type DeepMergeArraysHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = DeepMergeMergeFunctionKind[
    /* import warning: importer.ImportType#apply Failed type conversion: MF['DeepMergeArraysURI'] */ js.Any, 
    Ts, 
    MF, 
    M
  ]
  
  /**
    * The meta data deepmerge is able to provide.
    */
  /* Inlined std.Readonly<{  key :std.PropertyKey,   parents :std.ReadonlyArray<std.Readonly<std.Record<std.PropertyKey, unknown>>>}> */
  trait DeepMergeBuiltInMetaData extends StObject {
    
    val key: PropertyKey
    
    val parents: js.Array[Record[PropertyKey, Any]]
  }
  object DeepMergeBuiltInMetaData {
    
    inline def apply(key: PropertyKey, parents: js.Array[Record[PropertyKey, Any]]): DeepMergeBuiltInMetaData = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepMergeBuiltInMetaData]
    }
    
    extension [Self <: DeepMergeBuiltInMetaData](x: Self) {
      
      inline def setKey(value: PropertyKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setParents(value: js.Array[Record[PropertyKey, Any]]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsVarargs(value: (Record[PropertyKey, Any])*): Self = StObject.set(x, "parents", js.Array(value*))
    }
  }
  
  /**
    * Deep merge types.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsTuple<Ts> extends true ? Ts extends [] ? undefined : Ts extends [infer T1] ? T1 : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsArray<Ts> extends true ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysHKT<Ts, MF, M> : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsMap<Ts> extends true ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMapsHKT<Ts, MF, M> : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsSet<Ts> extends true ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeSetsHKT<Ts, MF, M> : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsRecord<Ts> extends true ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsHKT<Ts, MF, M> : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeOthersHKT<Ts, MF, M> : unknown
    }}}
    */
  type DeepMergeHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = Unit
  
  /**
    * Get the leaf type from many types that can't be merged.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Ts extends [] ? never : Ts extends [infer T] ? T : Ts extends [...infer Rest, infer Tail] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsNever<Tail> extends true ? Rest extends std.ReadonlyArray<unknown> ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeLeaf<Rest> : never : Tail : never
    }}}
    */
  @js.native
  trait DeepMergeLeaf[Ts /* <: js.Array[Any] */] extends StObject
  
  /**
    * Get the leaf type from many types that can't be merged.
    *
    * @deprecated Use `DeepMergeLeaf` instead.
    */
  type DeepMergeLeafHKT[Ts /* <: js.Array[Any] */] = DeepMergeLeaf[Ts]
  
  /**
    * The merge function that returns a leaf.
    */
  type DeepMergeLeafURI = typings.deepmergeTs.deepmergeTsStrings.DeepMergeLeafURI
  
  /**
    * Deep merge 2 maps.
    */
  type DeepMergeMapsDefaultHKT[Ts /* <: js.Array[Any] */] = Map[UnionMapKeys[Ts], UnionMapValues[Ts]]
  
  /**
    * The default merge function to merge maps with.
    */
  type DeepMergeMapsDefaultURI = typings.deepmergeTs.deepmergeTsStrings.DeepMergeMapsDefaultURI
  
  /**
    * Deep merge maps.
    */
  type DeepMergeMapsHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = DeepMergeMergeFunctionKind[
    /* import warning: importer.ImportType#apply Failed type conversion: MF['DeepMergeMapsURI'] */ js.Any, 
    Ts, 
    MF, 
    M
  ]
  
  /**
    * Get the type of the given merge function via its URI.
    */
  type DeepMergeMergeFunctionKind[URI /* <: DeepMergeMergeFunctionURIs */, Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = /* import warning: importer.ImportType#apply Failed type conversion: deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<Ts, MF, M>[URI] */ js.Any
  
  /**
    * A union of all valid merge function URIs.
    */
  /* keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<std.ReadonlyArray<unknown>, deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionsURIs, unknown> */ /* Rewritten from type alias, can be one of: 
    - typings.deepmergeTs.deepmergeTsStrings.DeepMergeLeafURI
    - typings.deepmergeTs.deepmergeTsStrings.DeepMergeRecordsDefaultURI
    - typings.deepmergeTs.deepmergeTsStrings.DeepMergeArraysDefaultURI
    - typings.deepmergeTs.deepmergeTsStrings.DeepMergeSetsDefaultURI
    - typings.deepmergeTs.deepmergeTsStrings.DeepMergeMapsDefaultURI
  */
  trait DeepMergeMergeFunctionURIs extends StObject
  
  /**
    * Mapping of merge function URIs to the merge function type.
    */
  trait DeepMergeMergeFunctionURItoKind[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] extends StObject {
    
    val DeepMergeArraysDefaultURI: DeepMergeArraysDefaultHKT[Ts, MF, M]
    
    val DeepMergeLeafURI: DeepMergeLeaf[Ts]
    
    val DeepMergeMapsDefaultURI: DeepMergeMapsDefaultHKT[Ts]
    
    val DeepMergeRecordsDefaultURI: DeepMergeRecordsDefaultHKT[Ts, MF, M]
    
    val DeepMergeSetsDefaultURI: DeepMergeSetsDefaultHKT[Ts]
  }
  object DeepMergeMergeFunctionURItoKind {
    
    inline def apply[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M](
      DeepMergeArraysDefaultURI: DeepMergeArraysDefaultHKT[Ts, MF, M],
      DeepMergeLeafURI: DeepMergeLeaf[Ts],
      DeepMergeMapsDefaultURI: DeepMergeMapsDefaultHKT[Ts],
      DeepMergeRecordsDefaultURI: DeepMergeRecordsDefaultHKT[Ts, MF, M],
      DeepMergeSetsDefaultURI: DeepMergeSetsDefaultHKT[Ts]
    ): DeepMergeMergeFunctionURItoKind[Ts, MF, M] = {
      val __obj = js.Dynamic.literal(DeepMergeArraysDefaultURI = DeepMergeArraysDefaultURI.asInstanceOf[js.Any], DeepMergeLeafURI = DeepMergeLeafURI.asInstanceOf[js.Any], DeepMergeMapsDefaultURI = DeepMergeMapsDefaultURI.asInstanceOf[js.Any], DeepMergeRecordsDefaultURI = DeepMergeRecordsDefaultURI.asInstanceOf[js.Any], DeepMergeSetsDefaultURI = DeepMergeSetsDefaultURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepMergeMergeFunctionURItoKind[Ts, MF, M]]
    }
    
    extension [Self <: DeepMergeMergeFunctionURItoKind[?, ?, ?], Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M](x: Self & (DeepMergeMergeFunctionURItoKind[Ts, MF, M])) {
      
      inline def setDeepMergeArraysDefaultURI(value: DeepMergeArraysDefaultHKT[Ts, MF, M]): Self = StObject.set(x, "DeepMergeArraysDefaultURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeLeafURI(value: DeepMergeLeaf[Ts]): Self = StObject.set(x, "DeepMergeLeafURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeMapsDefaultURI(value: DeepMergeMapsDefaultHKT[Ts]): Self = StObject.set(x, "DeepMergeMapsDefaultURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeRecordsDefaultURI(value: DeepMergeRecordsDefaultHKT[Ts, MF, M]): Self = StObject.set(x, "DeepMergeRecordsDefaultURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeSetsDefaultURI(value: DeepMergeSetsDefaultHKT[Ts]): Self = StObject.set(x, "DeepMergeSetsDefaultURI", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The utils provided to the merge functions.
    */
  /* Inlined std.Readonly<{  mergeFunctions :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>,   defaultMergeFunctions :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionsDefaults,   metaDataUpdater :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.MetaDataUpdater<M, MM>, deepmerge <Ts extends std.ReadonlyArray<unknown>>(values : Ts): unknown,   useImplicitDefaultMerging :boolean,   actions :std.Readonly<{  defaultMerge :symbol,   skip :symbol}>}> */
  @js.native
  trait DeepMergeMergeFunctionUtils[M, MM /* <: DeepMergeBuiltInMetaData */] extends StObject {
    
    val actions: ReadonlydefaultMergesymbo = js.native
    
    def deepmerge[Ts /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type Ts is not an array type */ values: Ts
    ): Any = js.native
    
    val defaultMergeFunctions: DeepMergeMergeFunctionsDefaults = js.native
    
    val mergeFunctions: DeepMergeMergeFunctions[M, MM] = js.native
    
    def metaDataUpdater(previousMeta: M, metaMeta: Partial[MM]): M = js.native
    def metaDataUpdater(previousMeta: Unit, metaMeta: Partial[MM]): M = js.native
    
    val useImplicitDefaultMerging: Boolean = js.native
  }
  
  /**
    * All the merge functions that deepmerge uses.
    */
  /* Inlined std.Readonly<{mergeRecords <Ts extends std.ReadonlyArray<std.Readonly<std.Record<std.PropertyKey, unknown>>>, U extends deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionUtils<M, MM>>(records : Ts, utils : U, meta : M | undefined): unknown, mergeArrays <Ts extends std.ReadonlyArray<std.ReadonlyArray<unknown>>, U extends deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionUtils<M, MM>>(records : Ts, utils : U, meta : M | undefined): unknown, mergeMaps <Ts extends std.ReadonlyArray<std.Readonly<std.ReadonlyMap<unknown, unknown>>>, U extends deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionUtils<M, MM>>(records : Ts, utils : U, meta : M | undefined): unknown, mergeSets <Ts extends std.ReadonlyArray<std.Readonly<std.ReadonlySet<unknown>>>, U extends deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionUtils<M, MM>>(records : Ts, utils : U, meta : M | undefined): unknown, mergeOthers <Ts extends std.ReadonlyArray<unknown>, U extends deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionUtils<M, MM>>(records : Ts, utils : U, meta : M | undefined): unknown}> */
  @js.native
  trait DeepMergeMergeFunctions[M, MM /* <: DeepMergeBuiltInMetaData */] extends StObject {
    
    def mergeArrays[Ts /* <: js.Array[js.Array[Any]] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
    def mergeArrays[Ts /* <: js.Array[js.Array[Any]] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
    
    def mergeMaps[Ts /* <: js.Array[ReadonlyReadonlyMapunknow] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
    def mergeMaps[Ts /* <: js.Array[ReadonlyReadonlyMapunknow] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
    
    def mergeOthers[Ts /* <: js.Array[Any] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
    def mergeOthers[Ts /* <: js.Array[Any] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
    
    def mergeRecords[Ts /* <: js.Array[Record[PropertyKey, Any]] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
    def mergeRecords[Ts /* <: js.Array[Record[PropertyKey, Any]] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
    
    def mergeSets[Ts /* <: js.Array[ReadonlyReadonlySetunknow] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
    def mergeSets[Ts /* <: js.Array[ReadonlyReadonlySetunknow] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
  }
  
  /**
    * The default merge functions to use when deep merging.
    */
  /* Inlined std.Readonly<{  DeepMergeRecordsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsDefaultURI,   DeepMergeArraysURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysDefaultURI,   DeepMergeSetsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeSetsDefaultURI,   DeepMergeMapsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMapsDefaultURI,   DeepMergeOthersURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeLeafURI}> */
  trait DeepMergeMergeFunctionsDefaultURIs extends StObject {
    
    val DeepMergeArraysURI: DeepMergeArraysDefaultURI
    
    val DeepMergeMapsURI: DeepMergeMapsDefaultURI
    
    val DeepMergeOthersURI: DeepMergeLeafURI
    
    val DeepMergeRecordsURI: DeepMergeRecordsDefaultURI
    
    val DeepMergeSetsURI: DeepMergeSetsDefaultURI
  }
  object DeepMergeMergeFunctionsDefaultURIs {
    
    inline def apply(
      DeepMergeArraysURI: DeepMergeArraysDefaultURI,
      DeepMergeMapsURI: DeepMergeMapsDefaultURI,
      DeepMergeOthersURI: DeepMergeLeafURI,
      DeepMergeRecordsURI: DeepMergeRecordsDefaultURI,
      DeepMergeSetsURI: DeepMergeSetsDefaultURI
    ): DeepMergeMergeFunctionsDefaultURIs = {
      val __obj = js.Dynamic.literal(DeepMergeArraysURI = DeepMergeArraysURI.asInstanceOf[js.Any], DeepMergeMapsURI = DeepMergeMapsURI.asInstanceOf[js.Any], DeepMergeOthersURI = DeepMergeOthersURI.asInstanceOf[js.Any], DeepMergeRecordsURI = DeepMergeRecordsURI.asInstanceOf[js.Any], DeepMergeSetsURI = DeepMergeSetsURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepMergeMergeFunctionsDefaultURIs]
    }
    
    extension [Self <: DeepMergeMergeFunctionsDefaultURIs](x: Self) {
      
      inline def setDeepMergeArraysURI(value: DeepMergeArraysDefaultURI): Self = StObject.set(x, "DeepMergeArraysURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeMapsURI(value: DeepMergeMapsDefaultURI): Self = StObject.set(x, "DeepMergeMapsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeOthersURI(value: DeepMergeLeafURI): Self = StObject.set(x, "DeepMergeOthersURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeRecordsURI(value: DeepMergeRecordsDefaultURI): Self = StObject.set(x, "DeepMergeRecordsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeSetsURI(value: DeepMergeSetsDefaultURI): Self = StObject.set(x, "DeepMergeSetsURI", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The default merge functions.
    */
  trait DeepMergeMergeFunctionsDefaults extends StObject
  
  /**
    * The merge functions to use when deep merging.
    */
  /* Inlined std.Readonly<{  DeepMergeRecordsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURIs,   DeepMergeArraysURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURIs,   DeepMergeSetsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURIs,   DeepMergeMapsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURIs,   DeepMergeOthersURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURIs}> */
  trait DeepMergeMergeFunctionsURIs extends StObject {
    
    val DeepMergeArraysURI: DeepMergeMergeFunctionURIs
    
    val DeepMergeMapsURI: DeepMergeMergeFunctionURIs
    
    val DeepMergeOthersURI: DeepMergeMergeFunctionURIs
    
    val DeepMergeRecordsURI: DeepMergeMergeFunctionURIs
    
    val DeepMergeSetsURI: DeepMergeMergeFunctionURIs
  }
  object DeepMergeMergeFunctionsURIs {
    
    inline def apply(
      DeepMergeArraysURI: DeepMergeMergeFunctionURIs,
      DeepMergeMapsURI: DeepMergeMergeFunctionURIs,
      DeepMergeOthersURI: DeepMergeMergeFunctionURIs,
      DeepMergeRecordsURI: DeepMergeMergeFunctionURIs,
      DeepMergeSetsURI: DeepMergeMergeFunctionURIs
    ): DeepMergeMergeFunctionsURIs = {
      val __obj = js.Dynamic.literal(DeepMergeArraysURI = DeepMergeArraysURI.asInstanceOf[js.Any], DeepMergeMapsURI = DeepMergeMapsURI.asInstanceOf[js.Any], DeepMergeOthersURI = DeepMergeOthersURI.asInstanceOf[js.Any], DeepMergeRecordsURI = DeepMergeRecordsURI.asInstanceOf[js.Any], DeepMergeSetsURI = DeepMergeSetsURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepMergeMergeFunctionsURIs]
    }
    
    extension [Self <: DeepMergeMergeFunctionsURIs](x: Self) {
      
      inline def setDeepMergeArraysURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeArraysURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeMapsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeMapsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeOthersURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeOthersURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeRecordsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeRecordsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeSetsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeSetsURI", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The options the user can pass to customize deepmerge.
    */
  /* Inlined std.Partial<deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeOptionsFull<M, MM & deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeBuiltInMetaData>> */
  trait DeepMergeOptions[M, MM /* <: Record[PropertyKey, Any] */] extends StObject {
    
    var enableImplicitDefaultMerging: js.UndefOr[Boolean] = js.undefined
    
    var mergeArrays: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[js.Array[Any]], 
          /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
          /* meta */ js.UndefOr[M], 
          Any
        ]) | `false`
      ] = js.undefined
    
    var mergeMaps: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[ReadonlyReadonlyMapunknow], 
          /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
          /* meta */ js.UndefOr[M], 
          Any
        ]) | `false`
      ] = js.undefined
    
    var mergeOthers: js.UndefOr[
        js.Function3[
          /* records */ js.Array[Any], 
          /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
          /* meta */ js.UndefOr[M], 
          Any
        ]
      ] = js.undefined
    
    var mergeRecords: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[Record[PropertyKey, Any]], 
          /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
          /* meta */ js.UndefOr[M], 
          Any
        ]) | `false`
      ] = js.undefined
    
    var mergeSets: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[ReadonlyReadonlySetunknow], 
          /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
          /* meta */ js.UndefOr[M], 
          Any
        ]) | `false`
      ] = js.undefined
    
    var metaDataUpdater: js.UndefOr[MetaDataUpdater[M, MM & DeepMergeBuiltInMetaData]] = js.undefined
  }
  object DeepMergeOptions {
    
    inline def apply[M, MM /* <: Record[PropertyKey, Any] */](): DeepMergeOptions[M, MM] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepMergeOptions[M, MM]]
    }
    
    extension [Self <: DeepMergeOptions[?, ?], M, MM /* <: Record[PropertyKey, Any] */](x: Self & (DeepMergeOptions[M, MM])) {
      
      inline def setEnableImplicitDefaultMerging(value: Boolean): Self = StObject.set(x, "enableImplicitDefaultMerging", value.asInstanceOf[js.Any])
      
      inline def setEnableImplicitDefaultMergingUndefined: Self = StObject.set(x, "enableImplicitDefaultMerging", js.undefined)
      
      inline def setMergeArrays(
        value: (js.Function3[
              /* records */ js.Array[js.Array[Any]], 
              /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
              /* meta */ js.UndefOr[M], 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeArrays", value.asInstanceOf[js.Any])
      
      inline def setMergeArraysFunction3(
        value: (/* records */ js.Array[js.Array[Any]], /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], /* meta */ js.UndefOr[M]) => Any
      ): Self = StObject.set(x, "mergeArrays", js.Any.fromFunction3(value))
      
      inline def setMergeArraysUndefined: Self = StObject.set(x, "mergeArrays", js.undefined)
      
      inline def setMergeMaps(
        value: (js.Function3[
              /* records */ js.Array[ReadonlyReadonlyMapunknow], 
              /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
              /* meta */ js.UndefOr[M], 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeMaps", value.asInstanceOf[js.Any])
      
      inline def setMergeMapsFunction3(
        value: (/* records */ js.Array[ReadonlyReadonlyMapunknow], /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], /* meta */ js.UndefOr[M]) => Any
      ): Self = StObject.set(x, "mergeMaps", js.Any.fromFunction3(value))
      
      inline def setMergeMapsUndefined: Self = StObject.set(x, "mergeMaps", js.undefined)
      
      inline def setMergeOthers(
        value: (/* records */ js.Array[Any], /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], /* meta */ js.UndefOr[M]) => Any
      ): Self = StObject.set(x, "mergeOthers", js.Any.fromFunction3(value))
      
      inline def setMergeOthersUndefined: Self = StObject.set(x, "mergeOthers", js.undefined)
      
      inline def setMergeRecords(
        value: (js.Function3[
              /* records */ js.Array[Record[PropertyKey, Any]], 
              /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
              /* meta */ js.UndefOr[M], 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeRecords", value.asInstanceOf[js.Any])
      
      inline def setMergeRecordsFunction3(
        value: (/* records */ js.Array[Record[PropertyKey, Any]], /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], /* meta */ js.UndefOr[M]) => Any
      ): Self = StObject.set(x, "mergeRecords", js.Any.fromFunction3(value))
      
      inline def setMergeRecordsUndefined: Self = StObject.set(x, "mergeRecords", js.undefined)
      
      inline def setMergeSets(
        value: (js.Function3[
              /* records */ js.Array[ReadonlyReadonlySetunknow], 
              /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], 
              /* meta */ js.UndefOr[M], 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeSets", value.asInstanceOf[js.Any])
      
      inline def setMergeSetsFunction3(
        value: (/* records */ js.Array[ReadonlyReadonlySetunknow], /* utils */ DeepMergeMergeFunctionUtils[M, MM & DeepMergeBuiltInMetaData], /* meta */ js.UndefOr[M]) => Any
      ): Self = StObject.set(x, "mergeSets", js.Any.fromFunction3(value))
      
      inline def setMergeSetsUndefined: Self = StObject.set(x, "mergeSets", js.undefined)
      
      inline def setMetaDataUpdater(
        value: (/* previousMeta */ js.UndefOr[M], /* metaMeta */ Partial[MM & DeepMergeBuiltInMetaData]) => M
      ): Self = StObject.set(x, "metaDataUpdater", js.Any.fromFunction2(value))
      
      inline def setMetaDataUpdaterUndefined: Self = StObject.set(x, "metaDataUpdater", js.undefined)
    }
  }
  
  /**
    * All the options the user can pass to customize deepmerge.
    */
  /* Inlined std.Readonly<{  mergeRecords :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>['mergeRecords'] | false,   mergeArrays :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>['mergeArrays'] | false,   mergeMaps :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>['mergeMaps'] | false,   mergeSets :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>['mergeSets'] | false,   mergeOthers :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>['mergeOthers'],   metaDataUpdater :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.MetaDataUpdater<M, MM>,   enableImplicitDefaultMerging :boolean}> */
  @js.native
  trait DeepMergeOptionsFull[M, MM /* <: DeepMergeBuiltInMetaData */] extends StObject {
    
    val enableImplicitDefaultMerging: Boolean = js.native
    
    val mergeArrays: (js.Function3[
        /* records */ js.Array[js.Array[Any]], 
        /* utils */ DeepMergeMergeFunctionUtils[M, MM], 
        /* meta */ js.UndefOr[M], 
        Any
      ]) | `false` = js.native
    
    val mergeMaps: (js.Function3[
        /* records */ js.Array[ReadonlyReadonlyMapunknow], 
        /* utils */ DeepMergeMergeFunctionUtils[M, MM], 
        /* meta */ js.UndefOr[M], 
        Any
      ]) | `false` = js.native
    
    def mergeOthers[Ts /* <: js.Array[Any] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U): Any = js.native
    def mergeOthers[Ts /* <: js.Array[Any] */, U /* <: DeepMergeMergeFunctionUtils[M, MM] */](records: Ts, utils: U, meta: M): Any = js.native
    
    val mergeRecords: (js.Function3[
        /* records */ js.Array[Record[PropertyKey, Any]], 
        /* utils */ DeepMergeMergeFunctionUtils[M, MM], 
        /* meta */ js.UndefOr[M], 
        Any
      ]) | `false` = js.native
    
    val mergeSets: (js.Function3[
        /* records */ js.Array[ReadonlyReadonlySetunknow], 
        /* utils */ DeepMergeMergeFunctionUtils[M, MM], 
        /* meta */ js.UndefOr[M], 
        Any
      ]) | `false` = js.native
    
    def metaDataUpdater(previousMeta: M, metaMeta: Partial[MM]): M = js.native
    def metaDataUpdater(previousMeta: Unit, metaMeta: Partial[MM]): M = js.native
  }
  
  /**
    * Deep merge other things.
    */
  type DeepMergeOthersHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = DeepMergeMergeFunctionKind[
    /* import warning: importer.ImportType#apply Failed type conversion: MF['DeepMergeOthersURI'] */ js.Any, 
    Ts, 
    MF, 
    M
  ]
  
  /**
    * Deep merge records.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ts extends std.Readonly<[unknown, .../ * Inlined std.Readonly<std.ReadonlyArray<unknown>> * /
  {readonly map <U>(callbackfn : (value : unknown, index : number, array : std.Array<unknown>): U): std.Array<U>,  readonly length :number, readonly entries (): std.IterableIterator<[number, unknown]>, readonly join (): string, readonly keys (): std.IterableIterator<number>, readonly forEach (callbackfn : (value : unknown, index : number, array : std.Array<unknown>): void): void, readonly concat (items : ...std.ConcatArray<unknown>): std.Array<unknown>, readonly includes (searchElement : unknown): boolean, readonly slice (): std.Array<unknown>, readonly flat <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>>, readonly some (predicate : (value : unknown, index : number, array : std.Array<unknown>): unknown): boolean, readonly at (index : number): unknown | undefined, readonly filter <S extends unknown>(predicate : (value : unknown, index : number, array : std.Array<unknown>): value is S): std.Array<S>, readonly toString (): string, readonly indexOf (searchElement : unknown): number, readonly reduceRight (callbackfn : (previousValue : unknown, currentValue : unknown, currentIndex : number, array : std.Array<unknown>): unknown): unknown, readonly findIndex (predicate : (value : unknown, index : number, obj : std.Array<unknown>): unknown): number, readonly reduce (callbackfn : (previousValue : unknown, currentValue : unknown, currentIndex : number, array : std.Array<unknown>): unknown): unknown, readonly values (): std.IterableIterator<unknown>, readonly flatMap <U, This = undefined>(callback : (this : This, value : unknown, index : number, array : std.Array<unknown>): U | std.ReadonlyArray<U>): std.Array<U>, readonly toLocaleString (): string, readonly every <S extends unknown>(predicate : (value : unknown, index : number, array : std.Array<unknown>): value is S): this is std.Array<S>, readonly lastIndexOf (searchElement : unknown): number, readonly find <S extends unknown>(predicate : (this : void, value : unknown, index : number, obj : std.Array<unknown>): value is S): S | undefined}]> ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.FlatternAlias<std.Omit<deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsDefaultHKTInternalProps<Ts, MF, M>, deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.BlacklistedRecordProps>> : {}
    }}}
    */
  type DeepMergeRecordsDefaultHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = FlatternAlias[Omit[DeepMergeRecordsDefaultHKTInternalProps[Ts, MF, M], BlacklistedRecordProps]]
  
  /**
    * Get the value of the property.
    */
  type DeepMergeRecordsDefaultHKTInternalPropValue[Ts /* <: Array[Any] */, K /* <: PropertyKey */, M] = FilterOutNever[DeepMergeRecordsDefaultHKTInternalPropValueHelper[Ts, K, M, js.Array[Any]]]
  
  /**
    * Tail-recursive helper type for DeepMergeRecordsDefaultHKTInternalPropValue.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Ts extends [infer Head, ...infer Rest] ? Head extends std.Readonly<std.Record<std.PropertyKey, unknown>> ? Rest extends [unknown, ...std.ReadonlyArray<unknown>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsDefaultHKTInternalPropValueHelper<Rest, K, M, [...Acc, deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.ValueOfKey<Head, K>]> : [...Acc, deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.ValueOfKey<Head, K>] : never : never
    }}}
    */
  @js.native
  trait DeepMergeRecordsDefaultHKTInternalPropValueHelper[Ts /* <: Array[Any] */, K /* <: PropertyKey */, M, Acc /* <: js.Array[Any] */] extends StObject
  
  /**
    * Deep merge record props.
    */
  @js.native
  trait DeepMergeRecordsDefaultHKTInternalProps[Ts /* <: Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] extends StObject
  
  /**
    * The default merge function to merge records with.
    */
  type DeepMergeRecordsDefaultURI = typings.deepmergeTs.deepmergeTsStrings.DeepMergeRecordsDefaultURI
  
  /**
    * Deep merge records.
    */
  type DeepMergeRecordsHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = DeepMergeMergeFunctionKind[
    /* import warning: importer.ImportType#apply Failed type conversion: MF['DeepMergeRecordsURI'] */ js.Any, 
    Ts, 
    MF, 
    M
  ]
  
  /**
    * Deep merge 2 sets.
    */
  type DeepMergeSetsDefaultHKT[Ts /* <: js.Array[Any] */] = Set[UnionSetValues[Ts]]
  
  /**
    * The default merge function to merge sets with.
    */
  type DeepMergeSetsDefaultURI = typings.deepmergeTs.deepmergeTsStrings.DeepMergeSetsDefaultURI
  
  /**
    * Deep merge sets.
    */
  type DeepMergeSetsHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = DeepMergeMergeFunctionKind[
    /* import warning: importer.ImportType#apply Failed type conversion: MF['DeepMergeSetsURI'] */ js.Any, 
    Ts, 
    MF, 
    M
  ]
  
  /**
    * Returns whether or not all the given types are arrays.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ts extends [infer T1] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsArray<T1> : Ts extends [infer Head, ...infer Rest] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsArray<Head> extends true ? Rest extends [unknown, ...std.ReadonlyArray<unknown>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsArray<Rest> : false : false : false
    }}}
    */
  type EveryIsArray[Ts /* <: js.Array[Any] */] = `false`
  
  /**
    * Returns whether or not all the given types are maps.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ts extends std.Readonly<[infer T1]> ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsMap<T1> : Ts extends [infer Head, ...infer Rest] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsMap<Head> extends true ? Rest extends [unknown, ...std.ReadonlyArray<unknown>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsMap<Rest> : false : false : false
    }}}
    */
  type EveryIsMap[Ts /* <: js.Array[Any] */] = `false`
  
  /**
    * Returns whether or not all the given types are records.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ts extends [infer Head, ...infer Rest] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsRecord<Head> extends true ? Rest extends std.ReadonlyArray<unknown> ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsRecord<Rest> : true : false : true
    }}}
    */
  type EveryIsRecord[Ts /* <: js.Array[Any] */] = `true`
  
  /**
    * Returns whether or not all the given types are sets.
    *
    * Note: This may also return true if all are maps.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ts extends std.Readonly<[infer T1]> ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsSet<T1> : Ts extends [infer Head, ...infer Rest] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsSet<Head> extends true ? Rest extends [unknown, ...std.ReadonlyArray<unknown>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.EveryIsSet<Rest> : false : false : false
    }}}
    */
  type EveryIsSet[Ts /* <: js.Array[Any] */] = `false`
  
  /**
    * Filter out nevers from a tuple.
    */
  type FilterOutNever[T /* <: js.Array[Any] */] = FilterOutNeverHelper[T, js.Array[Any]]
  
  /**
    * Tail-recursive helper type for FilterOutNever.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [] ? Acc : T extends [infer Head, ...infer Rest] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsNever<Head> extends true ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.FilterOutNeverHelper<Rest, Acc> : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.FilterOutNeverHelper<Rest, [...Acc, Head]> : T
    }}}
    */
  type FilterOutNeverHelper[T /* <: js.Array[Any] */, Acc /* <: js.Array[Any] */] = Acc
  
  type FlatternAlias[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]} */ js.Any
  
  /**
    * Get the merge functions with defaults apply from the given subset.
    */
  /* Inlined std.Readonly<{  DeepMergeRecordsURI :PMF['DeepMergeRecordsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeRecordsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsDefaultURI,   DeepMergeArraysURI :PMF['DeepMergeArraysURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeArraysURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysDefaultURI,   DeepMergeSetsURI :PMF['DeepMergeSetsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeSetsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeSetsDefaultURI,   DeepMergeMapsURI :PMF['DeepMergeMapsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeMapsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMapsDefaultURI,   DeepMergeOthersURI :PMF['DeepMergeOthersURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeOthersURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeLeafURI}> */
  trait GetDeepMergeMergeFunctionsURIs[PMF /* <: PartialDeepMergeMergeFunc */] extends StObject {
    
    val DeepMergeArraysURI: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeArraysURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeArraysURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysDefaultURI */ js.Any
    
    val DeepMergeMapsURI: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeMapsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeMapsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMapsDefaultURI */ js.Any
    
    val DeepMergeOthersURI: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeOthersURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeOthersURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeLeafURI */ js.Any
    
    val DeepMergeRecordsURI: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeRecordsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeRecordsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsDefaultURI */ js.Any
    
    val DeepMergeSetsURI: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeSetsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeSetsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeSetsDefaultURI */ js.Any
  }
  object GetDeepMergeMergeFunctionsURIs {
    
    inline def apply[PMF /* <: PartialDeepMergeMergeFunc */](
      DeepMergeArraysURI: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeArraysURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeArraysURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysDefaultURI */ js.Any,
      DeepMergeMapsURI: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeMapsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeMapsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMapsDefaultURI */ js.Any,
      DeepMergeOthersURI: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeOthersURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeOthersURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeLeafURI */ js.Any,
      DeepMergeRecordsURI: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeRecordsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeRecordsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsDefaultURI */ js.Any,
      DeepMergeSetsURI: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeSetsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeSetsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeSetsDefaultURI */ js.Any
    ): GetDeepMergeMergeFunctionsURIs[PMF] = {
      val __obj = js.Dynamic.literal(DeepMergeArraysURI = DeepMergeArraysURI.asInstanceOf[js.Any], DeepMergeMapsURI = DeepMergeMapsURI.asInstanceOf[js.Any], DeepMergeOthersURI = DeepMergeOthersURI.asInstanceOf[js.Any], DeepMergeRecordsURI = DeepMergeRecordsURI.asInstanceOf[js.Any], DeepMergeSetsURI = DeepMergeSetsURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDeepMergeMergeFunctionsURIs[PMF]]
    }
    
    extension [Self <: GetDeepMergeMergeFunctionsURIs[?], PMF /* <: PartialDeepMergeMergeFunc */](x: Self & GetDeepMergeMergeFunctionsURIs[PMF]) {
      
      inline def setDeepMergeArraysURI(
        value: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeArraysURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeArraysURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysDefaultURI */ js.Any
      ): Self = StObject.set(x, "DeepMergeArraysURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeMapsURI(
        value: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeMapsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeMapsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMapsDefaultURI */ js.Any
      ): Self = StObject.set(x, "DeepMergeMapsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeOthersURI(
        value: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeOthersURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeOthersURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeLeafURI */ js.Any
      ): Self = StObject.set(x, "DeepMergeOthersURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeRecordsURI(
        value: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeRecordsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeRecordsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsDefaultURI */ js.Any
      ): Self = StObject.set(x, "DeepMergeRecordsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeSetsURI(
        value: /* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeSetsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeSetsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeSetsDefaultURI */ js.Any
      ): Self = StObject.set(x, "DeepMergeSetsURI", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Safely test whether or not the first given types extends the second.
    *
    * Needed in particular for testing if a type is "never".
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T1] extends [T2] ? true : false
    }}}
    */
  type Is[T1, T2] = `true`
  
  /**
    * Returns whether or not the given type is an array.
    */
  type IsArray[T] = And[
    Not[IsNever[T]], 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.ReadonlyArray<unknown> ? true : false */ js.Any
  ]
  
  /**
    * Returns whether or not the given type is an map.
    */
  type IsMap[T] = And[
    Not[IsNever[T]], 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Readonly<std.ReadonlyMap<unknown, unknown>> * /
  {readonly entries (): std.IterableIterator<[unknown, unknown]>,  readonly size :number, readonly keys (): std.IterableIterator<unknown>, readonly forEach (callbackfn : (value : unknown, key : unknown, map : std.ReadonlyMap<unknown, unknown>): void): void, readonly has (key : unknown): boolean, readonly values (): std.IterableIterator<unknown>, readonly get (key : unknown): unknown | undefined} ? true : false */ js.Any
  ]
  
  /**
    * Safely test whether or not the given type is "never".
    */
  type IsNever[T] = Is[T, scala.Nothing]
  
  /**
    * Returns whether or not the given type a record.
    */
  type IsRecord[T] = And[
    Not[IsNever[T]], 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Readonly<std.Record<std.PropertyKey, unknown>> ? true : false */ js.Any
  ]
  
  /**
    * Returns whether or not the given type is an set.
    *
    * Note: This may also return true for Maps.
    */
  type IsSet[T] = And[
    Not[IsNever[T]], 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Readonly<std.ReadonlySet<unknown>> * /
  {readonly entries (): std.IterableIterator<[unknown, unknown]>,  readonly size :number, readonly keys (): std.IterableIterator<unknown>, readonly forEach (callbackfn : (value : unknown, value2 : unknown, set : std.ReadonlySet<unknown>): void): void, readonly has (value : unknown): boolean, readonly values (): std.IterableIterator<unknown>} ? true : false */ js.Any
  ]
  
  /**
    * Is the type a tuple?
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [] ? true : T extends [unknown, ...std.ReadonlyArray<unknown>] ? true : false
    }}}
    */
  type IsTuple[T /* <: js.Array[Any] */] = `true`
  
  /**
    * Get the keys of the type what match a certain criteria.
    */
  type KeysOfType[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends U? K : never}[keyof T] */ js.Any
  
  type MetaDataUpdater[M, MM /* <: DeepMergeBuiltInMetaData */] = js.Function2[/* previousMeta */ js.UndefOr[M], /* metaMeta */ Partial[MM], M]
  
  /**
    * Not operator for types.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends true ? false : true
    }}}
    */
  type Not[T /* <: Boolean */] = `false`
  
  /**
    * Get the optional keys of the type.
    */
  type OptionalKeys[T] = Exclude[/* keyof T */ String, RequiredKeys[T]]
  
  /**
    * Get all the optional keys on the types in the tuple.
    */
  type OptionalKeysOf[Ts /* <: Array[Any] */] = OptionalKeysOfHelper[Ts, scala.Nothing]
  
  /**
    * Tail-recursive helper type for OptionalKeysOf.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ts extends [infer Head, ...infer Rest] ? Head extends std.Record<std.PropertyKey, unknown> ? Rest extends [unknown, ...std.ReadonlyArray<unknown>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.OptionalKeysOfHelper<Rest, Acc | deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.OptionalKeys<Head>> : Acc | deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.OptionalKeys<Head> : never : Acc
    }}}
    */
  type OptionalKeysOfHelper[Ts /* <: Array[Any] */, Acc] = Acc
  
  /**
    * Get the required keys of the type.
    */
  type RequiredKeys[T] = Exclude[
    KeysOfType[
      T, 
      Exclude[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
        Unit
      ]
    ], 
    Unit
  ]
  
  /**
    * Get all the required keys on the types in the tuple.
    */
  type RequiredKeysOf[Ts /* <: Array[Any] */] = RequiredKeysOfHelper[Ts, scala.Nothing]
  
  /**
    * Tail-recursive helper type for RequiredKeysOf.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ts extends [infer Head, ...infer Rest] ? Head extends std.Record<std.PropertyKey, unknown> ? Rest extends [unknown, ...std.ReadonlyArray<unknown>] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.RequiredKeysOfHelper<Rest, Acc | deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.RequiredKeys<Head>> : Acc | deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.RequiredKeys<Head> : never : Acc
    }}}
    */
  type RequiredKeysOfHelper[Ts /* <: Array[Any] */, Acc] = Acc
  
  /**
    * Union of the maps' values' types
    */
  type UnionMapKeys[Ts /* <: js.Array[Any] */] = UnionMapKeysHelper[Ts, scala.Nothing]
  
  /**
    * Tail-recursive helper type for UnionMapKeys.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ts extends [infer Head, ...infer Rest] ? Head extends / * Inlined std.Readonly<std.ReadonlyMap<infer K1, unknown>> * /
  {readonly entries (): std.IterableIterator<[infer K1, unknown]>,  readonly size :number, readonly keys (): std.IterableIterator<infer K1>, readonly forEach (callbackfn : (value : unknown, key : infer K1, map : std.ReadonlyMap<infer K1, unknown>): void): void, readonly has (key : infer K1): boolean, readonly values (): std.IterableIterator<unknown>, readonly get (key : infer K1): unknown | undefined} ? Rest extends [] ? Acc | K1 : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.UnionMapKeysHelper<Rest, Acc | K1> : never : Acc
    }}}
    */
  type UnionMapKeysHelper[Ts /* <: js.Array[Any] */, Acc] = Acc
  
  /**
    * Union of the maps' keys' types
    */
  type UnionMapValues[Ts /* <: js.Array[Any] */] = UnionMapValuesHelper[Ts, scala.Nothing]
  
  /**
    * Tail-recursive helper type for UnionMapValues.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ts extends [infer Head, ...infer Rest] ? Head extends / * Inlined std.Readonly<std.ReadonlyMap<unknown, infer V1>> * /
  {readonly entries (): std.IterableIterator<[unknown, infer V1]>,  readonly size :number, readonly keys (): std.IterableIterator<unknown>, readonly forEach (callbackfn : (value : infer V1, key : unknown, map : std.ReadonlyMap<unknown, infer V1>): void): void, readonly has (key : unknown): boolean, readonly values (): std.IterableIterator<infer V1>, readonly get (key : unknown): infer V1 | undefined} ? Rest extends [] ? Acc | V1 : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.UnionMapValuesHelper<Rest, Acc | V1> : never : Acc
    }}}
    */
  type UnionMapValuesHelper[Ts /* <: js.Array[Any] */, Acc] = Acc
  
  /**
    * Union of the sets' values' types
    */
  type UnionSetValues[Ts /* <: js.Array[Any] */] = UnionSetValuesHelper[Ts, scala.Nothing]
  
  /**
    * Tail-recursive helper type for UnionSetValues.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ts extends [infer Head, ...infer Rest] ? Head extends / * Inlined std.Readonly<std.ReadonlySet<infer V1>> * /
  {readonly entries (): std.IterableIterator<[infer V1, infer V1]>,  readonly size :number, readonly keys (): std.IterableIterator<infer V1>, readonly forEach (callbackfn : (value : infer V1, value2 : infer V1, set : std.ReadonlySet<infer V1>): void): void, readonly has (value : infer V1): boolean, readonly values (): std.IterableIterator<infer V1>} ? Rest extends std.ReadonlyArray<unknown> ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.UnionSetValuesHelper<Rest, Acc | V1> : Acc | V1 : never : Acc
    }}}
    */
  type UnionSetValuesHelper[Ts /* <: js.Array[Any] */, Acc] = Acc
  
  /**
    * Get the value of the given key in the given object.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    K extends keyof T ? T[K] : never
    }}}
    */
  @js.native
  trait ValueOfKey[T /* <: Record[PropertyKey, Any] */, K /* <: PropertyKey */] extends StObject
}
