package typings.cypress.typesLodashMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.cypress.GlobalFunction
import typings.cypress.GlobalPartial
import typings.std.ArrayLike
import typings.std.Exclude
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Crazy typedef needed get _.omit to work properly with Dictionary and NumericDictionary
type AnyKindOfDictionary = Dictionary[Any] | NumericDictionary[Any]

type ArrayIterator[T, TResult] = js.Function3[/* value */ T, /* index */ Double, /* collection */ js.Array[T], TResult]

type AssignCustomizer = js.Function5[
/* objectValue */ Any, 
/* sourceValue */ Any, 
/* key */ js.UndefOr[java.lang.String], 
/* object */ js.UndefOr[js.Object], 
/* source */ js.UndefOr[js.Object], 
Any]

type CloneDeepWithCustomizer[TObject] = js.Function4[
/* value */ Any, 
/* key */ js.UndefOr[Double | java.lang.String], 
/* object */ js.UndefOr[TObject], 
/* stack */ Any, 
Any]

type CloneWithCustomizer[TValue, TResult] = js.Function4[
/* value */ TValue, 
/* key */ js.UndefOr[Double | java.lang.String], 
/* object */ Any, 
/* stack */ Any, 
TResult]

type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Boolean]

type Comparator2[T1, T2] = js.Function2[/* a */ T1, /* b */ T2, Boolean]

type CondPair[T, R] = js.Tuple2[js.Function1[/* val */ T, Boolean], js.Function1[/* val */ T, R]]

type Dictionary[T] = StringDictionary[T]

type DictionaryIteratee[T] = ObjectIteratee[Dictionary[T]]

type DictionaryIterator[T, TResult] = ObjectIterator[Dictionary[T], TResult]

type DictionaryIteratorTypeGuard[T, S /* <: T */] = ObjectIteratorTypeGuard[Dictionary[T], S]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends {  __trapAny :any} ? cypress.cypress/types/lodash.CollectionChain<any> & cypress.cypress/types/lodash.FunctionChain<any> & cypress.cypress/types/lodash.ObjectChain<any> & cypress.cypress/types/lodash.PrimitiveChain<any> & cypress.cypress/types/lodash.StringChain : T extends null | undefined ? never : T extends string ? cypress.cypress/types/lodash.StringChain : T extends string | null | undefined ? cypress.cypress/types/lodash.StringNullableChain : T extends (args : any): any ? cypress.cypress/types/lodash.FunctionChain<T> : T extends cypress.cypress/types/lodash.List<infer U> | null | undefined ? cypress.cypress/types/lodash.CollectionChain<U> : T extends object | null | undefined ? cypress.cypress/types/lodash.ObjectChain<T> : cypress.cypress/types/lodash.PrimitiveChain<T>
  }}}
  */
type ExpChain[T] = CollectionChain[Any] & FunctionChain[Any] & ObjectChain[Any] & PrimitiveChain[Any] & StringChain

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends string ? T : T extends cypress.cypress/types/lodash.List<any> ? never : T
  }}}
  */
type Flat[T] = T

type Function0[R] = js.Function0[R]

type Function1[T1, R] = js.Function1[/* t1 */ T1, R]

type Function2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]

type Function3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]

type Function4[T1, T2, T3, T4, R] = js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]

type FunctionBase = GlobalFunction

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends {  __trapAny :any} ? cypress.cypress/types/lodash.Collection<any> & cypress.cypress/types/lodash.Function<any> & cypress.cypress/types/lodash.Object<any> & cypress.cypress/types/lodash.Primitive<any> & cypress.cypress/types/lodash.String : T extends null | undefined ? never : T extends string | null | undefined ? cypress.cypress/types/lodash.String : T extends (args : any): any ? cypress.cypress/types/lodash.Function<T> : T extends cypress.cypress/types/lodash.List<infer U> | null | undefined ? cypress.cypress/types/lodash.Collection<U> : T extends object | null | undefined ? cypress.cypress/types/lodash.Object<T> : cypress.cypress/types/lodash.Primitive<T>
  }}}
  */
