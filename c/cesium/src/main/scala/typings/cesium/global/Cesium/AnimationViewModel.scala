package typings.cesium.global.Cesium

import typings.cesium.mod.AnimationViewModel.DateFormatter
import typings.cesium.mod.AnimationViewModel.TimeFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.AnimationViewModel")
@js.native
class AnimationViewModel protected ()
  extends typings.cesium.mod.AnimationViewModel {
  def this(clockViewModel: typings.cesium.mod.ClockViewModel) = this()
}
object AnimationViewModel {
  
  @JSGlobal("Cesium.AnimationViewModel")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.AnimationViewModel.defaultDateFormatter")
  @js.native
  def defaultDateFormatter: DateFormatter = js.native
  inline def defaultDateFormatter_=(x: DateFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDateFormatter")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.AnimationViewModel.defaultTicks")
  @js.native
  def defaultTicks: js.Array[Double] = js.native
  inline def defaultTicks_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTicks")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.AnimationViewModel.defaultTimeFormatter")
  @js.native
  def defaultTimeFormatter: TimeFormatter = js.native
  inline def defaultTimeFormatter_=(x: TimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeFormatter")(x.asInstanceOf[js.Any])
}
