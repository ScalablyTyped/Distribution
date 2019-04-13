package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CameraEventAggregator")
@js.native
class CameraEventAggregator () extends js.Object {
  def this(element: stdLib.HTMLCanvasElement) = this()
  var anyButtonDown: scala.Boolean = js.native
  var currentMousePosition: Cartesian2 = js.native
  def destroy(): scala.Unit = js.native
  def getButtonPressTime(`type`: CameraEventType): stdLib.Date = js.native
  def getButtonPressTime(`type`: CameraEventType, modifier: KeyboardEventModifier): stdLib.Date = js.native
  def getButtonReleaseTime(`type`: CameraEventType): stdLib.Date = js.native
  def getButtonReleaseTime(`type`: CameraEventType, modifier: KeyboardEventModifier): stdLib.Date = js.native
  def getLastMovement(`type`: CameraEventType): js.Any = js.native
  def getLastMovement(`type`: CameraEventType, modifier: KeyboardEventModifier): js.Any = js.native
  def getMovement(`type`: CameraEventType): js.Any = js.native
  def getMovement(`type`: CameraEventType, modifier: KeyboardEventModifier): js.Any = js.native
  def getStartMousePosition(`type`: CameraEventType): Cartesian2 = js.native
  def getStartMousePosition(`type`: CameraEventType, modifier: KeyboardEventModifier): Cartesian2 = js.native
  def isButtonDown(`type`: CameraEventType): scala.Boolean = js.native
  def isButtonDown(`type`: CameraEventType, modifier: KeyboardEventModifier): scala.Boolean = js.native
  def isDestroyed(): scala.Boolean = js.native
  def isMoving(`type`: CameraEventType): scala.Boolean = js.native
  def isMoving(`type`: CameraEventType, modifier: KeyboardEventModifier): scala.Boolean = js.native
  def reset(): scala.Unit = js.native
}

