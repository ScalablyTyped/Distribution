package typings.curriable

import typings.std.Parameters
import typings.std.ReturnType
import typings.std.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("curriable", JSImport.Namespace)
@js.native
object curriableMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.curriable.curriableBooleans.`true`
    - typings.curriable.curriableBooleans.`false`
  */
  trait HasTail[T /* <: js.Array[_] */] extends js.Object
  
  val __ : Placeholder = js.native
  def curry[Fn /* <: Handler */](fn: Fn): Curried[Fn] = js.native
  def curry[Fn /* <: Handler */](fn: Fn, arityOverride: Double): Handler = js.native
  def default[Fn /* <: Handler */](fn: Fn): Curried[Fn] = js.native
  def default[Fn /* <: Handler */](fn: Fn, arityOverride: Double): Handler = js.native
  def isPlaceholder(value: js.Any): /* is curriable.curriable.Placeholder */ Boolean = js.native
  def uncurry[Fn /* <: Handler */](curried: Curried[Fn]): Fn = js.native
  type Append[E, T /* <: js.Array[_] */] = Concat[T, js.Array[E]]
  type Cast[X, Y] = Y | X
  type CleanedGaps[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: std.NonNullable<T[K]>}
    */ typings.curriable.curriableStrings.CleanedGaps with T
  type Concat[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */] = Reverse[Cast[js.Any, js.Array[js.Any]], T2, js.Array[js.Any]]
  type Curried[Fn /* <: Handler */] = Curry[Fn] with Anon_Arity[Fn]
  type Curry[F /* <: Handler */] = js.Function1[
    /* args */ Cast[Cast[js.Array[js.Any], Gaps[Parameters[F]]], js.Array[js.Any]], 
    ReturnType[F]
  ]
  type Drop[N /* <: Double */, T /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.Anon_01<T>[curriable.curriable.Length<I> extends N ? 1 : 0] */ js.Any
  type GapOf[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */, TN /* <: js.Array[_] */, I /* <: js.Array[_] */] = TN | (Append[
    /* import warning: importer.ImportType#apply Failed type conversion: T2[curriable.curriable.Pos<I>] */ js.Any, 
    TN
  ])
  type Gaps[T /* <: js.Array[_] */] = CleanedGaps[PartialGaps[T]]
  type GapsOf[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */, TN /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.Anon_01Any<TN, I, T2>[curriable.curriable.Pos<I> extends curriable.curriable.Length<T1> ? 1 : 0] */ js.Any
  type Handler = js.Function1[/* repeated */ js.Any, js.Any]
  type Head[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  type Last[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.Anon_0<T>[curriable.curriable.HasTail<T> extends true ? 0 : 1] */ js.Any
  type Length[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any
  type Next[I /* <: js.Array[_] */] = Prepend[js.Any, I]
  type PartialGaps[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | curriable.curriable.Placeholder}
    */ typings.curriable.curriableStrings.PartialGaps with T
  type Placeholder = Symbol | Double
  type Pos[I /* <: js.Array[_] */] = Length[I]
  type Prepend[E, T /* <: js.Array[_] */] = T
  type Prev[I /* <: js.Array[_] */] = Tail[I]
  type Reverse[T /* <: js.Array[_] */, R /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.Anon_01Object<R>[curriable.curriable.Pos<I> extends curriable.curriable.Length<T> ? 1 : 0] */ js.Any
  type Tail[T /* <: js.Array[_] */] = js.Array[js.Any]
}