type ImpChain[T] = Collection[Any] & Function[Any] & Object[Any] & Primitive[Any] & String

type IsEqualCustomizer = js.Function6[
/* value */ Any, 
/* other */ Any, 
/* indexOrKey */ js.UndefOr[PropertyName], 
/* parent */ Any, 
/* otherParent */ Any, 
/* stack */ Any, 
js.UndefOr[Boolean]]

type IterateeShorthand[T] = PropertyName | (js.Tuple2[PropertyName, Any]) | PartialShallow[T]

/** Common interface between Arrays and jQuery objects */
type List[T] = ArrayLike[T]

type ListIteratee[T] = (ListIterator[T, NotVoid]) | IterateeShorthand[T]

type ListIterateeCustom[T, TResult] = (ListIterator[T, TResult]) | IterateeShorthand[T]

type ListIterator[T, TResult] = js.Function3[
/* value */ T, 
/* index */ Double, 
/* collection */ typings.cypress.typesLodashMod.List[T], 
TResult]

type ListIteratorTypeGuard[T, S /* <: T */] = js.Function3[
/* value */ T, 
/* index */ Double, 
/* collection */ typings.cypress.typesLodashMod.List[T], 
/* is S */ Boolean]

type ListOfRecursiveArraysOrValues[T] = typings.cypress.typesLodashMod.List[T | RecursiveArray[T]]

type LoDashExplicitArrayWrapper[T] = LoDashExplicitWrapper[js.Array[T]]

type LoDashExplicitNillableArrayWrapper[T] = LoDashExplicitWrapper[js.UndefOr[js.Array[T] | Null]]

type LoDashExplicitNillableObjectWrapper[T] = LoDashExplicitWrapper[js.UndefOr[T | Null]]

type LoDashExplicitNumberArrayWrapper = LoDashExplicitWrapper[js.Array[Double]]

type LoDashExplicitObjectWrapper[T] = LoDashExplicitWrapper[T]

type LoDashExplicitStringWrapper = LoDashExplicitWrapper[java.lang.String]

// For backwards compatibility
type LoDashImplicitArrayWrapper[T] = LoDashImplicitWrapper[js.Array[T]]

type LoDashImplicitNillableArrayWrapper[T] = LoDashImplicitWrapper[js.UndefOr[js.Array[T] | Null]]

type LoDashImplicitNillableObjectWrapper[T] = LoDashImplicitWrapper[js.UndefOr[T | Null]]

type LoDashImplicitNumberArrayWrapper = LoDashImplicitWrapper[js.Array[Double]]

type LoDashImplicitObjectWrapper[T] = LoDashImplicitWrapper[T]

type LoDashImplicitStringWrapper = LoDashImplicitWrapper[java.lang.String]

type Many[T] = T | js.Array[T]

/** @deprecated Use MemoListIterator or MemoObjectIterator instead. */
type MemoIterator[T, TResult] = js.Function4[/* prev */ TResult, /* curr */ T, /* indexOrKey */ Any, /* list */ js.Array[T], TResult]

type MemoIteratorCapped[T, TResult] = js.Function2[/* prev */ TResult, /* curr */ T, TResult]

type MemoIteratorCappedRight[T, TResult] = js.Function2[/* curr */ T, /* prev */ TResult, TResult]

type MemoListIterator[T, TResult, TList] = js.Function4[/* prev */ TResult, /* curr */ T, /* index */ Double, /* list */ TList, TResult]

type MemoObjectIterator[T, TResult, TList] = js.Function4[/* prev */ TResult, /* curr */ T, /* key */ java.lang.String, /* list */ TList, TResult]

type MemoVoidArrayIterator[T, TResult] = js.Function4[/* acc */ TResult, /* curr */ T, /* index */ Double, /* arr */ js.Array[T], Unit]

