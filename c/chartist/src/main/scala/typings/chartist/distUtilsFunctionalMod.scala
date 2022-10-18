package typings.chartist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsFunctionalMod {
  
  @JSImport("chartist/dist/utils/functional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def noop[T](n: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")(n.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def serialMap[T, K](array: js.Array[js.Array[T]], callback: js.Function1[/* repeated */ T, K]): js.Array[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("serialMap")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[K]]
  
  inline def sum(previous: Double, current: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(previous.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def times(length: Double): js.Array[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("times")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[Unit]]
  inline def times[T](length: Double, filler: js.Function1[/* index */ Double, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("times")(length.asInstanceOf[js.Any], filler.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
