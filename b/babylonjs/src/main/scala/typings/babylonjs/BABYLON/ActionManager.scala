package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionManager extends AbstractActionManager {
  
  /** @hidden */
  def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Any = js.native
  
  /** @hidden */
  def _getProperty(propertyPath: String): String = js.native
  
  var _scene: js.Any = js.native
  
  /**
    * Gets hosting scene
    * @returns the hosting scene
    */
  def getScene(): Scene = js.native
}
