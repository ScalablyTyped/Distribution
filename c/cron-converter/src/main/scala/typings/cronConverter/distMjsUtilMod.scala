package typings.cronConverter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsUtilMod {
  
  @JSImport("cron-converter/dist/mjs/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertValidArray(arr: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertValidArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def dedup(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("dedup")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def flatten(arrays: js.Array[js.Array[Double]]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arrays.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def parseNumber(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def range(start: Double, end: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def sort(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
