package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import typings.deepmergeTs.anon.PartialDeepMergeMergeFunc
import typings.deepmergeTs.anon.ReadonlyReadonlyArrayunkn
import typings.deepmergeTs.deepmergeTsStrings.__proto__
import typings.deepmergeTs.distNodeTypesLegacyV46Mod.^
import typings.std.Exclude
import typings.std.Map
import typings.std.Partial
import typings.std.PropertyKey
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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
DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], DeepMergeBuiltInMetaData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmergeCustom")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* objects */ js.Array[Any], 
DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], DeepMergeBuiltInMetaData]]]
inline def deepmergeCustom[PMF /* <: PartialDeepMergeMergeFunc */, MetaData, MetaMetaData /* <: DeepMergeBuiltInMetaData */](options: DeepMergeOptions[MetaData, MetaMetaData], rootMetaData: MetaData): js.Function1[
/* objects */ js.Array[Any], 
DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], MetaData]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepmergeCustom")(options.asInstanceOf[js.Any], rootMetaData.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* objects */ js.Array[Any], 
DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], MetaData]]]

/**
  * Deeply merge two or more objects using the given options and meta data.
  *
  * @param options - The options on how to customize the merge function.
  * @param rootMetaData - The meta data passed to the root items' being merged.
  */
inline def deepmergeCustom_PMFMetaDataMetaMetaData[PMF /* <: PartialDeepMergeMergeFunc */, MetaData, MetaMetaData /* <: DeepMergeBuiltInMetaData */](options: DeepMergeOptions[MetaData, MetaMetaData]): js.Function1[
/* objects */ js.Array[Any], 
DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], MetaData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmergeCustom")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* objects */ js.Array[Any], 
DeepMergeHKT[js.Array[Any], GetDeepMergeMergeFunctionsURIs[PMF], MetaData]]]

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
M]

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
M]

/**
  * Get the type of the given merge function via its URI.
  */
type DeepMergeMergeFunctionKind[URI /* <: DeepMergeMergeFunctionURIs */, Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = /* import warning: importer.ImportType#apply Failed type conversion: deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURItoKind<Ts, MF, M>[URI] */ js.Any

/**
  * Deep merge other things.
  */
type DeepMergeOthersHKT[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] = DeepMergeMergeFunctionKind[
/* import warning: importer.ImportType#apply Failed type conversion: MF['DeepMergeOthersURI'] */ js.Any, 
Ts, 
MF, 
M]

/**
  * Get the value of the property.
  */
type DeepMergeRecordsDefaultHKTInternalPropValue[Ts /* <: Array[Any] */, K /* <: PropertyKey */, M] = FilterOutNever[DeepMergeRecordsDefaultHKTInternalPropValueHelper[Ts, K, M, js.Array[Any]]]

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
M]

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
M]

/**
  * Filter out nevers from a tuple.
  */
type FilterOutNever[T /* <: js.Array[Any] */] = FilterOutNeverHelper[T, js.Array[Any]]

type FlatternAlias[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]} */ js.Any) & js.Object

/**
  * Returns whether or not the given type is an array.
  */
type IsArray[T] = And[
Not[IsNever[T]], 
/* import warning: importer.ImportType#apply Failed type conversion: T extends std.ReadonlyArray<unknown> ? true : false */ js.Any]

/**
  * Returns whether or not the given type is an map.
  */
type IsMap[T] = And[
Not[IsNever[T]], 
/* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Readonly<std.ReadonlyMap<unknown, unknown>> * /
{readonly entries (): std.IterableIterator<[unknown, unknown]>,  readonly size :number, readonly keys (): std.IterableIterator<unknown>, readonly forEach (callbackfn : (value : unknown, key : unknown, map : std.ReadonlyMap<unknown, unknown>): void): void, readonly has (key : unknown): boolean, readonly values (): std.IterableIterator<unknown>, readonly get (key : unknown): unknown | undefined} ? true : false */ js.Any]

/**
  * Safely test whether or not the given type is "never".
  */
type IsNever[T] = Is[T, scala.Nothing]

/**
  * Returns whether or not the given type a record.
  */
type IsRecord[T] = And[
Not[IsNever[T]], 
/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Readonly<std.Record<std.PropertyKey, unknown>> ? true : false */ js.Any]

/**
  * Returns whether or not the given type is an set.
  *
  * Note: This may also return true for Maps.
  */
type IsSet[T] = And[
Not[IsNever[T]], 
/* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Readonly<std.ReadonlySet<unknown>> * /
{readonly entries (): std.IterableIterator<[unknown, unknown]>,  readonly size :number, readonly keys (): std.IterableIterator<unknown>, readonly forEach (callbackfn : (value : unknown, value2 : unknown, set : std.ReadonlySet<unknown>): void): void, readonly has (value : unknown): boolean, readonly values (): std.IterableIterator<unknown>} ? true : false */ js.Any]

/**
  * Get the keys of the type what match a certain criteria.
  */
type KeysOfType[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends U? K : never}[keyof T] */ js.Any

type MetaDataUpdater[M, MM /* <: DeepMergeBuiltInMetaData */] = js.Function2[/* previousMeta */ js.UndefOr[M], /* metaMeta */ Partial[MM], M]

/**
  * Get the optional keys of the type.
  */
type OptionalKeys[T] = Exclude[/* keyof T */ String, RequiredKeys[T]]

/**
  * Get all the optional keys on the types in the tuple.
  */
type OptionalKeysOf[Ts /* <: Array[Any] */] = OptionalKeysOfHelper[Ts, scala.Nothing]

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
Unit]

/**
  * Get all the required keys on the types in the tuple.
  */
type RequiredKeysOf[Ts /* <: Array[Any] */] = RequiredKeysOfHelper[Ts, scala.Nothing]

/**
  * Union of the maps' values' types
  */
type UnionMapKeys[Ts /* <: js.Array[Any] */] = UnionMapKeysHelper[Ts, scala.Nothing]

/**
  * Union of the maps' keys' types
  */
type UnionMapValues[Ts /* <: js.Array[Any] */] = UnionMapValuesHelper[Ts, scala.Nothing]

/**
  * Union of the sets' values' types
  */
type UnionSetValues[Ts /* <: js.Array[Any] */] = UnionSetValuesHelper[Ts, scala.Nothing]
