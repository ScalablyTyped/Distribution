package typings.curriable

import typings.curriable.mod.Cast
import typings.curriable.mod.Concat
import typings.curriable.mod.Handler
import typings.curriable.mod.Head
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[T /* <: js.Array[_] */] extends StObject {
    
    var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Last<curriable.curriable.Tail<T>> */ js.Object = js.native
    
    var `1`: Head[T] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[T /* <: js.Array[_] */](
      `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Last<curriable.curriable.Tail<T>> */ js.Object,
      `1`: Head[T]
    ): `0`[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[T]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_], T /* <: js.Array[_] */] (val x: Self with `0`[T]) extends AnyVal {
      
      @scala.inline
      def set0(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Last<curriable.curriable.Tail<T>> */ js.Object
      ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1(value: Head[T]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `01`[R /* <: js.Array[_] */] extends StObject {
    
    var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object = js.native
    
    var `1`: R = js.native
  }
  object `01` {
    
    @scala.inline
    def apply[R /* <: js.Array[_] */](
      `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object,
      `1`: R
    ): `01`[R] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`01`[R]]
    }
    
    @scala.inline
    implicit class `01MutableBuilder`[Self <: `01`[_], R /* <: js.Array[_] */] (val x: Self with `01`[R]) extends AnyVal {
      
      @scala.inline
      def set0(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object
      ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1(value: R): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `0Object`[TN /* <: js.Array[_] */, I /* <: js.Array[_] */, T2 /* <: js.Array[_] */] extends StObject {
    
    var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.GapsOf<T1, T2, curriable.curriable.GapOf<T1, T2, TN, I> extends infer G ? curriable.curriable.Cast<G, std.Array<any>> : never, curriable.curriable.Next<I>> */ js.Object = js.native
    
    var `1`: Concat[TN, Cast[_, js.Array[_]]] = js.native
  }
  object `0Object` {
    
    @scala.inline
    def apply[TN /* <: js.Array[_] */, I /* <: js.Array[_] */, T2 /* <: js.Array[_] */](
      `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.GapsOf<T1, T2, curriable.curriable.GapOf<T1, T2, TN, I> extends infer G ? curriable.curriable.Cast<G, std.Array<any>> : never, curriable.curriable.Next<I>> */ js.Object,
      `1`: Concat[TN, Cast[_, js.Array[_]]]
    ): `0Object`[TN, I, T2] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0Object`[TN, I, T2]]
    }
    
    @scala.inline
    implicit class `0ObjectMutableBuilder`[Self <: `0Object`[_, _, _], TN /* <: js.Array[_] */, I /* <: js.Array[_] */, T2 /* <: js.Array[_] */] (val x: Self with (`0Object`[TN, I, T2])) extends AnyVal {
      
      @scala.inline
      def set0(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.GapsOf<T1, T2, curriable.curriable.GapOf<T1, T2, TN, I> extends infer G ? curriable.curriable.Cast<G, std.Array<any>> : never, curriable.curriable.Next<I>> */ js.Object
      ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1(value: Concat[TN, Cast[_, js.Array[_]]]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1`[T /* <: js.Array[_] */] extends StObject {
    
    var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Drop<N, curriable.curriable.Tail<T>, curriable.curriable.Prepend<any, I>> */ js.Object = js.native
    
    var `1`: T = js.native
  }
  object `1` {
    
    @scala.inline
    def apply[T /* <: js.Array[_] */](
      `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Drop<N, curriable.curriable.Tail<T>, curriable.curriable.Prepend<any, I>> */ js.Object,
      `1`: T
    ): `1`[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`[T]]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`[_], T /* <: js.Array[_] */] (val x: Self with `1`[T]) extends AnyVal {
      
      @scala.inline
      def set0(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Drop<N, curriable.curriable.Tail<T>, curriable.curriable.Prepend<any, I>> */ js.Object
      ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1(value: T): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Arity[Fn /* <: Handler */] extends StObject {
    
    var arity: Double = js.native
    
    var fn: Fn = js.native
  }
  object Arity {
    
    @scala.inline
    def apply[Fn /* <: Handler */](arity: Double, fn: Fn): Arity[Fn] = {
      val __obj = js.Dynamic.literal(arity = arity.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arity[Fn]]
    }
    
    @scala.inline
    implicit class ArityMutableBuilder[Self <: Arity[_], Fn /* <: Handler */] (val x: Self with Arity[Fn]) extends AnyVal {
      
      @scala.inline
      def setArity(value: Double): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFn(value: Fn): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
}
