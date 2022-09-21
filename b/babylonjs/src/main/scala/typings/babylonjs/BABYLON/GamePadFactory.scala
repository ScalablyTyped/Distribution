package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamePadFactory extends StObject {
  
  /**
    * Returns whether or not the current gamepad can be created for this type of controller.
    * @param gamepadInfo Defines the gamepad info as received from the controller APIs.
    * @returns true if it can be created, otherwise false
    */
  def canCreate(gamepadInfo: Any): Boolean
  
  /**
    * Creates a new instance of the Gamepad.
    * @param gamepadInfo Defines the gamepad info as received from the controller APIs.
    * @returns the new gamepad instance
    */
  def create(gamepadInfo: Any): Gamepad
}
object GamePadFactory {
  
  inline def apply(canCreate: Any => Boolean, create: Any => Gamepad): GamePadFactory = {
    val __obj = js.Dynamic.literal(canCreate = js.Any.fromFunction1(canCreate), create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[GamePadFactory]
  }
  
  extension [Self <: GamePadFactory](x: Self) {
    
    inline def setCanCreate(value: Any => Boolean): Self = StObject.set(x, "canCreate", js.Any.fromFunction1(value))
    
    inline def setCreate(value: Any => Gamepad): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
