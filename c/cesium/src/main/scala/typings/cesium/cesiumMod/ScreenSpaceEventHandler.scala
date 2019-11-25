package typings.cesium.cesiumMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ScreenSpaceEventHandler")
@js.native
class ScreenSpaceEventHandler () extends js.Object {
  def this(element: HTMLCanvasElement) = this()
  def destroy(): Unit = js.native
  def getInputAction(`type`: ScreenSpaceEventType): js.Function0[Unit] = js.native
  def getInputAction(`type`: ScreenSpaceEventType, modifier: Double): js.Function0[Unit] = js.native
  def getInputAction[K /* <: String */](`type`: K): js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: cesium.cesium.ScreenSpaceEventMap[K] */ /* event */ js.Any, 
    Unit
  ] = js.native
  def getInputAction[K /* <: String */](`type`: K, modifier: Double): js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: cesium.cesium.ScreenSpaceEventMap[K] */ /* event */ js.Any, 
    Unit
  ] = js.native
  def isDestroyed(): Boolean = js.native
  def removeInputAction(`type`: Double): Unit = js.native
  def removeInputAction(`type`: Double, modifier: Double): Unit = js.native
  def setInputAction(action: js.Function0[Unit], `type`: ScreenSpaceEventType): Unit = js.native
  def setInputAction(action: js.Function0[Unit], `type`: ScreenSpaceEventType, modifier: Double): Unit = js.native
  def setInputAction[K /* <: String */](
    action: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: cesium.cesium.ScreenSpaceEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    `type`: K
  ): Unit = js.native
  def setInputAction[K /* <: String */](
    action: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: cesium.cesium.ScreenSpaceEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    `type`: K,
    modifier: Double
  ): Unit = js.native
}

