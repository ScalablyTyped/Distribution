package typings.chartJs

import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ActiveDataPoint
import typings.chartJs.distTypesIndexMod.ChartEvent
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotcoreMod {
  
  @JSImport("chart.js/dist/helpers/helpers.core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: T, args: js.Array[Any]): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: T, args: js.Array[Any], thisArg: TA): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: Unit, args: js.Array[Any]): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: Unit, args: js.Array[Any], thisArg: TA): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def clone_[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def defined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def deprecated(scope: String, value: Any, previous: String, current: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_deprecated")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def each[T, TA](loopable: js.Array[T], fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: js.Array[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
    thisArg: TA
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: js.Array[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
    thisArg: TA,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: js.Array[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
    thisArg: Unit,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](loopable: Record[String, T], fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: Record[String, T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit],
    thisArg: TA
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: Record[String, T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit],
    thisArg: TA,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: Record[String, T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit],
    thisArg: Unit,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def elementsEqual(a0: js.Array[ActiveDataPoint], a1: js.Array[ActiveDataPoint]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_elementsEqual")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def finiteOrDefault(value: Any, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("finiteOrDefault")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isArray[T](value: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isClickEvent(e: ChartEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isClickEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true if `value` is a finite number, else returns false
    * @param value  - The value to test.
    */
  inline def isFinite(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinite")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isFunction(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNullOrUndef(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndef")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: Any): /* is chart.js.chart.js/dist/types/basic.AnyObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is chart.js.chart.js/dist/types/basic.AnyObject */ Boolean]
  
  inline def merge[T](target: T, source: js.Array[AnyObject]): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
  inline def merge[T](target: T, source: js.Array[AnyObject], options: MergeOptions): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
  inline def merge[T, S1](target: T, source: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def merge[T, S1](target: T, source: S1, options: MergeOptions): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def merge[T, S1, S2](target: T, source: js.Tuple2[S1, S2]): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def merge[T, S1, S2](target: T, source: js.Tuple2[S1, S2], options: MergeOptions): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def merge[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3]): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def merge[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3], options: MergeOptions): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def merge[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4]): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  inline def merge[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4], options: MergeOptions): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  
  inline def mergeIf[T](target: T, source: js.Array[AnyObject]): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
  inline def mergeIf[T, S1](target: T, source: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def mergeIf[T, S1, S2](target: T, source: js.Tuple2[S1, S2]): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def mergeIf[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3]): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def mergeIf[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4]): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  
  inline def mergeIf_TS1_Intersection[T, S1](target: T, source: js.Array[S1]): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  
  inline def mergeIf_T_T[T](target: T, source: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def merge_TS1_Intersection[T, S1](target: T, source: js.Array[S1]): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def merge_TS1_Intersection[T, S1](target: T, source: js.Array[S1], options: MergeOptions): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  
  inline def merge_T_T[T](target: T, source: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def merge_T_T[T](target: T, source: js.Array[Any], options: MergeOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def merger(key: String, target: AnyObject, source: AnyObject, options: AnyObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_merger")(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergerIf(key: String, target: AnyObject, source: AnyObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_mergerIf")(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def resolveObjectKey(obj: AnyObject, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveObjectKey")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setsEqual[T](a: Set[T], b: Set[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def splitKey(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_splitKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def toDimension(value: String, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDimension")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def toDimension(value: Double, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDimension")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toPercentage(value: String, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toPercentage")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def toPercentage(value: Double, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toPercentage")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  
  inline def valueOrDefault[T](value: T, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("valueOrDefault")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def valueOrDefault[T](value: Unit, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("valueOrDefault")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait MergeOptions extends StObject {
    
    var merger: js.UndefOr[
        js.Function4[
          /* key */ String, 
          /* target */ AnyObject, 
          /* source */ AnyObject, 
          /* options */ js.UndefOr[AnyObject], 
          Unit
        ]
      ] = js.undefined
  }
  object MergeOptions {
    
    inline def apply(): MergeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MergeOptions] (val x: Self) extends AnyVal {
      
      inline def setMerger(
        value: (/* key */ String, /* target */ AnyObject, /* source */ AnyObject, /* options */ js.UndefOr[AnyObject]) => Unit
      ): Self = StObject.set(x, "merger", js.Any.fromFunction4(value))
      
      inline def setMergerUndefined: Self = StObject.set(x, "merger", js.undefined)
    }
  }
}
