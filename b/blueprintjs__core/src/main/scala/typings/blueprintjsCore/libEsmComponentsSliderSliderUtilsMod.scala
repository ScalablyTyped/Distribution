package typings.blueprintjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsSliderSliderUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/sliderUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argMin[T](values: js.Array[T], argFn: js.Function1[/* value */ T, Any]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(values.asInstanceOf[js.Any], argFn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def fillValues[T](values: js.Array[T], startIndex: Double, endIndex: Double, fillValue: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillValues")(values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def formatPercentage(ratio: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPercentage")(ratio.asInstanceOf[js.Any]).asInstanceOf[String]
}
