package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionManager
  extends StObject
     with AbstractActionManager {
  
  /**
    * @param target
    * @param propertyPath
    * @hidden
    */
  def _getEffectiveTarget(target: Any, propertyPath: String): Any = js.native
  
  /**
    * @param propertyPath
    * @hidden
    */
  def _getProperty(propertyPath: String): String = js.native
  
  /* private */ var _scene: Any = js.native
  
  /**
    * Gets hosting scene
    * @returns the hosting scene
    */
  def getScene(): Scene = js.native
}
