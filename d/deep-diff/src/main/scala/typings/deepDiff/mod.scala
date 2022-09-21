package typings.deepDiff

import typings.deepDiff.deepDiffStrings.A
import typings.deepDiff.deepDiffStrings.D
import typings.deepDiff.deepDiffStrings.E
import typings.deepDiff.deepDiffStrings.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deep-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyChange[LHS](target: LHS, source: Any, change: Diff_[LHS, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChange")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyDiff[LHS, RHS](target: LHS, source: RHS): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyDiff")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyDiff[LHS, RHS](target: LHS, source: RHS, filter: Filter[LHS, RHS]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyDiff")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def diff[LHS, RHS](lhs: LHS, rhs: RHS): Accumulator[LHS, RHS] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[Accumulator[LHS, RHS]]
  inline def diff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: Unit, acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any], acc.asInstanceOf[js.Any])).asInstanceOf[Accumulator[LHS, RHS]]
  inline def diff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): Accumulator[LHS, RHS] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any])).asInstanceOf[Accumulator[LHS, RHS]]
  inline def diff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS], acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any], acc.asInstanceOf[js.Any])).asInstanceOf[Accumulator[LHS, RHS]]
  
  inline def diff_LHSRHS_Union[LHS, RHS](lhs: LHS, rhs: RHS): js.UndefOr[js.Array[Diff_[LHS, RHS]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Diff_[LHS, RHS]]]]
  inline def diff_LHSRHS_Union[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): js.UndefOr[js.Array[Diff_[LHS, RHS]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Diff_[LHS, RHS]]]]
  
  inline def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS): js.Array[Diff_[LHS, RHS]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observableDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff_[LHS, RHS]]]
  inline def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: Unit, prefilter: Unit, orderIndependent: Boolean): js.Array[Diff_[LHS, RHS]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observableDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], observer.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any], orderIndependent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff_[LHS, RHS]]]
  inline def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: Unit, prefilter: PreFilter[LHS, RHS]): js.Array[Diff_[LHS, RHS]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observableDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], observer.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff_[LHS, RHS]]]
  inline def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: Unit, prefilter: PreFilter[LHS, RHS], orderIndependent: Boolean): js.Array[Diff_[LHS, RHS]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observableDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], observer.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any], orderIndependent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff_[LHS, RHS]]]
  inline def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: Observer[LHS, RHS]): js.Array[Diff_[LHS, RHS]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observableDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff_[LHS, RHS]]]
  inline def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: Observer[LHS, RHS], prefilter: Unit, orderIndependent: Boolean): js.Array[Diff_[LHS, RHS]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observableDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], observer.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any], orderIndependent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff_[LHS, RHS]]]
  inline def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: Observer[LHS, RHS], prefilter: PreFilter[LHS, RHS]): js.Array[Diff_[LHS, RHS]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observableDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], observer.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff_[LHS, RHS]]]
  inline def observableDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    observer: Observer[LHS, RHS],
    prefilter: PreFilter[LHS, RHS],
    orderIndependent: Boolean
  ): js.Array[Diff_[LHS, RHS]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observableDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], observer.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any], orderIndependent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff_[LHS, RHS]]]
  
  inline def orderIndepHash(`object`: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("orderIndepHash")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def orderIndependentDeepDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    changes: js.Array[Diff_[LHS, RHS]],
    prefilter: PreFilter[LHS, RHS],
    path: js.Array[Any],
    key: Any,
    stack: js.Array[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("orderIndependentDeepDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any], path.asInstanceOf[js.Any], key.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS): Accumulator[LHS, RHS] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderIndependentDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[Accumulator[LHS, RHS]]
  inline def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: Unit, acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderIndependentDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any], acc.asInstanceOf[js.Any])).asInstanceOf[Accumulator[LHS, RHS]]
  inline def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): Accumulator[LHS, RHS] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderIndependentDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any])).asInstanceOf[Accumulator[LHS, RHS]]
  inline def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS], acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderIndependentDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any], acc.asInstanceOf[js.Any])).asInstanceOf[Accumulator[LHS, RHS]]
  
  inline def orderIndependentDiff_LHSRHS_Union[LHS, RHS](lhs: LHS, rhs: RHS): js.UndefOr[js.Array[Diff_[LHS, RHS]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderIndependentDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Diff_[LHS, RHS]]]]
  inline def orderIndependentDiff_LHSRHS_Union[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): js.UndefOr[js.Array[Diff_[LHS, RHS]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderIndependentDiff")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any], prefilter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Diff_[LHS, RHS]]]]
  
  inline def revertChange[LHS](target: LHS, source: Any, change: Diff_[LHS, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("revertChange")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Accumulator[LHS, RHS] extends StObject {
    
    var length: Double
    
    def push(diff: Diff_[LHS, RHS]): Unit
  }
  object Accumulator {
    
    inline def apply[LHS, RHS](length: Double, push: Diff_[LHS, RHS] => Unit): Accumulator[LHS, RHS] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[Accumulator[LHS, RHS]]
    }
    
    extension [Self <: Accumulator[?, ?], LHS, RHS](x: Self & (Accumulator[LHS, RHS])) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPush(value: Diff_[LHS, RHS] => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
  
  trait DiffArray[LHS, RHS]
    extends StObject
       with Diff_[LHS, RHS] {
    
    var index: Double
    
    var item: Diff_[LHS, RHS]
    
    var kind: A
    
    var path: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object DiffArray {
    
    inline def apply[LHS, RHS](index: Double, item: Diff_[LHS, RHS]): DiffArray[LHS, RHS] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = "A")
      __obj.asInstanceOf[DiffArray[LHS, RHS]]
    }
    
    extension [Self <: DiffArray[?, ?], LHS, RHS](x: Self & (DiffArray[LHS, RHS])) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: Diff_[LHS, RHS]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setKind(value: A): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait DiffDeleted[LHS]
    extends StObject
       with Diff_[LHS, Any] {
    
    var kind: D
    
    var lhs: LHS
    
    var path: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object DiffDeleted {
    
    inline def apply[LHS](lhs: LHS): DiffDeleted[LHS] = {
      val __obj = js.Dynamic.literal(kind = "D", lhs = lhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffDeleted[LHS]]
    }
    
    extension [Self <: DiffDeleted[?], LHS](x: Self & DiffDeleted[LHS]) {
      
      inline def setKind(value: D): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLhs(value: LHS): Self = StObject.set(x, "lhs", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait DiffEdit[LHS, RHS]
    extends StObject
       with Diff_[LHS, RHS] {
    
    var kind: E
    
    var lhs: LHS
    
    var path: js.UndefOr[js.Array[Any]] = js.undefined
    
    var rhs: RHS
  }
  object DiffEdit {
    
    inline def apply[LHS, RHS](lhs: LHS, rhs: RHS): DiffEdit[LHS, RHS] = {
      val __obj = js.Dynamic.literal(kind = "E", lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffEdit[LHS, RHS]]
    }
    
    extension [Self <: DiffEdit[?, ?], LHS, RHS](x: Self & (DiffEdit[LHS, RHS])) {
      
      inline def setKind(value: E): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLhs(value: LHS): Self = StObject.set(x, "lhs", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRhs(value: RHS): Self = StObject.set(x, "rhs", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiffNew[RHS]
    extends StObject
       with Diff_[Any, RHS] {
    
    var kind: N
    
    var path: js.UndefOr[js.Array[Any]] = js.undefined
    
    var rhs: RHS
  }
  object DiffNew {
    
    inline def apply[RHS](rhs: RHS): DiffNew[RHS] = {
      val __obj = js.Dynamic.literal(kind = "N", rhs = rhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffNew[RHS]]
    }
    
    extension [Self <: DiffNew[?], RHS](x: Self & DiffNew[RHS]) {
      
      inline def setKind(value: N): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRhs(value: RHS): Self = StObject.set(x, "rhs", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.deepDiff.mod.DiffNew[RHS]
    - typings.deepDiff.mod.DiffDeleted[LHS]
    - typings.deepDiff.mod.DiffEdit[LHS, RHS]
    - typings.deepDiff.mod.DiffArray[LHS, RHS]
  */
  trait Diff_[LHS, RHS] extends StObject
  object Diff_ {
    
    inline def DiffArray[LHS, RHS](index: Double, item: Diff_[LHS, RHS]): typings.deepDiff.mod.DiffArray[LHS, RHS] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = "A")
      __obj.asInstanceOf[typings.deepDiff.mod.DiffArray[LHS, RHS]]
    }
    
    inline def DiffDeleted[LHS](lhs: LHS): typings.deepDiff.mod.DiffDeleted[LHS] = {
      val __obj = js.Dynamic.literal(kind = "D", lhs = lhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.deepDiff.mod.DiffDeleted[LHS]]
    }
    
    inline def DiffEdit[LHS, RHS](lhs: LHS, rhs: RHS): typings.deepDiff.mod.DiffEdit[LHS, RHS] = {
      val __obj = js.Dynamic.literal(kind = "E", lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.deepDiff.mod.DiffEdit[LHS, RHS]]
    }
    
    inline def DiffNew[RHS](rhs: RHS): typings.deepDiff.mod.DiffNew[RHS] = {
      val __obj = js.Dynamic.literal(kind = "N", rhs = rhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.deepDiff.mod.DiffNew[RHS]]
    }
  }
  
  type Filter[LHS, RHS] = js.Function3[/* target */ LHS, /* source */ RHS, /* change */ Diff_[LHS, RHS], Boolean]
  
  type Observer[LHS, RHS] = js.Function1[/* diff */ Diff_[LHS, RHS], Unit]
  
  type PreFilter[LHS, RHS] = PreFilterFunction | (PreFilterObject[LHS, RHS])
  
  type PreFilterFunction = js.Function2[/* path */ js.Array[Any], /* key */ Any, Boolean]
  
  trait PreFilterObject[LHS, RHS] extends StObject {
    
    var normalize: js.UndefOr[
        js.Function4[
          /* currentPath */ Any, 
          /* key */ Any, 
          /* lhs */ LHS, 
          /* rhs */ RHS, 
          js.UndefOr[js.Tuple2[LHS, RHS]]
        ]
      ] = js.undefined
    
    var prefilter: js.UndefOr[js.Function2[/* path */ js.Array[Any], /* key */ Any, Boolean]] = js.undefined
  }
  object PreFilterObject {
    
    inline def apply[LHS, RHS](): PreFilterObject[LHS, RHS] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreFilterObject[LHS, RHS]]
    }
    
    extension [Self <: PreFilterObject[?, ?], LHS, RHS](x: Self & (PreFilterObject[LHS, RHS])) {
      
      inline def setNormalize(
        value: (/* currentPath */ Any, /* key */ Any, /* lhs */ LHS, /* rhs */ RHS) => js.UndefOr[js.Tuple2[LHS, RHS]]
      ): Self = StObject.set(x, "normalize", js.Any.fromFunction4(value))
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setPrefilter(value: (/* path */ js.Array[Any], /* key */ Any) => Boolean): Self = StObject.set(x, "prefilter", js.Any.fromFunction2(value))
      
      inline def setPrefilterUndefined: Self = StObject.set(x, "prefilter", js.undefined)
    }
  }
}