type MemoVoidDictionaryIterator[T, K /* <: java.lang.String | Double | js.Symbol */, TResult] = js.Function4[/* acc */ TResult, /* curr */ T, /* key */ K, /* dict */ Record[K, T], Unit]

/** @deprecated Use MemoVoidArrayIterator or MemoVoidDictionaryIterator instead. */
type MemoVoidIterator[T, TResult] = js.Function4[/* prev */ TResult, /* curr */ T, /* indexOrKey */ Any, /* list */ js.Array[T], Unit]

type MemoVoidIteratorCapped[T, TResult] = js.Function2[/* acc */ TResult, /* curr */ T, Unit]

type MergeWithCustomizer = js.Function5[
/* value */ Any, 
/* srcValue */ Any, 
/* key */ java.lang.String, 
/* object */ Any, 
/* source */ Any, 
Any]

type NotVoid = Any

type NumericDictionary[T] = NumberDictionary[T]

type NumericDictionaryIteratee[T] = (NumericDictionaryIterator[T, NotVoid]) | IterateeShorthand[T]

type NumericDictionaryIterateeCustom[T, TResult] = (NumericDictionaryIterator[T, TResult]) | IterateeShorthand[T]

// NOTE: keys of objects at run time are always strings, even when a NumericDictionary is being iterated.
type NumericDictionaryIterator[T, TResult] = js.Function3[
/* value */ T, 
/* key */ java.lang.String, 
/* collection */ NumericDictionary[T], 
TResult]

type ObjectIteratee[TObject] = (ObjectIterator[TObject, NotVoid]) | (IterateeShorthand[
/* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any])

type ObjectIterateeCustom[TObject, TResult] = (ObjectIterator[TObject, TResult]) | (IterateeShorthand[
/* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any])

// Note: key should be string, not keyof T, because the actual object may contain extra properties that were not specified in the type.
type ObjectIterator[TObject, TResult] = js.Function3[
/* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ /* value */ js.Any, 
/* key */ java.lang.String, 
/* collection */ TObject, 
TResult]

type ObjectIteratorTypeGuard[TObject, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any */] = js.Function3[
/* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ /* value */ js.Any, 
/* key */ java.lang.String, 
/* collection */ TObject, 
/* is S */ Boolean]

type Omit[T, K /* <: /* keyof any */ java.lang.String */] = Pick[T, Exclude[/* keyof T */ java.lang.String, K]]

type PartialObject[T] = GlobalPartial[T]

type PropertyName = java.lang.String | Double | js.Symbol

type PropertyPath = Many[PropertyName]

type SetWithCustomizer[T] = js.Function3[/* nsValue */ Any, /* key */ java.lang.String, /* nsObject */ T, Any]

type StringIterator[TResult] = js.Function3[
/* char */ java.lang.String, 
/* index */ Double, 
/* string */ java.lang.String, 
TResult]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends null | undefined | false | '' | 0 ? never : T
  }}}
  */
type Truthy[T] = T

type ValueIteratee[T] = (js.Function1[/* value */ T, NotVoid]) | IterateeShorthand[T]

type ValueIterateeCustom[T, TResult] = (js.Function1[/* value */ T, TResult]) | IterateeShorthand[T]

type ValueIteratorTypeGuard[T, S /* <: T */] = js.Function1[/* value */ T, /* is S */ Boolean]

type ValueKeyIteratee[T] = (js.Function2[/* value */ T, /* key */ java.lang.String, NotVoid]) | IterateeShorthand[T]

type ValueKeyIterateeTypeGuard[T, S /* <: T */] = js.Function2[/* value */ T, /* key */ java.lang.String, /* is S */ Boolean]

type __ = LoDashStatic

type isMatchWithCustomizer = js.Function5[
/* value */ Any, 
/* other */ Any, 
/* indexOrKey */ PropertyName, 
/* object */ js.Object, 
/* source */ js.Object, 
js.UndefOr[Boolean]]
