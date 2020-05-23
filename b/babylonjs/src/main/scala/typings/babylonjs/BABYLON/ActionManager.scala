package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionManager extends AbstractActionManager {
  var _scene: js.Any = js.native
  /** @hidden */
  def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Any = js.native
  /** @hidden */
  def _getProperty(propertyPath: String): String = js.native
  /**
    * Gets hosting scene
    * @returns the hosting scene
    */
  def getScene(): Scene = js.native
}

