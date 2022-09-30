package typings.deepmergeTs

import org.scalablytyped.runtime.TopLevel
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

object v46Mod {
  
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
  type And[T1 /* <: Boolean */, T2 /* <: Boolean */] = T2 | `false`
  
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
  type DeepMergeArraysDefaultHKTHelper[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M, Acc /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c repeated non-array type: Acc */ js.Array[Acc]
  
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
  type DeepMergeHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = js.UndefOr[
    Any | (DeepMergeOthersHKT[Ts, MF, M]) | (DeepMergeRecordsHKT[Ts, MF, M]) | (DeepMergeSetsHKT[Ts, MF, M]) | (DeepMergeMapsHKT[Ts, MF, M]) | (DeepMergeArraysHKT[Ts, MF, M])
  ]
  
  /**
    * Get the leaf type from many types that can't be merged.
    */
  type DeepMergeLeaf[Ts /* <: js.Array[Any] */] = Any
  
  /**
    * Get the leaf type from many types that can't be merged.
    *
    * @deprecated Use `DeepMergeLeaf` instead.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped Ts extends [] ? never : Ts extends [infer T] ? any : Ts extends [...infer Rest, infer Tail] ? deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.IsNever<any> extends true ? any extends std.ReadonlyArray<unknown> ? any : never : any : never */ trait DeepMergeLeafHKT[Ts /* <: js.Array[Any] */] extends StObject
  
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
      
      inline def setDeepMergeArraysDefaultURIVarargs(value: js.Array[Any]*): Self = StObject.set(x, "DeepMergeArraysDefaultURI", js.Array(value*))
      
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
  type DeepMergeRecordsDefaultHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = js.Object | (FlatternAlias[Omit[DeepMergeRecordsDefaultHKTInternalProps[Ts, MF, M], BlacklistedRecordProps]])
  
  /**
    * Get the value of the property.
    */
  type DeepMergeRecordsDefaultHKTInternalPropValue[Ts /* <: Array[Any] */, K /* <: PropertyKey */, M] = FilterOutNever[DeepMergeRecordsDefaultHKTInternalPropValueHelper[Ts, K, M, js.Array[Any]]]
  
  /**
    * Tail-recursive helper type for DeepMergeRecordsDefaultHKTInternalPropValue.
    */
  type DeepMergeRecordsDefaultHKTInternalPropValueHelper[Ts /* <: Array[Any] */, K /* <: PropertyKey */, M, Acc /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c repeated non-array type: Acc */ js.Array[Acc]
  
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
  type EveryIsArray[Ts /* <: js.Array[Any] */] = `false` | IsArray[Any]
  
  /**
    * Returns whether or not all the given types are maps.
    */
  type EveryIsMap[Ts /* <: js.Array[Any] */] = `false` | IsMap[Any]
  
  /**
    * Returns whether or not all the given types are records.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.deepmergeTs.deepmergeTsBooleans.`true`
    - typings.deepmergeTs.deepmergeTsBooleans.`false`
  */
  trait EveryIsRecord[Ts /* <: js.Array[Any] */] extends StObject
  
  /**
    * Returns whether or not all the given types are sets.
    *
    * Note: This may also return true if all are maps.
    */
  type EveryIsSet[Ts /* <: js.Array[Any] */] = `false` | IsSet[Any]
  
  /**
    * Filter out nevers from a tuple.
    */
  type FilterOutNever[T /* <: js.Array[Any] */] = FilterOutNeverHelper[T, js.Array[Any]]
  
  /**
    * Tail-recursive helper type for FilterOutNever.
    */
  type FilterOutNeverHelper[T /* <: js.Array[Any] */, Acc /* <: js.Array[Any] */] = T | Any | Acc
  
  type FlatternAlias[T] = typings.deepmergeTs.deepmergeTsStrings.FlatternAlias & TopLevel[T] & js.Object
  
  /**
    * Get the merge functions with defaults apply from the given subset.
    */
  /* Inlined std.Readonly<{  DeepMergeRecordsURI :PMF['DeepMergeRecordsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeRecordsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsDefaultURI,   DeepMergeArraysURI :PMF['DeepMergeArraysURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeArraysURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysDefaultURI,   DeepMergeSetsURI :PMF['DeepMergeSetsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeSetsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeSetsDefaultURI,   DeepMergeMapsURI :PMF['DeepMergeMapsURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeMapsURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMapsDefaultURI,   DeepMergeOthersURI :PMF['DeepMergeOthersURI'] extends keyof deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<any, any, any> ? PMF['DeepMergeOthersURI'] : deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeLeafURI}> */
  trait GetDeepMergeMergeFunctionsURIs[PMF /* <: PartialDeepMergeMergeFunc */] extends StObject {
    
    val DeepMergeArraysURI: DeepMergeArraysDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeArraysURI'] */ js.Any)
    
    val DeepMergeMapsURI: DeepMergeMapsDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeMapsURI'] */ js.Any)
    
    val DeepMergeOthersURI: DeepMergeLeafURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeOthersURI'] */ js.Any)
    
    val DeepMergeRecordsURI: DeepMergeRecordsDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeRecordsURI'] */ js.Any)
    
    val DeepMergeSetsURI: DeepMergeSetsDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeSetsURI'] */ js.Any)
  }
  object GetDeepMergeMergeFunctionsURIs {
    
    inline def apply[PMF /* <: PartialDeepMergeMergeFunc */](
      DeepMergeArraysURI: DeepMergeArraysDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeArraysURI'] */ js.Any),
      DeepMergeMapsURI: DeepMergeMapsDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeMapsURI'] */ js.Any),
      DeepMergeOthersURI: DeepMergeLeafURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeOthersURI'] */ js.Any),
      DeepMergeRecordsURI: DeepMergeRecordsDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeRecordsURI'] */ js.Any),
      DeepMergeSetsURI: DeepMergeSetsDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeSetsURI'] */ js.Any)
    ): GetDeepMergeMergeFunctionsURIs[PMF] = {
      val __obj = js.Dynamic.literal(DeepMergeArraysURI = DeepMergeArraysURI.asInstanceOf[js.Any], DeepMergeMapsURI = DeepMergeMapsURI.asInstanceOf[js.Any], DeepMergeOthersURI = DeepMergeOthersURI.asInstanceOf[js.Any], DeepMergeRecordsURI = DeepMergeRecordsURI.asInstanceOf[js.Any], DeepMergeSetsURI = DeepMergeSetsURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDeepMergeMergeFunctionsURIs[PMF]]
    }
    
    extension [Self <: GetDeepMergeMergeFunctionsURIs[?], PMF /* <: PartialDeepMergeMergeFunc */](x: Self & GetDeepMergeMergeFunctionsURIs[PMF]) {
      
      inline def setDeepMergeArraysURI(
        value: DeepMergeArraysDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeArraysURI'] */ js.Any)
      ): Self = StObject.set(x, "DeepMergeArraysURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeMapsURI(
        value: DeepMergeMapsDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeMapsURI'] */ js.Any)
      ): Self = StObject.set(x, "DeepMergeMapsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeOthersURI(
        value: DeepMergeLeafURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeOthersURI'] */ js.Any)
      ): Self = StObject.set(x, "DeepMergeOthersURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeRecordsURI(
        value: DeepMergeRecordsDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeRecordsURI'] */ js.Any)
      ): Self = StObject.set(x, "DeepMergeRecordsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeSetsURI(
        value: DeepMergeSetsDefaultURI | (/* import warning: importer.ImportType#apply Failed type conversion: PMF['DeepMergeSetsURI'] */ js.Any)
      ): Self = StObject.set(x, "DeepMergeSetsURI", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Safely test whether or not the first given types extends the second.
    *
    * Needed in particular for testing if a type is "never".
    */
  /* Rewritten from type alias, can be one of: 
    - typings.deepmergeTs.deepmergeTsBooleans.`false`
    - typings.deepmergeTs.deepmergeTsBooleans.`true`
  */
  trait Is[T1, T2] extends StObject
  
  /**
    * Returns whether or not the given type is an array.
    */
  type IsArray[T] = And[Not[IsNever[T]], `false` | `true`]
  
  /**
    * Returns whether or not the given type is an map.
    */
  type IsMap[T] = And[Not[IsNever[T]], `false` | `true`]
  
  /**
    * Safely test whether or not the given type is "never".
    */
  type IsNever[T] = Is[T, scala.Nothing]
  
  /**
    * Returns whether or not the given type a record.
    */
  type IsRecord[T] = And[Not[IsNever[T]], `false` | `true`]
  
  /**
    * Returns whether or not the given type is an set.
    *
    * Note: This may also return true for Maps.
    */
  type IsSet[T] = And[Not[IsNever[T]], `false` | `true`]
  
  /**
    * Is the type a tuple?
    */
  /* Rewritten from type alias, can be one of: 
    - typings.deepmergeTs.deepmergeTsBooleans.`false`
    - typings.deepmergeTs.deepmergeTsBooleans.`true`
  */
  trait IsTuple[T /* <: js.Array[Any] */] extends StObject
  
  /**
    * Get the keys of the type what match a certain criteria.
    */
  type KeysOfType[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends U? K : never}[keyof T] */ js.Any
  
  type MetaDataUpdater[M, MM /* <: DeepMergeBuiltInMetaData */] = js.Function2[/* previousMeta */ js.UndefOr[M], /* metaMeta */ Partial[MM], M]
  
  /**
    * Not operator for types.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.deepmergeTs.deepmergeTsBooleans.`true`
    - typings.deepmergeTs.deepmergeTsBooleans.`false`
  */
  trait Not[T /* <: Boolean */] extends StObject
  
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
  type OptionalKeysOfHelper[Ts /* <: Array[Any] */, Acc] = Acc | OptionalKeys[Any]
  
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
  type RequiredKeysOfHelper[Ts /* <: Array[Any] */, Acc] = Acc | RequiredKeys[Any]
  
  /**
    * Union of the maps' values' types
    */
  type UnionMapKeys[Ts /* <: js.Array[Any] */] = UnionMapKeysHelper[Ts, scala.Nothing]
  
  /**
    * Tail-recursive helper type for UnionMapKeys.
    */
  type UnionMapKeysHelper[Ts /* <: js.Array[Any] */, Acc] = Acc | Any
  
  /**
    * Union of the maps' keys' types
    */
  type UnionMapValues[Ts /* <: js.Array[Any] */] = UnionMapValuesHelper[Ts, scala.Nothing]
  
  /**
    * Tail-recursive helper type for UnionMapValues.
    */
  type UnionMapValuesHelper[Ts /* <: js.Array[Any] */, Acc] = Acc | Any
  
  /**
    * Union of the sets' values' types
    */
  type UnionSetValues[Ts /* <: js.Array[Any] */] = UnionSetValuesHelper[Ts, scala.Nothing]
  
  /**
    * Tail-recursive helper type for UnionSetValues.
    */
  type UnionSetValuesHelper[Ts /* <: js.Array[Any] */, Acc] = Acc | Any
  
  /**
    * Get the value of the given key in the given object.
    */
  type ValueOfKey[T /* <: Record[PropertyKey, Any] */, K /* <: PropertyKey */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
}
