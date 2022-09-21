package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the completion of an asynchronous operation
  */
@js.native
trait PromiseConstructor
  extends StObject
     with /**
  * Creates a new Promise.
  * @param executor A callback used to initialize the promise. This callback is passed two arguments:
  * a resolve callback used to resolve the promise with a value or the result of another promise,
  * and a reject callback used to reject the promise with a provided reason or error.
  */
Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.Object | PromiseLike[js.Object], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ] {
  
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T /* <: Array[Any] | js.Array[Any] */](values: T): Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: .typescript-nn5FuAjk.Awaited<T[P]>}
    */ typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.PromiseConstructor & TopLevel[T]
  ] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An iterable of Promises.
    * @returns A new Promise.
    */
  def all[T](values: Iterable[T | PromiseLike[T]]): Promise[Array[Awaited[T]]] = js.native
  
  /**
    * Creates a Promise that is resolved with an array of results when all
    * of the provided Promises resolve or reject.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def allSettled[T /* <: Array[Any] | js.Array[Any] */](values: T): Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: .typescript-nn5FuAjk.PromiseSettledResult<.typescript-nn5FuAjk.Awaited<T[P]>>}
    */ typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.PromiseConstructor & TopLevel[T]
  ] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all
    * of the provided Promises resolve or reject.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def allSettled[T](values: Iterable[T | PromiseLike[T]]): Promise[Array[PromiseSettledResult[Awaited[T]]]] = js.native
  
  /**
    * The any function returns a promise that is fulfilled by the first given promise to be fulfilled, or rejected with an AggregateError containing an array of rejection reasons if all of the given promises are rejected. It resolves all elements of the passed iterable to promises as it runs this algorithm.
    * @param values An array or iterable of Promises.
    * @returns A new Promise.
    */
  def any[T /* <: Array[Any] | js.Array[Any] */](values: T): Promise[
    Awaited[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ] = js.native
  /**
    * The any function returns a promise that is fulfilled by the first given promise to be fulfilled, or rejected with an AggregateError containing an array of rejection reasons if all of the given promises are rejected. It resolves all elements of the passed iterable to promises as it runs this algorithm.
    * @param values An array or iterable of Promises.
    * @returns A new Promise.
    */
  def any[T](values: Array[T | PromiseLike[T]]): Promise[T] = js.native
  /**
    * The any function returns a promise that is fulfilled by the first given promise to be fulfilled, or rejected with an AggregateError containing an array of rejection reasons if all of the given promises are rejected. It resolves all elements of the passed iterable to promises as it runs this algorithm.
    * @param values An array or iterable of Promises.
    * @returns A new Promise.
    */
  def any[T](values: Iterable[PromiseLike[T] | T]): Promise[Awaited[T]] = js.native
  
  // see: lib.es2015.iterable.d.ts
  // all<T>(values: Iterable<T | PromiseLike<T>>): Promise<T[]>;
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T /* <: Array[Any] | js.Array[Any] */](values: T): Promise[
    Awaited[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An iterable of Promises.
    * @returns A new Promise.
    */
  def race[T](values: Iterable[T | PromiseLike[T]]): Promise[Awaited[T]] = js.native
  
  // see: lib.es2015.iterable.d.ts
  // race<T>(values: Iterable<T>): Promise<T extends PromiseLike<infer U> ? U : T>;
  /**
    * Creates a new rejected promise for the provided reason.
    * @param reason The reason the promise was rejected.
    * @returns A new rejected Promise.
    */
  def reject[T](): Promise[T] = js.native
  def reject[T](reason: Any): Promise[T] = js.native
  
  /**
    * Creates a new resolved promise.
    * @returns A resolved promise.
    */
  def resolve(): Promise[Unit] = js.native
  /**
    * Creates a new resolved promise for the provided value.
    * @param value A promise.
    * @returns A promise whose internal state matches the provided promise.
    */
  def resolve[T](value: T): Promise[T] = js.native
  def resolve[T](value: PromiseLike[T]): Promise[T] = js.native
  
  @JSName(js.Symbol.species)
  val species: PromiseConstructor = js.native
}
