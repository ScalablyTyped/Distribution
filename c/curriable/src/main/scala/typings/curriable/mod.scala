package typings.curriable

import org.scalablytyped.runtime.TopLevel
import typings.std.Parameters
import typings.std.ReturnType
import typings.std.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("curriable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Fn /* <: Handler */](fn: Fn): Curried[Fn] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[Curried[Fn]]
  inline def default[Fn /* <: Handler */](fn: Fn, arityOverride: Double): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], arityOverride.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  @JSImport("curriable", "__")
  @js.native
  val __ : Placeholder = js.native
  
  inline def curry[Fn /* <: Handler */](fn: Fn): Curried[Fn] = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(fn.asInstanceOf[js.Any]).asInstanceOf[Curried[Fn]]
  inline def curry[Fn /* <: Handler */](fn: Fn, arityOverride: Double): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("curry")(fn.asInstanceOf[js.Any], arityOverride.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  inline def isPlaceholder(value: js.Any): /* is curriable.curriable.Placeholder */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlaceholder")(value.asInstanceOf[js.Any]).asInstanceOf[/* is curriable.curriable.Placeholder */ Boolean]
  
  inline def uncurry[Fn /* <: Handler */](curried: Curried[Fn]): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("uncurry")(curried.asInstanceOf[js.Any]).asInstanceOf[Fn]
  
  type Append[E, T /* <: js.Array[js.Any] */] = Concat[T, js.Array[E]]
  
  type Cast[X, Y] = Y | X
  
  type CleanedGaps[T /* <: js.Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: std.NonNullable<T[K]>}
    */ typings.curriable.curriableStrings.CleanedGaps & TopLevel[T]
  
  type Concat[T1 /* <: js.Array[js.Any] */, T2 /* <: js.Array[js.Any] */] = Reverse[Cast[js.Any, js.Array[js.Any]], T2, js.Array[js.Any]]
  
  @js.native
  trait Curried[Fn /* <: Handler */] extends Curry_[Fn] {
    
    var arity: Double = js.native
    
    var fn: Fn = js.native
  }
  
  type Curry_[F /* <: Handler */] = js.Function1[
    /* args */ Cast[Cast[js.Array[js.Any], Gaps[Parameters[F]]], js.Array[js.Any]], 
    ReturnType[F]
  ]
  
  type Drop[N /* <: Double */, T /* <: js.Array[js.Any] */, I /* <: js.Array[js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.1<T>[curriable.curriable.Length<I> extends N ? 1 : 0] */ js.Any
  
  type GapOf[T1 /* <: js.Array[js.Any] */, T2 /* <: js.Array[js.Any] */, TN /* <: js.Array[js.Any] */, I /* <: js.Array[js.Any] */] = TN | (Append[
    /* import warning: importer.ImportType#apply Failed type conversion: T2[curriable.curriable.Pos<I>] */ js.Any, 
    TN
  ])
  
  type Gaps[T /* <: js.Array[js.Any] */] = CleanedGaps[PartialGaps[T]]
  
  type GapsOf[T1 /* <: js.Array[js.Any] */, T2 /* <: js.Array[js.Any] */, TN /* <: js.Array[js.Any] */, I /* <: js.Array[js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.0Object<TN, I, T2>[curriable.curriable.Pos<I> extends curriable.curriable.Length<T1> ? 1 : 0] */ js.Any
  
  @js.native
  trait Handler extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.curriable.curriableBooleans.`true`
    - typings.curriable.curriableBooleans.`false`
  */
  trait HasTail[T /* <: js.Array[js.Any] */] extends StObject
  
  type Head[T /* <: js.Array[js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  
  type Last[T /* <: js.Array[js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.0<T>[curriable.curriable.HasTail<T> extends true ? 0 : 1] */ js.Any
  
  type Length[T /* <: js.Array[js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any
  
  type Next[I /* <: js.Array[js.Any] */] = Prepend[js.Any, I]
  
  type PartialGaps[T /* <: js.Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | curriable.curriable.Placeholder}
    */ typings.curriable.curriableStrings.PartialGaps & TopLevel[T]
  
  type Placeholder = Symbol | Double
  
  type Pos[I /* <: js.Array[js.Any] */] = Length[I]
  
  type Prepend[E, T /* <: js.Array[js.Any] */] = T
  
  type Prev[I /* <: js.Array[js.Any] */] = Tail[I]
  
  type Reverse[T /* <: js.Array[js.Any] */, R /* <: js.Array[js.Any] */, I /* <: js.Array[js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.01<R>[curriable.curriable.Pos<I> extends curriable.curriable.Length<T> ? 1 : 0] */ js.Any
  
  type Tail[T /* <: js.Array[js.Any] */] = js.Array[js.Any]
}
