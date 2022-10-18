package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelpersHelpersDotextrasMod {
  
  @JSImport("chart.js/types/helpers/helpers.extras", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce(fn: js.Function0[Unit], delay: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  
  inline def fontString(pixelSize: Double, fontStyle: String, fontFamily: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fontString")(pixelSize.asInstanceOf[js.Any], fontStyle.asInstanceOf[js.Any], fontFamily.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def requestAnimFrame(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def throttled(fn: js.Function1[/* repeated */ Any, Unit], thisArg: Any): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttled")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  inline def throttled(
    fn: js.Function1[/* repeated */ Any, Unit],
    thisArg: Any,
    updateFn: js.Function1[/* repeated */ Any, js.Array[Any]]
  ): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttled")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], updateFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
}
