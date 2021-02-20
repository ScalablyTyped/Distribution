package typings.blueprintjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/sliderUtils", "argMin")
  @js.native
  def argMin[T](values: js.Array[T], argFn: js.Function1[/* value */ T, _]): js.UndefOr[T] = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/sliderUtils", "fillValues")
  @js.native
  def fillValues[T](values: js.Array[T], startIndex: Double, endIndex: Double, fillValue: T): Unit = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/sliderUtils", "formatPercentage")
  @js.native
  def formatPercentage(ratio: Double): String = js.native
}
