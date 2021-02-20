package typings.deepDiff

import typings.deepDiff.deepDiffStrings.A
import typings.deepDiff.deepDiffStrings.D
import typings.deepDiff.deepDiffStrings.E
import typings.deepDiff.deepDiffStrings.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deep-diff", "applyChange")
  @js.native
  def applyChange[LHS](target: LHS, source: js.Any, change: Diff_[LHS, _]): Unit = js.native
  
  @JSImport("deep-diff", "applyDiff")
  @js.native
  def applyDiff[LHS, RHS](target: LHS, source: RHS): Unit = js.native
  @JSImport("deep-diff", "applyDiff")
  @js.native
  def applyDiff[LHS, RHS](target: LHS, source: RHS, filter: Filter[LHS, RHS]): Unit = js.native
  
  @JSImport("deep-diff", "diff")
  @js.native
  def diff[LHS, RHS](lhs: LHS, rhs: RHS): Accumulator[LHS, RHS] = js.native
  @JSImport("deep-diff", "diff")
  @js.native
  def diff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: js.UndefOr[PreFilter[LHS, RHS]], acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = js.native
  @JSImport("deep-diff", "diff")
  @js.native
  def diff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): Accumulator[LHS, RHS] = js.native
  @JSImport("deep-diff", "diff")
  @js.native
  def diff_LHSRHS_Union[LHS, RHS](lhs: LHS, rhs: RHS): js.UndefOr[js.Array[Diff_[LHS, RHS]]] = js.native
  @JSImport("deep-diff", "diff")
  @js.native
  def diff_LHSRHS_Union[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): js.UndefOr[js.Array[Diff_[LHS, RHS]]] = js.native
  
  @JSImport("deep-diff", "observableDiff")
  @js.native
  def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS): js.Array[Diff_[LHS, RHS]] = js.native
  @JSImport("deep-diff", "observableDiff")
  @js.native
  def observableDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    observer: js.UndefOr[scala.Nothing],
    prefilter: js.UndefOr[PreFilter[LHS, RHS]],
    orderIndependent: Boolean
  ): js.Array[Diff_[LHS, RHS]] = js.native
  @JSImport("deep-diff", "observableDiff")
  @js.native
  def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: js.UndefOr[scala.Nothing], prefilter: PreFilter[LHS, RHS]): js.Array[Diff_[LHS, RHS]] = js.native
  @JSImport("deep-diff", "observableDiff")
  @js.native
  def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: Observer[LHS, RHS]): js.Array[Diff_[LHS, RHS]] = js.native
  @JSImport("deep-diff", "observableDiff")
  @js.native
  def observableDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    observer: Observer[LHS, RHS],
    prefilter: js.UndefOr[PreFilter[LHS, RHS]],
    orderIndependent: Boolean
  ): js.Array[Diff_[LHS, RHS]] = js.native
  @JSImport("deep-diff", "observableDiff")
  @js.native
  def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: Observer[LHS, RHS], prefilter: PreFilter[LHS, RHS]): js.Array[Diff_[LHS, RHS]] = js.native
  
  @JSImport("deep-diff", "orderIndepHash")
  @js.native
  def orderIndepHash(`object`: js.Any): Double = js.native
  
  @JSImport("deep-diff", "orderIndependentDeepDiff")
  @js.native
  def orderIndependentDeepDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    changes: js.Array[Diff_[LHS, RHS]],
    prefilter: PreFilter[LHS, RHS],
    path: js.Array[_],
    key: js.Any,
    stack: js.Array[_]
  ): Unit = js.native
  
  @JSImport("deep-diff", "orderIndependentDiff")
  @js.native
  def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS): Accumulator[LHS, RHS] = js.native
  @JSImport("deep-diff", "orderIndependentDiff")
  @js.native
  def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: js.UndefOr[PreFilter[LHS, RHS]], acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = js.native
  @JSImport("deep-diff", "orderIndependentDiff")
  @js.native
  def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): Accumulator[LHS, RHS] = js.native
  @JSImport("deep-diff", "orderIndependentDiff")
  @js.native
  def orderIndependentDiff_LHSRHS_Union[LHS, RHS](lhs: LHS, rhs: RHS): js.UndefOr[js.Array[Diff_[LHS, RHS]]] = js.native
  @JSImport("deep-diff", "orderIndependentDiff")
  @js.native
  def orderIndependentDiff_LHSRHS_Union[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): js.UndefOr[js.Array[Diff_[LHS, RHS]]] = js.native
  
  @JSImport("deep-diff", "revertChange")
  @js.native
  def revertChange[LHS](target: LHS, source: js.Any, change: Diff_[LHS, _]): Unit = js.native
  
  @js.native
  trait Accumulator[LHS, RHS] extends StObject {
    
    var length: Double = js.native
    
    def push(diff: Diff_[LHS, RHS]): Unit = js.native
  }
  object Accumulator {
    
    @scala.inline
    def apply[LHS, RHS](length: Double, push: Diff_[LHS, RHS] => Unit): Accumulator[LHS, RHS] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[Accumulator[LHS, RHS]]
    }
    
    @scala.inline
    implicit class AccumulatorMutableBuilder[Self <: Accumulator[_, _], LHS, RHS] (val x: Self with (Accumulator[LHS, RHS])) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush(value: Diff_[LHS, RHS] => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DiffArray[LHS, RHS] extends Diff_[LHS, RHS] {
    
    var index: Double = js.native
    
    var item: Diff_[LHS, RHS] = js.native
    
    var kind: A = js.native
    
    var path: js.UndefOr[js.Array[_]] = js.native
  }
  object DiffArray {
    
    @scala.inline
    def apply[LHS, RHS](index: Double, item: Diff_[LHS, RHS], kind: A): DiffArray[LHS, RHS] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffArray[LHS, RHS]]
    }
    
    @scala.inline
    implicit class DiffArrayMutableBuilder[Self <: DiffArray[_, _], LHS, RHS] (val x: Self with (DiffArray[LHS, RHS])) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: Diff_[LHS, RHS]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: A): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[_]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: js.Any*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DiffDeleted[LHS]
    extends Diff_[LHS, js.Any] {
    
    var kind: D = js.native
    
    var lhs: LHS = js.native
    
    var path: js.UndefOr[js.Array[_]] = js.native
  }
  object DiffDeleted {
    
    @scala.inline
    def apply[LHS](kind: D, lhs: LHS): DiffDeleted[LHS] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffDeleted[LHS]]
    }
    
    @scala.inline
    implicit class DiffDeletedMutableBuilder[Self <: DiffDeleted[_], LHS] (val x: Self with DiffDeleted[LHS]) extends AnyVal {
      
      @scala.inline
      def setKind(value: D): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLhs(value: LHS): Self = StObject.set(x, "lhs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[_]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: js.Any*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DiffEdit[LHS, RHS] extends Diff_[LHS, RHS] {
    
    var kind: E = js.native
    
    var lhs: LHS = js.native
    
    var path: js.UndefOr[js.Array[_]] = js.native
    
    var rhs: RHS = js.native
  }
  object DiffEdit {
    
    @scala.inline
    def apply[LHS, RHS](kind: E, lhs: LHS, rhs: RHS): DiffEdit[LHS, RHS] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffEdit[LHS, RHS]]
    }
    
    @scala.inline
    implicit class DiffEditMutableBuilder[Self <: DiffEdit[_, _], LHS, RHS] (val x: Self with (DiffEdit[LHS, RHS])) extends AnyVal {
      
      @scala.inline
      def setKind(value: E): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLhs(value: LHS): Self = StObject.set(x, "lhs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[_]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: js.Any*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRhs(value: RHS): Self = StObject.set(x, "rhs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DiffNew[RHS]
    extends Diff_[js.Any, RHS] {
    
    var kind: N = js.native
    
    var path: js.UndefOr[js.Array[_]] = js.native
    
    var rhs: RHS = js.native
  }
  object DiffNew {
    
    @scala.inline
    def apply[RHS](kind: N, rhs: RHS): DiffNew[RHS] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffNew[RHS]]
    }
    
    @scala.inline
    implicit class DiffNewMutableBuilder[Self <: DiffNew[_], RHS] (val x: Self with DiffNew[RHS]) extends AnyVal {
      
      @scala.inline
      def setKind(value: N): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[_]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: js.Any*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRhs(value: RHS): Self = StObject.set(x, "rhs", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def DiffArray[LHS, RHS](index: Double, item: Diff_[LHS, RHS], kind: A): typings.deepDiff.mod.DiffArray[LHS, RHS] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.deepDiff.mod.DiffArray[LHS, RHS]]
    }
    
    @scala.inline
    def DiffDeleted[LHS](kind: D, lhs: LHS): typings.deepDiff.mod.DiffDeleted[LHS] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.deepDiff.mod.DiffDeleted[LHS]]
    }
    
    @scala.inline
    def DiffEdit[LHS, RHS](kind: E, lhs: LHS, rhs: RHS): typings.deepDiff.mod.DiffEdit[LHS, RHS] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.deepDiff.mod.DiffEdit[LHS, RHS]]
    }
    
    @scala.inline
    def DiffNew[RHS](kind: N, rhs: RHS): typings.deepDiff.mod.DiffNew[RHS] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.deepDiff.mod.DiffNew[RHS]]
    }
  }
  
  type Filter[LHS, RHS] = js.Function3[/* target */ LHS, /* source */ RHS, /* change */ Diff_[LHS, RHS], Boolean]
  
  type Observer[LHS, RHS] = js.Function1[/* diff */ Diff_[LHS, RHS], Unit]
  
  type PreFilter[LHS, RHS] = PreFilterFunction | (PreFilterObject[LHS, RHS])
  
  type PreFilterFunction = js.Function2[/* path */ js.Array[js.Any], /* key */ js.Any, Boolean]
  
  @js.native
  trait PreFilterObject[LHS, RHS] extends StObject {
    
    var normalize: js.UndefOr[
        js.Function4[
          /* currentPath */ js.Any, 
          /* key */ js.Any, 
          /* lhs */ LHS, 
          /* rhs */ RHS, 
          js.UndefOr[js.Tuple2[LHS, RHS]]
        ]
      ] = js.native
    
    var prefilter: js.UndefOr[js.Function2[/* path */ js.Array[_], /* key */ js.Any, Boolean]] = js.native
  }
  object PreFilterObject {
    
    @scala.inline
    def apply[LHS, RHS](): PreFilterObject[LHS, RHS] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreFilterObject[LHS, RHS]]
    }
    
    @scala.inline
    implicit class PreFilterObjectMutableBuilder[Self <: PreFilterObject[_, _], LHS, RHS] (val x: Self with (PreFilterObject[LHS, RHS])) extends AnyVal {
      
      @scala.inline
      def setNormalize(
        value: (/* currentPath */ js.Any, /* key */ js.Any, /* lhs */ LHS, /* rhs */ RHS) => js.UndefOr[js.Tuple2[LHS, RHS]]
      ): Self = StObject.set(x, "normalize", js.Any.fromFunction4(value))
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setPrefilter(value: (/* path */ js.Array[_], /* key */ js.Any) => Boolean): Self = StObject.set(x, "prefilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefilterUndefined: Self = StObject.set(x, "prefilter", js.undefined)
    }
  }
}
