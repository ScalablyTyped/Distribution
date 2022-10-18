package typings.chartist

import typings.chartist.chartistBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("chartist/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def each[T](
    list: js.Array[T],
    callback: js.Function3[/* item */ T, /* index */ Double, /* itemIndex */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T](
    list: js.Array[T],
    callback: js.Function3[/* item */ T, /* index */ Double, /* itemIndex */ Double, Unit],
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extend[T](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def extend[T, A](target: T, a: A): T & A = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[T & A]
  inline def extend[T, A, B](target: T, a: A, b: B): T & A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T & A & B]
  
  inline def getNumberOrUndefined(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getNumberOrUndefined(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isArrayOfArrays(data: Any): /* is std.Array<std.Array<unknown>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfArrays")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<std.Array<unknown>> */ Boolean]
  
  inline def isFalseyButZero(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalseyButZero")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumeric(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumeric(value: Double): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[`true`]
  
  inline def noop[T](n: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")(n.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def safeHasProperty[T, K /* <: String */](target: T, property: K): /* is chartist.chartist/dist/utils/types.FilterByKey<T, K> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("safeHasProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[/* is chartist.chartist/dist/utils/types.FilterByKey<T, K> */ Boolean]
  
  inline def serialMap[T, K](array: js.Array[js.Array[T]], callback: js.Function1[/* repeated */ T, K]): js.Array[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("serialMap")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[K]]
  
  inline def sum(previous: Double, current: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(previous.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def times(length: Double): js.Array[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("times")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[Unit]]
  inline def times[T](length: Double, filler: js.Function1[/* index */ Double, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("times")(length.asInstanceOf[js.Any], filler.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
