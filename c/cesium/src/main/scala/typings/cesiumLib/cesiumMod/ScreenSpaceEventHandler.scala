package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ScreenSpaceEventHandler")
@js.native
class ScreenSpaceEventHandler () extends js.Object {
  def this(element: stdLib.HTMLCanvasElement) = this()
  def destroy(): scala.Unit = js.native
  def getInputAction(`type`: ScreenSpaceEventType): js.Function0[scala.Unit] = js.native
  def getInputAction(`type`: ScreenSpaceEventType, modifier: scala.Double): js.Function0[scala.Unit] = js.native
  def getInputAction[K /* <: java.lang.String */](`type`: K): js.Function1[
    /* import warning: ImportType.apply Failed type conversion: cesium.cesium.ScreenSpaceEventMap[K] */ /* event */ js.Any, 
    scala.Unit
  ] = js.native
  def getInputAction[K /* <: java.lang.String */](`type`: K, modifier: scala.Double): js.Function1[
    /* import warning: ImportType.apply Failed type conversion: cesium.cesium.ScreenSpaceEventMap[K] */ /* event */ js.Any, 
    scala.Unit
  ] = js.native
  def isDestroyed(): scala.Boolean = js.native
  def removeInputAction(`type`: scala.Double): scala.Unit = js.native
  def removeInputAction(`type`: scala.Double, modifier: scala.Double): scala.Unit = js.native
  def setInputAction(action: js.Function0[scala.Unit], `type`: ScreenSpaceEventType): scala.Unit = js.native
  def setInputAction(action: js.Function0[scala.Unit], `type`: ScreenSpaceEventType, modifier: scala.Double): scala.Unit = js.native
  def setInputAction[K /* <: java.lang.String */](
    action: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: cesium.cesium.ScreenSpaceEventMap[K] */ /* event */ js.Any, 
      scala.Unit
    ],
    `type`: K
  ): scala.Unit = js.native
  def setInputAction[K /* <: java.lang.String */](
    action: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: cesium.cesium.ScreenSpaceEventMap[K] */ /* event */ js.Any, 
      scala.Unit
    ],
    `type`: K,
    modifier: scala.Double
  ): scala.Unit = js.native
}

